/*
1.Write a program which accept number from user and display below pattern. 

*/


function Pattern(input)
{
    for(let i = 1 ; i <= input * 2 ; i++)
    {
        if(i <= 5)
        {
            process.stdout.write("*\t");
        }
        else
        {
            process.stdout.write("#\t");
        }
        
    }
    
}


function main()
{
    let input = 5 ;

    Pattern(input);
}

main()