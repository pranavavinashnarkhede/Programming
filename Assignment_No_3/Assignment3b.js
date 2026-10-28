/*
2. Write a program which accept number from user and print even factors of that 
number.  

    input : 24
    Output : 2       4       6       8       12

*/

function printEvenFactors(no)
{
    let i = 0 ;

    for(i = 1 ; i <= no / 2 ; i++)
    {
        if(no % i == 0 && i % 2 == 0)
        {
            process.stdout.write(i+"\t");
        }
        
    }
}

function main()
{
    let no = 24 ;

    printEvenFactors(no);
}

main()