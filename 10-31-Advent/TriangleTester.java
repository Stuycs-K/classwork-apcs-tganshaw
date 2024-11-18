import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class TriangleTester{
public static void main(String[]args){

System.out.println("---- ORIGINAL TESTING, NOT IMPORTANT BUT INCLUDED SINCE WE WERE TOLD TO DO IT IN THE CLASSWORK");
Scanner sc1 = new Scanner("This is a bunch of words");

while(sc1.hasNext())
{
  System.out.println(sc1.next());
}

int sum = 0;
Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
while(sc2.hasNextDouble())
{
  sum += sc2.nextDouble();
}

System.out.println(sum);


for(int i = 0; i < 3; i++)
{
  System.out.println("\n");
}

System.out.println("\n\n------PART A------\n");

System.out.println("There are " + countTrianglesA("inputTri.txt") + " valid triangles.");

System.out.println("\n\n------PART B------\n");

System.out.println("There are " + countTrianglesB("inputTri.txt") + " valid triangles.");
}





public static int countTrianglesA(String filename)
{


    int n = 0;

try{
  File file = new File(filename);
  Scanner sc = new Scanner(file);



  int side1 = 0;
  int side2 = 0;
  int side3 = 0;



  while(sc.hasNextLine())
{
  String[] arr = sc.nextLine().split("\n");
  for(int i = 0; i < arr.length;i++){

    String[] arr2 = arr[i].strip().split("\\s+");

    side1 = Integer.parseInt(arr2[0]);
    side2 = Integer.parseInt(arr2[1]);
    side3 = Integer.parseInt(arr2[2]);




}

if((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2))
{n++;}
}
sc.close();
}
catch(FileNotFoundException e)
{
  System.out.println("filenotfound");
}
return n;
}






public static int countTrianglesB(String filename)
{

int n = 0;
int count = 0;
int tracker = 0;
try{
/*

Best way to do this is have a 2D Array. Add every line in it. Then for each triangle you do. arr[i][n] side 1,
arr[i][n] side 2, etc. Do that three times then add one to n. Then repeat & add 1 to n again. At the end of the for,
check if n is 2. If n is 2 then set it to 0 and add 3 to i. Then repeat until i > arr.length-3. Should be simple enough
to write in class.

*/

File file = new File(filename);
Scanner sc = new Scanner(file);



int side1 = 0;
int side2 = 0;
int side3 = 0;

while(sc.hasNextLine())
{
  count++;
  sc.nextLine();
}

sc.close();
File file2 = new File(filename);
Scanner sc2 = new Scanner(file2);


String[][] arr = new String[count][3];

for(int i = 0; i < count; i++)
{
  arr[i] = sc2.nextLine().strip().split("\s+");


}

sc2.close();


for(int i = 0; i < count; i++)
{

while(tracker < 3){
  side1 = Integer.parseInt(arr[i][tracker]);

  side2 = Integer.parseInt(arr[i+1][tracker]);

  side3 = Integer.parseInt(arr[i+2][tracker]);

if((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2))
  {n++;}
tracker++;
}

i+= 2;


if(tracker == 3)
{
  tracker= 0;
}

}








}catch(Exception FileNotFoundException)
{
  System.out.println("File Not Found");
}
return n;


}


}
