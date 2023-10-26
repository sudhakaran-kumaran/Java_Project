package J_Collection;

import java.util.ArrayList;

public class J_Collection {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        Student std = new Student(1,"sudhakaran");
        Student std1 = new Student(2,"naresh");
        student.add(std);
        student.add(std1);
        for(Student student1 : student){
            System.out.print(student1.getRollno()+" ");
            System.out.println(student1.getName() + " ");

        }
        student.remove(1);
        System.out.println("After removing a student,Existing student id and name");
        for(Student student1 : student){
            System.out.print(student1.getRollno() + " ");
            System.out.println(student1.getName());
        }
//        using setter
        Student stdsetter = new Student();
        stdsetter.setName("naresh");
        stdsetter.setRollno(2);
        student.add(stdsetter);
        student.add(1, new Student(1, "sudhakaran"));
        for (Student student1 : student) {
            System.out.println(student1.getName());
            System.out.println(student1.getRollno());
        }


    }
}
