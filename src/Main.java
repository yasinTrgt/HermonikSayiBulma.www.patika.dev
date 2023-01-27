import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("N Sayısını Giriniz : ");
        int n = sc.nextInt();
        double result = 0;
        double i = 1;

        while(i <= n){
            result += (1/i);
            i++;
        }
        System.out.print(result);
    }
}
