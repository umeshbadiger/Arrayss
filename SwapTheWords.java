package arrays;

public class SwapTheWords
{
	public static void main(String[] args) {
		String s = "i love programming";
		int count = 0; int j =0;
		String temp ="";
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
				count++;
		}
		String[] a = new String[count+1];//Array of Strings
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp =temp+s.charAt(i);	
			}
			else if(s.charAt(i)==' ')
			{
				a[j]=temp;
				j++;
				temp="";
			}
		}
			a[j]=temp;
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<a.length/2; i++)
		{
			
			String t= "";
			t= a[i];
			a[i] = a[a.length-1];
			a[a.length-1-i]=t;
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	

}
