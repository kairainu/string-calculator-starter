package calculator;

class StringCalculator {
	
    public int add(String input) {
    	if (input.isEmpty()) {
    		return 0;
    	}
    	if (input.length() == 1) {
    		return toInt(input);
    	}
    	String delimiter = ",|\n";
    	if (input.matches("//(.*)\n(.*)")) {
    		delimiter = Character.toString(input.charAt(2));
    		input = input.substring(4);
    	}
    	String[] numList = input.split(delimiter);
    	return getSum(numList);
    }
    
    private int toInt(String num) {
    	return Integer.parseInt(num);
    }
    
    private int getSum(String[] numList) {
    	int sum = 0;
    	for (String num: numList) {
    		sum += toInt(num);
    	}
    	return sum;
    }

}