package test;

public class Cylinder {
    private int radius;
    private int height;
    public Cylinder(){
    }
    public Cylinder(int r,int h){
        this.radius=r;
        this.height=h;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double getSurfaceArea(){
        return 2*Math.PI*this.radius*this.height;
    }
    public double getVolume(){
        return Math.PI*(this.radius*this.radius)*this.height;
    }
}
