 class Linkedlist {
    int data;
    ListNode1 next;
    Linkedlist(int data){
        this.data=data;
        this.next=null;
    }    
}
class Linkedlist{
    ListNode1 head;
    void traversal(){
        if(head==null){
            System.out.println("LL is empty");
            return;

        } 
        ListNode1 temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
            
        } 
        System.out.print("null");
      }
      void insert_at_begin(int data){
        ListNode1 newnode=new ListNode1(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next= head;
        head = newnode;
      }
}
public class ListNode{
    public static void main(String[] args){
        Linkedlist ob = new Linkedlist();
        ob.insert_at_begin(111);
        ob.insert_at_begin(222);
        ob.insert_at_begin(333);
        ob.traversal();
    }

}
/*
 * void inseart_at_position(int data,int pos){
 * listnode temp=head;
 * listnode temp
 * }
 */
