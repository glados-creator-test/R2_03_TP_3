public class Thing{
    private String name;
    private int vol;

    public Thing(String name){
        this.name = name;
        this.vol = 1;
    }
    public Thing(int vol){
        this.name = "truc";
        this.vol = vol;
    }
    public int volume(){
        return this.vol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void tobemerge() {}
}