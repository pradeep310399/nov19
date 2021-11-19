package november19;

public class EqualsString {

	

	public static void main(java.lang.String[] args) {
		String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");

	}

}
/*output of the program is "different text" because when we use the new keyword the value stored in the 
 * heap memory.when stored in the heap memory the value stored in different address. if we check both the Strings with "==" symbol.
 * it shows as the different text as per the address location.
 */ 
