/*
 *You are an IT support administration specialist and are charged with the task of creating email accounts for new hires
 * 
 * */

package emailapp;

public class EmailApp {
	public static void main(String[] args) {
		Email em1=new Email("John","Smith");
		
		System.out.println(em1.showInfo());
	}
}
