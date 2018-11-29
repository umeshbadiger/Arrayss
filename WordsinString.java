package arrays;

public class WordsinString {
	
	public static void main(String[] args) 
	{
		String s= "I LOVE YOU";
		String temp = "";
		String z[]=s.split(" ");
		
		System.out.println(z.length);
		
		
		
		char[]a = s.toCharArray();
		int count =1;
		for(int i=0;i<a.length; i++)
		{
			if(a[i]==' '&& a[i+1]!=' ' )
			{
				count++;
			}
		}
		System.out.println("no of words = "+count);
	}
}
