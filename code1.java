class ll
{
       Node head;
     public void add(int d)
     {
         Node newNode=new Node(d);
         if(head==null)
         head=newNode;
         else
         {
             Node lastNode=head;
             while(lastNode.next!=null)
             lastNode=lastNode.next;
             lastNode.next=newNode;
         }
    }
    public void display()
    {
        Node currentNode = head;
           while (currentNode != null)
               {
                  System.out.print(currentNode.data + "\t");
                  currentNode = currentNode.next;
               }
    }
    public void search(int d)
    {
        int k=0;
        Node currentNode=head;
        if(head!=null)
        {
            while(currentNode.data!=d)
            {
            currentNode=currentNode.next;
            k++;
            }
        }
        if(head==null)
        System.out.println("list is empty");
        else
        System.out.println(k+1);
    }
}
class  Node 
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class oop 
{
    public static void main(String[] args)
    {
        ll ll=new ll();
        ll.add(1);
        ll.add(5);
        ll.add(7);
        ll.add(3);
        ll.add(8);
        ll.add(2);
        ll.add(3);
        ll.display();
        System.out.print("\n");
        ll.search(7);
    }
}
