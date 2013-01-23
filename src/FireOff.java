public class FireOff extends BaseStatus {
    public String value = "Off";

    public BaseStatus fireOn() {
        return new FireOn();
    }
    public String getValue() {
        return this.value;
    }

}
