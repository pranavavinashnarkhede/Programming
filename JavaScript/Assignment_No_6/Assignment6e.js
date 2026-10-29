/*
 Write a program which accept number from user and display its table in reverse 
order.
*/

function RevTable(no)
{
    for(let i = 10 ; i >=1  ; i--)
    {
        console.log(`${no} * ${i} = ${no * i}`);
    }
}


function main()
{
    let no = 6 ;
    
    RevTable(no);
}

main()