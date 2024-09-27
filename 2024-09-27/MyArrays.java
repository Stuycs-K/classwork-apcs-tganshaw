public class MyArrays{

  public static void main(String[]args)
  {

    int[] array1 = new int[]{1,2,3,4,5};
    int[] array2 = new int[]{6,7,8,9,10};
    System.out.println(arrayToString(array1));
    System.out.println(returnCopy(array2));
    System.out.println(arrayToString(returnCopy(array2)));
    System.out.println(concatArray(array1, array2));
    System.out.println(arrayToString(concatArray(array1, array2)));
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

public static int[] concatArray(int [] ary1, int [] ary2)
{
  int[] ary12 = new int [ary1.length + ary2.length];
  int counter = 0;

  for(int i = 0; i < ary1.length; i++)
  {
    ary12[counter] = ary1[i];
    counter++;

  }

  for(int i = 0; i < ary2.length; i++)
  {
    ary12[counter] = ary2[i];
    counter++;

  }

return ary12;

}



}
