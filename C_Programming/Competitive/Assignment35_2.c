// count even numbers

int CountEven(PNODE head)
{
    PNODE temp = NULL;
    int iCount = 0 ;

    temp = head ;

    while(temp != NULL)
    {
        if ((temp->data) % 2 == 0)
        {
            iCount++;
        }
        temp = temp->next;
    }

    return iCount;
}