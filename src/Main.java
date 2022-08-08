
// Completed homework 1.7
// Aleksandr Zubanov
// 2022/08/08


public class Main {
    public static void main(String[] args) {
        printingOfStaffsNames();
        uppercaseConversion();
        characterReplacementFirstExample();
        characterReplacementSecondExample();
    }

// Task 1

// Напишите четыре строки:
// первая с именем firstName — для хранения имени;
// вторая с именем middleName — для хранения отчества;
// третья с именем lastName — для хранения фамилии;
// четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
// Выведите в консоль фразу: “ФИО сотрудника — ….”
// В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
//- Критерии оценки
//    – Строки инициализированы верно.
//    – Сложение строк проведено корректно.
//    – При изменении данных в строках результат программы выводится корректно.
//    – Все условия задания выполнены.


    public static String printingOfStaffsNames() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName + ".");
        return fullName;
    }

// Task 2

// Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich”
// на полностью заглавные буквы.
// В качестве строки с исходными данными используйте строку fullName.
// Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
// - Критерии оценки
//    – Применен метод, меняющий регистр символов строки.
//    - При изменении содержания строки результат программы выполняется.
//    – Результат программы выведен в консоль согласно условиям задачи.

    public static void uppercaseConversion() {
        String fullName = printingOfStaffsNames();
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName + ".");
    }


// Task 3

// Система, в которой мы работаем, не принимает символ “ё”.
// Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
// В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
// Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
// - **Подсказка**
//    Может потребоваться метод split() и метод contains().
// - Критерии оценки
//    – Применен метод, меняющий написание данных строки.
//    –При изменении содержания строки результат программы выполняется.
//    – Результат программы выведен в консоль согласно условиям задачи.


    public static void characterReplacementFirstExample() {
        String fullName = "Иванов Семён Семёнович";

        // methods used 'split' and 'equals'
        String[] splitName = fullName.split(" ");
        for (String name : splitName) {
            if (name.contains("ё")) {
                String[] splitWord = name.split("");
                for (int i = 0; i < splitWord.length; i++) {
                    if (splitWord[i].equals("ё")) {
                        splitWord[i] = "е";
                    }
                    System.out.print(splitWord[i]);
                }
                System.out.print(" ");
            } else {
                System.out.print("Данные ФИО сотрудника - " + name + " ");
            }
        }
        System.out.println();

    }

    public static void characterReplacementSecondExample() {
        String fullName = "Иванов Семён Семёнович";

        // method used 'replace'
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е") + ".");
    }
}