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
  this.setmaxHP(130);
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
  int dmgnum = (int) (Math.random()*6) + 1;
  restoreSpecial(1);
  other.applyDamage(dmgnum);
  return this.getName() + " used slash on " + other.getName() + " and dealt " + dmgnum + " damage!";
}

public String support(Adventurer other)
{
  double defbuff = 0.1;
  int healamt = (int)(other.getmaxHP()*-(defbuff));
  if(healamt < -(other.getmaxHP() - other.getHP()))
    {
      healamt = -(other.getmaxHP() - other.getHP());
    }
  other.applyDamage(healamt);
  return this.getName() + " healed " + other.getName() + " for " + -healamt + " health!";
}

public String support()
{
  int healamt = (int)(this.getHP()*-0.2);
  if(healamt < -(this.getmaxHP() - this.getHP()))
  {
    healamt = -(this.getmaxHP() - this.getHP());
  }
  applyDamage(healamt);
  return this.getName() + " healed for " + -healamt + " health!";
}

public String specialAttack(Adventurer other)
{
  int dmgnum = 50;
  int altdmgnum = (int) (Math.random()*6) + 1;
  if(special == 20)
  {
      other.applyDamage(dmgnum);
      setSpecial(0);
      return "Bring forth the chaos of both into one, and sing the twilight of a new origin. ARMAGEDDON!";
  }
  else{
    other.applyDamage(altdmgnum);
    return "Not enough strikes to activate Armageddon. Instead: use slash on " + other.getName() + " to deal " + altdmgnum + " damage!";
  }
}




}
