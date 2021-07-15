package day4;

public class Arrayfunctions {

	public static void main(String[] args) {
		int[] a={10,20,30,40,50,60,70,80,90,100};
		boolean b= false;
		
		for(int i=1;i<a.length;i++)
		{
			
			
			if (a[i]==45)
			{
				System.out.println("The element present");
				b=true;
				
			}
		}
		
		if (b==false)
		{
			
			System.out.println("The element not present");
		}	
		

	}

}
