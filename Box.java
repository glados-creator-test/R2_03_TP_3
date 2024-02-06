import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

/**
 * box
 */
public class Box {
    private ArrayList<Object> content = new ArrayList<Object>();

    Box() {
        this.capacity = this.content.size();
    }

    public void add(Object truc){
        this.content.add(truc);
    }

    public boolean contains(Object truc){
        return this.content.contains(truc);
    }

    public void remove(Object truc) throws Exception{
        if (!(this.content.remove(truc))){
            throw new Exception("item non trouver");
        }
    }
}