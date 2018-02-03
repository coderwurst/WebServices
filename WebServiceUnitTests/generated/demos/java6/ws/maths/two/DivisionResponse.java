
package demos.java6.ws.maths.two;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for divisionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="divisionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DivideRetVal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divisionResponse", propOrder = {
    "divideRetVal"
})
public class DivisionResponse {

    @XmlElement(name = "DivideRetVal")
    protected double divideRetVal;

    /**
     * Gets the value of the divideRetVal property.
     * 
     */
    public double getDivideRetVal() {
        return divideRetVal;
    }

    /**
     * Sets the value of the divideRetVal property.
     * 
     */
    public void setDivideRetVal(double value) {
        this.divideRetVal = value;
    }

}
