package codewithaman;
import java.util.Scanner;
public class eggcalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount of eggs you had");
		double n= sc.nextDouble();
		double gross=n/144;
		n= n%144;
		double dozen=n/12;
		n=n%12;
		System.out.println("gross= "+gross+" dozen"+dozen+" number of egg="+n);
	}

}
