package practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "12345";
		char array[] = name.toCharArray();
		int size = name.length();
		
		for(int i=size-1;i>=0;i--) {
			System.out.print(array[i]);
		}
		System.out.println();
		
		StringBuffer a = new StringBuffer("Software Testing Material");
		System.out.println(a.reverse());
		System.out.println();
		
		String input="Software Testing Material";
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		System.out.println(input1.reverse() + " builder");
		input1=input1.reverse();
	}

}