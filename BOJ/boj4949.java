import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
 
    public static void main(String[] args) throws IOException{
    	BufferedReader brd = new BufferedReader(new InputStreamReader(System.in));
    	Stack<Character> stack;
    	
    	
    	while(true) {
    		String input = brd.readLine();
    		if(input.equals(".")) {
    			break;
    		}
    		stack = new Stack<Character>();
    		boolean flag = true;
    		for(int i=0;i<input.length();i++) {
    			char temp = input.charAt(i);
    				if(temp=='('||temp=='[') {
    					stack.push(temp);
    				}else if(temp==')'||temp==']') {
    					if(stack.isEmpty()) {
    						flag = false;
    						break;
    					}
    					if(temp==')'&&stack.peek()=='(') {
    						stack.pop();
    					}else if(temp==']'&&stack.peek()=='[') {
    						stack.pop();
    					}else {
    						flag = false;
    						break;
    					}
    					
    					
    				}
    			
    		}
    		if(!stack.isEmpty()) {
    			System.out.println("no");
    			continue;
    		}
    		if(flag==false) {
    			System.out.println("no");
    			continue;
    		}
    		if(stack.isEmpty()) {
    			System.out.println("yes");
    		}
    		
    	}

    }
 
}	
