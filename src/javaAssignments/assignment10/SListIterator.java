package javaAssignments.assignment10;



public class SListIterator<T> {
    SNode<T> head;
    public SListIterator(SList<T> list){

        this.head=list.head;
    }
    public void add(T data){
        SNode<T> temp=head;
        if(head.data!=null){
            SNode<T> last=new SNode<T>(data);
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=last;
        }
        else{
            temp.data=data;
            temp.next=null;
        }

    }
    public void remove(T data){

        if (head == null) {
            return;
        }
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        SNode<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }



}
