
public class personTest {// create class
	public static void main(String [] args) {
		
		person one = new person(); // create and instilse person object
		person two = new person ("john",23,'m'); // set john 23 m as the parameters
			
		 System.out.println ("person one name is " +  one.getName() + "\npersons one name is  " + one.getAge() + "\n person one gender is " +  one.getGender());
		 // print out new objects from class given
		 System.out.println ( " person two is name is " + two.getName() + "\npesons two name is " + two.getAge() + "\npersons two name is " + one.getAge());
	// print out objects from new parameters
		
	}	// close class
	
	
	
	
	
	///trying	to	access	private	data	members
	private class personTest { // this is it with the private member
		public static void main(String [] args) {
			
			person one = new person(); // 
			person two = new person ("john",23,'m');
				
			System.out.println ("person one name is " +  one.getName() + "\npersons one name is  " + one.getAge() + "\n person one gender is " +  one.getGender());
			 
			System.out.println ( " person two is name is " + two.getName() + "\npesons two name is " + two.getAge() + "\npersons two name is " + one.getAge());
	
}
