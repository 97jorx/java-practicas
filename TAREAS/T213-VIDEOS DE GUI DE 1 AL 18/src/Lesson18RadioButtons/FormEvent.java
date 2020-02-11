package Lesson18RadioButtons;

import java.util.EventObject;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 21:14
 */
public class FormEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */

    private String name;
    private String ocuppation;
    private int ageCategory;
    private String empCat;
    private String taxId;
    private boolean usCitizen;
    private String gender;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String name, String occupation, int ageCat,
                     String empCat, String taxId, boolean usCitizen, String gender) {
        super(source);

        this.name = name;
        this.ocuppation = occupation;
        this.ageCategory = ageCat;
        this.empCat = empCat;
        this.taxId = taxId;
        this.usCitizen = usCitizen;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getTaxId() {
        return taxId;
    }

    public boolean isUsCitizen() {
        return usCitizen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOcuppation() {
        return ocuppation;
    }

    public void setOcuppation(String ocuppation) {
        this.ocuppation = ocuppation;
    }

    public int getAgeCategory() {
        return ageCategory;
    }

    public String getPuestoDeTrabajo(){
        return empCat;
    }
}
