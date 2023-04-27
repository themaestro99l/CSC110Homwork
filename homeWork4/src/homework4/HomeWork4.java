
package homework4;

public class HomeWork4 {

   public static int absolute(int value) {
       if (value < 0)    //Here I am checking to see if the value given is negative
           return -1 * value; //If the value is negative it will be multiplied by -1 to become the absolute value of itself
       else 
           return value; //Here we use an else statement for if the value is not negatve then the original value is returned
        
   }
       
   
   public static int factorial (int number){
       int result = 1; //here i initialize my result as 1
       for (int i = number; i > 1; i--){ //here i create a for loop that will take the original number multiply it by the result then decrease it by 1;
           result *= i; 
       }
        return result;
   }
   
   
   public static int binomialCoefficient (int n, int r ) { 
      int numerator = factorial(n);  //Here i initialize my numerator by a call of the factorial method with n in the parameters
      int denominator = factorial(r)* factorial(n-r); //Here I initialize a the denominator with product of the factorial of r and the factorial of (n-r)
      int answer = numerator / denominator; //here i initialize my answer with the quotient of the numerator by the denominator
              
      
      return answer;
   }
   
   public static void printGraph(int num){
       
            for (int x = 0; x < num; x++) //Here I am creating a loop for each iteration the totally ammount of times each is going to be preformed
       {
             for (int i = 0; i < 2 * num + 1;i++) //Here I am creating a for loop  the number of spaces in each top line
               System.out.print(" "); 
 
                  System.out.println("|"); //Here i print out the tick that will go after the each iteration
            
       }
        for (int d = 0; d < (2 * num + 1); d++) //Here we have a for loop that calculates the amount of times that "-|" will printed in a line
            System.out.print("-|");
        
        System.out.println("-"); //Here i am printing out the final tik that is needed to complete the Y axis of the graph
            
        for (int b = 0; b < num; b++)
       {
             for (int c = 0; c < 2 * num + 1;c++) //Here i use the same for loop i used in the first step to create the last two line
               System.out.print(" ");
 
                  System.out.println("|");
            
       }
        
         
       
       
   }
   
   
   
    public static void main(String[] args){

}
}