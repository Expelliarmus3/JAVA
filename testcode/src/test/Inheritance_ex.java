package test;
class Circle1{
    int radius;
    public Circle1(){
        System.out.println("I am radius from circle");
    }
    public Circle1(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(int radius){
        return Math.PI*radius*radius;
    }

}
class Cylinder1 extends Circle1{
    public Cylinder1(){
        System.out.println("I am radius from cylinder");
    }
    public Cylinder1(int radius, int height) {
        super(radius);
        this.height = height;
    }

    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume(int radius){
        return Math.PI*radius*radius*height;
    }
}
public class Inheritance_ex {
    public static void main(String[] args) {
        Cylinder1 cy = new Cylinder1(2,5);
    }
}
