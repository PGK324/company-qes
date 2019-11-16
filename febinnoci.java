package challenge;
import java.util.Scanner;
public class febinnoci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1;
		System.out.printf("%d%d", a,b);
		for(int i=0;i<=10;i++){
			int c=a+b;
			System.out.printf("%d%d",c);
			a=b;
			b=c;// TODO Auto-generated method stub
		}

	}

}
