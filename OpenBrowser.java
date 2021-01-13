package browserhandle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser 
{

	public static void main(String[] args) 
	{
		//Open Browser
		FirefoxDriver rv=new FirefoxDriver();
		//Open App
		rv.get("http://www.google.com");
		//Close Browser
		rv.close();
		

	}

}
