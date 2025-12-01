import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int length=s.length();
		int count=0;
		for(int i=0; i<length/2; i++)
		{
			if(s.charAt(i)== s.charAt(length-i-1))
			{
				count++;
			}
		}
		if(count==length/2)
		{
			System.out.printf("yes");
		}
		else {
			System.out.print("no");
		}
	}
}