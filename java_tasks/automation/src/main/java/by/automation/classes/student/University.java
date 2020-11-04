package by.automation.classes.student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
    private final List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void listOfStudentsByGroupNumber(String group) {
        int count = 0;
        for (Student student : this.studentList) {
            if (group.trim().equalsIgnoreCase(student.getGroupNumber())) {
                System.out.println(student.toString());
            } else {
                count++;
            }
        }

        if (count == this.studentList.size()) {
            System.out.println("Нет такой группы");
        }
    }

    public void listOfStudentsByDateOfBirth(String year) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate;

        int count = 0;

        try {
            localDate = LocalDate.parse("01-" + "01-" + year.trim(), dateTimeFormatter);

            for (Student student : this.studentList) {
                if (localDate.isBefore(student.getDateOfBirth())) {
                    System.out.println(student.toString());
                } else {
                    count++;
                }
            }
        } catch (DateTimeParseException e) {
            System.out.println("неверный год");
        }

        if (count == this.studentList.size()) {
            System.out.println("Нет студентов родившихся после " + year + " года");
        }
    }

    public void listOfStudentsByEachFaculty() {
        String[] faculty = new String[]{"Биологический", "Географический", "Исторический", "Прикладная математика"};

        for (String s : faculty) {
            System.out.println(s);
            for (Student student : this.studentList) {
                if (s.equals(student.getFaculty())) {
                    System.out.println(student.toString());
                }
            }
        }
    }

    public void listOfStudentsByYear() {
        int[] yearArray = new int[]{1, 2, 3, 4, 5};

        for (int year : yearArray) {
            System.out.println("Студенты " + year + " курса");
            for (Student student : this.studentList) {
                if (year == student.getYear()) {
                    System.out.println(student.toString());
                }
            }
        }
    }

    public void listOfStudentsByFaculty(String faculty) {
        int count = 0;
        for (Student student : this.studentList) {
            if (faculty.trim().equalsIgnoreCase(student.getFaculty())) {
                System.out.println(student.toString());
            } else {
                count++;
            }
        }
        if (count == this.studentList.size()) {
            System.out.println("Нет такого факультета");
        }
    }
}
