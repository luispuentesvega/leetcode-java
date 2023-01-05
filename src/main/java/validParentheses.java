import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        validParentheses vp = new validParentheses();
        boolean res = vp.isValid("]");
        System.out.println("The response is: "+res);
    }
    public boolean isValid(String s) {
        // map the symbols
        Map<String, String> im = Map.of("{", "}", "(", ")", "[", "]");

        // create stack
        Stack<String> ms = new Stack<>();

        String[] myArr = s.split("");

        for(String val: myArr) {
            if(im.get(val) != null) {
                ms.push(im.get(val));
            } else {
                if (ms.size() == 0) {
                    return false;
                }
                System.out.println(ms.toString());
                String top = ms.pop();
                if (!top.equals(val)) {
                    return false;
                }
            }
        }
        return ms.empty() ? true : false;
    }
}
