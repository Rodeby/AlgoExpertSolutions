import java.util.*;

class Program {
  public static boolean balancedBrackets(String str) {
		Stack<String> stack = new Stack<>();
		Boolean isBal = true;
		
		for(int i = 0; i < str.length(); i++) {
      
			String temp = String.valueOf(str.charAt(i));
	
			if(temp.equals(")") || temp.equals("]")  || temp.equals("}")  ) {
				if(stack.isEmpty())
					return false;
				String front = stack.pop();
				switch(front) {
					case "(": 
						if(!(temp.equals(")")) )
							isBal = false;
							break;
					case "[": 
						if(!(temp.equals("]")) )
							isBal = false;
							break;
					case "{": 
						if(!(temp.equals("}")) )
							isBal = false;
							break;
				}	
			}
				
			else if( temp.equals("(") || temp.equals("[")||temp.equals("{") ) {		
				stack.push(temp);
			}		
		}
		if(!stack.isEmpty())
			isBal = false;
	
		return isBal;
  }
}
