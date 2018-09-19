package com.norxx.cli.service;

import com.norxx.cli.model.Code;

public class CodeServiceImpl implements CodeService {
    public boolean addCode(String codeString, float amount){
        return true;
    }

    public void markCodeUsed(String codeString){}

    public Code findByCodeString(String codeString){
        return new Code(codeString, 3.14f, true);
    }
}
