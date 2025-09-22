package com.aditya;

public interface Worker {
    void performDuties();

}
class Chef extends Person implements Worker {
    Chef(String n, int i){
        super(n, i);
    }

    public void performDuties(){
        System.out.println(name + " is cooking food in the kitchen.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String n, int i){
        super(n, i);
    }

    public void performDuties(){
        System.out.println(name + " is serving food to customers.");
    }
}