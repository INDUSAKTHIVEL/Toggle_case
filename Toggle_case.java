package Toggle;
import java.util.*;
public class Toggle_case {

	public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    StringBuilder res = new StringBuilder();
			    System.out.println("Enter the String:");
			    String s = sc.next();
			    
			    for(int i = 0; i < s.length(); i++){
			        char c = s.charAt(i);
			        if(Character.isUpperCase(c)){
			            c = Character.toLowerCase(c);
			            res.append(c);
			        }else{
			            c = Character.toUpperCase(c);
			            res.append(c);
			        }
			    }
			    System.out.println(res);

	}

}
