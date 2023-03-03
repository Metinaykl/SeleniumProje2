

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestingProje extends BaseDriver {
    @Test

    public void Test() {
        driver.get("https://demowebshop.tricentis.com/");


        Actions aksiyonlar = new Actions(driver);


        WebElement register = driver.findElement(By.linkText("Register"));
        Action aksiyon1 = aksiyonlar.moveToElement(register).click().build();
        aksiyon1.perform();
        MyFunc.Bekle(1);



        WebElement male = driver.findElement(By.cssSelector("input[id='gender-male']"));
        Action aksiyon2 = aksiyonlar.moveToElement(male).click().build();
        aksiyon2.perform();
        MyFunc.Bekle(1);


        WebElement firstname = driver.findElement(By.id("FirstName"));
        Action aksiyon3 = aksiyonlar.moveToElement(firstname).click().sendKeys("Grup").build();
        aksiyon3.perform();
        MyFunc.Bekle(1);


        WebElement lastname= driver.findElement(By.id("LastName"));
        Action aksiyon4 = aksiyonlar.moveToElement(lastname).click().sendKeys("12").build();
        aksiyon4.perform();
        MyFunc.Bekle(1);


        WebElement mail = driver.findElement(By.id("Email"));
        Action aksiyon5 = aksiyonlar.moveToElement(mail).click().sendKeys("grup122@gmail.com").build();
        aksiyon5.perform();
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.id("Password"));
        Action aksiyon6 = aksiyonlar.moveToElement(password).click().sendKeys("123456").build();
        aksiyon6.perform();
        MyFunc.Bekle(1);

        WebElement repassword = driver.findElement(By.id("ConfirmPassword"));
        Action aksiyon7 = aksiyonlar.moveToElement(repassword).click().sendKeys("123456").build();
        aksiyon7.perform();
        MyFunc.Bekle(1);

        WebElement registerbutton = driver.findElement(By.id("register-button"));
        Action aksiyon8 = aksiyonlar.moveToElement(registerbutton).click().build();
        aksiyon8.perform();
        MyFunc.Bekle(2);

        WebElement mesaj= driver.findElement(By.xpath("//div[@class='page-body']"));
        Assert.assertEquals("Your registration completed", mesaj.getText());



    }

    @Test
    public void Test2(){
        driver.get("https://demowebshop.tricentis.com/");


        Actions aksiyonlar = new Actions(driver);


        WebElement register = driver.findElement(By.linkText("Register"));
        Action aksiyon1 = aksiyonlar.moveToElement(register).click().build();
        aksiyon1.perform();
        MyFunc.Bekle(1);



        WebElement male = driver.findElement(By.cssSelector("input[id='gender-male']"));
        Action aksiyon2 = aksiyonlar.moveToElement(male).click().build();
        aksiyon2.perform();
        MyFunc.Bekle(1);


        WebElement firstname = driver.findElement(By.id("FirstName"));
        Action aksiyon3 = aksiyonlar.moveToElement(firstname).click().sendKeys("Grup").build();
        aksiyon3.perform();
        MyFunc.Bekle(1);


        WebElement lastname= driver.findElement(By.id("LastName"));
        Action aksiyon4 = aksiyonlar.moveToElement(lastname).click().sendKeys("12").build();
        aksiyon4.perform();
        MyFunc.Bekle(1);


        WebElement mail = driver.findElement(By.id("Email"));
        Action aksiyon5 = aksiyonlar.moveToElement(mail).click().sendKeys("grup122@gmail.com").build();
        aksiyon5.perform();
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.id("Password"));
        Action aksiyon6 = aksiyonlar.moveToElement(password).click().sendKeys("123456").build();
        aksiyon6.perform();
        MyFunc.Bekle(1);

        WebElement repassword = driver.findElement(By.id("ConfirmPassword"));
        Action aksiyon7 = aksiyonlar.moveToElement(repassword).click().sendKeys("123456").build();
        aksiyon7.perform();
        MyFunc.Bekle(1);

        WebElement registerbutton = driver.findElement(By.id("register-button"));
        Action aksiyon8 = aksiyonlar.moveToElement(registerbutton).click().build();
        aksiyon8.perform();
        MyFunc.Bekle(2);

        WebElement mesaj= driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
        Assert.assertEquals("The specified email already exists", mesaj.getText());
        BekleKapat();


    }
    @Test
    public void Test3() {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(1);

        Actions aksiyonlar = new Actions(driver);

        WebElement loginBtn= driver.findElement(By.linkText("Log in"));
        Action aksiyon= aksiyonlar.moveToElement(loginBtn).click().build();
        aksiyon.perform();
        MyFunc.Bekle(1);

        WebElement mail= driver.findElement(By.cssSelector("input[id='Email']"));
        Action aksiyon1= aksiyonlar.moveToElement(mail).click().sendKeys("Grup122@gmail.com").build();
        aksiyon1.perform();
        MyFunc.Bekle(1);

        WebElement password= driver.findElement(By.xpath("//input[@class='password']"));

        Action aksiyon2= aksiyonlar.moveToElement(password).click().sendKeys("123456").build();
        aksiyon2.perform();
        MyFunc.Bekle(1);

        WebElement login= driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        Action aksiyon3= aksiyonlar.moveToElement(login).click().build();
        aksiyon3.perform();
        MyFunc.Bekle(1);
        WebElement logOut= driver.findElement(By.linkText("Log out"));

        Assert.assertEquals("Log out", logOut.getText());

        BekleKapat();

    }

    @Test
    public void Test4(){
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(1);

        Actions aksiyonlar = new Actions(driver);

        WebElement loginBtn= driver.findElement(By.linkText("Log in"));
        Action aksiyon= aksiyonlar.moveToElement(loginBtn).click().build();
        aksiyon.perform();
        MyFunc.Bekle(1);

        WebElement mail= driver.findElement(By.cssSelector("input[id='Email']"));
        Action aksiyon1= aksiyonlar.moveToElement(mail).click().sendKeys("Grup122@gmail.com").build();
        aksiyon1.perform();
        MyFunc.Bekle(1);

        WebElement password= driver.findElement(By.xpath("//input[@class='password']"));

        Action aksiyon2= aksiyonlar.moveToElement(password).click().sendKeys("1234567").build();
        aksiyon2.perform();
        MyFunc.Bekle(1);

        WebElement login= driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        Action aksiyon3= aksiyonlar.moveToElement(login).click().build();
        aksiyon3.perform();
        MyFunc.Bekle(1);

        WebElement mesaj= driver.findElement(By.cssSelector("div[class='validation-summary-errors'] span"));
        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.", mesaj.getText());


    }
    @Test
    public void Test5(){
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(1);

        Actions aksiyonlar = new Actions(driver);

        WebElement loginBtn= driver.findElement(By.linkText("Log in"));
        Action aksiyon= aksiyonlar.moveToElement(loginBtn).click().build();
        aksiyon.perform();
        MyFunc.Bekle(1);

        WebElement mail= driver.findElement(By.cssSelector("input[id='Email']"));
        Action aksiyon1= aksiyonlar.moveToElement(mail).click().sendKeys("Grup122@gmail.com").build();
        aksiyon1.perform();
        MyFunc.Bekle(1);

        WebElement password= driver.findElement(By.xpath("//input[@class='password']"));

        Action aksiyon2= aksiyonlar.moveToElement(password).click().sendKeys("123456").build();
        aksiyon2.perform();
        MyFunc.Bekle(1);

        WebElement login= driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        Action aksiyon3= aksiyonlar.moveToElement(login).click().build();
        aksiyon3.perform();
        MyFunc.Bekle(1);

        WebElement computers= driver.findElement(By.xpath("//ul[@class='sublist firstLevel']/..//a"));
        Action aksiyon4= aksiyonlar.moveToElement(computers).build();
        aksiyon4.perform();


        WebElement laptop= driver.findElement(By.xpath("//html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[2]/a"));


        Action aksiyon5= aksiyonlar.moveToElement(laptop).click().build();
        MyFunc.Bekle(2);
        aksiyon5.perform();
        MyFunc.Bekle(2);

        WebElement addToCart= driver.findElement(By.cssSelector("input[value='Add to cart']"));
        Action aksiyon6= aksiyonlar.moveToElement(addToCart).click().build();
        aksiyon6.perform();
        MyFunc.Bekle(1);

        WebElement mesaj= driver.findElement(By.cssSelector("p[class='content']"));
        Assert.assertTrue(mesaj.getText().contains("The product"));
        MyFunc.Bekle(1);


        WebElement shopCart= driver.findElement(By.cssSelector("span[class='cart-label']"));
        Action aksiyon7= aksiyonlar.moveToElement(shopCart).click().build();
        aksiyon7.perform();
        MyFunc.Bekle(1);

        WebElement checkBox= driver.findElement(By.id("termsofservice"));
        Action aksiyon8= aksiyonlar.moveToElement(checkBox).click().build();
        aksiyon8.perform();
        MyFunc.Bekle(1);

        WebElement checkOut= driver.findElement(By.id("checkout"));
        Action aksiyon30= aksiyonlar.moveToElement(checkOut).click().build();
        aksiyon30.perform();
        MyFunc.Bekle(1);

        WebElement country=driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select countyselect=new Select(country);
        countyselect.selectByVisibleText("Turkey");
        MyFunc.Bekle(1);

        WebElement city=driver.findElement(By.id("BillingNewAddress_City"));
        Action aksiyon12=aksiyonlar.moveToElement(city).click().sendKeys("Ankara").build();
        aksiyon12.perform();
        MyFunc.Bekle(1);

        WebElement adress=driver.findElement(By.id("BillingNewAddress_Address1"));
        Action aksiyon13=aksiyonlar.moveToElement(adress).click().sendKeys("Ankara Etimesgut").build();
        aksiyon13.perform();
        MyFunc.Bekle(1);

        WebElement postcode=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        Action aksiyon14=aksiyonlar.moveToElement(postcode).click().sendKeys("06790").build();
        aksiyon14.perform();
        MyFunc.Bekle(1);

        WebElement phonenumber=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        Action aksiyon15=aksiyonlar.moveToElement(phonenumber).click().sendKeys("5055555555").build();
        aksiyon15.perform();
        MyFunc.Bekle(4);

        WebElement contiune=driver.findElement(By.cssSelector("[onclick='Billing.save()']"));
        Action aksiyon16= aksiyonlar.moveToElement(contiune).click().build();
        MyFunc.Bekle(3);
        aksiyon16.perform();
        MyFunc.Bekle(2);

        WebElement instoreclick=driver.findElement(By.id("PickUpInStore"));
        Action aksiyon17= aksiyonlar.moveToElement(instoreclick).click().build();
        aksiyon17.perform();
        MyFunc.Bekle(1);

        WebElement contiune2=driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        Action aksiyon18=aksiyonlar.moveToElement(contiune2).click().build();
        aksiyon18.perform();
        MyFunc.Bekle(3);

        WebElement select=driver.findElement(By.id("paymentmethod_1"));
        Action aksiyon35=aksiyonlar.moveToElement(select).click().build();
        aksiyon35.perform();
        MyFunc.Bekle(2);



        //WebElement payment=driver.findElement(By.cssSelector("[onclick='ShippingMethod.save()']"));
        //Action aksiyon19= aksiyonlar.moveToElement(payment).click().build();

       // aksiyon19.perform();
        MyFunc.Bekle(2);
        WebElement paymentmethod=driver.findElement(By.xpath("(//input[@value='Continue'])[4]"));
        Action aksiyon20=aksiyonlar.moveToElement(paymentmethod).click().build();
        aksiyon20.perform();
        MyFunc.Bekle(1);

        WebElement paymentinfo=driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        Action aksiyon21= aksiyonlar.moveToElement(paymentinfo).click().build();
        aksiyon21.perform();
        MyFunc.Bekle(1);

        WebElement confirmpayment=driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        Action aksiyon22= aksiyonlar.moveToElement(confirmpayment).click().build();
        aksiyon22.perform();
        MyFunc.Bekle(1);


        WebElement ordercheck=driver.findElement(By.xpath("//div[@class='title']"));
        Assert.assertEquals("Your order has been successfully processed!",ordercheck.getText());



        BekleKapat();







    }
}
