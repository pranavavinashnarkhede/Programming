// last occurrence position

int FirstOccur(PNODE head , int iNo)
{
    PNODE temp = NULL;
    int iPos = 1 ;
    int iLast = 0 ;

    temp = head;

    while(temp != NULL)
    {
        if (temp->data == iNo)
        {
            iLast = iPos;
        }
        iPos++;
        temp = temp->next ; 
    }
    return iLast;
}