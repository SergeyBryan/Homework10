public class Main {
    public static void main(String[] args) {
//        Задание 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        System.out.println("ФИО сотрудника — " + lastName + firstName + middleName);
//        Задание 2
        String fullName = lastName + firstName + middleName;
        String fullNameIsBigger = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameIsBigger);
//        Задание 3
        String firstName1 = "Семён ";
        String middleName1 = "Семёнович";
        String lastName1 = "Иванов ";
        String fullName1 = lastName1 + firstName1 + middleName1;
        String fullNameReplace = fullName1.replace('ё','е');
        System.out.println("Данные ФИО сотрудника — " + fullNameReplace);
    }
}