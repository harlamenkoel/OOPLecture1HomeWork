import java.util.Calendar;

public class Human {
    String name;
    int yearOfBirth;
    String town;
    String job;

    Human(String name, int age, String town, String job) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        if (age < 0) {
            yearOfBirth = 0;
        } else {
            this.yearOfBirth = currentYear - age;
        }
        if (name == null) {
            name = "Информация не указана";
        }
        if (town == null) {
            town = "Информация не указана";
        }
        if (job == null) {
            job = "Информация не указана";
        }

        this.name = name;
        this.town = town;
        this.job = job;
    }

    void welcomeMessage() {
        System.out.println("Привет! Меня зовут " + name + ". " +
                "Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }

    void welcomeMessageWomen() {
        System.out.println("Привет! Меня зовут " + name + ". " +
                "Я из города " + town + ". Я родилась в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}