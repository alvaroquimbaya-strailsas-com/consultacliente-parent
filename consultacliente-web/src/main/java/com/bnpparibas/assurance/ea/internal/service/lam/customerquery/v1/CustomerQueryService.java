package com.bnpparibas.assurance.ea.internal.service.lam.customerquery.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-01T10:31:43.965-05:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "CustomerQueryService", 
                  wsdlLocation = "http://localhost:9080/consultacliente-web/WebContent/wsdl/CustomerQuery/V1.0.0/CustomerQuery.wsdl",
                  targetNamespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1") 
public class CustomerQueryService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "CustomerQueryService");
    public final static QName WSCustomerQueryPort = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "WSCustomerQueryPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9080/consultacliente-web/WebContent/wsdl/CustomerQuery/V1.0.0/CustomerQuery.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CustomerQueryService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:9080/consultacliente-web/WebContent/wsdl/CustomerQuery/V1.0.0/CustomerQuery.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CustomerQueryService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CustomerQueryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerQueryService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CustomerQueryService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CustomerQueryService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CustomerQueryService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CustomerQueryPort
     */
    @WebEndpoint(name = "WSCustomerQueryPort")
    public CustomerQueryPort getWSCustomerQueryPort() {
        return super.getPort(WSCustomerQueryPort, CustomerQueryPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerQueryPort
     */
    @WebEndpoint(name = "WSCustomerQueryPort")
    public CustomerQueryPort getWSCustomerQueryPort(WebServiceFeature... features) {
        return super.getPort(WSCustomerQueryPort, CustomerQueryPort.class, features);
    }

}
