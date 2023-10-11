import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here
        LinkedListStack brackets = new LinkedListStack();
        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                brackets.push(ch);
            } else {
                if (brackets.isEmpty()) {
                    return "NO";
                } else {
                    if (!(ch == brackets.pop())) {
                        return "NO";
                    }
                }
            }
        }
        return "YES";
    }

}
    public private static LinkedListStack {
        private static class Node {
            char data;
            Node next;
        }
        private Node first;
    public LinkedListStack() {

        }
    public LinkedListStack(char data, Node next) {
            first.data = data;
            first.next = null;
        }
        public void push(char data) {
            Node old_first = first;
            first = new Node();
            first.data = data;
            first.next = old_first;
        }
        public char pop() {
            char item = first.data;
            first = first.next;
            return item;
        }
        public boolean isEmpty() {
            if (first == null) return true;

            else return false;
        }
    }
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
