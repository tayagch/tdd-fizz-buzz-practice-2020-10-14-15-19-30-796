package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final String FIZZ = "Fizz";
    private static final int MODULO_5 = 5;
    private static final String BUZZ = "Buzz";
    private static final int MODULO_7 = 7;
    private static final String WHIZZ = "Whizz";

    public String countOff(int orderNumber) {
        String result = "";
        if (isModulo(new GameRule(orderNumber, MODULO_3))) {
            result += FIZZ;
        }

        if(isModulo(new GameRule(orderNumber, MODULO_5))){
            result += BUZZ;
        }

        if(isModulo(new GameRule(orderNumber, MODULO_7))){
            result += WHIZZ;
        }
        return result == "" ? String.valueOf(orderNumber) : result;
    }

    private boolean isModulo(GameRule gameRule) {
        return gameRule.getOrderNumber() % gameRule.getModuloValue() == 0;
    }
}
