import java.util.*;
import java.io.*;


public class day42{

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
        boolean checked = false;
        int[] alphaarr = new int[26];
        for(int i = 0; i < arr.length-1;i++) // All things in arr
        {
          for(int n = 0; n < arr[i].length(); n++)
          {
            alphaarr[(int) arr[i].charAt(n) - 97]++;
          }
        }
        int[]alphaarr2 = Arrays.copyOf(alphaarr, 26);

        String resultant = valueslargest(alphaarr2, day4.fivelargest(alphaarr));
        resultant = resultant.substring(0,5);
        System.out.println(resultant);
        System.out.println(arr[arr.length-1].substring(4,9));
        if(arr[arr.length-1].substring(4,9).equals(resultant))
        {
          sum+= Integer.parseInt(arr[arr.length-1].substring(0,3));
        }
  }
    }
  catch(FileNotFoundException e) {System.out.println("nofile");}


return sum;
}


public static String valueslargest(int[] arr,int[] arr2){

String resultant = "";
int index = 0;
System.out.println(arr2.length);
System.out.println(Arrays.toString(arr));
for(int i = 0; i < arr.length; i++)
{
if(arr[i] == arr2[index])
{
  if(index + 1 < arr2.length)
  {index++;}
  arr[i] = 9205;
  resultant += (char) (i + 97);
  i = -1;
}

}

return resultant;

}






}
