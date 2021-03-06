package Office_Hours.Practice_10_28_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesArrayList {

/*
Create a method will take an Integer ArrayList and remove any duplicates values. Return an ArrayList of unique elements.
-> 1,2,3,2,2,1,4
-> 1,2,3,4
list: 1,2,3,4

 */

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(4,23,1,4,23,5,3,5,7));
        System.out.println(removeDup(list));
        System.out.println(new LinkedHashSet<>(list));
    }

    //OPTION 1
    public static ArrayList<Integer> removeDup(ArrayList<Integer> nums){
        ArrayList<Integer> uniqueValues = new ArrayList<>();
        for (Integer each : nums){
            if(!uniqueValues.contains(each)){
                uniqueValues.add(each);
            }
        }
         return uniqueValues;
    }


    //OPTION 2
  //  public static ArrayList<Integer> removeDup2(ArrayList<Integer> nums){
   //     new HashSet<>(nums);
   //     return null;
  //  }

    //OPTION 3
    public static ArrayList<Integer> removeDup3(ArrayList<Integer> nums){
        return new ArrayList<>(new LinkedHashSet<>(nums));
    }

    //OPTION 4
    public static ArrayList<Integer> removeDup4(ArrayList<Integer>num){
        for (int i=0;i<=num.size()-1;i++){
            for (int j=1;j<=i;j++){
                if(num.get(i)== num.get(j)){
                    num.remove(i);
                }
            }
        }
        return num;
    }




}
