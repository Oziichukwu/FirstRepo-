package practiseExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    List myArrayList;
    @BeforeEach
    public void setUpBeforeEach(){
        myArrayList = new ArrayList();

    }
    @Test
    public void testThatMyArrayListIsNotEmpty(){
        assertNotNull(myArrayList);
    }

    @Test
    public void testThatListIsEmptyByDefault(){
        //when
        //assert
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testThatItemCanBeAddedToList(){
        myArrayList.add(78);
        assertEquals(78, myArrayList.get(0));
    }

    @Test
    public void testThatWeCanRemoveItemFromList(){
        myArrayList.add(43);
        myArrayList.remove(43);
        assertEquals(0, myArrayList.get());
    }

    @Test
    public void testThatSizeOfListCanBeDetermined(){
        myArrayList.add(5);
        myArrayList.add(9);
        myArrayList.remove(9);
        assertEquals(1, myArrayList.getSize());
    }

    @Test
    public void testThatAnElementCanBeGottenWithAnIndexValue(){
        myArrayList.add(66);
        myArrayList.add(24);
        myArrayList.add(34);
        assertEquals(34, myArrayList.get(2));
    }

    @Test
    public void testThatTheIndexOfAnElementCanBeGotten(){
        myArrayList.add(45);
        myArrayList.add(5);
        assertEquals(0, myArrayList.getIndexOf(45));
    }

    @Test
    public void testThatElementCanBeReplacedInList(){
        myArrayList.add(22);
        myArrayList.add(2);
        myArrayList.add(32);
        myArrayList.replace(42, 2);
        assertEquals(42, myArrayList.get(2));
    }

    @Test
    public void testThatIfWeRemoveFromAnEmptyListExceptionIsThrown(){
        assertThrows(IllegalArgumentException.class, ()->myArrayList.remove(34));
    }

    @Test
    public void testThatArrayListIsElastic(){
        myArrayList.add(22);
        myArrayList.add(2);
        myArrayList.add(32);
        myArrayList.add(42);
        assertEquals(6, myArrayList.getCapacity());

    }

    @Test
    public void removeAndRearrangeIndexTest(){

        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);
        assertEquals(32, myArrayList.get(1));
        myArrayList.remove(32);
        assertEquals(99, myArrayList.get(1));
    }

}
