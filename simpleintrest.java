package challenge;
import java.util.Scanner;
public class simpleintrest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		int n=s.nextInt();
		float r=s.nextFloat();
		float i=(p*n*r)/100;
		System.out.print("sample intrest=%.02f" + i);
		
		// TODO Auto-generated method stub

	}

}
