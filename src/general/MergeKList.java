package general;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chen on 02/04/2016.
 * <p>
 * Merge k sorted linked lists and return it as one sorted list.
 * <p>
 * Example :
 * <p>
 * 1 -> 10 -> 20
 * 4 -> 11 -> 13
 * 3 -> 8 -> 9
 * will result in
 * <p>
 * 1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20
 */
public class MergeKList {

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * public int val;
     * public ListNode next;
     * ListNode(int x) { val = x; next = null; }
     * }
     */
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeKLists(List<ListNode> a) {
        Integer[] kCurrentItem = new Integer[a.size()];
        init(kCurrentItem, a);


        Integer item = getNextMinimumItem(kCurrentItem, a);
        ListNode head = new ListNode(item);
        ListNode curr = head;

        while (item != null) {
            item = getNextMinimumItem(kCurrentItem, a);

            if (item == null)
                continue;

            curr.next = new ListNode(item);
            curr = curr.next;
        }

        return head;
    }

    public void init(Integer[] kCurrentItem, List<ListNode> a) {
        for (int i = 0; i < a.size(); i++) {
            kCurrentItem[i] = a.get(i).val;
        }
    }

    public Integer getNextMinimumItem(Integer[] kCurrentItem, List<ListNode> a) {

        Integer min = Integer.MAX_VALUE;
        int minKIndex = 0;

        for (int i = 0; i < kCurrentItem.length; i++) {
            if (kCurrentItem == null || min == null) {
                System.out.println("strange");
            }
            if (kCurrentItem[i] != null && min > kCurrentItem[i]) {
                minKIndex = i;
                min = kCurrentItem[i];
            }
        }

        if (min == Integer.MAX_VALUE)
            return null;

        if (a == null || a.get(minKIndex) == null)
            System.out.println("strange2");
        ListNode nextMin = a.get(minKIndex).next;
        kCurrentItem[minKIndex] = nextMin != null ? nextMin.val : null;

        a.set(minKIndex, nextMin);

        return min;
    }

    @Test
    public void mergeKListTest1() {
        List<ListNode> a = new ArrayList<>();
        ListNode l1 = createMockListNode(new Integer[]{1, 10, 20});
        ListNode l2 = createMockListNode(new Integer[]{4, 11, 13});
        ListNode l3 = createMockListNode(new Integer[]{3, 8, 9});

        a.add(l1);
        a.add(l2);
        a.add(l3);

        ListNode result = mergeKLists(a);
        printResult(result);
        Assert.assertEquals(result.val, 1);
    }

    public void printResult(ListNode a) {

        while (a != null) {
            System.out.print(a.val + " ");
            a = a.next;
        }
    }
    @Test
    public void mergeKListTest2() {
        List<ListNode> a = new ArrayList<>();
        ListNode l1 = createMockListNode(new Integer[]{8, 20, 38, 44, 55, 65, 66, 79, 87});
        ListNode l2 = createMockListNode(new Integer[]{68 ,72});
        ListNode l3 = createMockListNode(new Integer[]{5,  55, 61, 73, 89});
        ListNode l4 = createMockListNode(new Integer[]{30, 73 });
        ListNode l5 = createMockListNode(new Integer[]{28, 73, 84, 96});
        ListNode l6 = createMockListNode(new Integer[]{54, 82, 83});
        ListNode l7 = createMockListNode(new Integer[]{15, 33, 38, 94, 100});
        ListNode l8 = createMockListNode(new Integer[]{4});
        ListNode l9 = createMockListNode(new Integer[]{ 22, 32, 42, 64, 86});
        ListNode l10 = createMockListNode(new Integer[]{ 11, 78});

        a.add(l1);
        a.add(l2);
        a.add(l3);
        a.add(l4);
        a.add(l5);
        a.add(l6);
        a.add(l7);
        a.add(l8);
        a.add(l9);
        a.add(l10);

        ListNode result = mergeKLists(a);
        printResult(result);
    }

    public ListNode createMockListNode(Integer[] array) {
        ListNode head = new ListNode(array[0]);
        ListNode curr = head;

        for (int i = 1; i < array.length; i++) {
            curr.next = new ListNode(array[i]);
            curr = curr.next;
        }

        return head;
    }
}
