import java.util.*;

public class StBuilder {

    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuilder sb = new StringBuilder(str);
        sb.append(" How are you?");
        System.out.println("Appended String: " + sb.toString());

        sb.insert(7, "Java ");
        System.out.println("Inserted String: " + sb.toString());

        sb.replace(0, 5, "Hi");
        System.out.println("Replaced String: " + sb.toString());

        // sb.reverse();
        // System.out.println("Reversed String: " + sb.toString());
        ArrayList<String> list = new ArrayList<>();
        for (String s : sb.toString().split(" ")) {
            list.add(new StringBuilder(s).reverse().toString());
        }
        System.out.println("Reversed Words: " + list);
    }

}
