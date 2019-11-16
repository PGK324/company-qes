package challenge;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int pow =s.nextInt();
		long res=1;
		int i = pow;
		while (i != 0) 
		{
			res *= num;
			--i;
		}
		System.out.println(num + "^" + pow + "=" + res);
	}
}
