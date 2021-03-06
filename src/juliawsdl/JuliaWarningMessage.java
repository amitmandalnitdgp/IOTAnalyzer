//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.19 at 02:21:08 PM CET 
//


package juliawsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for juliaWarningMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="juliaWarningMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="artifacts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CWEid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalClassifications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="externalClassification" type="{http://service.server.web.julia.juliasoft.com/}externalClassification" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="memberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputArtifacts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="outputArtifact" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="simpleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warningCWECategory" type="{http://service.server.web.julia.juliasoft.com/}juliaWarningMessageCWECategory" minOccurs="0"/>
 *         &lt;element name="warningCategory" type="{http://service.server.web.julia.juliasoft.com/}juliaWarningMessageCategory" minOccurs="0"/>
 *         &lt;element name="warningDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warningMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="kind" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="progressive" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="rank" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="aboutAField" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "juliaWarningMessage", propOrder = {
    "artifacts",
    "cwEid",
    "className",
    "externalClassifications",
    "fieldName",
    "line",
    "memberName",
    "note",
    "outputArtifacts",
    "simpleName",
    "source",
    "warningCWECategory",
    "warningCategory",
    "warningDescription",
    "warningMessage"
})
public class JuliaWarningMessage {

    protected String artifacts;
    @XmlElement(name = "CWEid")
    protected Integer cwEid;
    protected String className;
    protected JuliaWarningMessage.ExternalClassifications externalClassifications;
    protected String fieldName;
    protected int line;
    protected String memberName;
    protected String note;
    protected JuliaWarningMessage.OutputArtifacts outputArtifacts;
    protected String simpleName;
    protected String source;
    @XmlSchemaType(name = "string")
    protected JuliaWarningMessageCWECategory warningCWECategory;
    @XmlSchemaType(name = "string")
    protected JuliaWarningMessageCategory warningCategory;
    protected String warningDescription;
    protected String warningMessage;
    @XmlAttribute(name = "kind", required = true)
    protected String kind;
    @XmlAttribute(name = "progressive", required = true)
    protected int progressive;
    @XmlAttribute(name = "rank", required = true)
    protected int rank;
    @XmlAttribute(name = "aboutAField", required = true)
    protected boolean aboutAField;

    /**
     * Gets the value of the artifacts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtifacts() {
        return artifacts;
    }

    /**
     * Sets the value of the artifacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtifacts(String value) {
        this.artifacts = value;
    }

    /**
     * Gets the value of the cwEid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCWEid() {
        return cwEid;
    }

    /**
     * Sets the value of the cwEid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCWEid(Integer value) {
        this.cwEid = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the externalClassifications property.
     * 
     * @return
     *     possible object is
     *     {@link JuliaWarningMessage.ExternalClassifications }
     *     
     */
    public JuliaWarningMessage.ExternalClassifications getExternalClassifications() {
        return externalClassifications;
    }

    /**
     * Sets the value of the externalClassifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuliaWarningMessage.ExternalClassifications }
     *     
     */
    public void setExternalClassifications(JuliaWarningMessage.ExternalClassifications value) {
        this.externalClassifications = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the line property.
     * 
     */
    public int getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     */
    public void setLine(int value) {
        this.line = value;
    }

    /**
     * Gets the value of the memberName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * Sets the value of the memberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberName(String value) {
        this.memberName = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the outputArtifacts property.
     * 
     * @return
     *     possible object is
     *     {@link JuliaWarningMessage.OutputArtifacts }
     *     
     */
    public JuliaWarningMessage.OutputArtifacts getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * Sets the value of the outputArtifacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuliaWarningMessage.OutputArtifacts }
     *     
     */
    public void setOutputArtifacts(JuliaWarningMessage.OutputArtifacts value) {
        this.outputArtifacts = value;
    }

    /**
     * Gets the value of the simpleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleName() {
        return simpleName;
    }

    /**
     * Sets the value of the simpleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleName(String value) {
        this.simpleName = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the warningCWECategory property.
     * 
     * @return
     *     possible object is
     *     {@link JuliaWarningMessageCWECategory }
     *     
     */
    public JuliaWarningMessageCWECategory getWarningCWECategory() {
        return warningCWECategory;
    }

    /**
     * Sets the value of the warningCWECategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuliaWarningMessageCWECategory }
     *     
     */
    public void setWarningCWECategory(JuliaWarningMessageCWECategory value) {
        this.warningCWECategory = value;
    }

    /**
     * Gets the value of the warningCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JuliaWarningMessageCategory }
     *     
     */
    public JuliaWarningMessageCategory getWarningCategory() {
        return warningCategory;
    }

    /**
     * Sets the value of the warningCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuliaWarningMessageCategory }
     *     
     */
    public void setWarningCategory(JuliaWarningMessageCategory value) {
        this.warningCategory = value;
    }

    /**
     * Gets the value of the warningDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningDescription() {
        return warningDescription;
    }

    /**
     * Sets the value of the warningDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningDescription(String value) {
        this.warningDescription = value;
    }

    /**
     * Gets the value of the warningMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningMessage() {
        return warningMessage;
    }

    /**
     * Sets the value of the warningMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningMessage(String value) {
        this.warningMessage = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the progressive property.
     * 
     */
    public int getProgressive() {
        return progressive;
    }

    /**
     * Sets the value of the progressive property.
     * 
     */
    public void setProgressive(int value) {
        this.progressive = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * Gets the value of the aboutAField property.
     * 
     */
    public boolean isAboutAField() {
        return aboutAField;
    }

    /**
     * Sets the value of the aboutAField property.
     * 
     */
    public void setAboutAField(boolean value) {
        this.aboutAField = value;
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
     *         &lt;element name="externalClassification" type="{http://service.server.web.julia.juliasoft.com/}externalClassification" maxOccurs="unbounded" minOccurs="0"/>
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
        "externalClassification"
    })
    public static class ExternalClassifications {

        protected List<ExternalClassification> externalClassification;

        /**
         * Gets the value of the externalClassification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalClassification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExternalClassification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExternalClassification }
         * 
         * 
         */
        public List<ExternalClassification> getExternalClassification() {
            if (externalClassification == null) {
                externalClassification = new ArrayList<ExternalClassification>();
            }
            return this.externalClassification;
        }

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
     *         &lt;element name="outputArtifact" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
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
        "outputArtifact"
    })
    public static class OutputArtifacts {

        @XmlElementRef(name = "outputArtifact", type = JAXBElement.class, required = false)
        protected List<JAXBElement<Object>> outputArtifact;

        /**
         * Gets the value of the outputArtifact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outputArtifact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOutputArtifact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * 
         * 
         */
        public List<JAXBElement<Object>> getOutputArtifact() {
            if (outputArtifact == null) {
                outputArtifact = new ArrayList<JAXBElement<Object>>();
            }
            return this.outputArtifact;
        }

    }

}
