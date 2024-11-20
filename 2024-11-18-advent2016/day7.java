import java.util.*;
import java.io.*;


public class day7{

public static void main(String[]args)
{

System.out.println(countIPs("day7input.txt") + " valid IPS");
}

public static int countIPs(String filename)
{
  int count = 0;

  try{

    File file = new File(filename);
    Scanner sc = new Scanner(file);
    while(sc.hasNextLine())
    {
      boolean bracketed = false;
      String arr = sc.nextLine();
      for(int i = 0; i < arr.length()-4;i++)
      {
        if(arr.charAt(i) == '['){bracketed = true;}

          if((arr.charAt(i) == arr.charAt(i+3) && arr.charAt(i+1) == arr.charAt(i+2)) && !bracketed && arr.charAt(i) != arr.charAt(i+1))
          {
            count++;
          }

          if((arr.charAt(i) == arr.charAt(i+3) && arr.charAt(i+1) == arr.charAt(i+2)) && arr.charAt(i+4) == ']')
          {
            count--;
          }

                  if(arr.charAt(i) == ']'){bracketed = false;}
        }

      }







  }catch(FileNotFoundException e){System.out.println("nofile");}


  return count;
}












}
