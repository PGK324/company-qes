package challenge;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int g=1;
for(int i=1;i<=n1 && i<=n2;i++)
{
	if(n1%i==0 && n2%i==0)
		g=i;
}
System.out.printf("G.C.D of %d and %d is %d", n1, n2, g);}
	}