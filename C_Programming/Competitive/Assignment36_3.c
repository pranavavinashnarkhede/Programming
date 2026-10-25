// last occurrence position

int LastOccur(PNODE head , int iNo)
{
    PNODE temp = NULL;
    int iPos = 1 ;
    int iLast = -1 ;

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