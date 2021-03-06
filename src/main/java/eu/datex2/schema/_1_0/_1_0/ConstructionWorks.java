//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Roadworks involving the construction of new infrastructure.
 * 
 * <p>Java class for ConstructionWorks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstructionWorks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Roadworks">
 *       &lt;sequence>
 *         &lt;element name="constructionWorkType" type="{http://datex2.eu/schema/1_0/1_0}ConstructionWorkTypeEnum" minOccurs="0"/>
 *         &lt;element name="constructionWorksExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionWorks", propOrder = {
    "constructionWorkType",
    "constructionWorksExtension"
})
public class ConstructionWorks
    extends Roadworks
{

    protected ConstructionWorkTypeEnum constructionWorkType;
    protected ExtensionType constructionWorksExtension;

    /**
     * Gets the value of the constructionWorkType property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public ConstructionWorkTypeEnum getConstructionWorkType() {
        return constructionWorkType;
    }

    /**
     * Sets the value of the constructionWorkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public void setConstructionWorkType(ConstructionWorkTypeEnum value) {
        this.constructionWorkType = value;
    }

    /**
     * Gets the value of the constructionWorksExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getConstructionWorksExtension() {
        return constructionWorksExtension;
    }

    /**
     * Sets the value of the constructionWorksExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setConstructionWorksExtension(ExtensionType value) {
        this.constructionWorksExtension = value;
    }

}
