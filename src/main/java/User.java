public class User implements Runnable {

    private final Box box;
    private final int userTimer = 1000;
    private final int countIteration = 5;

    public User(Box box) {
        this.box = box;
    }
    /**
     * Если Box.trigger == false, изменяет его на true 5 раз.
     * Таймаут = 1 сек.
     */
    @Override
    public void run() {
        try {
            int count = 0;
            while (true) {
                if(count == countIteration) {
                    break;
                }
                if(!box.getTrigger()) {

                        Thread.sleep(userTimer);

                    box.setTrigger(true);
                    count++;
                    System.out.println(Thread.currentThread().getName() + " нажал кнопку ВКЛ.");
                    System.out.println("Нажал - " + count + " раз");
                }
            }
            System.out.println("Закончил. Нажал 5 раз.");
            Thread.sleep(userTimer);
            System.out.println("Закругляемся.");
            Thread.currentThread().interrupt();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
