
/*
Check if regex given is valid or not.
*/
import java.util*;
import java.util.regex.*;

class ValidREGEX{
	public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int testcases=sc.nextInt();
			scan.nextLine();
			while(testcases-->0){
				String pattern=sc.nextLine();
				try{
					Pattern.compile(pattern);
					System.out.println("Valid");
				}catch(PatternSyntaxException exception){
					System.out.println("Invalid");
				}
			}
	}
}