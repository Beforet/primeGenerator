public class primeGeneratorTest{
	public static void main(String[] args){
		primeGenerator generator = new primeGenerator();
		System.out.println("The Prime Numbers up to 10");
		generator.generate(10);
		System.out.println("The Prime Numbers up to 100");
		generator.generate(100);
		System.out.println("The Prime Numbers up to 1000");
		generator.generate(1000);
		System.out.println("Extreme: The Primes up to 1,000,000,000");
		generator.generate(1000000000);
	}
}