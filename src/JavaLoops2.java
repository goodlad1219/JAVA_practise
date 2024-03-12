import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            String output = "";
            for (int k=0; k<n; k++){
                int sum =a;
                for(int j = 0; j<=k; j++){
                    sum += (int)(Math.pow(2.0, (double)(j))* b) ;
                }
                output += sum + " ";
            }

            System.out.println(output);
        }
        in.close();
    }
}
