
package main.DataServiceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DataServiceClient package. 
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

    private final static QName _GetAllData_QNAME = new QName("http://DataService/", "getAllData");
    private final static QName _GetAllDataResponse_QNAME = new QName("http://DataService/", "getAllDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DataServiceClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllData }
     * 
     */
    public GetAllData createGetAllData() {
        return new GetAllData();
    }

    /**
     * Create an instance of {@link GetAllDataResponse }
     * 
     */
    public GetAllDataResponse createGetAllDataResponse() {
        return new GetAllDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "getAllData")
    public JAXBElement<GetAllData> createGetAllData(GetAllData value) {
        return new JAXBElement<GetAllData>(_GetAllData_QNAME, GetAllData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "getAllDataResponse")
    public JAXBElement<GetAllDataResponse> createGetAllDataResponse(GetAllDataResponse value) {
        return new JAXBElement<GetAllDataResponse>(_GetAllDataResponse_QNAME, GetAllDataResponse.class, null, value);
    }

}
