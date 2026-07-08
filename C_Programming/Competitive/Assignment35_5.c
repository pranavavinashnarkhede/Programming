// display only even numbers

void DisplayEven(PNODE head)
{
    PNODE temp = NULL;

    temp = head;

    printf("Even Numbers in Linked List are : \n");
    while(temp != NULL)
    {
        if ((temp->data) % 2 == 0)
        {
            printf("%d\t",temp->data);
        }
        temp = temp->next;
    }
}