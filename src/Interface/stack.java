package Interface;

interface Stack {
    void push(int number);
    int pop();
}
class MyStack implements Stack {
    private int stack[];
    private int tos;

    MyStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int number) {
        if(tos == stack.length - 1) {
            int tmp[] = new int[stack.length * 2];
            for(int i = 0; i < stack.length; i++) {
                tmp[i] = stack[i];
            }
            stack = tmp;
        }
        else {
            stack[++tos] = number;
        }
    }

    public int pop() {
        if(tos == -1) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            return stack[tos--];
        }
    }
}
class Test_Stack {
    public static void main(String[] args) {
        Stack stackObj = new MyStack(5);

        for(int i=0; i<5; i++) stackObj.push(i);

        for(int i=0; i<5; i++) System.out.println(stackObj.pop());
    }
}
