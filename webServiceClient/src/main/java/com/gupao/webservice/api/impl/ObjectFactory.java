
package com.gupao.webservice.api.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gupao.webservice.api.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayGood_QNAME = new QName("http://impl.api.webservice.gupao.com/", "sayGood");
    private final static QName _SayGoodResponse_QNAME = new QName("http://impl.api.webservice.gupao.com/", "sayGoodResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gupao.webservice.api.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayGoodResponse }
     * 
     */
    public SayGoodResponse createSayGoodResponse() {
        return new SayGoodResponse();
    }

    /**
     * Create an instance of {@link SayGood }
     * 
     */
    public SayGood createSayGood() {
        return new SayGood();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayGood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.webservice.gupao.com/", name = "sayGood")
    public JAXBElement<SayGood> createSayGood(SayGood value) {
        return new JAXBElement<SayGood>(_SayGood_QNAME, SayGood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayGoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.api.webservice.gupao.com/", name = "sayGoodResponse")
    public JAXBElement<SayGoodResponse> createSayGoodResponse(SayGoodResponse value) {
        return new JAXBElement<SayGoodResponse>(_SayGoodResponse_QNAME, SayGoodResponse.class, null, value);
    }

}
