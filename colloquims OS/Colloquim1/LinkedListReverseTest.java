package fibonachi;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListReverseTest {

    @Test
    public void testReverseEmptyList() {
        ListNode head = null;

        ListNode result = LinkedListReverse.reverse(head);

        assertNull(result);
    }

    @Test
    public void testReverseSingleElementList() {
        ListNode head = new ListNode(42);

        ListNode result = LinkedListReverse.reverse(head);

        assertEquals(42, result.val);
        assertNull(result.next);
    }

    @Test
    public void testReverseMultipleElementList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode result = LinkedListReverse.reverse(head);

        assertEquals(4, result.val);
        assertEquals(3, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(1, result.next.next.next.val);
        assertNull(result.next.next.next.next);
    }

    @Test
    public void testReverseListWithRepeatedElements() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);

        ListNode result = LinkedListReverse.reverse(head);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(1, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    public void testReverseLongList() {
        ListNode head = new ListNode(1);
        ListNode current = head;

        // Создаем длинный список (1, 2, ..., 1000)
        for (int i = 2; i <= 1000; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        ListNode result = LinkedListReverse.reverse(head);

        assertEquals(1000, result.val);
        for (int i = 999; i >= 1; i--) {
            assertEquals(i, result.next.val);
            result = result.next;
        }
        assertNull(result.next);
    }
}
