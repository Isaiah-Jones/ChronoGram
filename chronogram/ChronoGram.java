 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chronogram;

/**
 *CSC 206
 * Mr. Osborne
 * @author Isaiah J Jones
 * 3-19-17
 */

//Give user insturctions on how to operate the stopwatch
//Take the current time when the user inputs "START"
// Take the current time when the user inputs "STOP"
// Find the difference between the two times 
// Print out the difference to show how long the stopwatch was running
import java.util.Scanner;

public class ChronoGram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare varialbles
        String userAnswer;
        double randNum;
        double [] legion = new double [100000];
        StopWatch chronos = new StopWatch();
        
        //Load the array with random numbers
        for(int i = 1; i < legion.length; i++){
            legion[i] = Math.random() * 5000;
        }
        
        //Start the StopWatch
        chronos.start();
        
        //Perform the Insertion Sort
        insertionSort(legion);
        
        //Stop the StopWatch
        chronos.stop();
        
        System.out.println("It took ChronoGram " + chronos.getElapsedTime()
                + " milliseconds to load and sort 100,000 numbers");
        //Create an new Scanner

          
        
    }
    public static void insertionSort(double[] legion){
        for (int i = 1; i < legion.length; i++){
         
            double currentElement = legion[i];
            int k;
            for (k = i - 1; k >= 0 && legion[k] > currentElement; k--){
              legion[k + 1] = legion[k];  
            }
            legion[k + 1] = currentElement;
    }
}
}