import java.util.Scanner;

class Solution
{
    public void CheckEligibleForLoan(int age , int income , int score , String str)
    {
        if(age < 0 || income < 0 || score < 0 || !(str.equals("Yes") || str.equals("No")))
        {
            System.out.println("Invalid input");
            return;
        }

        if((age < 21 && age > 60))
        {
            System.out.println("Loan Rejected : Age range is not fit in the loan criteria");
        }
        else if((income < 25000))
        {
            System.out.println("Loan Rejected : Income is not fit in the loan criteria");
        }
        else if((score < 700))
        {
            System.out.println("Loan Rejected : Credit Score is not fit in the loan criteria");
        }
        else if((str.equals("Yes")))
        {
            System.out.println("Loan Rejected : The customer does not have existing loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }

    } 
}


class Assignment49_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0 ;
        int Income = 0 ;
        int Credit_Score = 0 ;
        String Unpaid_Loan = null ;

        System.out.println("Enter age : ");
        Age = sobj.nextInt();

        System.out.println("Enter Monthly Income : ");
        Income = sobj.nextInt();

        System.out.println("Enter Credit Score : ");
        Credit_Score = sobj.nextInt();

        System.out.println("Existing Unpaid Loan (Yes / No) ? : ");
        Unpaid_Loan= sobj.next();

        Solution suobj = new Solution();

        suobj.CheckEligibleForLoan(Age , Income , Credit_Score , Unpaid_Loan);

        
    }
}