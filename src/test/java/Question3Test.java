import MIU.Question3;
import MIU.SumEvenOdd;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class InputData3 {
    public char[] a;
    public int start;
    public int len;
    public char[] output;
    InputData3(char[] a, int start, int len, char[] output) {
        this.a = a;
        this.start = start;
        this.len = len;
        this.output = output;
    }
}

class Question3Test {

    @Test
    void testNumbers() {
        Question3 q3 = new Question3();

        ArrayList<InputData3> input = new ArrayList<>();
//        char[]a = new char[]{'a','b','c'};
//        input.add(new InputData3(a, 0, 4, null));
        char[]b = new char[]{'a','b','c'};
        char[]c = new char[]{'a', 'b', 'c'};
        input.add(new InputData3(b, 0, 3, c));

        int index = 1;
        for(InputData3 data: input) {
            System.out.println("Test:"+index+" => ");
            System.out.println(q3.arrayContaining(data.a, data.start, data.len));
//            assertEquals(in, ou);
            index++;
        }

    }
}