public enum FizzBuzz {

    FIZZ("Fizz", 3) {
        @Override
        public boolean isDisplayOn(int number){
            return isMultipleOf(number) || containsOn(number);
        }

        @Override
        boolean isMultipleOf(int number) {
            return number % FIZZ.value == 0;
        }

        @Override
        boolean containsOn(int number) {
            return number % 10 == FIZZ.value || (number/10) % 10 == FIZZ.value;
        }
    },
    BUZZ("Buzz", 5) {
        @Override
        public boolean isDisplayOn(int number){
            return isMultipleOf(number) || containsOn(number);
        }

        @Override
        boolean isMultipleOf(int number) {
            return number % BUZZ.value == 0;
        }
        @Override
        boolean containsOn(int number) {
            return number % 10 == BUZZ.value || (number/10) % 10 == BUZZ.value;
        }
    };

    protected final String fizzBuzz;
    protected final int value;


    FizzBuzz(String fizzBuzz, int value) {
        this.fizzBuzz = fizzBuzz;
        this.value = value;
    }

    public abstract boolean isDisplayOn(int number);
    abstract boolean isMultipleOf(int number);
    abstract boolean containsOn(int number);

}
