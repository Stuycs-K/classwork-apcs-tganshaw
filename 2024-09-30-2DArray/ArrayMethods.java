public class ArrayMethods {

public static void main(String[]args) {

  int[] x = {1,4,6,8};
  int[] z = {2,3,6,9};
  System.out.println(arrayToString(x));
  System.out.println(arrayToString(z));
  int[][] testcase = {{2,3,4}, {4,3,2}, {33,23,42}};
  System.out.println(arrToString(testcase));
  System.out.println(arr2DSum(testcase));
  System.out.println(arrToString(swapRC(testcase)));
  int[][] y = {{-1,2,3},{-4,-5,-6}};
  System.out.println(arrToString(swapRC(y)));
  replaceNegative(y);
}



public static String arrayToString(int[] arr) {
  String x = "[";
  for(int i=0;i<arr.length-1;i++) {
    x += arr[i];
    x+= ", ";
  }
  x = x + arr[arr.length - 1] + "]";
  return x;
}

public static String arrToString(int[][] arr)
{
    String finale = "[";
  for(int i = 0; i < arr.length - 1; i++)

  {
    finale += arrayToString(arr[i]) + ", ";

  }

  finale += arrayToString(arr[arr.length-1]) + "]";
  return finale;

}

public static int arr2DSum(int [][]nums) {
  int sum =0;
  for(int i=0; i <nums.length;i++) {
    for(int x=0; x <nums[i].length;x++) {
      sum += nums[i][x];
    }
  }
  return sum;
}


public static int[][] swapRC(int[][]nums){

 int[][] newarray = new int[nums[0].length][nums.length];
 int counter = 0;
 int counter2 = 0;
 int counter3 = 0;
 int counter4 = 0;

for(int i = 0; i < nums.length * nums[0].length; i++)
{
 if (counter < nums.length)
 {
   newarray[counter2][counter] = nums[counter4][counter3];
   counter++;
   counter3++;
 }
 if (counter == nums.length)
 {
   counter2++;
   counter = 0;
 }
 if(counter3 == nums[0].length)
 {
   counter4++;
   counter3 = 0;
 }


}
 return (newarray);
}

public static void replaceNegative(int[][] vals) {
  for(int i =0;i<vals.length;i++) {
    for(int x=0;x<vals[i].length;x++) {
      if(vals[i][x] < 0) {
        if(x == i) {
          vals[i][x] = 1;
        }
        else{vals[i][x] = 0;}
      }
    }
  }
  System.out.println(arrToString(vals));
}



}
