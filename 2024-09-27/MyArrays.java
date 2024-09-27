public class MyArrays{

  public static void main(String[]args)
  {




    System.out.println(arrayToString(new int[]{1,2,3,4,5}));





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






















}
