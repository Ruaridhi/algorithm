import java.util.*;

public class Groups {

    public static void testableMethod(int arraySize) {

        //Set up a list
        ArrayList<Integer> aug = new ArrayList<Integer>();
        for (int i = 0; i < arraySize; i++){
            aug.add(i);
        }

        // Set how many groups
        int numberOfGroups = 3;

        // Divide the number of people by groups
        int membersPerGroup = aug.size() / numberOfGroups;

        // Create equal groups
        for (int start = 0; start < aug.size(); start += membersPerGroup) {
            int end = Math.min(start + membersPerGroup, aug.size());
            List<Integer> group = aug.subList(start, end);
            // Show the groups
//            System.out.println(group);
        }

    }
}

