/*
5. Accept on character from user and check whether that character is vowel  
(a,e,i,o,u) or not.  

    input : a
    Output : It is Vowel

*/

function CheckVowel(ch)
{
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
    {
        console.log("It is Vowel");
    }
    else
    {
        console.log("It is not Vowel");
    }
}

function main()
{
    let ch = 'a' ;

    CheckVowel(ch);
}

main()