package OOPS2;
class surfaceArea{
    double surfaceArea(int r){
        return 4*Math.PI*r*r;
    }
    double surfaceArea(int r,int h){
        return 2*Math.PI*r*h;
    }
}
class Volume extends surfaceArea{
    double Volume(int r){
        return (4/3)*Math.PI*r*r*r;
    }
    double Volume(int r, int h){
        return Math.PI*r*r*h;
    }
}
class Sphere extends Volume{
    private int r;
    void Sphere(int r){
        this.r=r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
class Cylinder extends Volume{
    private int r,h;
    void Cylinder(int r,int h){
        this.r=r;
        this.h=h;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
public class Packages {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        Sphere s = new Sphere();
        c.Cylinder(1,2);
        c.Volume(1,2);
    }
}
