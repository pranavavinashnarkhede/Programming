/*
Write a program to find even factorial of given number. 

*/


function EvenFactorial(input)
{
    let fact = 1 ;

    for(let i = 2 ; i <= input ; i++)
    {
        if(i % 2 == 0)
        {
            fact = fact * i ;
        }
    }

    return fact ;
}


function main()
{
    let input = 10 ;
    let iRet = 0 ;

    iRet = EvenFactorial(input);

    console.log(`Even factorial of  ${input} is ${iRet}`);
}

main()