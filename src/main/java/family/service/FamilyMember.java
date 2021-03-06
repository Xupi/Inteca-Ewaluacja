
package family.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for familyMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="familyMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date_of_birth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fmember_ids" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fmember_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type_of_fmember" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "familyMember", propOrder = {
    "dateOfBirth",
    "fmemberIds",
    "fmemberName",
    "surname",
    "typeOfFmember"
})
@Entity
public class FamilyMember {

    @XmlElement(name = "date_of_birth")
    @NotNull(message = "Format: DD-MM-YYYY")
    protected String dateOfBirth;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @XmlElement(name = "fmember_ids")
    protected int fmemberIds;
    @XmlElement(name = "fmember_name")
    @Size(min = 2, max = 200)
    @NotNull(message = "Name cannot be null")
    protected String fmemberName;
    @Size(min = 2, max = 200)
    @NotNull(message = "Surname cannot be null")
    protected String surname;
    @XmlElement(name = "type_of_fmember")
    protected String typeOfFmember;

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param date
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(String date) {
        this.dateOfBirth = date;
    }

    /**
     * Gets the value of the fmemberIds property.
     * 
     */
    public int getFmemberIds() {
        return fmemberIds;
    }

    /**
     * Sets the value of the fmemberIds property.
     * 
     */
    public void setFmemberIds(int value) {
        this.fmemberIds = value;
    }

    /**
     * Gets the value of the fmemberName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmemberName() {
        return fmemberName;
    }

    /**
     * Sets the value of the fmemberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmemberName(String value) {
        this.fmemberName = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the typeOfFmember property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfFmember() {
        return typeOfFmember;
    }

    /**
     * Sets the value of the typeOfFmember property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfFmember(String value) {
        this.typeOfFmember = value;
    }

}
