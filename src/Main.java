public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", -5, "Минск", "бренд-менеджер");
        Human ann = new Human(null, 29, "Москва", "методист образовательных программ");
        Human kate = new Human("Екатерина", 28, "Калининград", null);
        Human artem = new Human("Артем", 27, null, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир",21,"Казань",null);

        System.out.println(maxim);
        System.out.println(ann);
        System.out.println(kate);
        System.out.println(artem);
        System.out.println(vladimir);
    }
}