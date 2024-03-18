package sit707_week2;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args )
    {
    	int choice = 2;

		switch (choice) {
		case 1:
			SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
			break;
		case 2:
			SeleniumOperations.chemistwarehouse_registration_page("https://www.chemistwarehouse.com.au/login");
			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
    }
   
}
