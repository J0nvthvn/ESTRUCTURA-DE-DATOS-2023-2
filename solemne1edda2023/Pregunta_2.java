package solemne1edda2023;

public class Pregunta_2 {
    class Node {
        int value;
        Node next;

        public Node (int value) {
            this.value = value;
        }
    }

    public static Node merge(Node l1, Node l2) {
        if ( l1 == null ) return l2 ;
        if ( l2 == null ) return l1 ;

        Node head = null , tmp = null ;

        if ( l1 . value <= l2 . value ) {
            head = l1 ;
        } else {
            head = l2 ;
        }
        tmp = head ;

        while ( l1 != null && l2 != null ) {
            if ( l1 . value >= l2 . value ) {
                tmp . next = l1 ;
                l1 = l1 . next ;
            } else {
                tmp . next = l2 ;
                l2 = l2 . next ;
            }
            tmp = tmp . next ;
        }

        if ( l1 == null ) {
            tmp . next = l2 ;
        } else {
            tmp . next = l1 ;
        }
        return head ;
    }
}
