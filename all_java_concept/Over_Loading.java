/**
 * 
 */
package all_java_concept;

public class Over_Loading {

  private void stud_Details(int a) {
	  System.out.println(a);

}
  
  private void stud_Details(int a, String b) {
	  System.out.println(a+b);

}
  
  private void stud_Details(int a,int b) {
	  System.out.println(a+b);

}
  
  private void stud_Details(int a,int b,int c) {
	  System.out.println(a+b+c);

}
	
	
	public static void main(String[] args) {
		
		Over_Loading stud =new Over_Loading();
		stud.stud_Details(21,"Kavin Kumar");
		stud.stud_Details(10);
		stud.stud_Details(100, 1000);
		stud.stud_Details(1, 11, 111);
		

	}

}
