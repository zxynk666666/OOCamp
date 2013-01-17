public class Car {

    private boolean on;
    private boolean grade;
    private boolean speedUp;

    public Car(boolean status) {
        this.on = status;
    }

    public Car() {

    }

    public String display() {
        String returnValue = "Off";
        if (on) {
            if (grade && !speedUp) {
                returnValue = "Grade On";
            } else if (speedUp && !grade) {
                returnValue = "Free Run";
            } else if (speedUp && grade) {
                returnValue = "Move";
            } else
                returnValue = "On";
        }

        return returnValue;
    }

    public void gradeOn() {
        this.grade = true;
    }

    public void speedUp() {
        this.speedUp = true;
    }
}
