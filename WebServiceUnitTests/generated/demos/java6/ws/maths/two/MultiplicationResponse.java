
package demos.java6.ws.maths.two;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multiplicationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiplicationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultiplyRetVal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplicationResponse", propOrder = {
    "multiplyRetVal"
})
public class MultiplicationResponse {

    @XmlElement(name = "MultiplyRetVal")
    protected double multiplyRetVal;

    /**
     * Gets the value of the multiplyRetVal property.
     * 
     */
    public double getMultiplyRetVal() {
        return multiplyRetVal;
    }

    /**
     * Sets the value of the multiplyRetVal property.
     * 
     */
    public void setMultiplyRetVal(double value) {
        this.multiplyRetVal = value;
    }

}
