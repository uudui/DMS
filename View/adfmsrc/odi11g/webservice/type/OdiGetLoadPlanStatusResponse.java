
package odi11g.webservice.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="LoadPlanStatusResponse" type="{xmlns.oracle.com/odi/OdiInvoke/}LoadPlanStatusType" maxOccurs="unbounded" minOccurs="0"/>
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
    "loadPlanStatusResponse"
})
@XmlRootElement(name = "OdiGetLoadPlanStatusResponse")
public class OdiGetLoadPlanStatusResponse {

    @XmlElement(name = "LoadPlanStatusResponse")
    protected List<LoadPlanStatusType> loadPlanStatusResponse;

    /**
     * Gets the value of the loadPlanStatusResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadPlanStatusResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadPlanStatusResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadPlanStatusType }
     * 
     * 
     */
    public List<LoadPlanStatusType> getLoadPlanStatusResponse() {
        if (loadPlanStatusResponse == null) {
            loadPlanStatusResponse = new ArrayList<LoadPlanStatusType>();
        }
        return this.loadPlanStatusResponse;
    }

}
