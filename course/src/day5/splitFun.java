package day5;

public class splitFun {

	public static void main(String[] args) {
		String str = "how are you ravi";
		String[] s = str.split(" ");

		System.out.println(str.length());
		System.out.println(s.length);
		
		for(String st : s) {
			System.out.print(st+" : ");
		}
		
		// check for a word
		int nameCount = 0;
		String name = "ravi";
		
		for(String st : s) {
			if(st.equalsIgnoreCase(name)) {
				System.out.println("Word '"+name+"' is present");
				nameCount++;
			}
			else {
				System.out.println("Word '"+name+"' is NOT present");
			}
		}
		System.out.println(name+" occured "+nameCount+" times.");

	}

}
