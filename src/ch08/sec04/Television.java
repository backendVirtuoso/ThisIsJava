package ch08.sec04;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOff() {
        System.out.println("Turning off television");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on television");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Set volume to " + volume);
    }
}
