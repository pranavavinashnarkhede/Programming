/*
5. Write a program which accept N and print first 5 multiples of N.  

*/

function MultipleDisplay(no)
{
    for(let i = 1 ; i <= 5; i++)
    {
        process.stdout.write(no*i+"\t");
    }
}


function main()
{
    let no = 4 ;

    MultipleDisplay(no);
}

main()