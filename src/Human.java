import java.util.Calendar;

public class Human {
    String name;
    private int yearOfBirth;
    private String town;
    String job;

    Human(String name, int age, String town, String job) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);


        setYearOfBirth(age);
        if (age < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = currentYear - age;
        }

        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        setTown(town);
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + ". " +
                "Я из города " + getTown() + ". Год моего рождения " + getYearOfBirth() + ". Я работаю на должности " + getJob();
    }
}