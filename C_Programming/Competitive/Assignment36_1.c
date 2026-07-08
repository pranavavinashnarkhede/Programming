// display only odd numbers

void DisplayOdd(PNODE head)
{
    PNODE temp = NULL;

    temp = head;

    printf("Odd Numbers in Linked List are : \n");
    while(temp != NULL)
    {
        if ((temp->data) % 2 != 0)
        {
            printf("%d\t",temp->data);
        }
        temp = temp->next;
    }
}