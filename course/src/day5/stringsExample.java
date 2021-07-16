package day5;
import java.util.StringTokenizer;

class toStrClass {
	int rno;
	String name;

	toStrClass(String name, int rno) {
		this.rno = rno;
		this.name = name;
	}	
	
	public void dispNormal() {
		System.out.println("Roll num: "+this.rno);
		System.out.println("Name: "+this.name);		
	}
	
	public void dispToString() {
		String rno = Integer.toString(this.rno);
		System.out.println("Roll num: "+rno);
		System.out.println("Name: "+this.name);		
	}
}

public class stringsExample {

	public static String myStrRev(String s) {
		String rev = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		return rev;
	}

	public static void main(String[] args) {
		String place = "Trivandrum";

		System.out.println(place.charAt(4));
		System.out.println(place.length());
		System.out.println(place.concat("city"));
		System.out.println(place);
		System.out.println(place.indexOf('m'));
		System.out.println(place.compareTo("drum"));
		System.out.println(place.endsWith("drum"));
		System.out.println(place.contains("lol"));
		System.out.println(place.equalsIgnoreCase(place));

		System.out.println();
				
		// str tokenizer
		StringTokenizer st = new StringTokenizer("this is my string");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println();
		
		// to string conversion
		toStrClass s1 = new toStrClass("khiladi",786);
		s1.dispNormal();
		s1.dispToString();

		System.out.println();
		
		// srt reverse
		System.out.println(myStrRev(place));
	}

}
