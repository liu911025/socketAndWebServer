package com.gupao.webservice.test;

import com.gupao.webservice.api.impl.SayGoodImpl;
import com.gupao.webservice.api.impl.SayGoodImplService;

/**
 * Created by liujiatai on 2018/12/27.
 */
public class WebServiceClient {

    public static void main(String[] args) {
        SayGoodImplService sayGoodImplService = new SayGoodImplService();
        SayGoodImpl sayGood = sayGoodImplService.getSayGoodImplPort();
        System.out.println(sayGood.sayGood("ljt"));
    }
}
