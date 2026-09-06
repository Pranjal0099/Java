import java.util.*;

public class strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("\n----- BASIC METHODS -----");

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        if (!str.isEmpty()) {
            System.out.println("First character: " + str.charAt(0));
        }

        // 3. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());


        System.out.println("\n----- SEARCHING METHODS -----");

        // 5. contains()
        System.out.println("Contains 'java': " +
                str.toLowerCase().contains("java"));

        // 6. startsWith()
        System.out.println("Starts with 'Java': " +
                str.startsWith("Java"));

        // 7. endsWith()
        System.out.println("Ends with 'java': " +
                str.endsWith("java"));

        // 8. indexOf()
        System.out.println("Index of 'a': " + str.indexOf('a'));

        // 9. lastIndexOf()
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));


        System.out.println("\n----- EXTRACTION METHODS -----");

        // 10. substring()
        if (str.length() >= 3) {
            System.out.println("Substring from index 0 to 3: "
                    + str.substring(0, 3));
        }

        // 11. substring() from an index
        if (str.length() >= 3) {
            System.out.println("Substring from index 3: "
                    + str.substring(3));
        }


        System.out.println("\n----- COMPARISON METHODS -----");

        // Taking another String
        System.out.print("Enter another String: ");
        String str2 = sc.nextLine();

        // 12. equals()
        System.out.println("Both strings are equal: "
                + str.equals(str2));

        // 13. equalsIgnoreCase()
        System.out.println("Equal ignoring case: "
                + str.equalsIgnoreCase(str2));

        // 14. compareTo()
        System.out.println("compareTo result: "
                + str.compareTo(str2));


        System.out.println("\n----- CLEANING / MODIFYING METHODS -----");

        // 15. trim()
        System.out.println("After trim: [" + str.trim() + "]");

        // 16. replace()
        System.out.println("Replace 'a' with 'x': "
                + str.replace('a', 'x'));

        // 17. replace()
        System.out.println("Replace 'Java' with 'Python': "
                + str.replace("Java", "Python"));

        // 18. replaceFirst()
        System.out.println("Replace first 'a': "
                + str.replaceFirst("a", "X"));

        // 19. replaceAll()
        System.out.println("Remove all spaces: "
                + str.replaceAll(" ", ""));


        System.out.println("\n----- CHECKING METHODS -----");

        // 20. isEmpty()
        System.out.println("Is empty: " + str.isEmpty());

        // 21. isBlank() - Java 11+
        System.out.println("Is blank: " + str.isBlank());


        System.out.println("\n----- SPLIT METHOD -----");

        // 22. split()
        String[] words = str.split(" ");

        System.out.println("Words in String:");

        for (String word : words) {
            System.out.println(word);
        }


        System.out.println("\n----- CONCATENATION -----");

        // 23. concat()
        System.out.println("Concatenated String: "
                + str.concat(" Welcome"));

        // 24. + operator
        String message = str + " Welcome";
        System.out.println("Using + operator: " + message);


        System.out.println("\n----- JOIN METHOD -----");

        // 25. String.join()
        String result = String.join("-", "Java", "Python", "C++");
        System.out.println("Joined String: " + result);


        sc.close();
    }
} 