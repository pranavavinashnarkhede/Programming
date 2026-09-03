import java.util.Scanner;

class Solution
{
//--------------------------------------------------------------------//
// Function Name : Voting
// Description   : Counts valid votes by rejecting duplicate voter IDs.
// Input         : Array of voter IDs
// Output        : Number of valid votes
// Author        : Pranav Avinash Narkhede
// Date          : 23-07-2026
//--------------------------------------------------------------------//

    public int Voting(int Arr[])
    {
        int ValidVotes = 0 ;
        int i = 0  , j = 0 ;

        for(i = 0 ; i < Arr.length ; i++)
        {
            for(j = 0 ; j < i ; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    break;
                }
            }
            if(j == i)
            {
                ValidVotes++;
            }
            
        }

        return ValidVotes;

    }
}

class Assignment52_2
{
//--------------------------------------------------------------------//
// Application to count valid votes and reject duplicate votes.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int NoOfVotes = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number of voters : ");
        NoOfVotes = sobj.nextInt();

        int VoterID[] = new int[NoOfVotes] ;

        for(int i = 0 ; i < NoOfVotes ; i++)
        {
            System.out.print("Enter the "+(i+1)+" voter id : ");
            VoterID[i] = sobj.nextInt();
        }

        Solution suobj = new Solution();

        iRet = suobj.Voting(VoterID);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Valid Votes : "+iRet);
            System.out.println("Rejected Duplicate Votes : "+(NoOfVotes - iRet));
        }

    }
}