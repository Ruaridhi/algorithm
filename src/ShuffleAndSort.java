import java.util.ArrayList;
import java.util.Collections;

public class ShuffleAndSort
{
    public static void testableMethod(int arraySize) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < arraySize; i++) {
            array.add(i);
        }
        Collections.shuffle(array);
        Collections.sort(array);
    }
}
