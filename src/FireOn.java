class FireOn extends BaseStatus {
    public String value = "On";

    public BaseStatus gradeOn() {
       return new GradedOn();
    }

    public BaseStatus speedUp() {
        return new FreeRun();
    }
    public String getValue() {
        return this.value;
    }
}
