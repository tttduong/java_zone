package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView; 
public class CounterListener implements ActionListener{
    private CounterView ctv;
    public CounterListener(CounterView ctv){
        this.ctv = ctv; 

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println("Ban da nhan nut");
        String src = e.getActionCommand(); 
        System.out.println("Ban da nhan nut" + src);

        if(src.equals("+")){
            this.ctv.incresment();
        }
        if(src.equals("-")){
            this.ctv.descrement();
        }

    }
    
}
