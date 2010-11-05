//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.25 at 01:59:34 fm CEST 
//


package sequenceplanner.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conditions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="or" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sequenceCondition" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="operation" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conditions", propOrder = {
    "or"
})
public class Conditions {

    protected List<Conditions.Or> or;

    /**
     * Gets the value of the or property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the or property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Conditions.Or }
     * 
     * 
     */
    public List<Conditions.Or> getOr() {
        if (or == null) {
            or = new ArrayList<Conditions.Or>();
        }
        return this.or;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sequenceCondition" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="operation" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sequenceCondition"
    })
    public static class Or {

        protected List<Conditions.Or.SequenceCondition> sequenceCondition;

        /**
         * Gets the value of the sequenceCondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sequenceCondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSequenceCondition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Conditions.Or.SequenceCondition }
         * 
         * 
         */
        public List<Conditions.Or.SequenceCondition> getSequenceCondition() {
            if (sequenceCondition == null) {
                sequenceCondition = new ArrayList<Conditions.Or.SequenceCondition>();
            }
            return this.sequenceCondition;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="operation" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SequenceCondition {

            @XmlAttribute(required = true)
            protected int operation;
            @XmlAttribute(required = true)
            protected int status;

            /**
             * Gets the value of the operation property.
             * 
             */
            public int getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             */
            public void setOperation(int value) {
                this.operation = value;
            }

            /**
             * Gets the value of the status property.
             * 
             */
            public int getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             */
            public void setStatus(int value) {
                this.status = value;
            }

        }

    }

}