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
   public void func()
   {
       while(head.data>25)
       head=head.next;
       //Node pvNode=head;
       Node currentNode=head;
       while(currentNode.next!=null)
       {
           if(currentNode.next.data>25 )
           {
           currentNode.next=currentNode.next.next;
           }
           else
           currentNode=currentNode.next;
       }
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
class Main
{
    public static void main(String[] args)
    {
        ll ll=new ll();
        ll.add(56);
        ll.add(15);
        ll.add(51);
        ll.add(17);
        ll.add(90);
        ll.add(67);
        ll.add(89);
        ll.add(19);
        ll.add(14);
        ll.add(45);
        ll.add(95);
        ll.add(100);
        ll.display();
        System.out.print("\n");
        ll.func();
        ll.display();
    }
}
