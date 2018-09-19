package com.norxx.cli.repository;

import com.norxx.cli.model.Code;

interface CodeRepository {
    boolean add(Code code);
    void markUsed(Code code);
    Code findByCodeString(String codeString);
}
