package calculator;

class StringCalculator {
	
    public int add(String input) {
    	if (input.isEmpty()) {
    		return 0;
    	}
    	if (input.length() == 1) {
    		return Integer.parseInt(input);
    	}
    	String delimiter = ",|\n";
    	if (input.matches("//(.*)\n(.*)")) {
    		delimiter = Character.toString(input.charAt(2));
    		input = input.substring(4);
    	}
    	String[] numbers = input.split(delimiter); 
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