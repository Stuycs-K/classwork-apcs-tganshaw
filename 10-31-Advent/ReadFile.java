import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile{

public static void main(String[]args){



  try{

    File file = new File("ReadFile.java");
    Scanner input = new Scanner(file);
    while(input.hasNextLine())
    {
      System.out.println(input.nextLine());
    }
    input.close();
  }catch(FileNotFoundException ex)
  {
    System.out.println("File Not Found");
    return;
  }

}

}
