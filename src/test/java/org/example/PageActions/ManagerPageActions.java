package org.example.PageActions;

import io.cucumber.java.zh_cn.那么;
import org.example.PageDefinitions.CommonSteps;
import org.example.PageElements.ManagerPageElements;
import org.openqa.selenium.WebDriver;

public class ManagerPageActions {
   WebDriver driver;
   ManagerPageElements managerPageElements;
   public ManagerPageActions(CommonSteps commonSteps) {
      this.driver = commonSteps.getDriver();
      this.managerPageElements = new ManagerPageElements(driver);
   }



}
