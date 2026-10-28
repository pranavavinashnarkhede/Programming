// search an element

bool Search(PNODE head , int iNo)
{
    PNODE temp = NULL;

    temp = head;

    while(temp != NULL)
    {
        if (temp->data == iNo)
        {
            return true;
        }
        temp = temp->next ;
    }
    return false;
}