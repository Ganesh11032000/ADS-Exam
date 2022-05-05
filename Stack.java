class Stack{
	int max=8;
	int a1[]=new int [max];
	int top1=4;
	int top2=3;
	
	boolean isEmpty1(){
		return top1==3;
	}
	
	boolean isEmpty2(){
		return top1==4;
	}
	
	boolean isFull1(){
		return top1==0;
	}
	
	boolean isFull2(){
		return top2==7;
	}
	
	void push1(int d){
		if(isFull1()){
			System.out.println("Stack1 is full");
			return;
		}else{
			a1[--top1]=d;
		}
	}
	
	void push2(int d){
		if(isFull2()){
			System.out.println("Stack2 is full");
			return;
		}else{
			a1[++top2]=d;
		}
	}
	
	void pop1(){
		if(isEmpty1()){
			System.out.println("Stack1 is empty");
			return;
		}
		else{
			System.out.println("popped element from stack1 is "+a1[top1++]);
		}
	}
	
	void pop2(){
		if(isEmpty2()){
			System.out.println("Stack2 is empty");
			return;
		}
		else{
			System.out.println("popped element from stack2 is "+a1[top2--]);
		}
	}
	
	public static void main(String args[]){
		Stack s=new Stack();
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
		s.pop1();
		s.pop2();
	}
	
	
	
	
	
	
}