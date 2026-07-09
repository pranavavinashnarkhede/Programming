// first occurrence position

int FirstOccur(PNODE head , int iNo)
{
    PNODE temp = NULL;
    int iPos = 1 ;

    temp = head;

    while(temp != NULL)
    {
        if (temp->data == iNo)
        {
            return iPos;
        }
        iPos++;
        temp = temp->next ; 
    }
    return -1;          // element not found
}