import org.junit.jupiter.api.Test;
import MIU.SumEvenOdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;


class InputData {
    public int[] input;
    public int output;
    InputData(int[] input, int output) {
        this.input = input;
        this.output = output;
    }
}

class JUnit5ExampleTest {

    @Test
    void testNumbers() {
        SumEvenOdd sm = new SumEvenOdd();

        ArrayList<InputData> input = new ArrayList<>();
        input.add(new InputData(new int[]{1}, 1));
        input.add(new InputData(new int[]{1,2}, -1));
        input.add(new InputData(new int[]{1,2,3}, 2));
        input.add(new InputData(new int[]{1,2,3,4}, -2));
        input.add(new InputData(new int[]{3,3,4,4}, -2));
        input.add(new InputData(new int[]{}, 0));
        int index = 1;
        for(InputData data: input) {
            System.out.println("Test:"+index+" => ");
            assertEquals(sm.calculateSum(data.input), data.output);
            index++;
        }

    }
}