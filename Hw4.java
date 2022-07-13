/*
*   This program intends to pass through specific arrays to different methods so that
*each value for every postion of the array is printed through for loops. This will 
*then be printed to the console also known as Standard Stream. 
*   The purpose of the main method is to intialize and declare all the arrays while 
* also populating them with specific values. Arr is an int array holding values from values 
* 1-50. Arr2 is an String array that holds 10 strings from first, second, third etc
* up to tenth. Arr3 is a two dimensional int array that holds 10 rows and 20 columns 
*of random numbers. Arr4 is an LocalTime array that has a size of 3, then we will populate
* the (0) position of the array with the current time, while picking two random times
* for 1 positon and then the 2 positon. 
*   Each of the arrays are passed through to each respetive method, such as arr passing 
*through to methodOne, arr2 being passed to methodTwo, arr3 being moved to methodThree,
*and arr4 is passed to methodFour. Each of the methods prints out every value that each 
*of the respective arrays contains. This program compiles and runs without any errors or issues. 
*
*/

package hw4;

import java.time.LocalTime;

public class Hw4 {

 
    public static void main(String[] args) {
    
    //declare array and populate it with numbers 1-50
    int[] array= {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13 ,14 ,15 ,16 ,17 
                ,18 ,19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27 ,28 ,29 ,30 ,31 ,32 ,33 
                ,34 ,35 ,36 ,37 ,38 ,39 ,40 ,41 ,42 ,43 ,44 ,45 ,46 ,47 ,48 ,49 
                ,50};
    
    //declare array and populate with strings, such as first, second, third etc 
    String[] array2={"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eight", "Ninth", "Tenth"};
    
    //declare two-dimensional array with 10 rows and 20 columns
    int [][] array3 = {{0, 1, 2, 6, 7, 8, 9, 10, 20, 46, 45, 11, 22, 61, 71, 81, 1, 11, 20, 46}, 
                        {1, 4, 5, 6, 7, 8, 19, 13, 24, 44, 57, 1, 32, 60, 70, 85, 5, 40, 21, 42},
                        {2, 7, 8, 6, 7, 8, 28, 23, 12, 11, 69, 21, 42, 68, 72, 56, 6, 14, 24, 41},
                        {3, 1, 2, 6, 7, 8, 93, 43, 67, 22, 34, 31, 52, 69, 73, 23, 79, 14, 26, 40}, 
                        {4, 4, 5, 6, 7, 8, 13, 41, 50, 33, 47, 41, 62, 62, 74, 65, 9, 15, 26, 42},
                        {5, 7, 8, 6, 7, 8, 11, 2, 90, 44, 27, 51, 22, 63, 75, 76, 76, 17, 29, 45},
                        {6, 1, 2, 6, 7, 8, 18, 99, 36, 55, 7, 61, 16, 64, 79, 78, 6, 17, 25, 49}, 
                        {7, 4, 5, 6, 7, 8, 33, 7, 23, 66, 59, 71, 85, 65, 71, 0, 89, 17, 23, 48},
                        {8, 7, 8, 6, 7, 8, 56, 77, 98, 77, 12, 91, 41, 63, 75, 7, 99, 17, 28, 44},
                        {9, 7, 8, 6, 7, 8, 21, 15, 47, 88, 0, 81, 2, 6, 71, 80, 125, 10, 26, 11},
          
          
      };
    
    //Declare Localtime array
    //Utilize now method of LocalTime library to obtain current time
    //Use Parse method to obtain two random times.
    LocalTime[] array4 = new LocalTime[3];
    array4[0] = LocalTime.now();
    array4[1] = LocalTime.parse("12:21:21");
    array4[2] = LocalTime.parse("19:29:39");
    
    //Invoke all methods and pass the arrays to each respective method
    methodOne(array);
    System.out.println();
    methodTwo(array2);
    System.out.println();
    methodThree(array3);
    System.out.println();
    methodFour(array4);
    
    
    }
    
    public static void methodOne (int[] array) {
        
        int n= array.length;
        //For loop increments for each position in the array and prints the value at each position
        //n is the numer of elements in the array
        
        for (int i = 0; i < n; i++) {
            //adds 10 to each value in the array
            array[i]=array[i]+10;


            System.out.println(array[i]);

        }
        
    }
    
    public static void methodTwo(String[] array2) {
        //For loop again prints out value at each position of array while ending the length of each said value at every position
        
        for (int i=0; i< array2.length; i++) {
		System.out.println(array2[i] + " (" + array2[i].length() + " letters)");
		
        }
		
    }
    
    
    public static void methodThree(int[][]array3){
                
                int r;
		int c;
		
                //For loop for the rows 
                
                for (r = 0; r < array3.length; r++) {
                    
                    //For loop for the columns
                    for (c = 0; c < array3[r].length; c++) {
                        //Prints out each value for rows and colums of the array
                        
                        System.out.print(array3[r][c] + "  ");
            
                    }
                   
                    //Spaces out the table so it looks good
                    
                    System.out.println("\n");
        }
    }
    
    public static void methodFour(LocalTime[] array4) {
        //Simple for loop and prints every value for the array
        int i;
        
        for(i = 0; i < array4.length; i++) {
        System.out.println(array4[i]);
        
        }
		
    }
   
}
