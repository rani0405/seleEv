package testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AllTests {
	
	//DataProvider Example
	@DataProvider(name="loginData")
	public Object[][] loginData(){
		return new Object[][] {
			{"user1","pass1"},
			{"user2","pass2"},
			{"user3","pass3"}
		};
	}
@Test(dataProvider="loginData",groups= {"sanity"})
public void testLogin(String username,String password) {
	System.out.println("Login Test - Username: " + username + ", Password: " + password);
}
// Group Example
@Test(groups= {"regression"})
public void testHomePage() {
	System.out.println("Homepage Test");
}
//Priority Example
@Test(priority = 2)
public void testProfilePage() {
    System.out.println("Profile Page Test");
}

@Test(priority = 1)
public void testSearch() {
    System.out.println("Search Test");
}

// Parallel Testing Example
@Test
public void testParallelA() {
    System.out.println("Parallel Test A - Thread: " + Thread.currentThread().getId());
}

@Test
public void testParallelB() {
    System.out.println("Parallel Test B - Thread: " + Thread.currentThread().getId());
}
}
