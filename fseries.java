import java.util.Scanner;
class seriesf
{
	void method(int n) 
	{
		int a=0,b=1;
	System.out.print("0 1 ");
	if(n>2) {
	for(int i=1;i<n-1;i++) {
		int temp=a+b;
		System.out.print(temp+" ");
		a=b;
		b=temp;
							}
			}
	
	}
}
public class fseries 
{
public static void main(String args[])
	{
	Scanner read=new Scanner(System.in);
	System.out.println("Enter the number of fibonacci numbers u want and it should be more than 2");
	int a=read.nextInt();
	read.close();
	seriesf my=new seriesf();
	my.method(a);
	}
}
