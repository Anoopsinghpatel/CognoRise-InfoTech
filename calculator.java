package calculator;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n1, n2, ans;
			char operator;
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter a Number");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			System.out.println("Enter the opeeator" + "( + ," + " - ," + " * ," + " / )");
			operator = sc.next().charAt(0);
			switch(operator) {
			case '+' :
				System.out.println("ans="+(n1+n2));
			break;
			
			case '-' :
				System.out.println("ans="+(n1-n2));
			break;
			
			case '*' :
				System.out.println("ans="+(n1*n2));
			break;
			
			case '/' :
				try{
					System.out.println("ans="+(n1/n2));
				}catch(Exception e) {
 				   System.out.println(" Error: Division by zero");
				}
			break;
			
			default:System.out.println(" Error! ");
			return;
			
			}
			
			}
		catch(Exception e) {
		System.out.println(" Error: "+e.getMessage());
		
		}

		}

}
