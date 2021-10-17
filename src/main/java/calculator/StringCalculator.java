package calculator;

class StringCalculator {

    public int add(String input) {
    	String[] numbersCommaSeparated = input.split(",");
    	String[] numbersNewlineSeparated = input.split("\n");
    	if (input.isEmpty()) {
    		return 0;
    	}
    	if (input.length() == 1) {
    		return Integer.parseInt(input);
    	}
    	if (input.contains(",")) {
    		return getSum(numbersCommaSeparated[0], numbersCommaSeparated[1]);
    	}
    	return getSum(numbersNewlineSeparated[0], numbersNewlineSeparated[1]);
    }
    
    private int getSum(String num1, String num2) {
    	return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

}