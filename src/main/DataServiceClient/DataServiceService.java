package main.DataServiceClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2021-11-09T16:57:16.338+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "DataServiceService", 
                  wsdlLocation = "http://106.15.42.179:8088/SOA2/webservice/DataService?wsdl",
                  targetNamespace = "http://DataService/") 
public class DataServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://DataService/", "DataServiceService");
    public final static QName DataServicePort = new QName("http://DataService/", "DataServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://106.15.42.179:8088/SOA2/webservice/DataService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DataServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://106.15.42.179:8088/SOA2/webservice/DataService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DataServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DataServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DataServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DataServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DataServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DataServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns DataServicePort
     */
    @WebEndpoint(name = "DataServicePort")
    public DataServicePort getDataServicePort() {
        return super.getPort(DataServicePort, DataServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DataServicePort
     */
    @WebEndpoint(name = "DataServicePort")
    public DataServicePort getDataServicePort(WebServiceFeature... features) {
        return super.getPort(DataServicePort, DataServicePort.class, features);
    }

}
