/*
 Accept amount in US dollar and return its corresponding value in Indian currency. 
Consider 1$ as 70 rupees

*/


function DollorToINR(input)
{
    return input * 70 ;
}


function main()
{
    let input = 10 ;
    let iRet = 0 ;

    iRet = DollorToINR(input);

    console.log(`Value in INR is ${iRet}`);
}

main()