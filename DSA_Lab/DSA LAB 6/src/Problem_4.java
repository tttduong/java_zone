class Problem_4
{
    public static void main(String[] args)
    {
        Node1 a1 = node(2);
        Node1 b1 = node(3);
        Node1 c1 = node('+', a1, b1);
        Node1 d1 = node(5);
        Node1 e1 = node(1);
        Node1 f1 = node('-', d1, e1);
        Node1 g1 = node('*', c1, f1);
        Node1 h1 = node(8);
        Node1 i1 = node('/', g1, h1);
        
        Node1 a2 = node(2);
        Node1 b2 = node(3);
        Node1 c2 = node('+', a2, b2);
        Node1 d2 = node(5);
        Node1 e2 = node(1);
        Node1 f2 = node('-', d2, e2);
        Node1 g2 = node('*', c2, f2);
        Node1 h2 = node(8);
        Node1 i2 = node('/', g2, h2);

        System.out.println("Tree 1:");
        showTree(0, i1);
        System.out.println("Tree 2:");
        showTree(0, i2);
        
        // Kiểm tra hai cây có giống nhau không
        System.out.println("Are the trees identical? " + isIdentical(i1, i2));
    }

    // -------------------------------------------------------------
    public static Node1 node(char op, Node1 l, Node1 r)
    {
        Node1 a = new Node1();
        a.operation = op;
        a.leftChild = l;
        a.rightChild = r;
        return a;
    }

    // -------------------------------------------------------------
    public static Node1 node(int val)
    {
        Node1 a = new Node1();
        a.value = val;
        return a;
    }

    // -------------------------------------------------------------      
    public static void prefix(Node1 t)
    {
        if (t.leftChild == null && t.rightChild == null) 
            System.out.print(t.value + " ");
        else
        {
            System.out.print(t.operation + " ");
            prefix(t.leftChild);
            prefix(t.rightChild);
        }            
    }

    // -------------------------------------------------------------      
    public static void postfix(Node1 t)
    {
        if (t.leftChild == null && t.rightChild == null) 
            System.out.print(t.value + " ");
        else
        {
            postfix(t.leftChild);
            postfix(t.rightChild);
            System.out.print(t.operation + " ");
        }            
    }

    // -------------------------------------------------------------      
    public static void infix(Node1 t)
    {
        if (t.leftChild == null && t.rightChild == null) 
            System.out.print(t.value);
        else
        {
            System.out.print("(");
            infix(t.leftChild);
            System.out.print(t.operation);
            infix(t.rightChild);
            System.out.print(")");
        }            
    }

    // -------------------------------------------------------------      
    public static double eval(Node1 t)
    {
        double val = 0;
        if (t.leftChild == null && t.rightChild == null) 
            val = t.value;
        else
            switch (t.operation)
            {
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
    public static void showTree(int n, Node1 t)
    {
        tab(n);
        if (t.leftChild == null && t.rightChild == null) 
            System.out.println(t.value);
        else
        {
            System.out.println(t.operation);
            showTree(n + 2, t.leftChild);
            showTree(n + 2, t.rightChild);
        }
    }

    // -------------------------------------------------------------      
    public static void tab(int n)
    {
        for (int i = 0; i < n; i++) System.out.print(" ");
    }

    // -------------------------------------------------------------
    // Phương thức kiểm tra hai cây có giống nhau không
    public static boolean isIdentical(Node1 root1, Node1 root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.operation != root2.operation || root1.value != root2.value) {
            return false;
        }
        return isIdentical(root1.leftChild, root2.leftChild) &&
               isIdentical(root1.rightChild, root2.rightChild);
    }
}
// -------------------------------------------------------------

class Node
{
    char operation;
    int value;
    Node1 leftChild;
    Node1 rightChild;
}
