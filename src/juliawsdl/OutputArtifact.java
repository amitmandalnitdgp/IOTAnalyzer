//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.19 at 02:21:08 PM CET 
//


package juliawsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputArtifact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outputArtifact">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.server.web.julia.juliasoft.com/}artifact">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="producer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="standalone" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outputArtifact")
public class OutputArtifact
    extends Artifact
{

    @XmlAttribute(name = "producer")
    protected String producer;
    @XmlAttribute(name = "standalone", required = true)
    protected boolean standalone;

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducer(String value) {
        this.producer = value;
    }

    /**
     * Gets the value of the standalone property.
     * 
     */
    public boolean isStandalone() {
        return standalone;
    }

    /**
     * Sets the value of the standalone property.
     * 
     */
    public void setStandalone(boolean value) {
        this.standalone = value;
    }

}
