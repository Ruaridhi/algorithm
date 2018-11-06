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
            // [1

            //Shuffle it
            //Mix these cards: card in the 1st position goes to into a random position, card in the second position goes into a random position
            //One position can only have one card

            //create a random object called 'random' (you can then run .nextInt to set the maximum limit so: random.nextInt(3) would give you 0,1,2 or 3.
            Random random = new Random();

            // Loop from 1,2,3,4,5,5,6,....to arraySize.
            for (int i = 0; i < arraySize; i++) {
                int randomPosition = random.nextInt(arraySize);
                int temp = array.get(i);
                array.set(i, array.get(randomPosition));
                array.set(randomPosition, temp);
            }
        }
    }








