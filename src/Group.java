import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {

    //Set up a list
    ArrayList<String> aug = new ArrayList<>(Arrays.asList("Patrick", "Sebastian", "Nazz", "Amy", "Chloe", "Din", "Damion", "Ruaridhi", "Freya", "Victor",
            "Shweta", "Nathan", "Alex", "Vu", "Robbi", "Ibs"));

    // Set how many groups
    int numberOfGroups = 3;

    // Divide the number of people by groups
    int membersPerGroup = aug.size() / numberOfGroups;

    public void divide() {


        // Create equal groups
        for (int start = 0; start < aug.size(); start += membersPerGroup) {
            int end = Math.min(start + membersPerGroup, aug.size());
            List<String> group = aug.subList(start, end);
            // Show the groups
            System.out.println(group);
        }
    }
}
