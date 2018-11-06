import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {

    Group group;

    @BeforeEach
    void init(){
        group = new Group();
    }


    @Test
    void groupExists(){
        assertArrayEquals(new String[]{"Patrick", "Sebastian", "Nazz", "Amy", "Chloe", "Din", "Damion", "Ruaridhi", "Freya", "Victor", "Shweta", "Nathan", "Alex", "Vu", "Robbi", "Ibs"}, group.aug.toArray());
    }

    @Test
    void numberofGroupsExist(){
        assertEquals(3, group.numberOfGroups);
    }

    @Test
    void sizeOfGroups(){
        assertEquals(5, group.membersPerGroup);
    }


}