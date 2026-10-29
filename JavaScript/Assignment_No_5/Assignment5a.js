/*
Write a program which accept number from user and print that number of $ & * 
on screen. 

*/

function Pattern(no)
{
    for(let i = 0 ; i < no ; i++)
    {
        process.stdout.write("$\t*\t");
    }
}


function main()
{
    let no = 5 ;

    Pattern(no);
}

main()