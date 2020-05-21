package P2;

import java.util.ArrayList;

/**
 * ************************************************************
 * Purpose/Description: <The program is looking for a stability index
 * based on the right and left side of the index array>
 * Author’s Panther ID: Certification: I hereby certify that this work
 * is my own and none of it is the work of any other person.
 * ************************************************************
 */
public class StabilityIndex {
/**
 * The method will look for the sum at a certain index in which equals to the 
 * left and right side based on the number of arrays. If they don't equal than
 * there is no stability index. 
 * @param index
 * @return the stability index
 */
    static ArrayList<Integer> stability(int[] index) {

        ArrayList<Integer> stability = new ArrayList<>(); // new int ArrayList

        int rightSide = 0; // assigning the right side with 0
        for (int i = 1; i < index.length; i++) { /* for loop that starts at 1 
            and goes until the length of array */
            rightSide = rightSide + index[i] ; /* adding the sum of rightside
            with index[i] */
        }

        if (rightSide == 0) { // if rightside happens to be 0
            stability.add(rightSide);/* then add right side to the stability 
            array*/
        }

        int right = rightSide; /* rightSide is getting assigned
                to right*/
        int left = 0; // left starts at 0
        for (int i = 0; i < index.length - 1; i++) { /* for loop starting at 0,
            but goes one less of the length
            */

            right = right - index[i+1] ; // subtract sum with one index more

            left = left + index[i]; //add sum with index

            if (right == left) { // if the sum is the same
                stability.add(i +1); // then add one more to sum
            }
        }
        return stability; // return the array list
    }
/**
 * This method will print out one line followed with the index numbers
 * @param index the index of the arraylist of int
 */
    static void print(ArrayList<Integer> index) {
        for (int i = 0; i < 1; i++) { // for loop to print only one line
            String printIndex; // string 
            printIndex = index.toString().replace("[", "").replace("]", "");
            // removes the brackets from the printing string
            System.out.println("Stability Index is: " + printIndex + "\n");
            // prints the index of the arraylist
            
        }

    }
/**
 * The main method will, print and call stability and print out the array and
 * the index numbers.
 * @param args 
 */
    public static void main(String[] args) {

        int[] list = {0, -3, 5, -4, -2, 3, 1, 0}; // list 
        //Stability Index is: 0
        //Stability Index is: 3
        //Stability Index is: 7

        int[] list1 = {0, 1, -1, 2, -2, 1, -1, 0}; // list
        //Stability Index is: 0
        //Stability Index is: 7

       

        int[] list2 = {-7, 1, 5, 2, -4, 3, 0}; // list
        //Stability Index is: 3
        //Stability Index is: 6

        System.out.println("L1: {0, -3, 5, -4, -2, 3, 1, 0}"); // print
        print(stability(list)); // print and calls the method
        System.out.println("L2: {0, 1, -1, 2, -2, 1, -1, 0}"); // print
        print(stability(list1));// print and calls the method
        System.out.println("L3: {-7, 1, 5, 2, -4, 3, 0}"); // print
        print(stability(list2));// print and calls the method
    }
}
