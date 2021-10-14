public class FizzBuzzBuilder {
    private final StringBuilder printedValue = new StringBuilder();

    public void build(String name) {
         this.printedValue.append(name).append(" ");
    }

    public void build(int number) {
         this.printedValue.append(number).append(" ");
    }

    public void display() {
        System.out.println(this.printedValue);
    }
}
