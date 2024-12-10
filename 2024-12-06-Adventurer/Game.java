import java.util.*;
import java.io.*;

public class Game{

public static void main(String[] args) {

boolean notquit = true;
Adventurer Psyger0 = new Paladin("Psyger-0", 130);
Adventurer Cplusplus = new CodeWarrior("C++",110);
int turns = 0;


while(notquit)
{
boolean validresponse = true;
System.out.println("---------------");
System.out.println("Psyger0 - HP: " + Psyger0.getHP() + " Special: " + Psyger0.getSpecial());
System.out.println("C++ - HP: " + Cplusplus.getHP() + " Special: " + Cplusplus.getSpecial());
System.out.println();
System.out.println("Type; (a)ttack / (sp)ecial / (su)pport / quit");
System.out.println();
Scanner sc = new Scanner(System.in);

String result = sc.nextLine();

if(result.equals("a"))
{
  System.out.println(Psyger0.attack(Cplusplus));
}
else if(result.equals("sp"))
{
  System.out.println(Psyger0.specialAttack(Cplusplus));
}
else if(result.equals("su"))
{
  System.out.println(Psyger0.support());
}
else if(result.equals("quit"))
{
  notquit = false;
  System.out.println("Quitting.");
}else{validresponse = false;}

System.out.println();

if(Cplusplus.getHP() > 0 && notquit && validresponse)
{

  String resultant = "";
  int randNum = (int) (Math.random()*3);

  if(Cplusplus.getHP() < 50)
  {
    randNum = ((int) (Math.random() * 3)) + ((int) (Math.random() * 3));
    if(randNum > 2)
    {
      randNum = 2;
    }
  }
  if(Psyger0.getHP() < 50)
  {
    int randoNum = (int) (Math.random() * 3);
    if(randoNum == 0)
    {
      randNum = 0;
    }
  }
  if(Cplusplus.getHP() == Cplusplus.getmaxHP())
  {
    randNum = ((int) (Math.random()*2));
  }

  if(Cplusplus.getSpecial() >= 8)
  {
    randNum = 1;
  }

  if(randNum == 0){resultant = "a";}
  else if(randNum == 1){resultant = "sp";}
  else if(randNum == 2){resultant = "su";}



  if(resultant.equals("a"))
  {
    System.out.println(Cplusplus.attack(Psyger0));
  }
  else if(resultant.equals("sp"))
  {
    System.out.println(Cplusplus.specialAttack(Psyger0));
  }
  else if(resultant.equals("su"))
  {
    System.out.println(Cplusplus.support());
  }


}

if(Cplusplus.getHP() < 1)
{
  System.out.println("Psyger0 wins!");
  notquit = false;
}
if(Psyger0.getHP() < 1)
{
  System.out.println("Cplusplus wins!");
  notquit = false;
}
turns++;
}
System.out.println();
System.out.println("Final stats: ");
System.out.println("Psyger0 - HP: " + Psyger0.getHP() + " Special: " + Psyger0.getSpecial());
System.out.println("C++ - HP: " + Cplusplus.getHP() + " Special: " + Cplusplus.getSpecial());
System.out.println("Battle finished in " + turns + " turns.");
}



























}
