
package Prog3;

public class CustomHashTable {

    private CustomLinklist<Character>[] array = new CustomLinklist[999983];

    public CustomHashTable() {
        for (int count = 0; count < this.getArray().length; count++) {
            this.getArray()[count] = new CustomLinklist<>();
        }
    }

    public static int[] hashFunction(char... chars) {
        final int base = 101;
        long key = 0;
        for (int count = 0; count < chars.length; count++) {
            key = (key * base) + chars[count];
        }
        return new int[]{(int) (Math.abs(key) % 999983), (int) key};
    }

    public void insert(char nextChar, char... chars) {
        int[] inputs = hashFunction(chars);
        this.getArray()[inputs[0]].addElement(inputs[1], nextChar);
    }

    public char getElement(char... chars) {
        int[] inputs = hashFunction(chars);
        return this.getArray()[inputs[0]].getChar(inputs[1]);
    }

    public CustomLinklist<Character>[] getArray() {
        return array;
    }

    public void setArray(CustomLinklist<Character>[] array) {
        this.array = array;
    }

}
