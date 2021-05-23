public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Нажму кнопку 5 раз.");
        Thread toyThread = new Thread(null, new Toy(box), "Страшная рука");
        toyThread.setDaemon(true);
        Thread userTread = new Thread(null, new User(box), "Пользователь");

        toyThread.start();
        userTread.start();
    }
}
