import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

public class day4{

public static void main(String[]args){

int[] arrayy = {1,3,4,5,2,39,20,86,22,2,3,4,5,122};

//System.out.println(Arrays.toString(fivelargest(arrayy)));
System.out.println("Sum is " + checkSumSum("day4input.txt"));
//System.out.println(caesarshift("qzmtzixmtkozyivhz",343));
}


public static int[] fivelargest(int[] arr)
{
  int arr2[] = new int[5];
  int largestnum = 0;

for(int n = 0; n < 5; n++)
{
  for(int i =0; i < arr.length; i++)
  {
    if(arr[i] >= largestnum)
    {
      arr2[n] = arr[i];
      largestnum = arr[i];
    }

  }
  largesttozero(arr);
  largestnum = 0;
}

return arr2;

}

public static void largesttozero(int[] arr)
{
  int largestnum =0;
  int index = 0;
  for(int i = 0; i< arr.length;i++)
  {
    if(arr[i] > largestnum)
    {
      largestnum = arr[i];
      index = i;
    }
  }
  arr[index] = 0;
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


    boolean checkedsum = true;

    for(int i =0; i < arr.length;i++)
    {
      String checksum = arr[arr.length-1];
    //  System.out.println(checksum);
    //  System.out.println(arr[i]);
      String checksum2 =checksum.substring(4,9);
    //  System.out.println(checksum2);
      for(int n = 0; n < arr[i].length(); n++)
      {
      if(i < arr.length-1){alphabetarr[(int)arr[i].charAt(n)-97]++;}
      }
    //  System.out.println(Arrays.toString(fivelargest(alphabetarr)));
      int[] arr2 = fivelargest(alphabetarr);
      if(i == arr.length-1){

      for(int x = 0; x < checksum2.length();x++)
      {

        char chari = checksum2.charAt(x);
        int int1 = alphabetarr[((int)checksum2.charAt(x))-97];

      //  System.out.print(int1 + "" + arr2[x] + "\n");
        if(int1 != arr2[x]){checkedsum = false;}
      }

      //  System.out.println(true);
          //      System.out.println("------");
      //  System.out.println(Arrays.toString(arr));
        for(int z = 0; z<arr.length;z++)
        {
        caesarshift(arr[z],Integer.parseInt(checksum.substring(0,3)));
        }

      //System.out.println(Integer.parseInt(checksum.substring(0,3)));
    }

    }

}



    }
  catch(FileNotFoundException e) {System.out.println("nofile");}





return sum;
}


public static void caesarshift(String input, int shift)
{
  String newinput = "";
  //System.out.println("----" + shift);

  for(int i = 0; i < input.length();i++)
  {
    int a = (int)input.charAt(i)-97 + (shift % 26);
    if(a >= 26){a-=26;}
    newinput += (char)(a+97);
  }
  if(newinput.equals("northpole")){
  System.out.println(newinput + " " + shift);
}
}





}
