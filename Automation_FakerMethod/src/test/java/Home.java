import org.testng.annotations.Test;

import Logic.HomePageLogic;
import Logic.LaunchBrowsers;


public class Home extends LaunchBrowsers {
	 /**
     * Method to verify UI element in  home page
     * @throws Exception
     */
    @Test
    public void homePagevalidation() throws Exception{
//       VootHomePageLogic.verifyHomePageNavigation();
//        VootHomePageLogic.verifyVootLogo();
       HomePageLogic. navigateToContactus();
       HomePageLogic.verifySuccessfulMsg();
    }

}
