package challenge;
import java.util.Scanner;
public class lengthofstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int i=0;
		 
		char c[]=str.toCharArray();
		while(c[i]!=0)
		{
			i++;
		}
		System.out.println(i);
		
		}

	}


