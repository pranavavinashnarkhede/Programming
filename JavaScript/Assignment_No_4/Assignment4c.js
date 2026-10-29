/*
Write a program which accept number from user and display all its non factors. 
*/

function NonFact(no)
{
    for(let i = 1 ; i < no ; i++)
    {
        if(no % i != 0)
        {
            process.stdout.write(i+"\t");
        }
    }

}


function main()
{
    let no = 12 ;

    NonFact(no);
}

main()