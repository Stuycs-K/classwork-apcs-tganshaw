import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class day2part1{


public static void main(String[]args){

System.out.println("Combination is " + keypadCombo("inputday2.txt"));

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







}
