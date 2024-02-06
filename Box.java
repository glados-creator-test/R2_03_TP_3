import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

/**
 * box
 */
public class Box {
    private ArrayList<Thing> content = new ArrayList<Thing>();

    Box() {
        this.content = new ArrayList<>();
    }

    public void add(Thing truc){
        this.content.add(truc);
    }

    public boolean contains(Thing truc){
        return this.content.contains(truc);
    }

    public Thing remove(int i) throws Exception{
        return this.content.remove(i);
    }
}