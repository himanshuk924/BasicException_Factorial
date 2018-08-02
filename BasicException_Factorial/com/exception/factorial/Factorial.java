package com.exception.factorial;

public class Factorial {
	//getFactorial method throws InvalidInputException,FactorialException 
	public long getFactorial(long num) throws InvalidInputException,FactorialException {
		long res=1;
		if(num<2) {
			throw new InvalidInputException("Number is less than 2");
		}
		else {
			for(int i=1;i<=num;i++) {
				res=res*i;
			}
		}
		if(res>2147483647||res<=0) {
			throw new FactorialException("Factorial Result is more than integer limit");
		}
		return res;
	}
}
