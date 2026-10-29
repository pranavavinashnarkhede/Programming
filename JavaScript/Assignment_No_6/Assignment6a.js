/*
Write a program which accept number from user and if number is less than 50 
then print small , if it is greater than 50 and less than 100 then print medium, if it is 
greater than 100 then print large.

*/

function Number(no)
{
    if(no < 50)
    {
        console.log("SMALL");
    }
    else if(no > 50 && no < 100)
    {
        console.log("MEDIUM");
    }
    else 
    {
        console.log("LARGE");
    }
    
}


function main()
{

    let no = 54 ;

    Number(no);

}


main()