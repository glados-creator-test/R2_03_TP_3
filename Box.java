import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;


/**
 * box
 */
public class Box {
    private List<Thing> content;
    private boolean open;
    private int capacity;

    Box() {
        this.content = new ArrayList<>();
        this.capacity = -1;
        this.open = true;
    }

    public void setCapacity(int cap){
        this.capacity = cap;
    }
    public int capacity(){
        return this.capacity;
    }

    public boolean hasRoomFor(Thing truc){
        if (this.capacity == -1){return true;}
        return this.capacity >= this.content.size() + truc.volume();
    }

    public boolean actionAdd(Thing truc){
        if (isclose()){
            return false;
        }
        if (hasRoomFor(truc)){
            add(truc);
            return true;
        }
        return false;
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