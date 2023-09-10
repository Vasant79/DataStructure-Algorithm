package DataStructure.Recusrsion;

// question print name 5 times

public class PrintName {

    public static void name(String str, int count) {

        // base condition
        if (count >= 5) {
            return;
        }

        // processing
        System.out.println(count + " " + str);
        count++;

        // recursive releation
        name(str, count);
    }

    public static void main(String args[]) {

        String str = "Vasant Singh Negi";
        int count = 0;

        name(str, count);
    }

}
