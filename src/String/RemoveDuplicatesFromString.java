package String;

import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
	public static String removeDuplicates(String str) {
        return str.chars()
                  .distinct()
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + output);
    }
}

/*For input "hello":

str.chars() generates a stream of ASCII values: [104, 101, 108, 108, 111] for "h", "e", "l", "l", and "o".
.distinct() removes duplicates, resulting in [104, 101, 108, 111].
.mapToObj(...) converts this to ["h", "e", "l", "o"].
.collect(Collectors.joining()) joins them into the string "helo".


str.chars():

    This converts the String str into an IntStream of characters. Each character is represented by its ASCII (integer) value, which is why this stream is of type IntStream.

.distinct():

    This method filters the stream so that only distinct elements are kept. Since we're dealing with a stream of ASCII values, it removes duplicate ASCII values, effectively removing duplicate characters from the original string.

.mapToObj(c -> String.valueOf((char) c)):

    This converts each integer (ASCII value) back to a String character. Here’s how it works:
        (char) c casts each integer c back to a char (character).
        String.valueOf((char) c) converts that char to a String because we need each character in String form to join them together in the final output.
    As a result, this produces a Stream<String> where each element is a single character represented as a String.

.collect(Collectors.joining()):

    Collectors.joining() collects all the String elements in the stream and joins them into a single String. Since we removed duplicates earlier, the resulting string contains only the unique characters from the original string, in their first occurrence order.
*/