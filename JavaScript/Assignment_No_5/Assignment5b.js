/*
Write a program which accept number from user and print numbers till that  
number.

*/

function Display(no)
{
    for(let i = 1 ; i <= no ; i++)
    {
        process.stdout.write(i+"\t");
    }
}


function main()
{
    let no = 8 ;

    Display(no);
}

main()