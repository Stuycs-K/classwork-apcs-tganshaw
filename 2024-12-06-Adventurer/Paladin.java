import java.util.*;
import java.io.*;

public class Paladin extends Adventurer{

  private String name;
  private int HP,maxHP;
  private int special;

public Paladin(String name)
{
  this(name,10);
}
public Paladin(String name,int hp)
{
  super(name,hp);
}


public String getSpecialName()
{
  return "Strikes";
}

public int getSpecial()
{
  return special;
}

public void setSpecial(int n)
{
  if(n <= getSpecialMax() && n > -1)
  {
    special = n;
  }
  else if(n > getSpecialMax())
  {
    special = getSpecialMax();
  }else if (n < 0)
  {
    special = 0;
  }
}

public int getSpecialMax()
{
  return 20;
}

public String attack(Adventurer other)
{
  int dmgnum = 34;
  restoreSpecial(1);
  other.applyDamage(dmgnum);
  return "Slash!";
}

public String support(Adventurer other)
{
  double defbuff = 0.1;
  other.applyDamage((int)(other.getmaxHP()*-(defbuff)));
  return "Heal!";
}

public String support()
{
  applyDamage((int)(HP*-0.2));
  return "Heal!";
}

public String specialAttack(Adventurer other)
{
  int dmgnum = 120;
  if(special == 20)
  {
      other.applyDamage(dmgnum);
  }
  setSpecial(0);
  return "ARMAGEDDON";
}




}
