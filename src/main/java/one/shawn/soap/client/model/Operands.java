
package one.shawn.soap.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstNum" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="secondNum" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "firstNum",
    "secondNum"
})
@XmlRootElement(name = "operands")
public class Operands implements Equals2, HashCode2, ToString2
{

    protected float firstNum;
    protected float secondNum;

    /**
     * Gets the value of the firstNum property.
     * 
     */
    public float getFirstNum() {
        return firstNum;
    }

    /**
     * Sets the value of the firstNum property.
     * 
     */
    public void setFirstNum(float value) {
        this.firstNum = value;
    }

    /**
     * Gets the value of the secondNum property.
     * 
     */
    public float getSecondNum() {
        return secondNum;
    }

    /**
     * Sets the value of the secondNum property.
     * 
     */
    public void setSecondNum(float value) {
        this.secondNum = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            float theFirstNum;
            theFirstNum = this.getFirstNum();
            strategy.appendField(locator, this, "firstNum", buffer, theFirstNum, true);
        }
        {
            float theSecondNum;
            theSecondNum = this.getSecondNum();
            strategy.appendField(locator, this, "secondNum", buffer, theSecondNum, true);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Operands that = ((Operands) object);
        {
            float lhsFirstNum;
            lhsFirstNum = this.getFirstNum();
            float rhsFirstNum;
            rhsFirstNum = that.getFirstNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstNum", lhsFirstNum), LocatorUtils.property(thatLocator, "firstNum", rhsFirstNum), lhsFirstNum, rhsFirstNum, true, true)) {
                return false;
            }
        }
        {
            float lhsSecondNum;
            lhsSecondNum = this.getSecondNum();
            float rhsSecondNum;
            rhsSecondNum = that.getSecondNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondNum", lhsSecondNum), LocatorUtils.property(thatLocator, "secondNum", rhsSecondNum), lhsSecondNum, rhsSecondNum, true, true)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            float theFirstNum;
            theFirstNum = this.getFirstNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstNum", theFirstNum), currentHashCode, theFirstNum, true);
        }
        {
            float theSecondNum;
            theSecondNum = this.getSecondNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondNum", theSecondNum), currentHashCode, theSecondNum, true);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
