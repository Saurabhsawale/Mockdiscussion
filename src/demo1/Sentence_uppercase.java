package demo1;

public class Sentence_uppercase 
{

public static void main(String[] args)
{
	String org="mock group five";
	
	String[] Text=org.split(" ");  //{"mock","group","five"}

	for(int i=0; i<=Text.length-1; i++)
	{
		String Sr=Text[i];//five=Five
		
		String S1=Sr.substring(0,1).toUpperCase()+Sr.substring(1);

		System.out.print(S1+" ");//Mock Group Five 


	}


}

}
