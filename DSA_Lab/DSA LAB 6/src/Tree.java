// -------------------------------------------------------------
// Representing arithmetic expressions by binary tree
// CS 501 
// Zdravko Markov
//Problem 1 2 3 was done in this file
// -------------------------------------------------------------
class Tree {
    public static void main(String[] args) {
        Node1 a = node(2);
        Node1 b = node(3);
        Node1 c = node('+', a, b);
        Node1 d = node(5);
        Node1 e = node(1);
        Node1 f = node('-', d, e);
        Node1 g = node('*', c, f);
        Node1 h = node(8);
        Node1 i = node('/', g, h);

        // Node i =
        // node('/',node('*',node('+',node(2),node(3)),node('-',node(5),node(1))),node(8));

        System.out.println("Tree:");
        showTree(0, i);
        System.out.print("Prefix: ");
        prefix(i);
        System.out.print("\nPostfix: ");
        postfix(i);
        System.out.print("\nInfix: ");
        infix(i);
        System.out.println("\nValue: " + eval(i));

        // Count number
        System.out.println("Number of elements in the tree: " + countElements(i));

        System.out.println("Height of the tree: " + height(i));

        System.out.println("Number of leaves in the tree: " + countLeaves(i));

        System.out.println("Is the tree fully balanced? " + isFullyBalanced(i));
    }

    // -------------------------------------------------------------
    public static Node1 node(char op, Node1 l, Node1 r) /* Create new node */
    {
        Node1 a = new Node1();
        a.operation = op;
        a.leftChild = l;
        a.rightChild = r;
        return a;
    }

    // -------------------------------------------------------------
    public static Node1 node(int val) /* Create new node */
    {
        Node1 a = new Node1();
        a.value = val;
        return a;
    }

    // -------------------------------------------------------------
    public static void prefix(Node1 t) /* PreOrder: root - left - right */
    {
        if (t.leftChild == null && t.rightChild == null)
            System.out.print(t.value + " ");
        else {
            System.out.print(t.operation + " ");
            prefix(t.leftChild);
            prefix(t.rightChild);
        }
    }

    // -------------------------------------------------------------
    public static void postfix(Node1 t) /* PostOrder: left - right -root */
    {
        if (t.leftChild == null && t.rightChild == null)
            System.out.print(t.value + " ");
        else {
            postfix(t.leftChild);
            postfix(t.rightChild);
            System.out.print(t.operation + " ");
        }
    }

    // -------------------------------------------------------------
    public static void infix(Node1 t) /* Inorder: left - root - right */
    {
        if (t.leftChild == null && t.rightChild == null)
            System.out.print(t.value);
        else {
            System.out.print("(");
            infix(t.leftChild);
            System.out.print(t.operation);
            infix(t.rightChild);
            System.out.print(")");
        }
    }

    // -------------------------------------------------------------
    public static double eval(Node1 t) {
        double val = 0;
        if (t.leftChild == null && t.rightChild == null)
            val = t.value;
        else
            switch (t.operation) {
                case '+':
                    val = eval(t.leftChild) + eval(t.rightChild);
                    break;
                case '-':
                    val = eval(t.leftChild) - eval(t.rightChild);
                    break;
                case '*':
                    val = eval(t.leftChild) * eval(t.rightChild);
                    break;
                case '/':
                    val = eval(t.leftChild) / eval(t.rightChild);
            }
        return val;
    }

    // -------------------------------------------------------------
    public static void showTree(int n, Node1 t) {
        tab(n);
        if (t.leftChild == null && t.rightChild == null)
            System.out.println(t.value);
        else {
            System.out.println(t.operation);
            showTree(n + 2, t.leftChild);
            showTree(n + 2, t.rightChild);
        }
    }

    // -------------------------------------------------------------
    public static void tab(int n) {
        for (int i = 0; i < n; i++)
            System.out.print(" ");
    }

    // -------------------------------------------------------------
    public static int countElements(Node1 t) {
        if (t == null) {
            return 0;
        }
        return 1 + countElements(t.leftChild) + countElements(t.rightChild);
    }

    // -------------------------------------------------------------
    public static int height(Node1 t) {
        if (t == null) {
            return 0;
        }
        int leftHeight = height(t.leftChild);
        int rightHeight = height(t.rightChild);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // -------------------------------------------------------------
    public static int countLeaves(Node1 t) {
        if (t == null) {
            return 0;
        }
        if (t.leftChild == null && t.rightChild == null) {
            return 1;
        }
        return countLeaves(t.leftChild) + countLeaves(t.rightChild);
    }

    // -------------------------------------------------------------
    public static boolean isFullyBalanced(Node1 root) {
        return checkBalance(root).isBalanced;
    }

    private static BalanceStatus checkBalance(Node1 root) {
        if (root == null) {
            return new BalanceStatus(0, true);
        }
        BalanceStatus leftStatus = checkBalance(root.leftChild);
        BalanceStatus rightStatus = checkBalance(root.rightChild);

        boolean isBalanced = leftStatus.isBalanced && rightStatus.isBalanced
                && Math.abs(leftStatus.height - rightStatus.height) <= 1;
        int height = 1 + Math.max(leftStatus.height, rightStatus.height);

        return new BalanceStatus(height, isBalanced);
    }

    private static class BalanceStatus {
        int height;
        boolean isBalanced;

        BalanceStatus(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }
}
// -------------------------------------------------------------

class Node1 {
    char operation;
    int value;
    Node1 leftChild;
    Node1 rightChild;
}