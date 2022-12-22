package org.example.html;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setFio("Михаил Сергеевич");
        student.setBirthDate("2000-01-01");
        student.setGender("M");

        student.setYear(2022);
        student.setGroup("11-200");

        HTMLPersonWriter writer
                = new HTMLStudenWriter(student, "student.html");
        writer.print();


        Teacher teacher = new Teacher();

        teacher.setFio("Марина Фадеевна");
        teacher.setBirthDate("1900-03-05");
        teacher.setGender("Ж");

        teacher.setPosition("Преподаватель");
        teacher.setCources(new String[]{"11-401"});

        HTMLPersonWriter writer1 = new HTMLTeacherWriter(teacher, "teacher.html");
        writer1.print();



    }
}
