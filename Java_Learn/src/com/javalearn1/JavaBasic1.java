package com.javalearn1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



public class JavaBasic1 {

	public static void main(String[] args) throws InterruptedException {
		//Firefox driver		
		/* System.setProperty("webdriver.gecko.driver", "D:\\Dsp_Dspecial\\Selenium\\Latest Jan18\\drivers\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		//Chrome driver
//		System.setProperty("webdriver.chrome.driver", "D:\\Dsp_Dspecial\\Selenium\\Latest Jan18\\drivers\\chromedriver.exe");

		wd.get("https://www.naukri.com/");
		//Enter credentials
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize browser
		wd.manage().window().maximize();
		

		
		//wd.findElement(By.xpath("/html/body/div[9]/div[2]/div[2]/form/div[1]"))	
		String parentWindow = wd.getWindowHandle();
		
		Set<String> childWindows =wd.getWindowHandles();
		Iterator<String> it =childWindows.iterator();
        while (it.hasNext()){    
           String popupHandle=it.next().toString();
           if(!popupHandle.contains(parentWindow))
           {
           wd.switchTo().window(popupHandle);
           System.out.println("Pop Up Title: "+ wd.switchTo().window(popupHandle).getTitle());
           wd.close();
           }
        }
        System.out.println("the system handle is"+parentWindow);
        wd.switchTo().window(parentWindow);
        
        wd.findElement(By.xpath("/html/body/div[2]/div/ul/li[6]/a/div")).click();	
        
		wd.findElement(By.xpath("//*[@id='eLoginNew']")).sendKeys("devisaiprasad62@gmail.com");
		wd.findElement(By.xpath("//*[@id='pLogin']")).sendKeys("Dspk@123");
		wd.findElement(By.xpath("/html/body/div[9]/div[2]/div[2]/form/div[9]/button")).click();
		
		
		
		*/
	}

}
