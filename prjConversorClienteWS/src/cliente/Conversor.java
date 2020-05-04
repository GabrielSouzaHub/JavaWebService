
package cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Conversor", targetNamespace = "http://control/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Conversor {


    /**
     * 
     * @param escolhaN
     * @param temperat
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversor", targetNamespace = "http://control/", className = "cliente.Conversor_Type")
    @ResponseWrapper(localName = "conversorResponse", targetNamespace = "http://control/", className = "cliente.ConversorResponse")
    @Action(input = "http://control/Conversor/conversorRequest", output = "http://control/Conversor/conversorResponse")
    public String conversor(
        @WebParam(name = "escolhaN", targetNamespace = "")
        int escolhaN,
        @WebParam(name = "temperat", targetNamespace = "")
        int temperat);

}
