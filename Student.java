public class Student
{
  private String firstName;
  private String lastName;
  private int gradeLevel;

  public Student(String fName, String lName, int gLevel)
  {
    firstName = fName;
    lastName = lName;
    gradeLevel = gLevel;
  }

  public String toString()
  {
    return firstName + " " + lastName + " is in grade " + gradeLevel;
  }
  
}
