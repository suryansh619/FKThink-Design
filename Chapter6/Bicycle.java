package Chapter6;

public class Bicycle {
    int size;
    int tapecolor;
    public Bicycle(){}
    public Bicycle(int size, int tapecolor){
        this.size = size;
        this.tapecolor = tapecolor;
    }
    void spares(){
        String chain = "10-speed";
        int tireSize = 23;
        int tapecolor = this.tapecolor;
    }
    String defaultChain(){
        return "10-speed";
    }
}
