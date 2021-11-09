
package main.PTServiceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the PTServiceClient package. 
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

    private final static QName _TransResponse_QNAME = new QName("http://PythonService/", "transResponse");
    private final static QName _Trans_QNAME = new QName("http://PythonService/", "trans");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: PTServiceClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransResponse }
     * 
     */
    public TransResponse createTransResponse() {
        return new TransResponse();
    }

    /**
     * Create an instance of {@link Trans }
     * 
     */
    public Trans createTrans() {
        return new Trans();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PythonService/", name = "transResponse")
    public JAXBElement<TransResponse> createTransResponse(TransResponse value) {
        return new JAXBElement<TransResponse>(_TransResponse_QNAME, TransResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Trans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PythonService/", name = "trans")
    public JAXBElement<Trans> createTrans(Trans value) {
        return new JAXBElement<Trans>(_Trans_QNAME, Trans.class, null, value);
    }

}
