package arrays;

class Student
{
  public int rollno;
  public String name;
  public float gpa;

  // method
  public void printDetails()
  {
    System.out.printf("Name: %s, Roll Number: %d, GPA: %f\n", this.name, this.rollno, this.gpa);
  }
}

public class Arrayofobject 
{
  public static void main(String[] args)  
  {
    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "John";
    s1.gpa = 3.7f;

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Jane";
    s2.gpa = 3.4f;

    Student s3 = new Student();
    s3.rollno = 3;
    s3.name = "Rabbit";
    s3.gpa = 4.0f;

    Student[] students = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    System.out.println();
    for (Student student : students) 
    {
      student.printDetails();
    }
    System.out.println();    
  }
}
