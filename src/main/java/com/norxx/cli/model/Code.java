package com.norxx.cli.model;

import java.security.SecureRandom;

public class Code {
    private String codeString;
    private float amount;
    public static final int codeLenght = 50;
    boolean valid;


    public Code(float amount){
        this.amount = amount;
        this.codeString = generateSecureStringCode(codeLenght);
        valid = true;
    }

    public Code(String codeString, float amount, boolean valid){
        this.amount = amount;
        this.codeString = codeString;
        this.valid = valid;
    }



    public static String generateSecureStringCode(int codeLenght){
        String allowedSymbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder result = new StringBuilder(allowedSymbols.length());
        SecureRandom secureRandom = new SecureRandom();
        for (int i=0; i < codeLenght; i++) {
            //int randomSymbolNum = Math.abs(secureRandom.nextInt()) % allowedSymbols.length();
            int randomSymbolNum = secureRandom.nextInt(allowedSymbols.length());
            char randomChar = allowedSymbols.charAt(randomSymbolNum);
            result.append(randomChar);
        }
        return result.toString();
    }


    public float getAmount(){
        return amount;
    }

    public String getCode() {
    return codeString;
    }

    public boolean isValid() {
    return valid;
    }

    @java.lang.Override
    public java.lang.String toString() {
    String status;
    if (valid) {
        status = "Valid";
    } else {
        status = "Used";
    }
        return status + " Code, Amount : " + amount + " : " + codeString;
    }

}
