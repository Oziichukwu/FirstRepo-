package practiseExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StackImplTest {

    Stack stack;

    @BeforeEach
    void setUp(){
        stack = new Stack(5);
    }
    @Test
    public void stackCanBeCreatedTest(){
        assertNotNull(stack);
    }

    @Test
    void stackHasAFixedMaximumSize(){

        assertEquals(5, stack.maximumSize());
    }

    @Test
    void stackPushMethodAddsItemsToTheTopOfTheStack() throws Exception{

        stack.push(23);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());
    }

    @Test
    void stackPopMethodRemovesItemsFromTheTopOfTheStack() throws Exception {

        stack.push(23);
        stack.push(43);
        assertEquals(43, stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    void stackPeekMethodReturnsItemAtTheTopOfTheStackWithoutModifying() throws Exception {

        stack.push(45);
        stack.push(40);
        stack.push(41);
        stack.pop();
        assertEquals(2, stack.size());
        assertEquals(40, stack.peek());

    }
}
