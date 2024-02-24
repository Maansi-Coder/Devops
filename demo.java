public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            next= null;
            size++;
        }
    }

    //add- start, end

    public void addbeg(String data){
        Node newnode= new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addLast(String data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node currnode= head;
        while (currnode.next != null){
            currnode= currnode.next;
        }
        currnode.next= newnode;
    }

    public void print(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node currnode= head;
        while (currnode!=null){
            System.out.print(currnode.data + "->");
            currnode=currnode.next;
        }
        System.out.println("NULL");
  
    }

    public void delFirst(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head= head.next;
    }

    public void deflast(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }
        Node currnode= head;
        while (currnode.next.next != null){
            currnode=currnode.next;
        }
        currnode.next= null;
    }

    public void getsize(){
        System.out.println(size);
    }

    /*public void search(String d){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node currnode= head;
        while(currnode!=null){
            if (currnode.data == d){
                System.out.println("True");
                return;
            }
            currnode= currnode.next;
        }
        System.out.println("False");
        return;
    }*/

    public void midterm()

    public void search(Node n,String d){
        if (n == null){
            System.out.println("False");
            return;
        }
        if (n.data==d){
            System.out.println("True");
            return ;
        }else{
            search(n.next,d);
        }
    }
    /*public static void reverse(LL l){
        LL l1= new LL();
        if (l.head==null){
            System.out.println("List is empty");
        }
        Node currnode= l.head;
        while(currnode != null){
            l1.addbeg(currnode.data);
            currnode= currnode.next;
        } 
        l1.print();
    }*/

    public static void reverse(LL l1, Node n,LL l){
        if (l.head==null){
            System.out.println("list is empty");
        }
        l1.addbeg(l.n.data);
        reverse(l1, n.next, l);
    }

    public void delat(int pos){
        
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        if (pos==0){
            delFirst();
            return;
        }
        int i=1;
        Node currnode= head.next;
        Node secolast= head;
        while(currnode!=null){
            if (i==pos){
                break;
            }
            i++;
            currnode= currnode.next;
            secolast= secolast.next;
        }
        secolast.next= currnode.next;
        currnode.next= null;


    }

     public void getat(int pos){
        
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        if (pos==0){
            System.out.println(head.data);
            return;
        }
        int i=1;
        Node currnode= head.next;
        while(currnode!=null){
            if (i==pos){
                break;
            }
            i++;
            currnode= currnode.next;
        }
        System.out.println(currnode.data);
        


    }
    
    public static void main(String args[]){
        LL l= new LL();
        l.addbeg("b");
        l.addbeg("a");
        l.addLast("c");
        l.addLast("d");
        //l.reverse(l);
        //l.getsize();
        //l.search(l.head,"c");
        l.print();
        LL new_L= new LL();
        l.reverse(new_L,l.head,l);
        //l.getat(2);
        //l.delFirst();
        //l.getsize();
        //l.print();
        //l.deflast();
        //l.getsize();
        //l.search(l.head,"a");
        new_L.print();

    }
}
