// count numbers less than x

int CountGreater(PNODE head , int x)
{
    PNODE temp = NULL;
    int iCount = 0 ;

    temp = head ;

    while(temp != NULL)
    {
        if (temp ->data < x)
        {
            iCount++;
        }
        temp = temp->next;
    }
    return iCount;
}