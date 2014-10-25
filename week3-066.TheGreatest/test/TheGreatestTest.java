import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import java.util.ArrayList;

@Points("66")
public class TheGreatestTest {
    
    public ArrayList<Integer> a(int... i ) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int j : i) {
            al.add(j);
        }
        return al;
    }

    @Test
    public void test1() {
        assertEquals("Greatest of the list [1] not correct.",1,TheGreatest.greatest(a(1)));
        assertEquals("Greatest of the list [2] not correct.",2,TheGreatest.greatest(a(2)));
        assertEquals("Greatest of the list [3] not correct.",3,TheGreatest.greatest(a(3)));
    }

    @Test
    public  void test2() {
        assertEquals("Greatest of the list [1,2,3] not correct.",
                     3,TheGreatest.greatest(a(1,2,3)));
        assertEquals("Greatest of the list [3,2,1] not correct.",
                     3,TheGreatest.greatest(a(3,2,1)));
        assertEquals("Greatest of the list [2,2,2,2,2,2,2] not correct.",
                     2,TheGreatest.greatest(a(2,2,2,2,2,2,2)));
        assertEquals("Greatest of the list [-1,1,-2,2,-3,3] not correct.",
                     3,TheGreatest.greatest(a(-1,1,-2,2,-3,3)));
        assertEquals("Greatest of the list [-2,-1,-3] not correct.",
                     -1,TheGreatest.greatest(a(-2,-1,-3)));
        assertEquals("Greatest of the list [-9000,-9001] not correct.",
                     -9000,TheGreatest.greatest(a(-9000,-9001)));
    }

}
