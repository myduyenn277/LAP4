package Lap4.View;

import java.util.ArrayList;

import Lap4.Common.Libraby;


public abstract class Menu<T> {
    protected  String title;
    protected  ArrayList<T> opsList;
    Libraby l = new Libraby();
    public Menu(String title, String[] mc) {
        this.title = title;
        this.opsList = new ArrayList<>();
        for (String o : mc) {
            opsList.add((T) o);
        }

    }
    
    public void display(){
        System.out.println("-------------------------------");
        System.out.println(title);
        System.out.println("-------------------------------");
         for (int i = 0; i < opsList.size(); i++) {
            System.out.println((i+1) + "." + opsList.get(i));
        }
        System.out.println("--------------------------------");
    }
    
    public int getSelected(){
        display();
        return l.getInt("Enter selection ",1, opsList.size()+1);
    }
    
    public abstract void execute(int n);
    
    public void run(){
        while(true){
            int n = getSelected();
            execute(n);
            if(n> opsList.size()){
                break;
            }
        }
    }
}

