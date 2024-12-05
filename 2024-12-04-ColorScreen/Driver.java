import java.util.*;
import java.io.*;

public class Driver{

public static void main(String[] args) {
  System.out.print(Text.CLEAR_SCREEN);
  System.out.print(Text.RESET);
 border();


   int[] arr = new int[3];
   for(int i =0;i < 3;i++)
   {
     arr[i] = (int)(Math.random() * 100);
   }
   Text.go(2,2);
   for(int i = 0; i < 3; i++)
   {
     if(arr[i] < 25)
     {
       System.out.print("\u001b[31;1m");
     }
     if(arr[i] > 75)
     {
       System.out.print("\u001b[" + Text.GREEN + ";" + Text.BRIGHT + "m");
     }
     else
     {
       System.out.print("\u001b[37m");
     }
     System.out.print(arr[i] + " ");
   }

   Text.go(3,2);
   for(int i = 0; i < 78; i++)
   {
   System.out.print("-");
 }
   Text.go(32,1);
   System.out.print(Text.RESET);
}

public static void border()
{
  Text.go(1,1);
  for(int i = 0; i < 80; i++)
  {
    System.out.print("\u001b[" + Text.background(Text.RED) + "m");
    System.out.print(" ");
  }
  System.out.print("\u001b[m");
  for(int i = 1; i < 30; i++)
  {
    Text.go(i,80);
    System.out.print("\u001b[" + Text.background(Text.RED) + "m ");
    System.out.println("\u001b[m");
  }
  Text.go(30,80);
  System.out.print("\u001b[" + Text.background(Text.RED) + "m ");
  Text.go(1,1);
  for(int i = 0; i < 30; i++)
  {
    System.out.print("\u001b[" + Text.background(Text.RED) + "m ");
    System.out.println("\u001b[m");
  }
  for(int i = 0; i < 80; i++)
  {
    System.out.print("\u001b[" + Text.background(Text.RED) + "m");
    System.out.print(" ");
  }
      System.out.println("\u001b[m");

}

}
