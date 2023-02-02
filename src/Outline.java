import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Outline {

  public static List<String> getList() {
    return List.of("hi", "bat", "ear", "hello", "iguana",
            "beaver", "winterland", "elephant", "eye", "qi");
  }

  // Loop through the words and print each one on a separate line,
  // with two spaces in front of each word.
  public static void question1() {
    List<String> words = getList();
    System.out.println("1: ");
    // YOUR CODE
  }

  // Repeat this problem but without two spaces in front of each word.
  // This should be trivial if you use the same approach as the previous
  // question; the point here is to make use of a method reference.
  public static void question2() {
    List<String> words = getList();
    System.out.println("2: ");
    // YOUR CODE
  }

  // For each of the following lambda expressions (see Question 5 in Worksheet 2),
  // produce the list that contains the elements of the original list
  // that satisfy the predicate defined by the lambda expression
  // (use the filter stream operation):
  //  - s -> s.length() < 4 (strings with no more than 3 characters),
  //  -  s -> s.contains("b") (strings containing "b"),
  // s -> (s.length() % 2) == 0 (strings of even length).

  public static void question3() {
    List<String> words = getList();
    System.out.println("3:");
    // YOUR CODE
  }


  // For each of the following lambda expressions (see Question 7 in Worksheet 2),
  // produce the list that contains the results of applying the function
  // defined by the lambda expression to each element of the original list
  // (use the map stream operation):
  // - s -> s + "!",
  //  s -> s.replace("i", "eye"),
  //  s -> s.toUpperCase().

  public static void question4() {
    List<String> words = getList();
    System.out.println("4:");
    // YOUR CODE
  }


  // (*) Turn the strings in the list into uppercase, keep only the
  // ones that are shorter than four characters, and, of what is remaining,
  // keep only the ones that contain "e", and print the first result.
  // Repeat the process, except checking for a "q" instead of an "e".

  public static void question5() {
    List<String> words = getList();
    System.out.println("5a:");
    // YOUR CODE
  }


  // (** ) The above example uses lazy evaluation, but it is not easy to see
  // that it is doing so. Create a variation of the above example that shows
  // that it is doing lazy evaluation. The simplest way is to track which
  // entries are turned into upper case.

  public static void question6() {
    List<String> words = getList();
    System.out.println("6:");
    // YOUR CODE
  }

  // (*) Produce a single String that is the result of concatenating the
  // uppercase versions of all the Strings.
  // For example, the result should be "HIHELLO...".
  // Hint: use a map operation that turns the words into upper case,
  // followed by a reduce operation that concatenates them.

  public static void question7() {
    List<String> words = getList();
    System.out.println("7:");
    // YOUR CODE
  }


  // (*) Produce a single String that is the result of concatenating the
  // uppercase versions of all the Strings.
  // For example, the result should be "HIHELLO...".
  // Use a single reduce operation, without using map.

  public static void question8() {
    List<String> words = getList();
    System.out.println("8:");
    // YOUR CODE
  }

  // (*) Produce a String that is all the words concatenated together, but
  // with commas in between. For example, the result should be "hi,hello,...".
  // Note that there is no comma at the beginning, before "hi", and also no comma
  // at the end, after the last word.

  public static void question9() {
    List<String> words = getList();
    System.out.println("9:");
    // YOUR CODE
  }

  // CONTINUE WITH THE REST OF THE QUESTIONS

  public static void main(String... args) { // varargs alternative to String[]
    question1();

  }
}