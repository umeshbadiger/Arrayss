package arrays;

public class StringTOstringTYpeArray 
{
	public static void main(String[] args) 
	{
		String s1= "how are you";
		int count = 0;
		for(int i=0; i<s1.length()-1; i++)
		{
			if(s1.charAt(i)==' '&& s1.charAt(i+1)!=' ')
				count++;
		}
		String[] ar = new String[count+1];
				int j=0;
		String temp = "";
		
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)!=' ')
			{
				temp = temp+s1.charAt(i);	
			}
			else if(s1.charAt(i)==' ')
			{
				ar[j]=temp;
				j++;
				temp="";
			}
				
		}
		    ar[j]=temp;
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
