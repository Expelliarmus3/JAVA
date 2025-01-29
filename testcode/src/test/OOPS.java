package test;

import java.util.Scanner;

class square{
    int side;
    public void set_side(int n){
         side= n;
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
}
class employee{ //in a package only one public class can be present
    int salary;
    String name;
    public void getName(){
        System.out.println(name);
    }
    public int getSalary() {
        return salary;
    }
    public void setName(String n) {
        name = n;
    }
}
public class OOPS {
    public static void main(String[] args) {
        employee e1= new employee();
        e1.name= "John";
        e1.salary=1000;
        System.out.println(e1.getSalary());
        e1.getName();
        e1.setName("Amy");
        e1.getName();
        cellphone test =new cellphone();
        test.ringing();
        test.vibrating();
        square s= new square();
        s.set_side(2);
        System.out.println("Area is "+s.area());
        System.out.println("Perimeter is "+s.perimeter());
        TommyVecetti p= new TommyVecetti();
        p.run();
        p.fire();
        p.hit();
        Circle c = new Circle(2);
        c.set_radius(1);
        System.out.println("Area"+c.get_Area());
        System.out.println("Perimeter"+c.get_perimeter());
    }
}
