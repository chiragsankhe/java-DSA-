import java.util.*;

public class C93_stringBuilder_stringBuffer
{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() → add at the end
        sb.append(" World");
        System.out.println("append: " + sb);  // Hello World

        // 2. insert() → insert at index
        sb.insert(5, " Java");
        System.out.println("insert: " + sb);  // Hello Java World

        // 3. delete() → remove substring
        sb.delete(5, 10); // removes " Java"
        System.out.println("delete: " + sb);  // Hello World

        // 4. deleteCharAt() → remove single char
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt: " + sb);  // HelloWorld

        // 5. replace() → replace part
        sb.replace(5, 10, " Java");
        System.out.println("replace: " + sb);  // Hello Java

        // 6. setCharAt() → modify a single char
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt: " + sb);  // hello Java

        // 7. reverse() → reverse string
        sb.reverse();
        System.out.println("reverse: " + sb);  // avaJ olleh

        // 8. length() & capacity()
        System.out.println("length: " + sb.length());     // 10
        System.out.println("capacity: " + sb.capacity()); // default 16 + original length

        // 9. charAt() → get a character
        System.out.println("charAt(2): " + sb.charAt(2));

        // 10. substring() → get part (returns String, not StringBuilder)
        String sub = sb.substring(0, 4);
        System.out.println("substring: " + sub);

        // 11. ensureCapacity() → increase buffer
        sb.ensureCapacity(50);
        System.out.println("capacity after ensureCapacity: " + sb.capacity());
    }

}