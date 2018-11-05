/**
 * The Student class, subclass of Person.
 * 
 * @author 
 * @version 
 */
public class Student extends Person 
{
    // private instance variables
    private int numCourses;   // number of courses taken so far
    private String[] courses; // course codes
    private int[] grades;     // grade for the corresponding course codes
    private static final int MAX_COURSES = 30; // maximum number of courses

    /**
     * Constructor.
     * 
     * @param   name    the student's name
     * @param   address the student's address
     */
    public Student(String name, String address) 
    {
        // call the superclass constructor
        numCourses = 0;
        courses = // a String array containing MAX_COURSES locations
        grades = // an int array containing MAX_COURSES locations
    }

    /**
     * Output a Student object.
     * 
     * @return a description of a Student object.
     */
    @Override
    public String toString() 
    {
        return "Student: " + // call the superclass toString method
    }

    /**
     * Add a course and a grade
     * 
     * @param    course  the course
     * @param    grade   the grade in the course
     */
    public void addCourseGrade(String course, int grade) 
    {
        // add the course and the grade to their respective arrays.
        // increment the number of courses.
    }

    /**
     * Print all of the courses and grades.
     */
    public void printGrades() 
    {
        
    }

    /**
     * Calculate the average grade of all of the course grades.
     * 
     * @return the average grade
     */
    public double getAverageGrade() 
    {
        
    }
}