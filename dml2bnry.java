package challenge;
import java.util.Scanner;
public class dml2bnry {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int bin[]=new int[n];
		int i=0;
		while(n>0)
		{
			bin[i]=n%2;
			n=n/2;
			i++;// TODO Auto-generated method stub
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(bin[j]);
		}

	}
}