public class CowboyHat {

    private String owner;
    private int size;
    private boolean hatOn = false;

    // Constructor to create a CowboyHat object
    public CowboyHat(String person, int thesize) 
    {
        size = thesize ;
        owner = person;

    }

    // Method to put the hat on
    public void putHston() {
        hatOn = true;

    }
    // Method to put the hat off
    public void putHatOn() {
        hatOn = false;
    }
    // Method to change the owner
    public void changeOwner(String newOwner) {
        owner = newOwner;
    }
    // Method to get the hat size
    public int getSize() {
        return size;
    } 

}
// Return the size of the hat
// Record hat status as on
// Record hat status as off



// Set the hat size
// Set the hat owner
// Name of current owner
// Stores the hat size
// Records whether a hat is on or o