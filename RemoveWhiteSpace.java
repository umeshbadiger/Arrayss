package arrays;

public class RemoveWhiteSpace
{
	public static void main(String[] args) {
		String s= "   i love programmong    ";
		int st =0;
		int ed =0;
		String temp="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
				st=i;
				break;
			}
		}
		for(int j=s.length()-1; j>=0; j--)
		{
			if(s.charAt(j)!=' ')
			{
				ed=j;
				break;
			}
		}
		for(int k=st; k<=ed; k++)
		{
			temp = temp+s.charAt(k);
		}
		System.out.println(temp);
	}

}
