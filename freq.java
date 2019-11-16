package challenge;
import java.util.Scanner;
public class freq {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
				// TODO Auto-generated method stub
			}
		}
		if(!flag)
			System.out.println(num +"is prime");
		else
			System.out.println(num +"is not prime");

	}

}
