package linear_search;
import java.util.Scanner;
public class Linear_Search {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.print("ENTER THE SIZE OF ARRAY-->>");
	int n=scan.nextInt();
	int []A=new int[n];
	System.out.print("ENTER THE ELEMENTS OF ARRAY>>\n");
	int i,k=0;
	for(i=0;i<n;i++)
	{
		A[i]=scan.nextInt();
	}
	System.out.print("\nENTER THE ELEMENTS FOR SEARCH>>");
	int j=scan.nextInt();
	for(i=0;i<n;i++)
	{
		k=0;
		if(A[i]==j)
		{
			k=1;
			break;
		}
	}
	if(k==1)
	{
		System.out.print("\nElement at position>>"+(i+1));
	}
	else
	{
		System.out.print("\nELEMENT NOT FOUND");
	}
}
}
