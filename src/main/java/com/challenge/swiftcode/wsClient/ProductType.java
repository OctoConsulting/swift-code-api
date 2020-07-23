
package com.challenge.swiftcode.wsClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FOREIGN_PRODUCT"/>
 *     &lt;enumeration value="RIGHTS_SOFTWARE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductType")
@XmlEnum
public enum ProductType {

    FOREIGN_PRODUCT,
    RIGHTS_SOFTWARE;

    public String value() {
        return name();
    }

    public static ProductType fromValue(String v) {
        return valueOf(v);
    }

}
