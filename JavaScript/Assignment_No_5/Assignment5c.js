/*
3. Write a program which accept number from user and print its numbers line. 

*/

function Display(no)
{
    for(let i = -no ; i <= no ; i++)
    {
        process.stdout.write(i+"\t");
    }
}


function main()
{
    let no = 5 ;

    Display(no);
}

main()