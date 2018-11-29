package arrays;

public class ReverseWord 
{
	public static void main(String[] args) {
		String s= "i love java";
		String temp="";
		int count = 0; int j= 0;
		
		for(int i= 0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
				count++;
		}
		String a[] = new String[count+1];
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp = temp+s.charAt(i);
			}
			else if(s.charAt(i)==' ')
			{
				a[j]= temp;
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
		for(int i=0; i<a.length; i++)
		{
			
			String t="";
			char[] ch = a[i].toCharArray();
			 for(int k=ch.length-1; k>=0; k--)
			 {
				 t=t+ch[k];
			 }
			 a[i]=t;
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
