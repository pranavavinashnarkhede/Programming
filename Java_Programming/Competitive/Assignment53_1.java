//======================================================================
// Import : java.util
// Purpose: Provides utility classes such as Scanner for taking input.
//======================================================================

import java.util.*;

class Solution
{

//======================================================================
// Function : AnalyzePerformance
// Purpose  : Calculate student totals, topper, subject averages and
//            identify failed students.
// Input    : 2D marks array (0 to 100)
// Output   : Student totals, topper, subject averages and failed students.
// Date     : 25/07/2026
// Author   : Pranav Avinash Narkhede
//======================================================================

    public void AnalyzePerformance(int marks[][])
    {
        int i  = 0 , j = 0 ;
        int iTemp = 0 ;
        int iTotalMarks[] = new int[marks.length];
        int StudentFailed[] = new int[marks.length];
        int iTopper = 0 ;
        float fAverageOfSubject[] = new float[marks[0].length];
        int iIndex = 0 ;
        float fAverage = 0.0f;

        //-------------------------Validations---------------------------//
        for(i = 0 ; i < marks.length ; i++)
        {
            for(j = 0 ; j < marks[i].length ; j++)
            {
                if((marks[i][j] < 0) || (marks[i][j] > 100))
                {
                    System.out.println("Invalid input");
                    return ;
                }
            }
        }

        //----------Calculate total marks of each student , topper , failed student-------------//

        for(i = 0 ; i < marks.length ; i++)
        {
            StudentFailed[i] = 1 ;

            for(j = 0 ; j < marks[i].length ; j++)
            {
                if(marks[i][j] < 35)
                {
                    StudentFailed[i] = 0;
                }
                
                iTemp = iTemp + marks[i][j];
                
            }

            if(iTemp > iTopper)
            {
                iTopper = iTemp ;
                iIndex = i+1 ;
            }

            iTotalMarks[i] = iTemp ;
            iTemp = 0 ;                 // reset iTemp to 0 .
        }

        //---------------Calculate average of each subject--------------------//

        for(i = 0 ; i < marks[0].length ; i++)
        {
            for(j = 0 ; j < marks.length ; j++)
            {
                iTemp = iTemp + marks[j][i];
            }

            fAverage = (float)iTemp / marks.length;

            fAverageOfSubject[i] = fAverage;
            iTemp = 0 ;
        }

    //---------------------Display Output-------------------------------------//
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("-----------------------Student Performance Evaluation-----------------------");
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Student Totals : ");
        for(i = 0 ; i < iTotalMarks.length ;i++)
        {
            System.out.println("Student  "+(i+1)+" : "+iTotalMarks[i]);
        }

        System.out.println();
        System.out.println("Topper : Student "+ iIndex);
        System.out.println();

        System.out.println("Subject Averages : ");
        for(i = 0 ; i < fAverageOfSubject.length ;i++)
        {
            System.out.println("Subject "+(i+1)+" : "+fAverageOfSubject[i]);
        }

        System.out.println();
        System.out.println("Students Failed : ");
        for(i = 0 ; i < StudentFailed.length ;i++)
        {
            if(StudentFailed[i] == 0)
            {
                System.out.println("Student "+(i+1));
            }
        }

    }
}

class Assignment53_1
{
//======================================================================
// Main Function : main
// Purpose       : Accept number of students, subjects and their marks.
// Input         : Students, subjects and marks.
// Output        : Student performance analysis.
// Date          : 25/07/2026
// Author        : Pranav Avinash Narkhede
//======================================================================

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iStudent = 0 ;
        int iSubject = 0 ;
        int i = 0 , j = 0;

        System.out.println("Enter number of students : ");
        iStudent = sobj.nextInt();

        System.out.println("Enter number of subjects : ");
        iSubject = sobj.nextInt();

        if(iStudent < 0 || iSubject < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        int Marks[][] = new int[iStudent][iSubject];


        for(i = 0 ; i < iStudent ; i++)
        {
            System.out.println("Enter marks of "+(i+1 +" : ")+" student : ");
            for(j = 0 ; j < iSubject ; j++)
            {
                System.out.print("Enter "+(j+1)+" subject marks : ");
                Marks[i][j] = sobj.nextInt();
            }
            System.out.println();
        }

        Solution suobj = new Solution();
        suobj.AnalyzePerformance(Marks);

       
    }
}
