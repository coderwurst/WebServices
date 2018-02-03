
package demos.java6.ws.maths.two;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddRetVal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionResponse", propOrder = {
    "addRetVal"
})
public class AdditionResponse {

    @XmlElement(name = "AddRetVal")
    protected double addRetVal;

    /**
     * Gets the value of the addRetVal property.
     * 
     */
    public double getAddRetVal() {
        return addRetVal;
    }

    /**
     * Sets the value of the addRetVal property.
     * 
     */
    public void setAddRetVal(double value) {
        this.addRetVal = value;
    }

}
