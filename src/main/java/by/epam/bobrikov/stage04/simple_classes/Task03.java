package by.epam.bobrikov.stage04.simple_classes;

import by.epam.bobrikov.stage04.simple_classes.task_classes.Student;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти
 * элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
 * студентов, имеющих оценки, равные только 9 или 10
 */
public class Task03 {
    public void taskCalculation() {
        Student[] students = new Student[]{
                new Student("Adamov A.A.", 105, new int[]{5, 6, 9, 10, 9}),
                new Student("Abramov G.A.", 110, new int[]{9, 10, 9, 10, 9}),
                new Student("Ivanov P.P.", 105, new int[]{10, 10, 10, 10, 9}),
                new Student("Zueva T.F.", 105, new int[]{5, 9, 7, 10, 9}),
                new Student("Popov N.T.", 111, new int[]{8, 10, 9, 10, 9}),
                new Student("Klimova O.P.", 111, new int[]{9, 9, 9, 10, 9}),
                new Student("Adamovich Z.I.", 110, new int[]{9, 10, 10, 10, 9}),
                new Student("Abrashkin O.O.", 110, new int[]{10, 10, 8, 10, 9}),
                new Student("Burak A.L.", 105, new int[]{9, 9, 9, 9, 9}),
                new Student("Agaponov E.P.", 111, new int[]{10, 10, 10, 10, 10})
        };
        printGoodStudents(students);
    }

    public void printGoodStudents(Student[] students) {
        for (Student student: students) {
            if (student.isGoodProgress()) {
                System.out.println("Student " + student.getSurnameAndInitials() +
                        ", group N" + student.getGroupNumber());
            }
        }
    }
}
