package apr3rd;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String s1="hello world";
		
		char ch1=97;
		System.out.println(ch1);
		char ch2=65;
		System.out.println(ch2);
		
		int[] ch=new int[256];
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print((char)i+"\t");
			System.out.println(ch[i]);
		}
		

	}

}
