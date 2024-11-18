import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class day2part1{


public static void main(String[]args){

System.out.println("Combination is " + keypadCombo("inputday2.txt"));
System.out.println("Combination 2 is " + keypadCombo2("inputday2.txt"));
}







public static String keypadCombo(String filename){

String combo = "";
int[][] keypad = {{1,2,3},{4,5,6},{7,8,9}};
int ypos = 1;
int xpos = 1;

try{

File file = new File(filename);
Scanner sc = new Scanner(file);

while(sc.hasNextLine()){
String[] arr = sc.nextLine().strip().split("\n");

for(int i = 0; i < arr.length; i++)
{

  for(int n = 0; n < arr[i].length(); n++)
  {
    if(arr[i].charAt(n) == 'U' && (ypos != 0))
    {
      ypos--;
    }
    if(arr[i].charAt(n) == 'D' && ypos != 2)
    {
      ypos++;
    }
    if(arr[i].charAt(n) == 'L' && xpos != 0)
    {
      xpos--;
    }
    if(arr[i].charAt(n) == 'R' && xpos != 2)
    {
      xpos++;
    }

    System.out.println(xpos + " " + ypos);


  }
  combo += keypad[ypos][xpos];
}
}


}catch(FileNotFoundException e) {System.out.println("notfiled");}


return combo;
}

public static String keypadCombo2(String filename){

String combo = "";
char[][] keypad = {
  {'0','0','1','0','0'},
  {'0','2','3','4','0'},
  {'5','6','7','8','9'},
  {'0','A','B','C','0'},
  {'0','0','D','0','0'}};
int ypos = 2;
int xpos = 0;

try{

File file = new File(filename);
Scanner sc = new Scanner(file);

while(sc.hasNextLine()){
String[] arr = sc.nextLine().strip().split("\n");

for(int i = 0; i < arr.length; i++)
{

  for(int n = 0; n < arr[i].length(); n++)
  {
    if(arr[i].charAt(n) == 'U' && trackerchecker(keypad[ypos][xpos],"U"))
    {
      ypos--;
    }
    if(arr[i].charAt(n) == 'D' && trackerchecker(keypad[ypos][xpos],"D"))
    {
      ypos++;
    }
    if(arr[i].charAt(n) == 'L' & trackerchecker(keypad[ypos][xpos],"L"))
    {
      xpos--;
    }
    if(arr[i].charAt(n) == 'R' && trackerchecker(keypad[ypos][xpos],"R"))
    {
      xpos++;
    }

    System.out.println(xpos + " " + ypos);


  }
  combo += keypad[ypos][xpos];
}
}


}catch(FileNotFoundException e) {System.out.println("notfiled");}


return combo;
}


public static boolean trackerchecker(char char1, String direction)
{
  if(direction == "U")
  {
    if(char1 == '1' || char1 == '2' || char1 == '4' || char1 =='5' || char1 == '9')
    {return false;}
  }
  if (direction == "D"){
    if(char1 == 'D' || char1 == 'A' || char1 == 'C' || char1 =='5' || char1 == '9')
    {return false;}
  }
  if (direction == "L"){
    if(char1 == 'D' || char1 == 'A' || char1 == '1' || char1 =='5' || char1 == '2')
    {return false;}
  }
  if (direction == "R"){
    if(char1 == 'D' || char1 == 'C' || char1 == '1' || char1 =='9' || char1 == '4')
    {return false;}
  }
  return true;
}


}
