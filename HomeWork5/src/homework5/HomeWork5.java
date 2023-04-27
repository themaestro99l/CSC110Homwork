
package homework5;


public class HomeWork5 {

    public static boolean isNumberInArray(int number,int list[]) //this method helps to determine if the number is in the array
    {
        boolean result = false;    //Here i set the result to false
        for (int element : list)  //Here I have a for loop that is going to go through each element
        {
            if (element == number) //Here I use an if statement to set the result to true if the element is the same as the number
                result = true;
        }
        return result; // I then have the function return the result
    }
    
    public static int[] unionArrays(int listA[], int listB[]) // This is our unionArrays function
    {
        
        int index = 0;  //I initialize my index variable to 0
        int result[] = new int[listA.length + listB.length] ;  //here I intitialize a result wich will add listA and listB 
        
        for (int i = 0; i < listA.length; i++)  //here I create a for loop that will go through the first array and check for duplicates
        {
            if(!isNumberInArray(listA[i], result)){  
                result[index] = listA[i];
                index++;
            }
        }
            for (int p = 0; p < listB.length; p++) //This for loop is the same as the one before just to go through the listB
        {
            if(!isNumberInArray(listB[p], result)){
                result[index] = listB[p];
                index++;
            }
        
    }
    return result; //I return my results 
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4};
        int b[] = {7,3,5,6};
        
        int[] answer = unionArrays (a, b);  //Here I call my unionArrays function to go through listA and listB
       
        for (int element : answer)  //Just a classic print statement to test :)
          System.out.println(element);
       
    }
       
    
    
}
