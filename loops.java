//Milind Pathiyal

//Loop practice : User answers questions and code calculates
import java.util.*;

public class loops
{
     public void start()
     {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you if it is prime or not");
        int number = keys.nextInt();
        checkPrime(number);                                 // method #1
        //Calculates whether the number that is entered is prime or not
                                  
      
        System.out.println("Enter at least three scores and once finished, enter -1");
        ignoreRussianJudge();                              //method #2
        //Calculates the average whilst dropping the highest and lowest score
        System.out.println("Enter an annual contribution towards saving $1,000,000");
        int contribution = keys.nextInt();
        System.out.println("Enter an annual interest rate as a decimal");
        double rate = keys.nextDouble();
        printInvestmentTable(contribution, rate);           // method #3
        //User enters the annual contribution and annual rate, output is a chart 
     }
    
    // pre: number > 1
    // post: prints whether number is prime or not
   
     public void checkPrime(int number)
     {
         int count = 0;
         for (int x = 2; x < number; x++)
         {
             if(number % x ==0)
             {
                 count = 1;
                 break;
                }
            }
            
         if (count == 1)
            {
                System.out.println("This is not a prime number");
            }
            else
            {
                System.out.println("This is a prime number");
            }
         
        }
    
        
       // pre: at least 3 scores will be entered
       // post: asks user to enter gymnastics scores until he or she enters -1
       // post: prints out the average of the test scores, dropping the highest and lowest
       
     public void ignoreRussianJudge()
     {
        double highest = 0;
        double lowest = Double.MAX_VALUE;
        double control = 0;
        Scanner input = new Scanner(System.in);
        int terminate = -1;
        double sum = 0;
        double count = 0;
        double score = 0;
        double average = 0;
         
         while ( score <= Integer.MAX_VALUE)
         {
             System.out.println("Enter a score");
             score = input.nextDouble();
             if ( terminate == score )
             {
               break;
             }
             
             if (score > highest)
             {
                 highest = score;
                }
                
             if ( score < lowest)
             {
                 lowest = score;
             }

             sum = sum + score;
             count++;

         }
          
         sum = sum - (highest + lowest);        //eradicating the lowest and highest scores
         count = count - 2;
         average = sum / count;
         
         System.out.println("average "+ average);

        }
     
        public void printInvestmentTable(int contribution, double rate)
     {
         double interest = 0;
         int total = 0;
         int year = 0;
         int newTotal = 0;
         int i = 1;
         System.out.println("Year   " + "Deposit   " + "   Total  " + "   Interest  " + "   New Total");
         while ( newTotal <= 1000000 )
         {
             total = contribution + newTotal;
             interest = total * rate;
             newTotal = total + (int)interest;
             System.out.println(i + "     " + contribution + "      " + total + "     " + (int)interest + "     " + newTotal);
             year++;
             i = year+1;
             
            }
        }
    }

/*
Enter a number and I will tell you if it is prime or not
15
This is not a prime number

Enter at least three scores and once finished, enter -1
Enter a score
6
Enter a score
9
Enter a score
3
Enter a score
5
Enter a score
-1
average 5.5

Enter an annual contribution towards saving $1,000,000
100000
Enter an annual interest rate as a decimal
.5
Year   Deposit      Total     Interest     New Total
1     100000      100000     50000     150000
2     100000      250000     125000     375000
3     100000      475000     237500     712500
4     100000      812500     406250     1218750

*/
