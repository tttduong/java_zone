package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;
import java.awt.BorderLayout; 
import java.awt.event.ActionListener;

public class CounterView extends JFrame{
    private CounterModel counterModel; 
    private JButton button_minus; 
    private JButton button_plus; 
    private JLabel lable_value;
    public CounterView(){
      this.counterModel = new CounterModel(); 
      this.init(); 
      this.setVisible(true);
    }

    public void init(){
        this.setTitle("Counter");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel jPanel = new JPanel(); 
        jPanel.setLayout(new BorderLayout()); 

        button_minus = new JButton("-"); 
        button_plus = new JButton("+"); 
        lable_value = new JLabel(counterModel.getValue()+"", JLabel.CENTER); 
        ActionListener ac = new CounterListener(this); 
        
        jPanel.add(button_minus, BorderLayout.WEST); 
        button_minus.addActionListener(ac);
        jPanel.add(lable_value, BorderLayout.CENTER); 
        jPanel.add(button_plus, BorderLayout.EAST); 
        button_plus.addActionListener(ac); 

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER); 
    }

    public void incresment (){
        this.counterModel.incresment(); 
        this.lable_value.setText(this.counterModel.getValue()+ ""); 
    }
    
    public void descrement(){
        this.counterModel.decrement(); 
        this.lable_value.setText(this.counterModel.getValue()+"");
    }
}
