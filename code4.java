class Node 
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
        ll.add(23);
        ll.add(9);
        ll.add(23);
        ll.add(17);
        ll.add(98);
        ll.add(23);
        ll.display();
        System.out.print("\n");
        ll.delete(98);
        ll.display();
         System.out.print("\n");
       ll.insert(3,1);
       ll.insert(5,3);
       ll.insert(99,1);
       ll.insert(5,8);
       ll.insert(76,10);
       ll.display();
         System.out.print("\n");
    }
}
class ll 
{
    int s=0;
    Node head;
    public void display()
    {
        Node currentNode=head;
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+"\t");
            currentNode=currentNode.next;
        }
    }
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
      s++;
    }
   public void insert(int d,int k)
    {
        Node newNode=new Node(d);
        if(head==null)
           {
               head=newNode;
               s++;
               return;
           }
        if(k==1)
        {
           newNode.next=head;
           head=newNode;
        }
        else if(k==s+1)
        {
		Node currentNode=head;
		while(currentNode.next!=null)
			currentNode=currentNode.next;
		currentNode.next=newNode;
        }
        else
        {
            Node currentNode=head;
        while(k-->2)
        {
            currentNode=currentNode.next;
        }
        //if(currentNode.next.next!=null)
        newNode.next=currentNode.next;
         currentNode.next=newNode;
        }
         s++;
    }
    public void delete(int d)
    {
        Node currentNode=head;
        while(currentNode.next!=null)
        { 
            if(currentNode.next.data!=d)
            currentNode=currentNode.next;
            else
            currentNode.next=currentNode.next.next;
        }
        if(currentNode.data==d)
        currentNode=null;
        currentNode=head;
        if(currentNode.data==d)
        head=head.next;
        s--;
    }
}
