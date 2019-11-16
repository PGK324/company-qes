package challenge;
import java.util.Scanner;
public class amstr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		int b=a;
		while(a!=0)
		{
			int r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
			if(sum==b)
			{
				System.out.print("Yes");
			}
			else
			{
				System.out.print("No");
			}// TODO Auto-generated method stub

		}
	}

