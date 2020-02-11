package Lesson14ListBoxes;

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

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String name, String occupation) {
        super(source);

        this.name = name;
        this.ocuppation = occupation;
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
}
