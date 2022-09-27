import java.util.Arrays;
import java.util.Collections;

public class Utils {
    public static Integer[] reverseArray(Integer[] array){
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    public static Integer yearsToDays(Integer years){
        int leapYearAux = years/4;
        return (years * 365) + leapYearAux;
    }
}
