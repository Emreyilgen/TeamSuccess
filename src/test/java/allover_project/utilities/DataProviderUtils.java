package allover_project.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    //    Data Provider Method to get the employee credentials
    @DataProvider
    public Object[][] employeeCredentialsProvider(){
        Object [][] employeeInfo={
                {"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {"pam.raymond@bluerentalcars.com","Nga^g6!"}
        };
        return employeeInfo;
    }
    //    Data Provider to get the employee credentials from the EXCEL SHEET
    @DataProvider
    public Object[][] excelEmployeeData(){
        String excelPath = "./resources/data_sheet.xlsx";
        String sheetName = "employee_credentials";
        ExcelUtils excelUtils = new ExcelUtils(excelPath,sheetName);
        Object[][] employeeInfo = excelUtils.getDataArrayWithoutFirstRow();

        return employeeInfo;
    }

    //    Data Provider to get the employee credentials from the EXCEL SHEET called 'user_data' (Day18_DataProvider2 class)
    @DataProvider                               // to enable parallel testing we use (parallel = true) parameter
    public Object[][] userData(){
        String excelPath = "./resources/data_sheet.xlsx";
        String sheetName = "user_data";
        ExcelUtils excelUtils = new ExcelUtils(excelPath,sheetName);
        Object[][] userInfo = excelUtils.getDataArrayWithoutFirstRow();

        return userInfo;

    }
}

