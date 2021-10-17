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
    	return getSum(numbers[0], numbers[1]);
    }
    
    private int getSum(String num1, String num2) {
    	return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

}