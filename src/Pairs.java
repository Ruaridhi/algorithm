import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pairs {

    public static ArrayList<Integer> array = new ArrayList<>();

    public static void testableMethod(int arraySize) {
    //Set up a list

    for (int i = 0; i < arraySize; i++){ array.add(i); }

    //creates somewhere to store the pairs
    List<String> pairs = new ArrayList<>();

    //take the first element of the array and list all pairs excluding itself
    for (int j = 0; j <= arraySize; j++){
        for (int i = j + 1; i <= arraySize; i++) {
            int[] pair = {j, i};
            pairs.add(Arrays.toString(pair));
        }
    }
    //take second element and list all pairs excluding
    }
}
