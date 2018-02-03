
package demos.java6.ws.maths.two;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subtractionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subtractionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubtractRetVal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subtractionResponse", propOrder = {
    "subtractRetVal"
})
public class SubtractionResponse {

    @XmlElement(name = "SubtractRetVal")
    protected double subtractRetVal;

    /**
     * Gets the value of the subtractRetVal property.
     * 
     */
    public double getSubtractRetVal() {
        return subtractRetVal;
    }

    /**
     * Sets the value of the subtractRetVal property.
     * 
     */
    public void setSubtractRetVal(double value) {
        this.subtractRetVal = value;
    }

}
