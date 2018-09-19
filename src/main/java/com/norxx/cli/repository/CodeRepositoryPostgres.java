package com.norxx.cli.repository;

import com.norxx.cli.model.Code;

public class CodeRepositoryPostgres implements CodeRepository {
    public boolean add(Code code){
        return true;
    }
    public void markUsed(Code code){

    }
    public Code findByCodeString(String codeString){
        return null;
    }
}
