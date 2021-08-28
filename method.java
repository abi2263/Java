public class method {
    public static void main(String[] args) {
        abi("Abi", 18);
        System.out.println(meth(5));
    }

    static void abi(String name, int age) {
        System.out.println(name + " is " + age + ".");
    }

    static int meth(int n) {
        return n + 5;
    }
}
