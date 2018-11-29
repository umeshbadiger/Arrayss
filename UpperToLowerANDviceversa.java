package arrays;

public class UpperToLowerANDviceversa
{
	public static void main(String[] args)
	{
		String s = "i LOVE programming";
		String temp="";
		char a[]=s.toCharArray();
		for(int i=0; i<s.length(); i++)
		{
			if(a[i]>=97 && a[i]<=122)
			{
				temp =temp+"*"+(char)(a[i]-32);
			}
			else if(a[i]>=65 && a[i]<=90)
			{
				temp =(temp)+(char)(a[i]+32);
			}
			else
				temp = temp+(char)a[i];
			
		}
		System.out.println(temp);
	}

}
