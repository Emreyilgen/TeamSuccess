package allover_project.pages.customerPages;

import allover_project.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ComparePage {

    public ComparePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
