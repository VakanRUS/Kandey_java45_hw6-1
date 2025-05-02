public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = (lastName + " " + firstName + " " + middleName);
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println();

        //task 2
        System.out.println("task 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperFullName);
        System.out.println();

        //task 3
        System.out.println("task 3");
        fullName = "Иванов Семён Семёнович";
        String correctedFullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName);
        System.out.println();
    }
}