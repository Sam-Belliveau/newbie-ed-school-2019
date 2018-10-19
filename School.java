/* Example/template Code:
    -For each class, make a separate file.
    -fill in the  blank code.
*/

public class School {

    static int numberOfSchools = 0;
    int numberOfTeachers, numberOfStudents;

    int population = numberOfTeachers + numberOfStudents;
    int studentTeacherRatio = numberOfStudents / numberOfTeachers;

    int numberOfClassrooms = 10;

    public School(int numberOfClassrooms){
        numberOfSchools++;
    }

    public void addStudent(){

    }

    public void addTeacher(){

    }

    public void addClassroom(){

    }
}
    private class Classroom{
                int room;
                int period;
                School school;
                Teacher teacher;

                public Classroom(){
                }
        }

     private class Person{
        int age;
        //When new person added/removed, increment/decrement School population by 1.
        //Make leaveSchool() and getAge()
    }

     private class Teacher extends Person{
     }

    private class Student extends Person{
        int grade;
    }

