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
    int[] alphabetarr = new int[26];

while(sc.hasNextLine()){
    String[] arr = sc.nextLine().split("-");

    for(int i = 0; i < arr.length;i++)
    {
    //  System.out.println(arr[i]);
    }
    boolean checkedsum = true;

    for(int i =0; i < arr.length;i++)
    {
      String checksum = arr[arr.length-1];
      System.out.println(arr[i]);
      String checksum2 =checksum.substring(4,10);
      for(int n = 0; n < arr[i].length(); n++)
      {

      if(i < arr.length-1){alphabetarr[(int)arr[i].charAt(n)-97]++;}
      }
      if(i == arr.length-1){
      for(int x = 0; x < checksum2.length()-1;x++)
      {
        if(alphabetarr[(int)checksum2.charAt(x)-97] == 0)
        {
          checkedsum = false;
          //System.out.println(checkedsum);
        }
        else if((alphabetarr[(int)checksum2.charAt(x)-97] < alphabetarr[(int)checksum2.charAt(x+1)-97]))
        {
          checkedsum = false;
        }
        else if ((alphabetarr[(int)checksum2.charAt(x)-97] == alphabetarr[(int)checksum2.charAt(x+1)-97]) && checksum2.charAt(x) > checksum2.charAt(x+1)   )
        {
          checkedsum = false;
        }
      }
      if(checkedsum)
      {sum+=Integer.parseInt(checksum.substring(0,3));
      System.out.println(checkedsum);}
      //System.out.println(Integer.parseInt(checksum.substring(0,3)));
    }

    }

}



    }
  catch(FileNotFoundException e) {System.out.println("nofile");}






return sum;
}









}
