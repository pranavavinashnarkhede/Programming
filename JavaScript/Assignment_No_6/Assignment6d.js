/*
Write a program which accept number from user and display its table.  

*/

function Table(no)
{
    for(let i = 1 ; i <= 10 ; i++)
    {
        console.log(`${no} * ${i} = ${no * i}`);
    }
}


function main()
{
    let no = 6 ;
    
    Table(no);
}


main()