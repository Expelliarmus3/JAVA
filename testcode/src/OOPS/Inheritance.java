package OOPS;
class Circle1{
    public int radius;
    public void Circle1(){
        System.out.println("I am non param of circle");
    }
    public Circle1(int radius){
        this.radius=radius;
        System.out.println("I am parameterized constructor");
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }

}
class Cylinder1 extends Circle1{
    private int height;
    Cylinder1(int radius, int height){
        super(radius);
        this.height=height;
        System.out.println("I am non param cylinder");
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Cylinder1 c1 = new Cylinder1(2,3);
    }

}
