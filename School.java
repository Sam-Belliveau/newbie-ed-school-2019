/* Example/template Code:
    -For each class, make a separate file.
    -fill in the  blank code.
*/

public class School {

    static int numberOfSchools = 0;
    int numberOfTeachers, numberOfStudents;

    int population = numberOfTeachers + numberOfStudents;
    double studentTeacherRatio = numberOfStudents / numberOfTeachers;
    Classroom[] Classrooms;
    int numberOfClassrooms = 0;

    public School(int maxNumberOfClassrooms){
        Classrooms = new ClassRoom[maxNumberOfClassrooms];
        numberOfSchools++;
    }

    public void addStudent(int age){
        Student m = new Student(age,this);
        numberOfStudents++;        
    }

    public void addTeacher(int age, String subject){
        Teacher m = new Teacher(age,subject,this);
        numberOfTeachers++;
    }

    public void addClassroom(int item,Teacher myTeacher){
        if (item >= 0 && item < Classrooms.length){
            Classrooms[item] = new Classroom(this, myTeacher);
        }
    }
    public void updateStatistics(){
        population = numberOfTeachers + numberOfStudents;
        studentTeacherRatio = numberOfStudents / numberOfTeachers;
    }
}
    private class Classroom{
                int room;
                int period;
                School school;
                Teacher teacher;

                public Classroom(School mySchool, Teacher coolTeacher,int myRoom){
                    school = mySchool;
                    teacher = coolTeacher;
                    room = myRoom;
                }
        }

     private class Person{
        int age;
        School currentSchool;
        //When new person added/removed, increment/decrement School population by 1.    
        public Person(int myAge,School mySChool){
            currentSchool = mySchool;
            age = myAge;
            currentSchool.population++;
        }
        //Make leaveSchool() and getAge()
    }

    private class Teacher extends Person{
        String Subject = "NONE";
        public Teacher(int age, String mySubject,School mySchool){
            super(age,mySchool);
            Subject = mySubject;
            currentSchool.numberOfTeachers++;
        }
    }

    private class Student extends Person{
        int grade;
        public Student(int age, School mySchool){
            grade = age - 6;
            super(age,mySchool);
            currentSchool.numberOfStudents++;
        }
    }

