import java.util.*;
import java.io.*;

public class fib{

  public static void main(String[] args) {
    int val = Integer.parseInt(args[0]);
    System.out.println(fib(val));
  }

  public static int fib(int n){
    if(n == 0)
    {
      return 0;
    }
    if(n == 1 || n == 2)
    {
      return 1;
    }
    return fib(n-1) + fib(n-2);
  }
}

// Largest n to run in 10 seconds : 46
// First n to overflow: 47
