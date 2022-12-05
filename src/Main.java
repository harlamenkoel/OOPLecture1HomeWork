public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", -5, "Минск", "бренд-менеджер");
        Human ann = new Human("", 29, "Москва", "методист образовательных программ");
        Human kate = new Human("Екатерина", 28, "Калининград", "");
        Human artem = new Human("Артем", 27, "", "директор по развитию бизнеса");

        maxim.welcomeMessage();
        ann.welcomeMessageWomen();
        kate.welcomeMessageWomen();
        artem.welcomeMessage();

    }
}