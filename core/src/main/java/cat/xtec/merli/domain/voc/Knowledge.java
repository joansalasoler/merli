package cat.xtec.merli.domain.voc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import cat.xtec.merli.domain.EnumSource;
import cat.xtec.merli.domain.EnumString;
import cat.xtec.merli.bind.*;


/**
 * Content knowledge type (DUCv3.0).
 */
@XmlEnum
@XmlType(name = "Knowledge")
public enum Knowledge implements EnumString<Knowledge> {

    /** Not exactly known or defined */
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified"),

    /** Ability to adopt appropriate attitudes */
    @XmlEnumValue("attitudinal")
    ATTITUDINAL("attitudinal"),

    /** How to explain and apply concepts */
    @XmlEnumValue("conceptual")
    CONCEPTUAL("conceptual"),

    /** Knowledge of how to do a task */
    @XmlEnumValue("procedural")
    PROCEDURAL("procedural");

    /** Source of the vocabulary */
    private final EnumSource source = EnumSource.DUC;

    /** Enumeration value */
    private final String value;


    /**
     * Enumeration constructor
     *
     * @param value
     */
    Knowledge(String value) {
        this.value = value;
    }


    /**
     * {@inheritDoc}
     */
    public EnumSource source() {
        return source;
    }


    /**
     * {@inheritDoc}
     */
    @DucString
    public String value() {
        return value;
    }


    /**
     * {@inheritDoc}
     */
    @DucCreator()
    public static Knowledge fromValue(String value) {
        return EnumString.from(Knowledge.class, value);
    }

}
