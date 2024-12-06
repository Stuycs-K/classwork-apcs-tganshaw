import java.util.*;
import java.io.*;

public class Driver{

public static void main(String[] args) {

Adventurer darkness = new Paladin("Darkness", 80);

System.out.println("Name is " + darkness);
System.out.println("Special Name is " + darkness.getSpecialName());
System.out.println("Special charge is " + darkness.getSpecial());
darkness.setSpecial(31);
System.out.println("Special restored to max");
System.out.println("Special charge is " + darkness.getSpecial());
darkness.setSpecial(-1);
System.out.println("Special set to " + darkness.getSpecial());
darkness.restoreSpecial(14);
System.out.println("Special restored by 14");
System.out.println("Special charge is " + darkness.getSpecial());
System.out.println("Max Special Charge is " + darkness.getSpecialMax());

Adventurer psyger0 = new Paladin("Psyger-0", 130);
System.out.println(psyger0.attack(darkness));
System.out.println(darkness.getHP());
psyger0.setSpecial(31);
System.out.println("Special restored to max");
System.out.println(psyger0.specialAttack(darkness));
System.out.println(darkness.getHP());

}




}
