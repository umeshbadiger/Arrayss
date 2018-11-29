package arrays;

public class Practice 
{
	public static void main(String[] args)
	{
		String s= "i love jAVa";
		String temp="";
		int count = 0; int j= 1;
		char[] a = s.toCharArray();
		for(int i=0; i<a.length; i++)
		{
			
		if(	i==0 && a[i+1]==' ' ||a[i-1]==' '&& a[i]!=' ')
		{	
			if(a[i]>=97 && a[i]<=122)
			{
				temp =temp+(char)(a[i]-32);
			}
			
		}
		else if(a[i]>=65 && a[i]<=90)
		{
			temp= temp+(char)(a[i]+32);
		}
		else
		{
			temp= temp+(char)(a[i]);
		}

			
		}
		System.out.println(temp);
	}
}

