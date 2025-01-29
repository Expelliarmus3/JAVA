package test;
class Root{
    public Root(){
        System.out.println("Initial");
    }
    public Root(int x){
        System.out.println("Overload initial");
    }
}
class Derive extends Root{
    public Derive() {
        System.out.println("I am derive");
    }

    public Derive(int x,int y) {
        super(x);
        System.out.println("I am overload derive");
    }
}
class lil extends Derive{
    public lil() {
        System.out.println("I am lil");
    }

    public lil(int x, int y,int z) {
        super(x, y);
        System.out.println("I am overload lil");
    }
}
public class Constructors {
    public static void main(String[] args) {
        lil l = new lil(1,2,3);
        lil m = new lil();
    }
}
