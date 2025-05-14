package problem2;

public class AddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(4, n3);
        ListNode l1 = new ListNode(2, n2);

        ListNode z3 = new ListNode(4);
        ListNode z2 = new ListNode(6, z3);
        ListNode l2 = new ListNode(5, z2);
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        toString(result);

        ListNode List3 = new ListNode(9);
        ListNode List2 = new ListNode(9, List3);
        ListNode newListNode1 = new ListNode(9, List2);
        System.out.println("\n");

        ListNode List7 = new ListNode(9);
        ListNode List6 = new ListNode(9, List7);
        ListNode List5 = new ListNode(9, List6);
        ListNode List4 = new ListNode(9, List5);
        ListNode newListNode2 = new ListNode(9, List4);
        ListNode result2 = addTwoNumbers.addTwoNumbers(newListNode1, newListNode2);
        toString(result2);

    }
/*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        int sum;
        boolean head = true;
        boolean carryOver = false;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 == null) {
                sum = l1.val;
                l1 = l1.next;
            } else if (l1 == null && l2 != null) {
                sum = l2.val;
                l2 = l2.next;
            } else {
                sum = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            if (carryOver) {
                sum++;
                carryOver = false;
            }
            if (sum >= 10) {
                carryOver = true;
            }
            if (head) {
                head = false;
                result.val = sum % 10;
                continue;
            }
            ListNode newNode = new ListNode();
            newNode.val = sum % 10;
            addToTail(result, newNode);
        }
        if (carryOver) {
            ListNode n = new ListNode(1);
            ListNode tmp = result;
            n.val = 1;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = n;
        }
        return result;
    }


    static void addToTail(ListNode head, ListNode newNode) {
        while (head.next != null) {
            head = head.next;
        }
        head.next = newNode;
    }
    */
            /*
            if(isCarryOver(sum)){
                carryOver=true;
                sum++;
            }
            if(head){
                head = false;
                carryOver = isCarryOver(sum);
                if(carryOver){
                    result.val = (sum+1) % 10;
                    continue;
                }
                carryOver = false;
                result.val = sum;
                continue;
            }
            ListNode tmp = new ListNode();
            carryOver = isCarryOver(sum);
            if(carryOver){
                result.val = (sum+1) % 10;
                continue;
            }
            if(isCarryOver(sum)){
                sum +=1 ;
                tmp.val = sum+1;
            }


            l1 = l1.next;

        }
        return result;

      }
                     */


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // Calcolo il carry per il prossimo giro
            current.next = new ListNode(sum % 10); // Crea il nuovo nodo
            current = current.next; // Sposta il puntatore corrente
        }

        if (carry > 0) {
            current.next = new ListNode(carry); // Aggiungi un nodo per il carry finale
        }

        return dummyHead.next; // Restituisci la lista senza il nodo fittizio
    }


    static boolean isCarryOver(int sum) {
        if (sum >= 10)
            return true;
        return false;
    }


//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        List<ArrayList<Integer>> allList = new ArrayList<>();
//        ArrayList<Integer> list1Int = new ArrayList<>();
//        ArrayList<Integer> list2Int = new ArrayList<>();
//        while(l1 != null){
//            list1Int.add(l1.val);
//            list2Int.add(l2.val);
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//        allList.add(list1Int);
//        allList.add(list2Int);
//        StringBuilder sb = new StringBuilder();
//        for (Integer num : list1Int) {
//            sb.append(num);
//        }
//        int result1 = Integer.parseInt(sb.toString());
//        sb = new StringBuilder();
//        for (Integer num : list2Int) {
//            sb.append(num);
//        }
//        int result2 = Integer.parseInt(sb.toString());
//        System.out.println(result1+result2);
//        return l1;
//    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static void toString(ListNode listNode) {
        String s;
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}


