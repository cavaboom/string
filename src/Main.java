public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Фамилия Имя Отчество";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("Задание 2");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpper);
        System.out.println("Задание 3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName2);
    }
}