//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.06 at 11:24:37 AM MDT 
//


package com.centurylink.mdw.demo.cool;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CoolRequired" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CoolOptional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="requiredAttr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="optionalAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coolRequired",
    "coolOptional"
})
@XmlRootElement(name = "CoolDoc")
public class CoolDoc {

    @XmlElement(name = "CoolRequired", required = true)
    protected String coolRequired;
    @XmlElement(name = "CoolOptional")
    protected String coolOptional;
    @XmlAttribute(name = "requiredAttr", required = true)
    protected String requiredAttr;
    @XmlAttribute(name = "optionalAttr")
    protected String optionalAttr;

    /**
     * Gets the value of the coolRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoolRequired() {
        return coolRequired;
    }

    /**
     * Sets the value of the coolRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoolRequired(String value) {
        this.coolRequired = value;
    }

    /**
     * Gets the value of the coolOptional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoolOptional() {
        return coolOptional;
    }

    /**
     * Sets the value of the coolOptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoolOptional(String value) {
        this.coolOptional = value;
    }

    /**
     * Gets the value of the requiredAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredAttr() {
        return requiredAttr;
    }

    /**
     * Sets the value of the requiredAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredAttr(String value) {
        this.requiredAttr = value;
    }

    /**
     * Gets the value of the optionalAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalAttr() {
        return optionalAttr;
    }

    /**
     * Sets the value of the optionalAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalAttr(String value) {
        this.optionalAttr = value;
    }

}
