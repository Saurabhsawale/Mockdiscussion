package demo1;

public class test
{


public static void main(String[] args)
{

	int a=1010;

	int rev=0;

	//i=0101 			0101/10=10.1
				//10>0   10/10=1
				//1>0
	
	
	
	for(int i=a;  i>0;  i=i/10)
	{
		int rem = i % 10;   // 1

		 rev = (rev*10) + rem;  //=110
	}

	System.out.println(rev);




}
}
