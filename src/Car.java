public class Car {

    private BaseStatus Status = new FireOff();

    public Car() {

    }

    public String display() {
        return this.Status.getValue();
    }


    public void gradeOn() {
        this.Status = this.Status.gradeOn();
    }

    public void speedUp() {
       this.Status = this.Status.speedUp();
    }

    public void turnOn() {
        this.Status = this.Status.fireOn();
    }
}


