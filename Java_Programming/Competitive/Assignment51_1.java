import java.util.Scanner;

//--------------------------------------------------------------------//
// Application to calculate the hospital bill.
//--------------------------------------------------------------------//

class Solution
{
    //--------------------------------------------------------------------//
    // Function Name : CalculateBill
    // Description   : Calculates the hospital bill and insurance cover.
    // Input         : Days, ward type, medicine bill, consultation fee, insurance
    // Output        : Total bill, insurance cover and final payable amount
    // Author        : Pranav Avinash Narkhede
    // Date          : 22-07-2026
    //--------------------------------------------------------------------//

    public void CalculateBill(int days, String ward, int medicinebill,
                              int consulationfee, String insured)
    {
        int totalBill = 0;
        int insuranceCover = 0;
        int finalPay = 0;

        if(days < 0 || 
           (!ward.equals("ICU") && !ward.equals("Normal")) ||
           medicinebill < 0 ||
           consulationfee < 0 ||
           (!insured.equals("Yes") && !insured.equals("No")))
        {
            System.out.println("Invalid input");
            return;
        }

        if(ward.equals("ICU"))
        {
            totalBill = days * 5000 + medicinebill + consulationfee;
        }
        else
        {
            totalBill = days * 2000 + medicinebill + consulationfee;
        }

        if(insured.equals("Yes"))
        {
            insuranceCover = (totalBill * 70) / 100;

            if(insuranceCover > 50000)
            {
                insuranceCover = 50000;
            }
        }

        finalPay = totalBill - insuranceCover;

        System.out.println("Total Bill : " + totalBill);
        System.out.println("Insurance Cover : " + insuranceCover);
        System.out.println("Final Pay : " + finalPay);
    }
}

class Assignment51_1
{
    //--------------------------------------------------------------------//
    // Application to calculate the hospital bill.
    //--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int days = 0;
        String WardType = null;
        int MedicineBill = 0;
        int ConsultationFee = 0;
        String Insured = null;

        System.out.println("Enter the days you admitted in hospital : ");
        days = sobj.nextInt();

        System.out.println("Enter your ward type (Normal / ICU) : ");
        WardType = sobj.next();

        System.out.println("Enter the medicine bill : ");
        MedicineBill = sobj.nextInt();

        System.out.println("Enter the consultation fee : ");
        ConsultationFee = sobj.nextInt();

        System.out.println("Is Insurance available (Yes / No) : ");
        Insured = sobj.next();

        Solution suobj = new Solution();

        suobj.CalculateBill(days, WardType, MedicineBill,
                           ConsultationFee, Insured);
    }
}