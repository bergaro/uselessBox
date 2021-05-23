public class Toy implements Runnable {

    private final Box box;
    private final int toyTimer = 500;
    public Toy(Box box) {
        this.box = box;
    }

    /**
     * Если Box.trigger == true, изменяет его на false.
     * Если тумблер выключен Таймаут = 0,5 сек.
     */
    @Override
    public void run() {
        while (true) {
            if(box.getTrigger()) {
                box.setTrigger(false);
                System.out.println(Thread.currentThread().getName() + " нажал кнопку ВЫКЛ.");
            } else {
                try{
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

            }
        }
    }
}
