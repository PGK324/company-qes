package challenge;
import java.util.Scanner;
public class lcm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int lcm;
		lcm=(n1>n2)?n1 : n2;
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
				System.out.printf("the lcm of %d &%d is %d",n1,n2,lcm);
				break;// TODO Auto-generated method stub
			}
			++lcm;
		}

	}

}
