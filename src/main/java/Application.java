public class Application {
    public static void main(String[] args) {

        FizzBuzzBuilder fizzBuzzBuilder = new FizzBuzzBuilder();

        for (int i = 1; i <= 100; i++) {

            if (FizzBuzz.FIZZ.isDisplayOn(i)) {
                fizzBuzzBuilder.build(FizzBuzz.FIZZ.name());
            }
            if (FizzBuzz.BUZZ.isDisplayOn(i)) {
                fizzBuzzBuilder.build(FizzBuzz.BUZZ.name());
            }
            if (FizzBuzz.NONE.isDisplayOn(i)) {
                fizzBuzzBuilder.build(i);
            }

            fizzBuzzBuilder.build(" - ");
        }

        fizzBuzzBuilder.display();
    }
}
