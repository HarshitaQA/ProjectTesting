package dataFactory.customer;

import dataObjects.customer.SignUp;
import utilities.JavaHelpers;

public class SignUpData {
    SignUp signUpPO = new SignUp();

    JavaHelpers javaHelpers = new JavaHelpers();

    public SignUp addSignUpData(){
        signUpPO.setUserName(javaHelpers.getAlphaNumericString(5));
        signUpPO.setPassWord(javaHelpers.getAlphaNumericString(5));
        return signUpPO;
    }
}
