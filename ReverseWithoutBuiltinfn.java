package arrays;

public class ReverseWithoutBuiltinfn
{
	public static void main(String[] args) {
		String s= "programer";
		String temp = "";
		char[] a =s.toCharArray();
		for(int i=a.length-1; i>=0; i--)
		{
			temp = temp+(a[i]);
		}
		System.out.println(temp);
	}
}
