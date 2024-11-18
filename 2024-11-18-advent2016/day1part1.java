import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class day1part1{



  public static void main(String[]args)
  {

System.out.println("You will be " + walkingDistance("inputday1.txt") + " blocks away");


  }


public static int walkingDistance(String filename)
{

int distance = 0;
int angle = 0;
int vert = 0;
int hori = 0;

try{
  File file = new File(filename);
  Scanner sc = new Scanner(file);

  String[] arr = sc.nextLine().split(", ");

  for(int i = 0; i < arr.length; i++)
  {
    System.out.print(arr[i] + " ");
    if(arr[i].charAt(0) == 'R')
    {
      angle -= 90;

    }
    if(arr[i].charAt(0) == 'L')
    {
      angle += 90;
    }
    if(angle < 0){angle += 360;}
    if(angle >= 360){angle -= 360;}
    System.out.println(angle);
    if(angle == 0)
    {
      vert += Integer.parseInt(arr[i].substring(1));
    }
    if(angle == 180)
    {
      vert -= Integer.parseInt(arr[i].substring(1));
    }
    if(angle == 90)
    {
      hori += Integer.parseInt(arr[i].substring(1));
    }
    if(angle == 270)
    {
      hori -= Integer.parseInt(arr[i].substring(1));
    }

  }
}catch(FileNotFoundException e) {System.out.println("nofile");}

System.out.println(hori + " " + vert);
return Math.abs(vert) + Math.abs(hori);
}




}
