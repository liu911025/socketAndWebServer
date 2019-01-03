package com.gupao.webservice.api;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by liujiatai on 2018/12/27.
 */

@WebService
public interface ISayGood {

    @WebMethod
    String sayGood(String name);

    @WebMethod
    String sayBai(String name);
}
