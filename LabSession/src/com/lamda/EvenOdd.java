package com.lamda;


interface Checkable {
    void check(int num);
}

public class EvenOdd {

    public static void main(String[] args) {
        Checkable c = (num) -> {
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        };

        c.check(10); 
        
        
    }
}
