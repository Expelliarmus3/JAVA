package test;

public class Methods2 {
    public static void patterns(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rec_pattern(int n) {
        if(n>0){
            rec_pattern(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //patterns(5);
        rec_pattern(5);
    }
}
