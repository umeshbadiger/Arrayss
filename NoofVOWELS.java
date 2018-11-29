package arrays;

public class NoofVOWELS 
{
	public static void main(String[] args)
	{
		String s = "programer";
		String temp = "";
		char[] a = s.toCharArray();		
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]=='a' ||a[i]=='e' ||a[i]=='i' || a[i]=='o' ||a[i]=='u')
			{
				count++;
			}
			
		}
		System.out.println("the no of vowels is: "+count);
	}

}
