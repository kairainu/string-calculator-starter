package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_two_numbers_separated_by_comma_delimitor_should_return_their_sum() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(5, stringCalculator.add("2,3"));
    }
    
    @Test
    void string_with_two_numbers_separated_by_newline_delimitor_should_return_their_sum() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(10, stringCalculator.add("6\n4"));
    }
    
    @Test
    void string_with_three_numbers_separated_by_either_delimitor_should_return_their_sum() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(11, stringCalculator.add("6\n4,1"));
    }
    
    @Test
    void string_with_two_numbers_separated_by_given_delimitor_should_return_their_sum() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
    
    @Test
    void string_with_negative_numbers_should_throw_exception() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	try {
			stringCalculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "negatives not allowed - -1");
		}

		try {
			stringCalculator.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "negatives not allowed - -4,-5");
		}
    }
    
    @Test
    void ignoreNumbersGreaterThan1000() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(2, stringCalculator.add("2,1001"));
    }
}
