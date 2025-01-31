package test;

class One{
    public void radius(){
        System.out.println("This is from class One");
    }
}
class Two extends One{
    @java.lang.Override
    public void radius(){
        System.out.println("This is from class Two");
    }
}
public class Override {

}
