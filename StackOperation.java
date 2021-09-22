import java.util.*;

interface Stack {
    void push();
    void pop();
}

interface Stack1 {
    void push1(int num);
    void pop1();
}

class Oper implements Stack {
    int stack[] = new int[3];
    int i, top = -1;

    Scanner in = new Scanner(System.in);

    public void push() {
        if (top >=2) {
            System.out.println("Stack is OVERFLOW!");
        } else {
            System.out.print("Enter the element to insert : ");
            int n = in.nextInt();
            ++top;
            stack[top] = n;
            System.out.println("Element pushed! (" + stack[top] + ")");
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack is UNDERFLOW!");
        } else {
            System.out.println("Successfully popped!");
            System.out.println("The popped element is " + stack[top]);
            top--;
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.print("The elements in the STACK are: ");
            for (i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
        } else {
            System.out.println("The STACK is empty!");
        }
    }
}

class Oper1 implements Stack1 {
    ArrayList<Integer> stack1 = new ArrayList<Integer>();
    int top = -1;

    Scanner in = new Scanner(System.in);

    public void push1(int num) {
        ++top;
        stack1.add(num);
    }

    public void pop1() {
        if (top < 0) {
            System.out.println("Stack is UNDERFLOW!");
        } else {
            System.out.println("The popped element is " + stack1.get(top));
            stack1.remove(top);
            System.out.print("Successfully popped!");
            top--;
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.print("The elements in the STACK are: ");
            for(int i=stack1.size()-1;i>=0;i--)
                System.out.print(stack1.get(i)+" ");
        } else {
            System.out.println("The STACK is empty!");
        }
    }
}

class StackOperation {

    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int ch;
        Oper o = new Oper();
        System.out.println("\n\t1.STRING OPERATIONS USING STATIC ARRAY\n\t2.STRING OPERATIONS USING DYNAMIC LIST");
        System.out.print("\nEnter the type: ");
        int type = in.nextInt();
        if (type == 1) {
            System.out.println("\n\t1.Push\n\t2.Pop\n\t3.Display\n\t4.Exit");
            do {
                System.out.print("\n\nEnter your choice : ");
                ch = in.nextInt();
                switch (ch) {
                    case 1:
                        o.push();
                        break;
                    case 2:
                        o.pop();
                        break;
                    case 3:
                        o.display();
                        break;
                    case 4:
                        System.out.println("EXIT!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please Enter the Valid Choice (1/2/3/4)!");
                        break;
                }
            } while (ch != 4);
        }

        else if (type == 2) {
            Oper1 o1 = new Oper1();
            int choice;
            System.out.println("\n\t1.Push\n\t2.Pop\n\t3.Display\n\t4.Exit");
            do {
                System.out.print("\n\nEnter your choice : ");
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter a element to insert : ");
                        int n = in.nextInt();
                        o1.push1(n);
                        System.out.print("Successfully pushed!");
                        break;
                    case 2:
                        o1.pop1();
                        break;
                    case 3:
                        o1.display();
                        break;
                    case 4:
                        System.out.println("EXIT!");
                        break;
                    default:
                        System.out.println("Invalid choice ! Please Enter the Valid Choice..!!!");
                        break;
                }
            } while (choice != 4);
        }
    }
}