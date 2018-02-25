package hailstone;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Joel Salminen
 */
public class Hailstone {
    
    ArrayList<Integer> hSequence; /* Length of the sequence is unknown, arraylist works well here */
    Hailstone(int inputNumber){
        this.hSequence = new ArrayList<>();
        Calculate(inputNumber);
    }
    
    
    
    public void Calculate(int number){

        hSequence.add(number);
        if (number == 1){
          //System.out.println(hSequence);
        }
        else if (number%2 == 0){
            this.Calculate(number/2);
        }
        else if (number%2 == 1){
            this.Calculate(3*number + 1);
        }
        
    }
    
    public int GetSecondLargest(){
        /* Copying hSequence to a new Arraylist */
        if (hSequence.size() >0){
            ArrayList<Integer> tempList = new ArrayList<>(hSequence); 
        
            /* Sorting and reversing the new list*/
            Collections.sort(tempList);
            Collections.reverse(tempList);
        
            return (tempList.get(1));
        }
        return 1;
        
        
        
    }
    
    public int GetSteps(){
        return hSequence.size()-1;
    }
}
