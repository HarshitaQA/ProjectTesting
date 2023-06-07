package dataFactory.customer;

import dataObjects.customer.LogIn;
import dataObjects.customer.SignUp;
import utilities.JavaHelpers;

public class LoginData {
    LogIn loginPO = new LogIn();
    SignUp signUp = new SignUpData().addSignUpData();

    JavaHelpers javaHelpers = new JavaHelpers();

    public LogIn addLogInData(){
        loginPO.setUserName(signUp.getUserName());
        loginPO.setPassWord(signUp.getPassWord());

        return loginPO;
    }
}
