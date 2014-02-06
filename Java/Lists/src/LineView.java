// Solution to Project 14.1

import java.util.Scanner;

public class LineView{


   private LineModel model;

   public LineView(){
      model = new LineModel();
      String menu = "1. New file\n" +
                    "2. First\n" +
                    "3. Next\n" +
                    "4. Previous\n" +
                    "5. Last\n" +
                    "6. Exit\n";
      while (true){
         System.out.print(menu);
         int command = readCommand(1, 6);
         if (command == 6)
            break;
         else if (command == 1)
            readFile();
         else 
            moveToLine(command);
      }
   }

   private void readFile(){
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter the file name: ");
      String name = reader.nextLine();
      String message = model.reset(name);
      System.out.println(message);
   }

   private void moveToLine(int command){
      String line = null;
      if (command == 2)
         line = model.first();
      else if (command == 3)
         line = model.next();
      else if (command == 4)
         line = model.previous();
      else if (command == 5)
         line = model.last();
      if (line != null){
         int lineNumber = model.getCurrentPosition();
         System.out.println(lineNumber + ": " + line);
      }
      else
         System.out.println("No lines available");
   }
 
   // Robust input of command numbers
   private int readCommand(int low, int high){
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter a number from " + low + 
                       " to " + high + ": ");
      try{
         int input = reader.nextInt();
         if (input < low || input > high){
            System.out.println("The number must be between " + 
                               low + " and " + high);
            return readCommand(low, high);
         }else
            return input;
      }catch(Exception e){
            System.out.println("Input must be a number");
            return readCommand(low, high);
      }
   }                 
}