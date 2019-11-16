package challenge;
import java.util.Scanner;
public class arcofcircle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double pi=22.0/7.0;
		double arc;
		int angle;
		int diameter;
		if(angle>=360) {
			System.out.println("angle can not"+"be formed");
			return 0;
			// TODO Auto-generated method stub
		}
		else {
			arc=(pi*diameter)*(angle/360.0);
			return arc;
		}

	}

}
