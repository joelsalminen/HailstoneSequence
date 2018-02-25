package hailstone;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Joel Salminen
 */
public class Hailstone {
    
    ArrayList<Integer> hSequence; /* An arraylist that stores the hSequence.*/
    
    Hailstone(int inputNumber){
        this.hSequence = new ArrayList<>();
        Calculate(inputNumber);
    }
    
    
    /* Calculates the hailstone sequence recursively based on the input number */
    public void Calculate(int number){

        hSequence.add(number);
        if (number == 1){
          //System.out.println(hSequence);
        }
        
        /* A number is an even whenever the remainder is 0 */
        else if (number%2 == 0){
            this.Calculate(number/2);
        }
        
        /* A number is an odd whenever the remainder is 1 */
        else if (number%2 == 1){
            this.Calculate(3*number + 1);
        }
        
    }
    
    /* Return the second largest number in the sequence */
    public int GetSecondLargest(){
        /* Copying hSequence to a new Arraylist */
        ArrayList<Integer> tempList = new ArrayList<>(hSequence); 
        
        /* Sorting and reversing the new list*/
        Collections.sort(tempList);
        Collections.reverse(tempList);

        return (tempList.get(1));
    }
    
    public int GetSteps(){
        return hSequence.size()-1;
    }
}
