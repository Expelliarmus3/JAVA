package test;

public class Methods {
    //Varargs
    public void product(int n){ //non-static method needs to create an object and then call it
        for(int i=1;i<=10;i++){
            System.out.format("%d x %d= %d\n",n,i,(n*i));
        }
    }
    public static void pattern2(int n) {
        for(int i=0;i<n;i++){
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern(int n) {
        for(int i=0;i<n;i++){
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int sum(int x,int...arr){ //making it mandatory to input one argument
        int result=x;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        //System.out.println("The sum of 2,3,4,5,6 is "+sum(2,3,4,5,6));
//        Methods m = new Methods();//the object needed to be created for a non-static method
//        System.out.println("The table is");
//        m.product(5);
        pattern(5);
        pattern2(5);
    }
}
