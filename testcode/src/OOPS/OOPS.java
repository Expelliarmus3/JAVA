package OOPS;
class Base{
    public void print(){
        System.out.println("From Base");
    }
}
class Derived extends Base{
    @Override
    public void print() {
        System.out.println("From derived");
    }
}
public class OOPS {
    public static void main(String[] args) {
        Base b = new Base();
        b.print();
        Derived d = new Derived();
        d.print();
    }
}
