//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.19 at 02:21:08 PM CET 
//


package juliawsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for juliaWarningMessageCWECategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="juliaWarningMessageCWECategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Improper_Input_Validation_and_Verification"/>
 *     &lt;enumeration value="API_abuse"/>
 *     &lt;enumeration value="Security_Features"/>
 *     &lt;enumeration value="Time_and_State"/>
 *     &lt;enumeration value="Error_Handling"/>
 *     &lt;enumeration value="Code_Quality"/>
 *     &lt;enumeration value="Encapsulation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "juliaWarningMessageCWECategory")
@XmlEnum
public enum JuliaWarningMessageCWECategory {

    @XmlEnumValue("Improper_Input_Validation_and_Verification")
    IMPROPER_INPUT_VALIDATION_AND_VERIFICATION("Improper_Input_Validation_and_Verification"),
    @XmlEnumValue("API_abuse")
    API_ABUSE("API_abuse"),
    @XmlEnumValue("Security_Features")
    SECURITY_FEATURES("Security_Features"),
    @XmlEnumValue("Time_and_State")
    TIME_AND_STATE("Time_and_State"),
    @XmlEnumValue("Error_Handling")
    ERROR_HANDLING("Error_Handling"),
    @XmlEnumValue("Code_Quality")
    CODE_QUALITY("Code_Quality"),
    @XmlEnumValue("Encapsulation")
    ENCAPSULATION("Encapsulation");
    private final String value;

    JuliaWarningMessageCWECategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JuliaWarningMessageCWECategory fromValue(String v) {
        for (JuliaWarningMessageCWECategory c: JuliaWarningMessageCWECategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
