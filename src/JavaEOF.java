import java.util.Scanner;

public class JavaEOF {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int count =1;
        String input = "";
        Scanner sc = new Scanner(System.in);
        do {
            input = sc.nextLine();
            System.out.println(count + " " + input);
            count++;
        }while(sc.hasNext());
    }
}
