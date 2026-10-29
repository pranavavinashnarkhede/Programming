/*
Write a program which accept number from user and display its factors in 
decreasing order.

*/

function FactRev(no)
{

    for(let i = no / 2 + 1 ; i >= 1 ; i--)
    {
        if(no % i == 0)
        {
            process.stdout.write(i+"\t");
        }
    }

}


function main()
{
    let no = 12 ;

    FactRev(no);
}

main()