
package Maven;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail_unrd {

 public static void main(String[] args) throws InterruptedException
 {
  // Initialize browser
  System.setProperty("webdriver.chrome.driver", "E:\\satheesh\\workspace\\Browser _Servers\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
   
  // Open Gmail
  driver.get("http://www.gmail.com");
  
        // Login to Gmail
        driver.findElement(By.id("identifierId")).sendKeys("satheesh.sampath@terralogic.com");
        driver.findElement(By.id("identifierNext")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys("satsam@93");
        //driver.findElement(By.id("PersistentCookie")).click();
        driver.findElement(By.xpath(".//*[@id='passwordNext']")).click();
      
      
  List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zA zE']"));

  System.out.println("Unread email is:"+unreademeil.size());
  

  /*for(int i=0;i<unreademeil.size();i++)
  {
      if(unreademeil.get(i).isDisplayed()==true)
      {*/
    	  driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
    	  //WebDriverWait wait = new WebDriverWait(driver,30);
    	  //wait.until(ExpectedConditions.presenceOfElementLocated(By.id(":lx']")));
    	  driver.findElement(By.name("to")).sendKeys("satjob93@gmail.com");
    	  driver.findElement(By.name("subjectbox")).sendKeys("Automated Email !");
    	  driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("This is an Auto-generated email to notify about the number of unread mails from inbox !! \n \n Count : "+unreademeil.size());
    	  driver.findElement(By.xpath("//div[text()='Send']")).click();
          /*driver.findElement(By.xpath("//*[@class='gstq_d gstq_a gsfs']")).click();
          //driver.findElement(By.xpath("//*[@class='zA zE']")).click();
          //driver.findElement(By.xpath("//*[@class='hA T-I-J3']")).click();
          //driver.findElement(By.xpath("//*[@id='r3']")).click(); 
          //driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("satjob93@gmail.com");
          //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          driver.findElement(By.xpath("//div[text()='Send']")).click();
          //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/u/0/#inbox']")).click();  
          */

      }
  
 // driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("shabnum.khanum@terralogic.com");
 
  
  

 // Message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("abc@abc.com,abc@def.com,ghi@abc.com"));
  
  //driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Automated Email !");
  //driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("This is an Auto-generated email to notify about the number of unread mails from inbox !! \n Count : "+unreadInboxMails);
  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  //driver.findElement(By.xpath("//div[text()='Send']")).click();
  
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get("https://accounts.google.com/ServiceLogin?");
  

  
  
  
  // To send Email
  
  
  
  
  
  // Sign out
       // driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
        //driver.findElement(By.xpath("//*[@id='gb_71']")).click();
        
        // Closing Browser 
        //driver.close();
 
 }


