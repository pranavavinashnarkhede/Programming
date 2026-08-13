/*
    Write a program which displays ASCII table. Table contains symbol,
    Decimal, Hexadecimal and Octal representation of every member from
    0 to 255.
*/

class Assignment30_1
{
    static void DisplayASCII()
    {
        System.out.println("Decimal     Octal       HexaDecimal     Character");
        for(int i = 0 ; i <= 255 ; i++ )
        {
            System.out.print(i+"\t\t");
            System.out.print(Integer.toOctalString(i)+"\t\t");
            System.out.print(Integer.toHexString(i)+"\t\t");
            System.out.print((char)i);
            System.out.println();
        }
    }

    public static void main(String A[])
    {
        DisplayASCII();
    }
 
}