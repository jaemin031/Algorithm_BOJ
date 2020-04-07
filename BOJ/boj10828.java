import java.util.Scanner;
import java.util.Stack;

public class Main {
 
    public static void main(String[] args){
 
    	Stack<Integer> stack = new Stack<Integer>();
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	
    	for(int i=0;i<n;i++) {
    		String in = sc.next();
    		if(in.contains("push")) {
    			String in2 = sc.next();
    			stack.push(Integer.parseInt(in2));
    		}else if(in.equals("pop")) {
    			System.out.println(stack.isEmpty()?-1:stack.pop());
    		}else if(in.equals("size")) {
    			System.out.println(stack.size());
    		}else if(in.equals("empty")) {
    			System.out.println(stack.isEmpty()?1:0);
    		}else if(in.equals("top")) {
    			System.out.println(stack.isEmpty()?-1:stack.peek());
    		}
    		
    		
    	}
    	
    }
 
}	
