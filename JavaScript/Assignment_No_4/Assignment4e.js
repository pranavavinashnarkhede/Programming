/*
Write a program which accept number from user and return difference between 
summation of all its factors and non factors. .
*/

function FactDiff(no)
{
    let sumNonFact = 0 ;
    let sumFact = 0 ;

    for(let i = 1 ; i < no ; i++)
    {
        if(no % i != 0)
        {
            sumNonFact = sumNonFact + i ;
        }
        else
        {
            sumFact = sumFact + i ;
        }
    }

    return sumFact - sumNonFact ;

}


function main()
{
    let no = 12 ;
    let iRet = 0 ;

    iRet = FactDiff(no);

    console.log("Difference between summation of factors and non factors is : "+iRet);

    
}

main()