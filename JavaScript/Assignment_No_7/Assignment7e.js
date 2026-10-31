/*
  Write a program which returns difference between Even factorial and odd factorial 
of given number.

*/


function FactorialDiff(input)
{
    let factodd = 1 ;
    let facteven = 1 ;

    for(let i = 2 ; i <= input ; i++)
    {
        if(i % 2 == 1)
        {
            factodd = factodd * i ;
        }
        else
        {
            facteven = facteven * i ;
        }
    }

    return facteven - factodd ;
}


function main()
{
    let input = 10 ;
    let iRet = 0 ;

    iRet = FactorialDiff(input);

    console.log(`Factorial difference is ${iRet}`);
}

main()