package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final String FIZZ = "Fizz";
    private static final int MODULO_5 = 5;
    private static final String BUZZ = "Buzz";
    private static final int MODULO_7 = 7;
    private static final String WHIZZ = "Whizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    public String countOff(int orderNumber) {
        if(isModulo(orderNumber, MODULO_3) && isModulo(orderNumber, MODULO_5)){
            return FIZZ_BUZZ;
        }

        if(isModulo(orderNumber,MODULO_3) && isModulo(orderNumber,MODULO_7)){
            return "FizzWhizz";
        }

        if (isModulo(orderNumber, MODULO_3)) {
            return FIZZ;
        }

        if(isModulo(orderNumber, MODULO_5)){
            return BUZZ;
        }

        if(isModulo(orderNumber, MODULO_7)){
            return WHIZZ;
        }

        return String.valueOf(orderNumber);
    }

    private boolean isModulo(int orderNumber, int moduloValue) {
        return orderNumber % moduloValue == 0;
    }
}
