// count frequency of given number

int Frequency(PNODE head , int iNo)
{
    PNODE temp = NULL;
    int iCount = 0 ;

    temp = head;

    while(temp != NULL)
    {
        if((temp->data) == iNo)
        {
            iCount++;
        }
        temp = temp->next ;
    }

    return iCount;
}