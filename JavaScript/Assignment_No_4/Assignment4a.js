/*
.Write a program which accept number from user and display its multiplication of 
factors.

*/

function factorMultiplication(no)
{
    let factMul = 1 ;

    for(let i = 1 ; i <= no / 2 ; i++)
    {
        if(no % i == 0)
        {
            factMul = factMul * i ;
        }
    }

    return factMul ;
}


function main()
{
    let no = 12 ;
    let iRet = 0 ;

    iRet = factorMultiplication(no);

    console.log("Multiplication of factors is : "+iRet);
}

main()