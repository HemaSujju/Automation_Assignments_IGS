import org.testng.annotations.Test;


import Logic.LaunchBrowsers;
import Logic.HomePagesLogic;

public class Home extends LaunchBrowsers {
	 /**
     * Method to verify UI element in voot home page
     * @throws Exception
     */
    @Test
    public void homePagevalidation() throws Exception{
//       VootHomePageLogic.verifyHomePageNavigation();
//        VootHomePageLogic.verifyVootLogo();
       HomePagesLogic. navigateToContactus();
    }

}
