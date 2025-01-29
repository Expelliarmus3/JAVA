package test;

public class TommyVecetti {
    public void hit(){
        System.out.println("hitting...");
    }
    public void run(){
        System.out.println("running...");
    }
    public void fire(){
        System.out.println("firing...");
    }
}
class Circle{
    private double area;
    private double perimeter;
    private int radius;
    public Circle(){
       this.radius=0;
    }
    public Circle(int radius){
       this.radius=radius;
    }
    public void set_radius(int r){
        this.radius=r;
    }
    public void get_radius(){
        System.out.println(this.radius);
    }
    public double get_Area(){
        this.area= Math.PI*radius*radius;
        return area;
    }
    public double get_perimeter(){
        this.perimeter= 2*Math.PI*radius;
        return perimeter;
    }
}
