package model;

public class CounterModel{
    private int value; 
    public CounterModel(){
        this.value = 0; 
    }

    public int incresment(){
        return value++; 
    }

    public int decrement(){
        return value--; 
    }

    public void printValue(){
        System.out.println(value);
    }

    public void setValue(int value){
        this.value = value; 
    }

    public int getValue(){
        return value; 
    }
    
}