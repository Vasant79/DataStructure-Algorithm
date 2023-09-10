package DataStructure.CharArrAndString;

public class StringCompression {

    // compress string
    public static void compress(char arr[]) {

        int aplhaArra[] = new int[26];

        for (char ch : arr) {

            int position = (int) ch - (int) 'a';
            aplhaArra[position] = aplhaArra[position] + 1;
        }

        int count = 0;

        for (int i : aplhaArra) {
            if (i == 1) {
                count++;
            } else if (i > 1 && i <= 9) {
                count = count + 2;
            } else if (i > 9 && i <= 99) {
                count = count + 3;
            }
        }

        char result[] = new char[count];

        int j = 0;
        for (int i = 0; i < aplhaArra.length; i++) {

            if (aplhaArra[i] > 1) {
                // diplaying alphabat and element;
                char ch = (char) (i + 65);
                result[j] = ch;
                j++;
                result[j] = (char) aplhaArra[i];
            } else if (aplhaArra[i] == 1) {
                char ch = (char) (i + 65);
                result[j] = ch;
                j++;

            }
        }

        print(result);

    }

    public static void print(char arr[]) {

        for (char n : arr) {
            System.out.print(n);
        }
    }

    public static void main(String args[]) {

        char arr[] = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        // compress(arr);

    }

}
