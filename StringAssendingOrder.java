package arrays;

public class StringAssendingOrder 
{
	public static void main(String[] args) {
		String s = "umesh";
		char a[]= s.toCharArray();
		String temp =""; char t=0;
		
		for(int i=1; i<a.length; i++)
		{
			for(int j=0; j<a.length-i; j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
				
			}
		}
		for(int i=0; i<a.length; i++)
		{
			temp=temp+ a[i];
		}
		System.out.println(temp);
	}

}
