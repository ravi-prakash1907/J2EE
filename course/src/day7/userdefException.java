package day7;

class MyException extends Exception {
	MyException(String name) {
		super(name);
	}
}

public class userdefException {

	public static void main(String[] args) {
		int age = 32;
		try {
			if(age<18) {
				throw new MyException("wrong value");
			} else {
				System.out.println("Go vote!");
			}
		} catch (MyException e) {
			System.out.println("Age less then 18 years!");
		}		

	}

}
