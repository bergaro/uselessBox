public class Toy implements Runnable {

    private final Box box;
    private final int toyTimer = 1000;

    public Toy(Box box) {
        this.box = box;
    }

    /**
     * Если Box.trigger == true, изменяет его на false.
     * Таймаут = 1 сек.
     */
    @Override
    public void run() {
        while (true) {
            if(box.getTrigger()) {
                try {
                    Thread.sleep(toyTimer);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                box.setTrigger(false);
                System.out.println(Thread.currentThread().getName() + " нажал кнопку ВЫКЛ.");
            }
        }
    }
}
