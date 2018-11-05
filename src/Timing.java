import java.util.ArrayList;

public class Timing {


        public static void main(String[] args){
            firstTime();
        }


        public static int firstArray() {
            int[] intArray = new int[1000000];
            return intArray[0];
        }

        public static int lastArray() {
            int[] intArray = new int[1000000];
            System.out.println(intArray[intArray.length]);
            return intArray[intArray.length];
        }

        public static void firstTime() {
                long startTime = System.nanoTime();
                firstArray();
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println("Returning first of array lasts: "+ duration + "ns");
        }

    }











