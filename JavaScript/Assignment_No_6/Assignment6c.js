/*
Write a program to find factorial of given number.  

*/

function Factorial(no)
{
    let fact = 1 ;

    for(let i = 1 ; i <= no ; i++)
    {
        fact = fact * i ;
    }

    return fact ;
    
}


function main()
{
    let no = 6 ;
    let iRet = 0 ;

    iRet = Factorial(no);

    console.log(`Factorial of ${no} is ${iRet}`);
}


main()