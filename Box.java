import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;


/**
 * box
 */
public class Box {
    private List<Thing> content;
    private boolean open = true;
    private int capacity;

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

    public boolean isopen(){return this.open;}
    public boolean isclose(){return !this.open;}
    public void open(){this.open = true;}
    public void close(){this.open = false;}
}