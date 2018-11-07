import java.util.ArrayList;
import java.util.Collections;

public class Sort
{
    public static void testableMethod(int arraySize) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < arraySize; i++) {
            array.add(i);
        }
        Collections.sort(array);
    }
}
