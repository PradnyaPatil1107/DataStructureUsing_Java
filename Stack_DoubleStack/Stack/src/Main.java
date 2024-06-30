public class Main {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>(5);

        s.push("Pune");
        s.push("Mumbai");

        System.out.println(s.peek());
        System.out.println(s.pop());



        DoubleStack<Integer>st=new DoubleStack<>(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(s.peek());
        System.out.println(s.pop());

    }
}
