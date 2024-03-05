import java.util.Scanner;

public class JavaStdinAndStdout1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInt = sc.nextInt();
        int secondInt = sc.nextInt();
        int thirdInt = sc.nextInt();

        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);
    }
}
