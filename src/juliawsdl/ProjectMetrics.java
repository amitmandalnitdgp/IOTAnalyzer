//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.19 at 02:21:08 PM CET 
//


package juliawsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for projectMetrics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="projectMetrics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="methodCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fieldCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="constPoolEntryCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="byteCodeSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="statementCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "projectMetrics", propOrder = {
    "projectName",
    "classCount",
    "sourceCount",
    "methodCount",
    "fieldCount",
    "constPoolEntryCount",
    "byteCodeSize",
    "statementCount"
})
public class ProjectMetrics {

    protected String projectName;
    protected int classCount;
    protected int sourceCount;
    protected int methodCount;
    protected int fieldCount;
    protected int constPoolEntryCount;
    protected int byteCodeSize;
    protected int statementCount;

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the classCount property.
     * 
     */
    public int getClassCount() {
        return classCount;
    }

    /**
     * Sets the value of the classCount property.
     * 
     */
    public void setClassCount(int value) {
        this.classCount = value;
    }

    /**
     * Gets the value of the sourceCount property.
     * 
     */
    public int getSourceCount() {
        return sourceCount;
    }

    /**
     * Sets the value of the sourceCount property.
     * 
     */
    public void setSourceCount(int value) {
        this.sourceCount = value;
    }

    /**
     * Gets the value of the methodCount property.
     * 
     */
    public int getMethodCount() {
        return methodCount;
    }

    /**
     * Sets the value of the methodCount property.
     * 
     */
    public void setMethodCount(int value) {
        this.methodCount = value;
    }

    /**
     * Gets the value of the fieldCount property.
     * 
     */
    public int getFieldCount() {
        return fieldCount;
    }

    /**
     * Sets the value of the fieldCount property.
     * 
     */
    public void setFieldCount(int value) {
        this.fieldCount = value;
    }

    /**
     * Gets the value of the constPoolEntryCount property.
     * 
     */
    public int getConstPoolEntryCount() {
        return constPoolEntryCount;
    }

    /**
     * Sets the value of the constPoolEntryCount property.
     * 
     */
    public void setConstPoolEntryCount(int value) {
        this.constPoolEntryCount = value;
    }

    /**
     * Gets the value of the byteCodeSize property.
     * 
     */
    public int getByteCodeSize() {
        return byteCodeSize;
    }

    /**
     * Sets the value of the byteCodeSize property.
     * 
     */
    public void setByteCodeSize(int value) {
        this.byteCodeSize = value;
    }

    /**
     * Gets the value of the statementCount property.
     * 
     */
    public int getStatementCount() {
        return statementCount;
    }

    /**
     * Sets the value of the statementCount property.
     * 
     */
    public void setStatementCount(int value) {
        this.statementCount = value;
    }

}