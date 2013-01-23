class GradedOn extends BaseStatus {
    public String value = "Graded On";

    public BaseStatus speedUp() {
        return new Move();
    }
    public String getValue() {
        return this.value;
    }
}
