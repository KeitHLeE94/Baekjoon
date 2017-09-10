import java.util.Scanner;

/**
 * Created by Keith_Lee on 2017-09-11.
 */
public class Main {
    static int zero = 0;
    static int one = 0;

    public static int fibonacci(int n){
        if(n==0){
            zero++;
            return 0;
        } else if(n==1){
            one++;
            return 1;
        } else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0; i<num; i++){
            int input = scan.nextInt();
            fibonacci(input);
            System.out.println(zero + " " + one);
            zero = 0;
            one = 0;
        }
    }
}
