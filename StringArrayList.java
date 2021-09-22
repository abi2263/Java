import java.util.*;

class Operations {

    void insert(ArrayList<String> arr, int index, String str) {
        arr.add(index, str);
    }

    void append(ArrayList<String> arr, String str) {
        arr.add(str);
    }

    void search(ArrayList<String> arr, String str) {
        for (int i = 0; i < (arr.size()); i++) {
            if (arr.get(i).equals(str)) {
                System.out.println("The given string is in the index: " + i);
                return;
            }
        }
        System.out.println("No such string in the ArrayList!");
    }

    void start(ArrayList<String> arr, String w) {
        for (int i = 0; i < (arr.size()); i++) {
            String str1 = arr.get(i);
            if (str1.startsWith(w)) {
                System.out.println("String: " + str1);
                return;
            }
        }
        System.out.println("No such string in the List!");
    }
}

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        Operations o = new Operations();
        Scanner in = new Scanner(System.in);
        int ch;
        System.out.println("\tSTRING OPERATIONS");
        System.out.println(
                "\n\t1.Insert\n\t2.Append\n\t3.Search\n\t4.Print the string that starts with specified character\n\t5.Exit");
        do {
            System.out.print("\n\nEnter the choice: ");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the index you want to insert: ");
                    int idx = in.nextInt();
                    System.out.print("Enter the word to insert: ");
                    String word = in.next();
                    o.insert(arr, idx, word);
                    System.out.println("Successfully inserted!");
                    System.out.println("\nArrayList after insertion: " + arr);
                    break;

                case 2:
                    System.out.print("Enter the word to append: ");
                    String wor = in.next();
                    o.append(arr, wor);
                    System.out.println("Successfully appended!");
                    System.out.println("\nArrayList after appended: " + arr);
                    break;

                case 3:
                    System.out.print("Enter the word to search: ");
                    String wo = in.next();
                    o.search(arr, wo);
                    break;

                case 4:
                    System.out.print("Enter the character to print the string that starts with it : ");
                    String w = in.next();
                    o.start(arr, w);
                    break;

                case 5:
                    System.out.print("EXIT!");
                    break;

                default:
                    System.out.println("Please enter the valid choice (1/2/3/4/5)!");
                    break;
            }
        } while (ch != 5);
        in.close();
    }
}