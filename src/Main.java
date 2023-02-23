public class Main {
    public static void main(String[] args) {

        MyLinkedList ml = new MyLinkedList(10);

        String result = (ml.isEmpty())? "Empty": "Has " + ml.count() + " Values";
        System.out.println(result);

        ml.insert("One");
        ml.insert("Two");
        ml.insert("Three");
        ml.insert("Four");
        ml.insert("Five");
        ml.insert("Six");
        ml.insert("Seven");

        // now print the array with seven items
        result = (ml.isEmpty()) ? "Empty" : ("Has " + ml.count() + " Values ...");
        System.out.println(result);
        System.out.println(ml);
        System.out.println();

        // Try to insert 4 more items, the last one should print
        // an error message
        System.out.println("Now insert 4 more items");
        ml.insert("Eight");
        ml.insert("Nine");
        ml.insert("Ten");
        System.out.println();

        // should print an error message
        ml.insert("Eleven");
        System.out.println();

        // Now thest the delete
        ml.delete("Four");
        ml.delete("Three");
        System.out.println();

        // after the delete
        System.out.println("After the delete");
        System.out.println(ml);
    }
}