import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        int n=0;
        n=(n|1<<a);
        n=(n|1<<b);
        System.out.println(n);
    }
}
