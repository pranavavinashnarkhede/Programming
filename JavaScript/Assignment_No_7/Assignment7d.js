/*
Write a program to find odd factorial of given number.  
 

*/


function OddFactorial(input)
{
    let fact = 1 ;

    for(let i = 2 ; i <= input ; i++)
    {
        if(i % 2 == 1)
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

    iRet = OddFactorial(input);

    console.log(`Odd factorial of  ${input} is ${iRet}`);
}

main()