package apr3rd;

public class StringDemo1 {

	public static void main(String[] args) {
		//  String Constant Pool Area   - SCPA
		String s1="hello"; // SCPA
		
		System.out.println(s1);
		
		char[] ch= {'w','o','r','l','d'};
		String s2=new String(ch);  //Heap Area 
		
		System.out.println(s2);
		
		System.out.println(s1+s2);
		
		String s3=new String("hello");
		
		System.out.println(s1==s3);  //here comparision is done on references 
		
		System.out.println(s1.equals(s3)); //here comparision is done on content

	}

}
