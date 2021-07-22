package day7;

public class multiCatch {

	//public static void main(String[] args) throw ArithmaticException,IOException {  // TO AVOIDE MULTIPLE CATCH BLOCKS
	public static void main(String[] args) {  // throw ArithmaticException,IOException
		
		int a = 4;
		int b = 0;
		try {
			//
		}
		/*
		catch(ArithmaticException e) {
			//
		}
		
		catch(ArrayIndexOutOfBoundException e) {
			//
		}
		*/
		
		// instead of multiple catch block.. use following
		catch(Exception e) {
			System.out.println("Exception occured!");
		}
		finally {
			System.out.println("out");
		}
		

	}

}
