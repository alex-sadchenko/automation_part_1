package by.automation.classes.student;

import InputFromConsole.InputFromConsole;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        university.addStudent(new Student(1, "Иванов", "Иван", "Иванович",
                LocalDate.of(1995, 1, 1), "Минск, ул. Кирова 1-20",
                "+375 11 1511212", "Прикладная математика", 1, "101"));
        university.addStudent(new Student(2, "Сидоров", "Степан", "Степанович",
                LocalDate.of(1994, 2, 1), "Минск, ул. Я.Колоса 5-51",
                "+ 375 22 2312323", "Исторический", 2, "202"));
        university.addStudent(new Student(3, "Петров", "Петр", "Петрович",
                LocalDate.of(1993, 3, 1), "Минск, ул. Захарова 1-11",
                "+375 22 3215656", "Биологический", 3, "303"));
        university.addStudent(new Student(4, "Михайлов", "Михаил", "Александрович",
                LocalDate.of(1992, 4, 1), "Минск ул. Орловская 14-51",
                "+375 11 1214545", "Географический", 4, "404"));
        university.addStudent(new Student(5, "Павлов", "Павел", "Сергеевич",
                LocalDate.of(1991, 5, 1), "Минск ул. Филатова 16-50",
                "+375 11 4846565", "Прикладная математика", 5, "505"));
        university.addStudent(new Student(6, "Иванова", "Ирина", "Ивановна",
                LocalDate.of(1992, 6, 1), "Минск ул. Янковского 15-60",
                "+375 32 4548888", "Географический", 4, "404"));
        university.addStudent(new Student(7, "Петрова", "Полина", "Игоревна",
                LocalDate.of(1993, 7, 1), "Минск ул. Октябрьская 10-20",
                "+375 11 5956666", "Биологический", 3, "303"));
        university.addStudent(new Student(8, "Степанова", "Светлана", "Андреевна",
                LocalDate.of(1994, 8, 1), "Минск пр. Пушкина 2-15",
                "+375 22 4847777", "Исторический", 2, "202"));
        university.addStudent(new Student(9, "Сидорова", "Валерия", "Станиславовна",
                LocalDate.of(1995, 9, 1), "Минск ул. Селицкого 15-10",
                "+375 22 5853333", "Прикладная математика", 1, "101"));
        university.addStudent(new Student(10, "Павлова", "Ксения", "Александровна",
                LocalDate.of(1994, 10, 1), "Минск ул. Ковалевской 4-30",
                "+375 11 6549999", "Исторический", 2, "202"));

        InputFromConsole inputFromConsole = new InputFromConsole();

        System.out.println("Чтобы вывести список студентов заданного факультета введите 1");
        System.out.println("Чтобы вывести списки студентов для каждого факультета и курса введите 2");
        System.out.println("Чтобы вывести список студентов, родившихся после заданного года введите 3");
        System.out.println("Чтобы вывести список учебной группы введите 4");

        switch (inputFromConsole.inputNumber()) {
            case 1:
                university.listOfStudentsByFaculty(inputFromConsole.inputLine("Введите название факультета"));
                break;
            case 2:
                university.listOfStudentsByEachFaculty();
                university.listOfStudentsByYear();
                break;
            case 3:
                university.listOfStudentsByDateOfBirth(inputFromConsole.inputLine("Введите год"));
                break;
            case 4:
                university.listOfStudentsByGroupNumber(inputFromConsole.inputLine("Введите номер группы"));
                break;
            default:
                System.out.println("Неправильное число");
        }
    }
}
