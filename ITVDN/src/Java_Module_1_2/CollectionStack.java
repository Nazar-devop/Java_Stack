package Java_Module_1_2;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class CollectionStack {
    public static void main(String[] args) {
        Map<Character, Character> brackets = new Hashtable<>();
        brackets.put(']', '[');
        brackets.put('}', '{');
        brackets.put(')', '(');
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку: ");
        System.out.format("balanced: %b%n", isBalanced(s.nextLine(), brackets));
    }
    public static boolean isBalanced(String str, Map<Character, Character> brk) {
        java.util.Stack<Character> stk = new java.util.Stack<>();
        for (char c : str.toCharArray()) {
            if (brk.containsValue(c)) {
                stk.push(c);
            } else {
                    if (brk.containsKey(c)) {
                        if (stk.isEmpty() || !brk.get(c).equals(stk.pop())) {
                            return false;
                        }
                    }
                }
             }
        return stk.isEmpty();
    }
}



