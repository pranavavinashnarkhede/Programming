/*
1.Write a program which accept one number from user and print that number of 
even numbers on screen. 

*/

function printEven(no)
{
    let i = 0 ;

    for(i = 2 ; i <= no * 2 ; i = i + 2)
    {
        process.stdout.write(i+"\t");
    }
}

function main()
{
    let no = 7 ;

    printEven(no);
}

main()