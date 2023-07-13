package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args) throws FileNotFoundException {
            // Print out a running total of all the
            // values in the input file.
            Scanner fileIn = new Scanner(new File("Step4/input.txt"));

            System.out.println("Reading from file ... ");
            int sum=0;
            while (fileIn.hasNext())
            {


                sum+= fileIn.nextInt();
            }

            System.out.println(sum);
        }



        }
