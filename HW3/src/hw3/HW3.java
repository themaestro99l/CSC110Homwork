
package hw3;

public class HW3 {

 
    public static void main(String[] args) {
        
        int minLimit = (int) -(89 * Math.random()); //Here is a random minimum value
        int maxLimit = (int) (89 * Math.random());  //Here is a random max value
        int count = 0; // Here I create an int that will count the ammount of primes between the random range of numbers
        
        boolean isPrime; //here i creat the variable isPrime
        
        for (int x = minLimit; x <= maxLimit; x++) //here i am setting a new variable that will be used to count through the random range of numbers
            
        {
            isPrime = true;
            
            for (int number = 2; number < x; number++) //here is a loop count from 2 through the number right before maxValue
            {
                if (x % number == 0) //here if the number is divided by 2 or greater and has no divisor then isprime will be considered false
                    isPrime = false; 
            }
            
            if (isPrime == true) // Here the code is checking if the value is true if so it is adding it to the counter
                count++;
        }
        
        System.out.println("The number of prime numbers between " + minLimit + " and " + maxLimit + " is " + count);
            
    }
    
}
