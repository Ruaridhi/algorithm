import java.util.ArrayList;

public class Timing {


        public static void main(String[] args){
            lastTime();
        }


        public static int firstArray() {
            int[] intArray = new int[10];
            return intArray[0];
        }

        public static void firstTime() {
                long startTime = System.nanoTime();
                firstArray();
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println("Returning first of array lasts: "+ duration + "ns");
        }

        public static int lastArray() {
            int[] intArray = new int[1000000];
            return intArray[intArray.length -1];
        }

        public static void lastTime() {
            long startTime = System.nanoTime();
            lastArray();
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Returning first of array lasts: "+ duration + "ns");
        }

    }











