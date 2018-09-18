package ca.insightdata;

import java.util.Arrays;
import java.util.Collection;

public class CollectionJava {

	public static void main(String[] args) {
		
		Collection<Integer[]> list = Arrays.asList(new Integer[][] {
			{2, 1, 1},
			{3, 2, 1}, //expected, valueOne, valueTwo
			{4, 3, 1}
		});
		
		
		
	}	
	
	public Integer[][] getValues() {
		Integer[][] values = new Integer[5][];
		return values;
	}
}
