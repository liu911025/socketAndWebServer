package com.gupao.webservice.test;

import com.gupao.webservice.api.impl.SayGoodImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by liujiatai on 2018/12/28.
 */
public class TestService {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8000/api/say", new SayGoodImpl());

        System.out.println("publish success");
    }
}
