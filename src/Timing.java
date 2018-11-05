import java.lang.reflect.Array;
import java.util.ArrayList;

public class Timing {


        public static void main(String[] args){
            int[] range = {10,100,1000,3000,5000,10000,30000,50000,100000,300000,500000,1000000};
            for (int arraySize : range) {
                long startTime = System.nanoTime();
                testableMethod(arraySize);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println(arraySize + ": " + duration + "ns");
            }

        }


        public static int testableMethod(int arraySize) {
            int[] intArray = new int[arraySize];
            return intArray[intArray.length -1];
        }


    }








