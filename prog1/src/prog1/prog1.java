package prog1;
import java.util.Scanner;
public class prog1 {
public static void main(String[] args){
	int a;
	Scanner reader = new Scanner(System.in);
	System.out.print("Year");
	a = reader.nextInt();
	if (a%400==0) {
		System.out.print("Bisiesto");
		
		}else if(a%4==0 && a%100!=0 ){
			System.out.print("Bisiesto");
		}else {
			System.out.print("No Bisiesto");
		}

}
}
