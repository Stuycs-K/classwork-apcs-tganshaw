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


for(int i = 0; i < 5; i++)
{
  System.out.println("\n");
}

System.out.println(countTrianglesA("inputTri.txt"));

System.out.println("\n\n------PARTB------\n");

System.out.println(countTrianglesB("inputTri.txt"));
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
  String[] arr = sc.nextLine().split(" ");
  for(int i = 0; i < arr.length;i++){
    if (i == 0)
    {side1 = Integer.parseInt(arr[i]);}
    if (i == 1)
    {side2 = Integer.parseInt(arr[i]);}
    if (i == 2)
    {side3 = Integer.parseInt(arr[i]);}
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
  arr[i] = sc2.nextLine().split(" ");


}

sc2.close();



for(int i = 0; i < count; i++)
{

while(tracker < 3){
  side1 = Integer.parseInt(arr[i][tracker]);
  System.out.println(side1);
  side2 = Integer.parseInt(arr[i+1][tracker]);
    System.out.println(side2);
  side3 = Integer.parseInt(arr[i+2][tracker]);
    System.out.println(side3);

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
