public class ColorDemo{

public static void main(String[] args) {


  System.out.println("\u001b[2J");
  System.out.println("\u001b[36mCyan");
  System.out.println("\u001b[43mBackgroundYellow");
  System.out.println("\u001b[H");
  System.out.print("\u001b[36mCyanAgain");
  System.out.println("\u001b[1;1f");
  System.out.println("\n\u001b[mReset");
  System.out.println("\u001b[38;2;140;93;72;7mDifferentColor");
  System.out.println("\n\u001b[mReset");

  for(int i = 0; i < 17; i++)
  {
    int color = 30+i;
    if(color%10 > 7){color = ((color % 10) + 1) * 10;}
    System.out.println("\u001b[" + color + "mColor");
  }
  System.out.println("\n\u001b[mReset");
}



}
