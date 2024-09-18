package appleusa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class endtoendflow {

	public static void main(String[] args) throws InterruptedException {
		String item="iPhone";

		String iphone="iPhone 15 &";

		String name="prathik";

		String lastname="Rao";

		String street="No 347";

		String emailid="prathikprao@gmail.com";

		String phono="1234567891";

		

		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.apple.com/us/store");

		driver.manage().window().maximize();

		Thread.sleep(5000);

	List<WebElement> items=driver.findElements(By.xpath("//a[@class='rf-productnav-card-title']"));

	

	for(int i=0;i<items.size();i++)

	{

	if(items.get(i).getText().equalsIgnoreCase(item))

	{

		driver.findElements(By.xpath("//a[@class='rf-productnav-card-title']")).get(i).click();

		break;

	}

	}

	Thread.sleep(5000);

	JavascriptExecutor js = (JavascriptExecutor) driver;

	js.executeScript("window.scrollBy(0,500)", "");

	List<WebElement> iphonemodel=driver.findElements(By.xpath("//h3[@class='rf-hcard-content-title']"));

	

	for(int j=0;j<iphonemodel.size();j++)

	{

		

	if(iphonemodel.get(j).getText().contains(iphone))

	{

	

		driver.findElements(By.xpath("//a[@class='rf-hcard-cta button']")).get(j).click();

		break;

	}

	

	

	}

	

	Thread.sleep(5000);

	driver.findElement(By.xpath("(//input[@id=':r7:'])[1]")).click();

	Thread.sleep(5000);

	driver.navigate().refresh();

	driver.findElement(By.xpath("(//img[@class='colornav-swatch'])[2]")).click();

	Thread.sleep(3000);

	driver.findElement(By.xpath("(//label[@id=':rf:_label'])[1]")).click();

	Thread.sleep(3000);

	driver.findElement(By.id("noTradeIn_label")).click();

	Thread.sleep(5000);

	//driver.navigate().refresh();
	//Thread.sleep(5000);
	JavascriptExecutor jk = (JavascriptExecutor) driver;

	jk.executeScript("window.scrollBy(0,350)", "");

	Thread.sleep(5000);
//driver.findElement(By.id(":r33:_label")).click();
	driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(12) > div:nth-child(5) > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > fieldset:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > label:nth-child(2)")).click();

	Thread.sleep(5000);

	driver.findElement(By.xpath("//label[@id=':rm:_label']")).click();

	Thread.sleep(3000);

	driver.findElement(By.id("applecareplus_58_noapplecare_label")).click();

	Thread.sleep(3000);

	driver.findElement(By.name("add-to-cart")).click();

	

	driver.findElement(By.xpath("//button[@value='proceed']")).click();

	Thread.sleep(3000);

	driver.findElement(By.id("shoppingCart.actions.checkout")).click();

	

	

	driver.findElement(By.id("signIn.guestLogin.guestLogin")).click();

	Thread.sleep(3000);

	driver.findElement(By.id("checkout.fulfillment.deliveryTab.delivery.deliveryLocation.address.postalCode")).sendKeys("10000");

	Thread.sleep(3000);

	driver.findElement(By.id("checkout.fulfillment.deliveryTab.delivery.deliveryLocation.address.calculate")).click();

	Thread.sleep(3000);

	driver.findElement(By.id("rs-checkout-continue-button-bottom")).click();

	

	

	driver.findElement(By.name("firstName")).sendKeys(name);

	driver.findElement(By.name("lastName")).sendKeys(lastname);

	driver.findElement(By.name("street")).sendKeys(street);

	driver.findElement(By.name("city")).sendKeys("NY");

	driver.findElement(By.name("state")).sendKeys("NY");

	driver.findElement(By.name("emailAddress")).sendKeys(emailid);

	driver.findElement(By.name("fullDaytimePhone")).sendKeys(phono);

	Thread.sleep(3000);

	driver.findElement(By.id("rs-checkout-continue-button-bottom")).click();

	

	

	driver.findElement(By.id("checkout.shipping.addressVerification.selectedAddress.continueWithSelectedAddress")).click();

	

	Thread.sleep(3000);

	driver.findElement(By.id("checkout.billing.billingoptions.credit_label")).click();

	driver.findElement(By.id("checkout.billing.billingOptions.selectedBillingOptions.creditCard.cardInputs.cardInput-0.cardNumber")).sendKeys("4444444444444448");

	driver.findElement(By.id("checkout.billing.billingOptions.selectedBillingOptions.creditCard.cardInputs.cardInput-0.expiration")).sendKeys("07/24");

	driver.findElement(By.id("checkout.billing.billingOptions.selectedBillingOptions.creditCard.cardInputs.cardInput-0.securityCode")).sendKeys("123");

	Thread.sleep(3000);

	driver.findElement(By.id("rs-checkout-continue-button-bottom")).click();

	

	

	}




	}

