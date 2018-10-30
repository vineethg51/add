import java.util.Scanner;

public class add {
	public static void main(String[] args){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		c=add(a,b);
		System.out.println(" Addition of two numbers is : "+c);
		
	}
	static int add(int x,int y)
	{
		return x+y;
	}

}
