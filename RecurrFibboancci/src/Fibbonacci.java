import java.util.Scanner;

public class Fibbonacci {
	public static int fibbRecur(int a,int b,int n,int i) {
		if(i==n)
			return a+b;
		int fibb=a+b;
		System.out.println(fibb);
		return fibbRecur(b,fibb,n,i++);
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter Num");
//	
//		int key=sc.nextInt();
		System.out.println('0');
		System.out.println(fibbRecur(0,1,10,2));

	}

}
