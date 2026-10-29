/*
Write a program which accept number from user and return summation of all its 
non factors.
*/

function SumNonFact(no)
{
    let sumNonFact = 0 ;

    for(let i = 1 ; i < no ; i++)
    {
        if(no % i != 0)
        {
            sumNonFact = sumNonFact + i ;
        }
    }

    return sumNonFact ;

}


function main()
{
    let no = 12 ;
    let iRet = 0 ;

    iRet = SumNonFact(no);

    console.log("Summation of non factors is : "+iRet);
}

main()