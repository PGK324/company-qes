package challenge;

import java.util.Scanner;

public class arraygcd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		int x=0;
		int i=1;
		while(i<=n)
		{
		if(a[i]%x==0)
		{
		i++;
		}
		else
		{
		x=a[i]%x;
		i++;
		}
		}
		System.out.println(x);
		sc.close();
		}

		}

// TODO Auto-generated method stub

