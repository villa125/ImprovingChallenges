import java.util.Arrays;

public class Runner {
    public static void main (String[] args){

        //Challenge 1
        //Create a list/array with multiple numbers and print it out in reverse
        Integer [] arr = {13, 88, 135, 250, 500};
        System.out.println("input: " + Arrays.toString(arr));
        System.out.println("output: " + Arrays.toString(Utils.reverseArray(arr)));

        //Challenge 2
        //Create a method/function that receives age in years and returns age in days.
        Integer years = 26;
        System.out.println("Approximately Days: " + Utils.yearsToDays(years));
    }
}
