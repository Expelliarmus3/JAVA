package test;
class Root1 {
    public Root1() {
        System.out.println("I am Root");
    }
    public Root1(int x){
        super();
        System.out.println("I am overloaded method Root");
    }
}
class myDerived extends Root1 {
    public myDerived() {
        System.out.println("I am Derived");
    }
    public myDerived(int x,int y){

        System.out.println("I am overloaded derived");
    }
}
class grandDerived extends myDerived{
    public grandDerived() {
        System.out.println("I am grand-derived");
    }
    public grandDerived(int x,int y,int z){

        System.out.println("I am overloaded grand-derived");
    }
}
public class Constructor_in_inheritance {
    public static void main(String[] args) {
        grandDerived gd = new grandDerived();
    }
}
