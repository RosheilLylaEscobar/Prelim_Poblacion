import java.util.Scanner;

class Student {
   private String IDnumber;
   private int credits;
   private int points;
   private double gradePoint;

   public Student() {
   }

   // constructor to initialize the values
   public Student(String aID, int aNumberOfCredits, int aPoints) {
       super();
       IDnumber = aID;
       credits = aNumberOfCredits;
       points = aPoints;
       calculateGradePoint();
   }

   // getters and setters
   public String getID() {
       return IDnumber;
   }

   public void setID(String aID) {
       IDnumber = aID;
   }

   public int getNumberOfCredits() {
       return credits;
   }

   public void setNumberOfCredits(int credits) {
      credits = credits;
   }

   public int getPoints() {
       return points;
   }

   public void setPoints(int aPoints) {
       points = aPoints;
   }

   // to return object in String representation form
   @Override
   public String toString() {
       return "ID : " + IDnumber + "redits : " +credits + " Points : " + points + " Grade Point : "
               + gradePoint;
   }

   // method to find gradePoint
   public void calculateGradePoint() {
       gradePoint = points / (double) credits;
   }
}
