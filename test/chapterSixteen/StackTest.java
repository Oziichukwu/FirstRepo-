package chapterSixteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StackTest {
    Stack stack;

    @BeforeEach

    void setUp(){

        stack = new Stack(5);
    }
    @Test
    public void stackCanBeCreated(){

        assertNotNull(stack);
    }

    @Test
    public void canAdd(){

        stack.add(3);
        assertEquals(1, stack.size());
    }

    @Test
    public void addTwoValuesSizeIs2(){

        stack.add(3);
        stack.add(6);
        assertEquals(2, stack.size());
    }


    @Test
    public void canAddAndRemove(){

        stack.add(3);
        stack.add(6);
        stack.pop();
        assertEquals(1, stack.size());
    }

    @Test
    public void canBeEmpty() throws RuntimeException{
        stack.add(5);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void canBeFull() throws RuntimeException{
        stack.add(5);
        stack.add(5);
        stack.add(5);
        stack.add(5);
        //assertTrue(stack.isFull());
    }

    @Test

    public void removeFromEmptyStackThrowsUnderFlowException(){

        assertTrue(stack.isEmpty());
        assertThrows(Stack.UnderFlowException.class,()->stack.pop());
    }

    @Test
    public void addXPeeksShowsXTest(){

        stack.add(4);
        stack.add(7);
        stack.add(2);
        stack.add(9);
        assertEquals(9, stack.peek());
    }
    @Test
    public void addXYremoveZW(){

        stack.add(4);
        stack.add(7);
        stack.add(9);
        stack.pop();
        stack.pop();
        assertEquals(1, stack.size());
        assertEquals(4, stack.peek());
    }
    @Test
    void addXYZV_throwsStackOverFlow(){

        stack.add(43);
        stack.add(21);
        stack.add(12);
        stack.add(12);
        stack.add(43);
        assertThrows(Stack.OverFlowException.class, ()->stack.add(31));
    }

}
