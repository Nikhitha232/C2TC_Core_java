import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		char arr1[]=str.toCharArray();
		int index=0;
		for(char i:arr1)
		{
			if(i>='a'&& i<='z')
			{
				ch=(char)(i-32);
			}
			else if(i>='A'&&i<='Z')
			{
				ch=(char)(i+32);
			}
			else
			{
				ch=i;
			}
			sb.setCharAt(index++, ch);
		}
		System.out.println(sb);
	}

}
