import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
// import com.google.gson.Gson;

import java.util.List;
import java.lang.*;

public class TestsBoxes {
    @Test
    public void testBoxCreate() {
        Box b = new Box();
    } /** on veut pouvoir mettre des trucs dedans */

    @Test
    public void testBoxAdd() {
        Box b = new Box();
        b.add(new Thing("truc1"));
        b.add(new Thing("truc2"));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1/0;
    }
    @Test(expected = Exception.class)
    public void remove_not_in() throws Exception{
        Box b = new Box();
        b.remove(0);
    }
    @Test
    public void remove_in() throws Exception {
        Box b = new Box();
        b.add(new Thing("truc"));
        b.remove(0);
    }
    @Test   
    public void is_open(){
        Box b = new Box();
        org.junit.Assert.assertTrue(b.isopen());
        b.close();
        org.junit.Assert.assertTrue(b.isclose());
        b.open();
        org.junit.Assert.assertTrue(b.isopen());
    }

    @Test
    public void Thing_volume(){
        Thing truc = new Thing(5);
        org.junit.Assert.assertEquals(truc.volume(),5);
    }
    @Test
    public void test_cap(){
        Box b = new Box();
        b.setCapacity(5);
        org.junit.Assert.assertEquals(b.capacity(),5);
    }
    @Test
    public void test_hasroom(){
        Box b = new Box();
        b.setCapacity(0);
        org.junit.Assert.assertEquals(b.hasRoomFor(new Thing(1)),false);
        b.setCapacity(1);
        org.junit.Assert.assertEquals(b.hasRoomFor(new Thing(1)),true);
    }
    @Test
    public void test_actionAdd(){
        
    }
}