// Solution to Project 14.1

import java.util.*;
import java.io.*;

public class LineModel{

   // Instance variables ---------------------------------

   private List<String> list;
   ListIterator<String> itr;

   // Constructor-----------------------------------------------

   public LineModel(){
      list = new LinkedList<String>();
   }

   // Public methods-------------------------------------------

   public String reset(String fileName){
      try{
         list = new LinkedList<String>();
         Scanner reader = new Scanner(new File(fileName));
         while (reader.hasNext())
            list.add(reader.nextLine());
         	itr = list.listIterator();
      }catch(IOException e){
        return e.toString();
      }
      return "File read successfully";
   }

   public String next(){
      if (! list.isEmpty() && itr.hasNext()){
         return itr.next();
      }
      else
         return null;
   }
   
   public int getCurrentPosition(){
	   return itr.nextIndex();
   }
   
   public String first(){
      if (! list.isEmpty()){
         while(itr.hasPrevious()){
        	 itr.previous();
         }
         return itr.next();
      }
      else
         return null;
   }

   public String previous(){
      if (! list.isEmpty() && itr.hasPrevious() && itr.hasNext()){
    	  if (itr.hasPrevious()){
    		  itr.previous();
    		  itr.previous();
    		  return itr.next();
      	  }
    	  else{
    		  return null;
    	  }
      }
      else if(! list.isEmpty() && itr.hasPrevious() && ! itr.hasNext()){
    	  return itr.previous();
      }
      else
         return null;
   }

   public String last(){
      if (! list.isEmpty()){
         while(itr.hasNext()){
        	 itr.next();
         }
         return itr.previous();
      }
      else
         return null;
   }
}