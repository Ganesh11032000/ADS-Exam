import java.util.*;
class List{
	Node head;
	 class Node{
		 int data;
		 Node next;
		 
		 Node(int d){
			 data=d;
			 next=null;
		 }
	 }
	 List(){
		 head=null;
	 }
	 
	 Node reverse(Node head){
		 if(head==null || head.next==null){
			
			 return head;
		 }
		 Node t=reverse(head.next);
		 head.next.next=head;
		 head.next=null;
		 
		 return t;
		 
		 
	 }
	 
	 void insert(int d){
		 Node n=new Node(d);
		 if(head==null){
			 head=n;
			 return;
		 }
		 Node tem=head;
		 while(tem.next!=null){
			 tem=tem.next;
		 }
		 tem.next=n;
	 }
	 
	 void display(Node head){
		 Node n=head;
		 while(n!=null) {
			 System.out.print(n.data+" ");
			 n=n.next;
		 }
	 }
		 
		 public static void main(String args[]){
			 Scanner sc=new Scanner(System.in);
			 List l1=new List();
			 int t=sc.nextInt();
			 int n=sc.nextInt();
			 for(int i=0;i<n;i++){
				 l1.insert(sc.nextInt());
			 }
			 l1.head=l1.reverse(l1.head);
			 l1.display(l1.head);
			 
		 }
		 

}
