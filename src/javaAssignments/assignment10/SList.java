package javaAssignments.assignment10;



public class SList<T> {
    public SNode<T> head;
    public SList(){
        head = new SNode<T>();
    }

    public SListIterator<T> Iterator(){

        return new SListIterator<T>(this);

    }
    public String toString(){

        SNode<T> temp = this.head;
        String string = "Single Linked list: ";
        while (temp.next != null) {
            string = string + temp.data.toString() + " ";
            temp = temp.next;
        }
        string = string + temp.data.toString() ;
        return string;

    }
}
