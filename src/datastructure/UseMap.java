package datastructure;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        for(Entry ent:map.entrySet()) {
            for(Object obj: Arrays.asList(ent.getValue())) {
                System.out.println(obj.toString());
            }
        }
    }

}
