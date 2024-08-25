import java.util.*;

public class Collections {
    public static void main(String[] args) {

        //CHANGES DONE TO USERNAME AGAIN
        // Tested on my LAPTOP!!

        //                                               List--Sets--Maps

        //-----------------------------------------------------------------------------------------------------------


        /*
         *                                                    List:
         *
         * Allow duplicates
         * Keeps elements ordered by index
         * allows null values
         * common implementations: ArrayList, LinkedList, Vector
         *
         * */

        //creates a list
        List<String> name = new ArrayList<>();

        //adds to list with
        //.add()
        name.add("angel");

        for (String names : name ){
            System.out.println(names);
        }

        //gets the element at the giving index
        name.get(0); //angel



        /*-------------------------------------------------------------------------------------------------------*/

        /*
         *                                                    Set:
         * no duplicates
         * unordered
         * allow null value
         * common implementation: HashSet, LinkedHashSet, TreeSet
         *
         * */
        Set<String> states = new HashSet<String>();

        //Adds elements to Set with
        //.add()
        states.add("alabama");
        states.add("alaska");
        states.add("arizona");

        //prints out the size with
        //size()
        System.out.println(states.size());

        //checks if the Set states contains Delaware
        //.contains("")
        System.out.println(states.contains("Delaware")); // True or False

        if (!states.contains("alabama")) { // adds logic to remove alabama
            states.remove("alabama");
        }

        //loops through
        for (String state : states){
            System.out.println(state);
        }

        //----------------------------------------------------------------------------------------------------------

        /*
         *                                                   Map:
         *
         * Map<K,V> K is the key, and V is the value
         *
         * Key value pairs (dictionary)
         * values can be duplicated, but not keys
         * Common implementation: HashMap. LinkedHashMap, TreeMap, Hashtable
         *
         *
         * */

        // How to creat a HashMap
        Map<Integer, String> racerPlacement = new HashMap<Integer, String>();

        // Add value to the HashMap
        // .put(K,V)
        racerPlacement.put(1, "Angel");
        racerPlacement.put(2, "Tommy");
        racerPlacement.put(3, "John");

        //replace the key value 2 with the value "bob"
        racerPlacement.replace(2,"bob");

        //removes key and value
        racerPlacement.remove(1);

        //gets the Value at the key of placement 1 (Key, Value)
        System.out.println(racerPlacement.get(1));


        //Creates a Set and assigns the Set-racerKeys to HashMap-racerPlacement
        //Key.set() gets the keys for racerPlacement
        Set<Integer> racerKeys = racerPlacement.keySet();
        //loops through racerKeys/racerPlacement
        for(Integer key : racerKeys){
            //prints out the key and racerPlacement.get(key)
            System.out.println(key + " : " + racerPlacement.get(key));
        }

        //creates a collection just for the VALUES not **KEYS!!**
        Collection<String> racers =racerPlacement.values();
        for (String racer : racers){
            System.out.println(racer);
        }

        Map<String, String> dict = new HashMap<String, String>();
        dict.put("Grit","courage and resolve; strength of character.");
        dict.put("Winner", "a person or thing that wins something.");
        dict.put("discipline","the practice of training people to obey rules or a code of behavior, using punishment to correct disobedience.");



    }
}

