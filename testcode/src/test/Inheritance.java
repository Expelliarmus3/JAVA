package test;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Root {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Animal{
    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
class Dog extends Animal{
    public String color;
    public String sound;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal n= new Animal();
        n.setType("Aquatic");
        System.out.println(n.getType());
        Dog d = new Dog();
        d.setType("Mammal");
        d.setSound("Bark");
        d.setColor("Brown");
        System.out.println(d.getColor()+d.getType()+d.getSound());
    }

}
