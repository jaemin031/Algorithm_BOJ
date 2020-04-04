import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer=0;
        int N=Integer.parseInt(sc.nextLine().trim());
        for(int i=1;N!=0;i++){
            if(N<i)
                i=0;
            else{ 
                N-=i;
            answer++;
            }
        }
        System.out.println(answer);
        
    }
}
