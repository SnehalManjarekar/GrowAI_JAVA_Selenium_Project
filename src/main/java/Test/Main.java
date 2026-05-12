package Test;

public class Main {
    public static void main(String[] args) {
//      Valid Login Test
        ValidLoginTestCase Valid = new ValidLoginTestCase();
        Valid.setupBrowser();
        Valid.NavigateToApp();
        Valid.ValidLogin();

//      Invalid Login Test
        InvalidLoginTest invalid = new InvalidLoginTest();
        invalid.setupBrowser();
        invalid.NavigateToApp();
        invalid.InvalidLogin();

//      Blank Filed Login Test
        LoginBlankFieldTest Blank = new LoginBlankFieldTest();
        Blank.setupBrowser();
        Blank.NavigateToApp();
        Blank.BlankLogin();
    }
}
