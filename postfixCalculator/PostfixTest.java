package postfixCalculator;

import org.junit.Test;

import java.util.Stack;
import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.*;

/*
In reverse Polish notation the operators follow their operands;
for instance, to add 3 and 4, one would write "3 4 +" rather than "3 + 4".
If there are multiple operations, the operator is given immediately after its second operand;
so the expression written "3 - 4 + 5" in conventional notation would be written "3 4 - 5 +" in RPN: 4 is first subtracted from 3, then 5 added to it.
An advantage of RPN is that it obviates the need for parentheses that are required by infix.
While "3 - 4 * 5" can also be written "3 - (4 * 5)", that means something quite different from "(3 - 4) * 5".
In postfix, the former could be written "3 4 5 * -", which unambiguously means "3 (4 5 *) -" which reduces to "3 20 -";
the latter could be written "3 4 - 5 *" (or 5 3 4 - *, if keeping similar formatting), which unambiguously means "(3 4 -) 5 *".
Taken from http://en.wikipedia.org/wiki/Reverse_Polish_notation.
 */
public class PostfixTest {

    @Test
    public void calcSignShouldReturnStackWithTwoElementsPoppedAndOneElementPushed() {
        Stack<Double> numbers = new Stack<>();
        IntStream.rangeClosed(1, 5).forEach(number -> numbers.add((double) number));
        Stack<Double> actual = calcSign(numbers, (num1, num2) -> num2 / num1);
        assertThat(actual.size(), is(equals(4)));
    }

}