package com.norxx.cli.service;

import com.norxx.cli.model.Code;

import java.util.Collection;

public interface CodeService {
    boolean addCode(String codeString, float amount);
    //возвращает false в случае коллизии, когда такая codeString уже есть в базе
    //в базу такой код 2й раз не добавляется
    //codeString в базе должен быть уникальным полем

    void markCodeUsed(String codeString);

    Code findByCodeString(String codeString);

    //void markCodeValid(String codeString);
    /*может пригодится, если сервер БД упал после того как старый
    код уже пометили Used, а новый не успели отдать клиенту и сохранить в базу.

    Вообще было бы круто сделать как то так, чтоб пометка старого кода Used происходила
    строго одновременно с созданием нового кода.
    Может стоит использовать
    void updateCodes(Collection<Code> codesToMarkUsed, Collection<Code> newValidcodes);

    Но я не уверен, что это поможет в ситуации внезапного падения сервера.
    Все равно в итоге будет отдельно sql insert и после него update или наоборот,
    и даун может произойти как раз между ними.
    Не удается придумать отказоустойчивую архитектуру, которая бы мне нравилась.
    */

}
