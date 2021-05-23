public class Box {
    private volatile boolean trigger = false;

    public boolean getTrigger() {
        return trigger;
    }

    public void setTrigger(boolean trigger) {
        this.trigger = trigger;
    }
}
