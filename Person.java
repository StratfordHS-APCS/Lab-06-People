/** 
 * Superclass Person has name and address.
 * 
 * @author Dave Avis
 * @version 11.4.2018
 */
public class Person 
{
    // private instance variables
    private String name, address;

    // Constructor
    public Person(String name, String address) 
    {
        this.name = name;
        this.address = address;
    }

    /**
     * Get the person's name.
     * 
     * @return the person's name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Get the person's address.
     * 
     * @return the person's address.
     */
    public String getAddress() 
    {
        return address;
    }

    /**
     * Set the person's address.
     * 
     * @param    address     the person's address
     */
    public void setAddress(String address) 
    {
        this.address = address;
    }

    /**
     * Output a Person object.
     * 
     * @return a description of a Person object.
     */
    public String toString() 
    {
        return name + "(" + address + ")";
    }
}