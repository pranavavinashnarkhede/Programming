/*
4. Write a program which accepts N from user and print all odd numbers up to N. 

*/

function DisplayOdd(no)
{
    for(let i = 1 ; i <= no ; i = i+2)
    {
        process.stdout.write(i+"\t");
    }
}


function main()
{
    let no = 18 ;

    DisplayOdd(no);
}

main()