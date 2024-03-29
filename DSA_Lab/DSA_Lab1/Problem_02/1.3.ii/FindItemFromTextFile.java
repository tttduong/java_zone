//********************************************************************
//  GasMileage.java       Author: Lewis/Loftus
//
//  Demonstrates the use of the Scanner class to read numeric data.
//********************************************************************

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindItemFromTextFile
{
   //-----------------------------------------------------------------
   //  Calculates fuel efficiency based on values entered by the
   //  user.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {

    String fileName = "array_items.txt"; // File name containing array items
    List<Integer> arrayItems = new ArrayList<>(); // List to store array items

    // Read array items from the file
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = br.readLine()) != null) {
            int item = Integer.parseInt(line.trim()); // Parse item from string to integer
            arrayItems.add(item); // Add item to the list
        }
    } catch (IOException e) {
        System.err.println("Error reading file: " + e.getMessage());
        return;
    } catch (NumberFormatException e) {
        System.err.println("Invalid number format in file: " + e.getMessage());
        return;
    }

    // Convert list to array
    int[] array = new int[arrayItems.size()];
    for (int i = 0; i < arrayItems.size(); i++) {
        array[i] = arrayItems.get(i);
    }

    // Print the array
    System.out.println("Array items read from file:");
    for (int item : array) {
        System.out.println(item);
    }
    //-----------------------------------------------------------------------------------------------------------
    //Find the item in array
      int itemToFind;
      boolean findItem = false;

    
      Scanner scan = new Scanner (System.in);

      System.out.print ("Enter the item to find: ");
      itemToFind = scan.nextInt();

      for (int item: array){
        if (item == itemToFind){    
            findItem = true; 
        }
      }

      if(findItem == true){
        System.out.println("Find "+itemToFind+" in the array");
      }else{
        System.out.println("Do not find "+itemToFind+" in the array");
      }
   }
}


