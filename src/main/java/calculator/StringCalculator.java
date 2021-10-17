package calculator;

class StringCalculator {
	
    public int add(String input) throws Exception {
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
    
    private int getSum(String[] numList) throws Exception {
    	String negativeNumbers = new String();
        for(String num : numList){
        	if(toInt(num) < 0){
        		if(negativeNumbers.length() == 0)
        			negativeNumbers = num;
        		else
        			negativeNumbers += ("," + num);
        	}
        }
        if (negativeNumbers.length() != 0) {
        	throw new IllegalArgumentException("negatives not allowed - " + negativeNumbers);
        }
    	int sum = 0;
    	for (String num: numList) {
    		sum += toInt(num);
    	}
    	return sum;
    }

}