
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RS_LOCN_STATType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RS_LOCN_STATType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HQ"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="SL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RS_LOCN_STATType")
@XmlEnum
public enum RSLOCNSTATType {

    HQ,
    BR,
    SL;

    public String value() {
        return name();
    }

    public static RSLOCNSTATType fromValue(String v) {
        return valueOf(v);
    }

}
