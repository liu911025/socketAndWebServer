package com.gupao.webservice.api.impl;

import com.gupao.webservice.api.ISayGood;

import javax.jws.WebService;

/**
 * Created by liujiatai on 2018/12/27.
 */
@WebService
public class SayGoodImpl implements ISayGood{
    @Override
    public String sayGood(String name) {
        return name + " is very good !";
    }

    @Override
    public String sayBai(String name) {
        return name + " bay !";
    }
}
