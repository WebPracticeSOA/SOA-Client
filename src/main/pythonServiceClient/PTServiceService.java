package main.pythonServiceClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2021-11-03T22:17:10.539+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "PTServiceService", 
                  wsdlLocation = "http://localhost:8080/PTService?wsdl",
                  targetNamespace = "http://PythonService.main/") 
public class PTServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://PythonService.main/", "PTServiceService");
    public final static QName PTServicePort = new QName("http://PythonService.main/", "PTServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/PTService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PTServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/PTService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PTServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PTServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PTServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PTServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PTServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PTServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PTServicePort
     */
    @WebEndpoint(name = "PTServicePort")
    public PTServicePort getPTServicePort() {
        return super.getPort(PTServicePort, PTServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PTServicePort
     */
    @WebEndpoint(name = "PTServicePort")
    public PTServicePort getPTServicePort(WebServiceFeature... features) {
        return super.getPort(PTServicePort, PTServicePort.class, features);
    }

}
