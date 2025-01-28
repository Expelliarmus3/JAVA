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
    int radius;
    public void set_radius(int r){
        radius=r;
    }
    public void get_radius(){
        System.out.println(radius);
    }
    public double get_Area(){
        return Math.PI*radius*radius;
    }
    public double get_perimeter(){
        return 2*Math.PI*radius;
    }
}
