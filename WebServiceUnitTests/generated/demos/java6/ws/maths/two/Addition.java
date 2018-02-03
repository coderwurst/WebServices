
package demos.java6.ws.maths.two;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOne" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberTwo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addition", propOrder = {
    "numberOne",
    "numberTwo"
})
public class Addition {

    protected int numberOne;
    protected int numberTwo;

    /**
     * Gets the value of the numberOne property.
     * 
     */
    public int getNumberOne() {
        return numberOne;
    }

    /**
     * Sets the value of the numberOne property.
     * 
     */
    public void setNumberOne(int value) {
        this.numberOne = value;
    }

    /**
     * Gets the value of the numberTwo property.
     * 
     */
    public int getNumberTwo() {
        return numberTwo;
    }

    /**
     * Sets the value of the numberTwo property.
     * 
     */
    public void setNumberTwo(int value) {
        this.numberTwo = value;
    }

}
