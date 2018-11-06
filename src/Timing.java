import java.util.*;

public class Timing {


        public static void main(String[] args){
            int[] range = {10,100,1000,3000,5000,10000,30000,50000,100000,300000,500000,1000000};
            for (int arraySize : range) {
long startTime = System.nanoTime();
testableMethod(arraySize);
long endTime = System.nanoTime();
long duration = (endTime - startTime);
System.out.println(duration);
            }
        }

        public static void testableMethod(int arraySize) {
            //Set up a list
            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int i = 0; i < arraySize; i++){
                array.add(i);
            }

            //Reverse it - the first array = the last array...
            for (int i = 0; i < arraySize; i++) {
                array.set(i, array.get(arraySize - i -1));
            }
        }
    }








