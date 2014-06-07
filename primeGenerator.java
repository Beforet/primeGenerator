/**
Prime Generator
A program that generates prime numbers up to a user defined number.
*/
import java.util.ArrayList;
public class primeGenerator {
	private ArrayList<Integer> primes;
	public primeGenerator(){
		primes = new ArrayList<Integer>();
		//primes.add(1);
		primes.add(2);
	}
	/**
	Tests to see if a number is a prime number by testing it against a list of other prime numbers. If none of the other prime numbers is a number, then the number must be prime and the method
	returns true.
	*/
	private boolean isPrime(int testNo){
		boolean prime = true;
		if(testNo == 1){
			prime = false;
			return prime;
		}
		for(Integer number : primes){
			if(number > testNo)
				break;
			if(testNo % number == 0){
				if(testNo == number)
					prime = true;
				else{
					prime = false;
					break;
				}
			}
		}
		if(prime == true){
			if(primes.indexOf(testNo) < 0 && testNo != 1)
				primes.add(testNo);
		}
		return prime;
	}
	/**
	Generates and prints all the prime numbers between 0 and a user defined number.
	*/
	public void generate(int target){
		for(int i = 1; i <= target; i++){
			if(isPrime(i))
				System.out.println(i);
		}
	}
}