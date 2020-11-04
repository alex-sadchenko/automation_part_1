package by.automation.classes.student;

//Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(),
// toString(). Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора
// данных и вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено
// несколько конструкторов.

// Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
//Создать массив объектов. Вывести:
//a) список студентов заданного факультета;
//b) списки студентов для каждого факультета и курса;
//c) список студентов, родившихся после заданного года;
//d) список учебной группы.

import java.time.LocalDate;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int year;
    private String groupNumber;

    public Student() {

    }

    public Student(int id, String surname, String name, String patronymic, LocalDate dateOfBirth,
                   String address, String phoneNumber, String faculty, int year, String groupNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.year = year;
        this.groupNumber = groupNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getYear() {
        return year;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    @Override
    public String toString() {
        return "id - '" + id + '\'' +
                ", '" + surname + '\'' +
                ", '" + name + '\'' +
                ", '" + patronymic + '\'' +
                ", '" + dateOfBirth + '\'' +
                ", '" + address + '\'' +
                ", '" + phoneNumber + '\'' +
                ", '" + faculty + '\'' +
                ", year - '" + year + '\'' +
                ", groupNumber - '" + groupNumber + '\'';
    }
}
