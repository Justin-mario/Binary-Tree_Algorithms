package com.company;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree ();
            tree.insert ( 25 );
            tree.insert ( 25 );
            tree.insert ( 20 );
            tree.insert ( 15 );
            tree.insert ( 27 );
            tree.insert ( 30 );
            tree.insert ( 29 );
            tree.insert ( 26 );
            tree.insert ( 22 );
            tree.insert ( 32 );
            tree.insert ( 17 );

            System.out.println ("=========traverse in-order=========");
            tree.traverseInOrder ();
            System.out.println ();
            System.out.println ();
            System.out.println ("=========traverse pre-order=========");
            tree.traversePreOder ();
            System.out.println ();
            System.out.println ();
            System.out.println ("=========traverse post-order=========");
            tree.traversePostOrder ();

            System.out.println (tree.get ( 27 ));
            System.out.println (tree.get ( 17 ));
            System.out.println (tree.get ( 88 ));
            System.out.println (tree.min ());
            System.out.println (tree.max ());

            tree.getLastNode ();
        System.out.println ();
        tree.delete ( 888 );
        tree.traverseInOrder ();


    }
}
