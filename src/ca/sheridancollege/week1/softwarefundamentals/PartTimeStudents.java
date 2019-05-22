package ca.sheridancollege.week1.softwarefundamentals;
/**
 * @author Feilong Huang
 */
public class PartTimeStudents extends Student
{
   private int numOfHours;

   public PartTimeStudents (String name, String studentID, int numOfHours)
   {
      super(name, studentID);
      this.numOfHours = numOfHours;
   }

   /**
    * @return the numOfHours
    */
   public int getNumOfHours ()
   {
      return numOfHours;
   }

   /**
    * @param numOfHours the numOfHours to set
    */
   public void setNumOfHours (int numOfHours)
   {
      this.numOfHours = numOfHours;
   }
}
