import java.util.Scanner;
import java.util.Stack;

public class Main {
 
    public static void main(String[] args){
 
    	Stack<Integer> stack;
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	
    	for(int i=0;i<n;i++) {
    		stack = new Stack<Integer>();
    		String in = sc.next();
    		int flag = 0;
    		for(int j=0;j<in.length();j++) {
    			if(in.charAt(j)=='(') {
    				stack.push(0);
    				flag = 1;
    			}else if(stack.isEmpty()&&in.charAt(j)==')') {
    				flag = 1;
    				break;
    			}else if((!stack.isEmpty())&&in.charAt(j)==')') {
    				stack.pop();
    				flag = 0;
    			}
    		}
    		if(!stack.isEmpty()) {
    			flag = 1;
    		}
    		if(flag==0) {
    			System.out.println("YES");
    		}else if(flag ==1) {
    			System.out.println("NO");
    		}
    	}


    }
 
}	
