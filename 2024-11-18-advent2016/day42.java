import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class day4{

public static void main(String[]args){


  System.out.println("Sum is " + checkSumSum("day4input.txt"));
}

public static int checkSumSum(String filename)
{
int sum = 0;
  try{
    File file = new File(filename);
    Scanner sc = new Scanner(file);

    while(sc.hasNextLine()){
        String[] arr = sc.nextLine().split("-");
        int[] alphaarr = new int[25];
        




      }
    }
  catch(FileNotFoundException e) {System.out.println("nofile");}






return sum;
}









}
