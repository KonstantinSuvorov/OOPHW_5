package OOPHW5;

import OOPHW5.Controller.Controller;
import OOPHW5.Model.Student;
import OOPHW5.Model.Teacher;
import OOPHW5.View.ModelView;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher teacherAleks = new Teacher(" Александр ", " Васильев ", 34, " Математика ", 2);

        Student studentNik = new Student("Николай", "Черенковский", 22, 1);
        Student studentSlava = new Student("Слава", "Радимова", 23, 2);
        Student studentSergey = new Student("Сергей", "Радимов", 24, 3);
        Student studentLion = new Student("Лев", "Яшинка", 21, 4);
        Student studentKatya = new Student("Катя", "Лелякова", 22, 5);
        Student studentAlex = new Student("Александр", "Черенковский", 22, 6);


        List<Student> studentList = new ArrayList<>();
        studentList.add(studentNik);
        studentList.add(studentKatya);
        studentList.add(studentSergey);
        studentList.add(studentLion);
        studentList.add(studentSlava);
        studentList.add(studentAlex);

        Controller controller = new Controller();

        ModelView modelView = new ModelView();

        System.out.println("\nСоздана группа студентов: \n");
        modelView.getAllGroup(studentList,teacherAleks,controller);
    }

}