
package demos.ws.maths;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.1-02/02/2007 03:56 AM(vivekp)-FCS
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Maths", targetNamespace = "http://maths.ws.demos/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Maths {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://maths.ws.demos/", className = "demos.ws.maths.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://maths.ws.demos/", className = "demos.ws.maths.AddResponse")
    public double add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://maths.ws.demos/", className = "demos.ws.maths.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://maths.ws.demos/", className = "demos.ws.maths.SubtractResponse")
    public double subtract(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://maths.ws.demos/", className = "demos.ws.maths.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://maths.ws.demos/", className = "demos.ws.maths.MultiplyResponse")
    public double multiply(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://maths.ws.demos/", className = "demos.ws.maths.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://maths.ws.demos/", className = "demos.ws.maths.DivideResponse")
    public double divide(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
