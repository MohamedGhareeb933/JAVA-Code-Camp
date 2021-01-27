package DataStructure;

public class main {
    public final int MAX = 17;

    class hashMap{
        private String value;

        public hashMap(String value) {
            this.value = value;
        }
    };

    class hashTable{
        private hashMap Table [];

        public hashTable() {
            Table = new hashMap[MAX];
            for (int i = 0; i < MAX; i++) {
                Table[i] = null;
            }
        }

        int hashFunc(String value) {
            // giving every value a key
            int key = 0;
            char charArray[] = value.toCharArray();
            for (int i = 0; i <value.length(); i++) {
                key += charArray[i];
            }

            return key % MAX;
        }

        void insert(String value) {
            // inserting value to table
            int key = hashFunc(value);
            if (Table[key] == null){
                Table[key] = new hashMap(value);
            }
        }

        hashMap search(String value) {
            int key = hashFunc(value);
            //searching for table by value
            if (Table[key] == null) {
                return null;
            } else {
                return Table[key];

            }
        }

        void delete(String value) {
            int key = hashFunc(value);
            if (Table[key] == null) {
                System.out.println("element is not found");
            } else {
                Table[key] = null;
                System.out.println("element : " + value + " deleted");
            }
        }

    };


    public static void main(String[] args){
        main m = new main();
        hashTable h = m.new hashTable();
        h.insert("one");
        System.out.println(h.search("one"));

        h.delete("one");
        System.out.println(h.search("one"));

    }
}
