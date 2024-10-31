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

System.out.println(countTrianglesA("tester.txt"));

}

public static int countTrianglesA(String filename)
{
try{
  File file = new File(filename);
  Scanner sc = new Scanner(file);



  int side1 = 0;
  int side2 = 0;
  int side3 = 0;
  String[] arr = new String[3];
  int n = 0;

  while(sc.hasNextLine())
{
  for(int i = 0; i < sc.nextLine().length(); i++)
  {
    if(sc.nextLine().charAt(i) != ' ')
    {
      arr[n] += sc.nextLine().charAt(i);
    }
    else
    {
      n++;
    }
    System.out.println(sc.nextLine());
  }

}

}
catch(FileNotFoundException e)
{
  System.out.println("filenotfound");
}
return 1;
}



}
