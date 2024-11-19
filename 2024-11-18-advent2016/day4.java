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
        int[] alphabetarr = new int[26];
        System.out.println("------");

    boolean checkedsum = true;

    for(int i =0; i < arr.length;i++)
    {
      String checksum = arr[arr.length-1];
      System.out.println(checksum);
      System.out.println(arr[i]);
      String checksum2 =checksum.substring(4,9);
      System.out.println(checksum2);
      for(int n = 0; n < arr[i].length(); n++)
      {

      if(i < arr.length-1){alphabetarr[(int)arr[i].charAt(n)-97]++;}
      }
      if(i == arr.length-1){

      for(int x = 0; x < checksum2.length()-1;x++)
      {
      /*  System.out.println(checksum2.charAt(x));
        System.out.println(checksum2.charAt(x+1));
      */  System.out.println(checksum2);

        System.out.println(alphabetarr[((int)checksum2.charAt(x))-97]);
        System.out.println(alphabetarr[((int)checksum2.charAt(x+1))-97]);

        char chari = checksum2.charAt(x);
        char chari2 = checksum2.charAt(x+1);
        int int1 = alphabetarr[((int)checksum2.charAt(x))-97];
        int int2 = alphabetarr[((int)checksum2.charAt(x+1))-97];
        System.out.println(chari);
        System.out.println(chari2);

        if(int1 == 0 || int2 == 0)
        {
          checkedsum = false;
        }
        if(int2 > int1)
        {
          checkedsum = false;
        }
        if(int1 == int2)
        {//USE A 2D ARRAY FOR THIS I THINK IT'LL MAKE YOUR LIFE EASIER
          if(chari > chari2)
          {
            checkedsum = false;
          }
        }


      }
      if(checkedsum)
      {
        System.out.println(true);
        sum+=Integer.parseInt(checksum.substring(0,3));
      }
      //System.out.println(Integer.parseInt(checksum.substring(0,3)));
    }

    }

}



    }
  catch(FileNotFoundException e) {System.out.println("nofile");}






return sum;
}









}
