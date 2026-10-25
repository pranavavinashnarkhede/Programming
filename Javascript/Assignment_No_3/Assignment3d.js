/*
 Accept one character from user and convert case of that character.    

    input : a
    Output : A

*/

function convertCase(ch)
{
    let no = 0 ;

    if(ch >= 'a' && ch <= 'z')
    {
        no = ch.charCodeAt(0);

        no = no - 32 ;

    }
    else if (ch >= 'A' && ch <= 'Z')
    {
        no = ch.charCodeAt(0);

        no = no + 32 ;
    }

    console.log(String.fromCharCode(no));
}

function main()
{
    let ch = 'a' ;

    convertCase(ch);
}

main()