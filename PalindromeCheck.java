import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    int start = 0;
		int last = str.length()-1;
		boolean isPal = true;
		while(start < last){
			if(str.charAt(start) != str.charAt(last))
					isPal = false;
			start++;
			last--;
		}
    return isPal;
  }
}
