import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import java.awt.FlowLayout; 
import java.awt.GridLayout; 
import java.awt.BorderLayout; 

public class MyCalculator extends JFrame {
    public MyCalculator(){
        this.setTitle("MyCalculator");
        this.setSize(300,300);  
        this.setLocationRelativeTo(null); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        JPanel panel_textField = new JPanel(); 
        panel_textField.setLayout(new BorderLayout());
        JTextField textfield = new JTextField(); 
        panel_textField.add(textfield, BorderLayout.CENTER); 




        JPanel panel_buttons = new JPanel(); 
        panel_buttons.setLayout(new GridLayout(5,3));
        JButton button_0 = new JButton("0"); 
        JButton button_1 = new JButton("1"); 
        JButton button_2 = new JButton("2"); 
        JButton button_3 = new JButton("3"); 
        JButton button_4 = new JButton("4"); 
        JButton button_5 = new JButton("5"); 
        JButton button_6 = new JButton("6"); 
        JButton button_7 = new JButton("7"); 
        JButton button_8 = new JButton("8"); 
        JButton button_9 = new JButton("9"); 
        JButton button_plus = new JButton("+"); 
        JButton button_minus = new JButton("-"); 
        JButton button_multi = new JButton("*"); 
        JButton button_divi = new JButton("/"); 
        JButton button_equal = new JButton("="); 

        panel_buttons.add(button_0); 
        panel_buttons.add(button_1); 
        panel_buttons.add(button_2); 
        panel_buttons.add(button_3); 
        panel_buttons.add(button_4); 
        panel_buttons.add(button_5); 
        panel_buttons.add(button_6); 
        panel_buttons.add(button_7); 
        panel_buttons.add(button_8); 
        panel_buttons.add(button_9); 
        panel_buttons.add(button_plus); 
        panel_buttons.add(button_minus); 
        panel_buttons.add(button_multi); 
        panel_buttons.add(button_divi); 
        panel_buttons.add(button_equal); 

        this.setLayout(new BorderLayout()); 
        this.add(panel_textField, BorderLayout.NORTH);
        this.add(panel_buttons, BorderLayout.CENTER); 
        this.setVisible(true);

        
    }
    public static void main (String[] args){
        // try{
        //     // com.sun.java.swing.plaf.gtk.GTKLookAndFeel -- không hỗ trợ
        //     // com.sun.java.swing.plaf.motif.MotifLookAndFeel
        //     // com.sun.java.swing.plaf.windows.WindowsLookAndFeel
        //     UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());;
            MyCalculator mc = new MyCalculator() ; 
        // }catch(Exception ex){
        //     ex.printStackTrace();
        // }; 
        // // MyCalculator mc = new MyCalculator() ; 
    }
}
