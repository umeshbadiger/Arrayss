package arrays;

public class StringReverse3 
{
	public static void main(String[] args)
	{
		String s= "programer";
		String temp = ""; char t;
		char a[] = s.toCharArray();
		for(int i=0; i<a.length/2; i++)
		{
			t=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i] = t;
			
		}
		for(int i=0; i<a.length; i++)
		{
			temp = temp+a[i];
		}
		System.out.println(temp);
	}

	

}
