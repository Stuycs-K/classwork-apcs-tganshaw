import java.util.ArrayList;

public class ArrayListPractice{

public static void main(String[]args)
{

  System.out.println(createRandomArray(20));
  System.out.println(createRandomArray(200000));

  ArrayList<String> newArr = createRandomArray(20);
  System.out.println(newArr);
  replaceEmpty(newArr);
  System.out.println(newArr);
  System.out.println(makeReversedList(newArr));
}







public static ArrayList<String>createRandomArray(int size){

ArrayList<String> arr = new ArrayList<String>(size);


for(int i = 0; i < size; i++)
{

  arr.add("" + (int) (Math.random() * 11));

  if(arr.get(i).equals("0"))
  {
    arr.set(i,"");
  }
}
return arr;


}

public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for(int i = 0; i < original.size(); i++){
    if(original.get(i).equals("")){
      original.set(i, "Empty");
    }
  }
}

public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
  ArrayList<String> returnedAry = new ArrayList<String>(original.size());
  for(int i = 0; i < original.size(); i++){
    returnedAry.add(original.get(original.size() - i - 1));
  }
  return returnedAry;
}










}
