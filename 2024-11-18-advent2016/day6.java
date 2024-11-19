import java.util.*;
import java.io.*;

public class day6{


public static void main(String[]args)
{
System.out.println(cipherer("day6input.txt", 8));
}

public static int lineCount(String filename)
{
  int count = 0;
  try{

  File file = new File(filename);
  Scanner sc = new Scanner(file);
  while(sc.hasNextLine())
  {
    count++;
    sc.nextLine();
  }
  }catch(FileNotFoundException e) {System.out.println("nofile");}
  return count;
}

public static String cipherer(String filename,int longness)
{//qtbjqiuq

String[] resultantarr = new String[longness];
String[][] resultantarr2 = new String[longness][lineCount(filename)];
String[][] arr = new String[lineCount(filename)][longness];
String resultant = "";
int counter = 0;
try{

File file = new File(filename);
Scanner sc = new Scanner(file);
while(sc.hasNextLine())
{

  String bleebo = sc.nextLine();
  for(int i = 0; i < bleebo.length(); i++)
  {
    arr[counter][i] = "" + bleebo.charAt(i);
  }
  counter++;
}


//arr = swapRC(arr);
for(int i = 0; i <longness ;i++)
{
  for(int n = 0; n< arr.length;n++)
  {
    resultantarr2[i][n] = arr[n][i];
  }
}

for(int i = 0; i < longness; i++){
System.out.println(Arrays.toString(resultantarr2[i]));}


for(int i = 0; i < resultantarr2.length;i++)
{
  resultant += mostcommon(resultantarr2[i]);
}

}catch(FileNotFoundException e) {System.out.println("nofile");}




return resultant;

}


public static String mostcommon(String[] arr)
{
  int[] alphaarr = new int[26];
  String resultant = "";
  for(int i = 0; i < arr.length; i++)
  {
    alphaarr[(int) arr[i].charAt(0) - 97]++;
  }

  int largestnumber = 0;
  int index = 0;
  for(int i =0;i< alphaarr.length;i++)
  {
    if(alphaarr[i] > largestnumber)
    {
      largestnumber = alphaarr[i];
      index = i;
    }
  }
  resultant += (char) (index+97);
  return resultant;
}
/*
public static String[][] swapRC(String[][]nums){

 String[][] newarray = new String[nums[0].length][nums.length];
 int counter = 0;
 int counter2 = 0;
 int counter3 = 0;
 int counter4 = 0;

for(int i = 0; i < nums.length; i++)
{
for(int n =0;n< nums[0].length;n++){
 newarray[counter][counter2] = nums[counter3][counter4];
 counter++;
 counter4++;
}
counter2++;
counter3++;
}
 return (newarray);
}
*/

}
