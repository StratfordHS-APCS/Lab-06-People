/**
 * The Teacher class, subclass of Person.
 * 
 * @author 
 * @version 
 */
public class Teacher extends Person 
{
    // private instance variables
    private int numCourses;   // number of courses taught currently
    private String[] courses; // course codes
    private static final int MAX_COURSES = 5; // maximum courses

    /**
     * Constructor
     * 
     * @param   name    the teacher's name
     * @param   address the teacher's name
     */
    public Teacher(String name, String address) 
    {
        // call the super class constructor
        numCourses = 0;
        courses = // a String array containing MAX_COURSES locations
    }

    /**
    * Output a Student object.
    * 
    * @return a description of a Student object.
    */
    @Override
    public String toString() 
    {
        return "Teacher: " + // call the super class toString method
    }

    /**
     * Add a course to the teacher's list.
     * 
     * @param   course  the course to add to the course list.
     * @return  false if the course is already in the course list.
     */
    public boolean addCourse(String course) 
    {
        // Check if the course already in the course list
        // Return false if it is already in the course list.
        // Return true and add the course if it is not in the list.
        // Make sure you keep the number of courses accurate.
    }

    /**
     * Remove a course from the course list.
     * Return false if the course cannot be found in the course list.
     * 
     * @param   course  the course to remove from the course list
     * @return  false if the course is not in the course list.
     */
    public boolean removeCourse(String course) 
    {
        // Return false i fthe course is not in the course list.
        // Return true and delete the course if it is in the course list.
        // make sure you keep the number of courses accurate.
    }
}