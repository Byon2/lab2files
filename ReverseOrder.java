package lab1assignments;
import java.util.*;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please write a sentence");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		s=iterative(s);
		System.out.println(s);
		s=recursive(s);
		System.out.println(s);
		
		recursive(s);
	}
	
	static String recursive(String s){
		if(s.isEmpty()) {
			return s;
		}else{
			return recursive(s.substring(1))+s.charAt(0);
		}
	}
	
	static String iterative(String s) {
		char[] c = new char[s.length()];
		for(int i = 0; i<s.length(); i++) {
			c[s.length() - i - 1] = s.charAt(i);
		}
		s = new String(c);
		return s;
	}

}


