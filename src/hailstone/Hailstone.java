/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hailstone;

import java.util.ArrayList;

/**
 *
 * @author Joel Salminen
 */
public class Hailstone {
    
    ArrayList<Integer> hSequence; /* Length of the sequence is unknown, arraylist works well here */
    Hailstone(){
        this.hSequence = new ArrayList<>();
        
    }
    
    
    
    public void Calculate(int number){
 /*       hSequence.add(5);
        hSequence.add(1);
        System.out.println(hSequence.indexOf(1));
         */
        hSequence.add(number);
        if (number == 1){
          System.out.println(hSequence);
        }
        else if (number%2 == 0){
            this.Calculate(number/2);
        }
        else if (number%2 == 1){
            
            this.Calculate(3*number + 1);
        }
        
    }
}
