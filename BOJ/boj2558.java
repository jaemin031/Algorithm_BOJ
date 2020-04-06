import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int A,B;
        Scanner scanner = new Scanner(System.in);
        A=Integer.parseInt(scanner.nextLine());
        B=Integer.parseInt(scanner.nextLine());
        
        System.out.println(A+B);
        
        scanner.close();
        scanner=null;
        
    }
}
