package arrays;

public class SpitFUNCTION 
{
	public static void main(String[] args) 
	{int count=0;
		String s1 = "java mava how are you";
		String[] a = s1.split("");
		
		for(int i=a.length-1; i>=0; i--)
		{
			if(i%2 != 0)
			{
				String s2 = a[i];
				for(int k = s2.length()-1; k>=0; k--)
				{
					System.out.print(s2.charAt(k));
				}
				System.out.print(" ");
				
			}
			else
				System.out.print(a[i]+" ");
		}
		
	}

}
