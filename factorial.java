package challenge;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;
		int num=s.nextInt();
		for (int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(num+fact);

	}

}
