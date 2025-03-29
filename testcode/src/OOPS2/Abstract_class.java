package OOPS2;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends Pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("Changing");
    }
}
interface basicanimal{
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("Bite");
    }
}
class human extends monkey implements basicanimal{
    void speak(){
        System.out.println("Hello");
    }
    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
abstract class telephone{
    abstract void lift();
    abstract void disconnected();
}
class smartTelephone extends telephone{
    public void lift(){
        System.out.println("Lift");
    }
    public void disconnected(){
        System.out.println("Hanging up");
    }
    public void music(){
        System.out.println("playing music");
    }
}
interface TVremote{
    void change_channels();
    void change_volume();
    void switch_on();
    void switch_of();
}
interface smartTVremote extends TVremote{
    void voice_input();
    void hovering();
}
class TV implements smartTVremote{
    @Override
    public void change_channels() {
        System.out.println("Changing..");
    }

    @Override
    public void change_volume() {
        System.out.println("Volume");
    }

    @Override
    public void hovering() {
        System.out.println("Selected");
    }

    @Override
    public void switch_of() {
        System.out.println("off");
    }

    @Override
    public void voice_input() {
        System.out.println("Ok google");
    }

    @Override
    public void switch_on() {
        System.out.println("On");
    }
    
}
public class Abstract_class {
    public static void main(String[] args) {
        telephone tl = new smartTelephone();
        tl.lift();
        monkey m = new human();
        m.bite();
        human h = new human();
        h.sleep();

    }
}
