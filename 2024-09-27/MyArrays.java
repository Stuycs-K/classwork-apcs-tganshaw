public class MyArrays{

  public static void main(String[]args)
  {
    System.out.println(arrayToString(new int[]{1,2,3,4,5}));
    System.out.println(returnCopy(new int[]{1,2,9,4,5}));
    System.out.println(arrayToString(returnCopy(new int[]{1,2,9,4,5})));
  }



public static String arrayToString(int [] nums)
{
  String finale = "[";
  for(int i =0; i < nums.length - 1; i ++){

    finale += nums[i];
    finale += ", ";
  }
  return (finale + nums[nums.length-1] + "]");
}



public static int[] returnCopy(int [] ary){
  int[] newarray = new int[ary.length];

  for(int i = 0; i < ary.length; i++)
  {
    newarray[i] = ary[i];
  }

  return (newarray);
}


}
