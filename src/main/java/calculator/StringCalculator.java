package calculator;

class StringCalculator {
	private final String delimiter = ",|\n";
    public int add(String input) {
    	String[] numbers = input.split(delimiter);
    	if (input.isEmpty()) {
    		return 0;
    	}
    	if (input.length() == 1) {
    		return Integer.parseInt(input);
    	}
    	if (numbers.length == 2) {
    		return getSum(numbers[0], numbers[1]);
    	}
    	return getSum(numbers[0], numbers[1] , numbers[2]);
    }
    
    private int getSum(String num1, String num2) {
    	return Integer.parseInt(num1) + Integer.parseInt(num2);
    }
    
    private int getSum(String num1, String num2, String num3) {
    	return Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3);
    }

}