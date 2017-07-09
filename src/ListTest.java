import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ListTest {

	@Test
	public void testNewLinkedList() {
		LinkedList singly = new LinkedList();
		assertTrue(singly.isEmpty()); // linked list should be empty
		assertEquals(0, singly.size()); // length of linked list should be zero
		singly.addLast("ABC");
		assertFalse(singly.isEmpty()); // linked list should not be empty
		assertEquals(1, singly.size()); // length of linked list should be 1
	}

	@Test
	public void tesLinkedListAdd() {
		LinkedList singly = new LinkedList();
		singly.addLast("You ");
		singly.addLast("are ");
		singly.addLast("awesome!!");
		assertFalse(singly.isEmpty()); // linked list should not be empty
		assertEquals("You are awesome!!", singly.toString()); // length of
																// linked list
																// should be 1
	}

	@Test
	public void tesLinkedListRemove() {
		LinkedList singly = new LinkedList();
		singly.addLast("A");
		singly.addLast("B");
		singly.addLast("C");
		singly.remove(1);
		assertFalse(singly.isEmpty()); // linked list should not be empty
		assertEquals("AC", singly.toString()); // length of linked list should
												// be 1
	}

	@Test
	public void tesLinkedListSimpleAdd() {
		LinkedList singly = new LinkedList();
		singly.addLast("A");
		singly.addLast("B");
		singly.add("X", 1);
		assertFalse(singly.isEmpty()); // linked list should not be empty
		assertEquals("AXB", singly.toString()); // length of linked list should
												// be 1
	}

	@Test
	public void tesLinkedListAddRemove() {
		LinkedList singly = new LinkedList();
		singly.addLast("A");
		singly.remove(0);
		singly.add("B", 0);
		singly.remove(0);
		assertTrue(singly.isEmpty()); // linked list should not be empty
	}

}
