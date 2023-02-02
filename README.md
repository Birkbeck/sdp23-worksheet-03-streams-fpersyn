# Worksheet Three

## The Stream Processing API

+ This worksheet examines your existing knowledge to reinforce concepts from your previous studies.
+ It is essential that you commit regularly any changes to your source code (to the respective `GitHub Classroom` repository).
+ Where the questions make incremental changes to the code you **do not** need to keep separate versions of your code, as your commits will deal with that situation. 
+ Text-based questions should be answered inline by modifying this document.

## Learning goals

Before the next session, you should try to achieve the following learning goals:

+ Use the Stream API to process a list.
+ Use streams to achieve *lazy* evaluation.
+ Have seen examples of the basic functional operations: *filter*, *map*, *reduce*, etc. 
+ Compare *parallel* and *serial* execution using the Stream API.

Remember that **starred** exercises are more difficult. 
Do not attempt starred exercises unless the other exercises are clear to you.



## The Exercises

All questions should be answered using Java 8 *Streams*.

For Questions 4-7, start with a `List` of `String`s provided by a method similar to this:

   ```.java
    public static List<String> getList() {
        return List.of("hi", "bat", "ear", "hello", "iguana",
                "beaver", "winterland", "elephant", "eye", "qi");
    }
   ```

1. Loop through the words and print each one on a separate line, with two spaces in front of each word.

2. Repeat this problem but **without** two spaces in front of each word.
   This should be trivial if you use the same approach as in Question 1; the point here is
   to make use of a **method reference**.

3. For each of the following lambda expressions (see Question 5 in Worksheet 2),
   produce the list that contains the elements of the original list
   that satisfy the predicate defined by the lambda expression
   (use the `filter` stream operation):

- `s -> s.length() < 4` (strings with no more than 3 characters),
- `s -> s.contains("b")` (strings containing "b"),
- `s -> (s.length() % 2) == 0` (strings of even length).

4. For each of the following lambda expressions (see Question 7 in Worksheet 2),
   produce the list that contains the results of applying the function
   defined by the lambda expression to each element of the original list
   (use the `map` stream operation):

- `s -> s + "!"`,
- `s -> s.replace("i", "eye")`,
- `s -> s.toUpperCase()`.

5. (*) Turn the strings in the list into uppercase, keep only the
   ones that are shorter than four characters, and, of what is remaining,
   keep only the ones that contain `"e"`, and print the first result.

    Repeat the process, except checking for a `"q"` instead of an `"e"`.

6. The above example uses lazy evaluation, but it is not easy to see
   that it is doing so. Create a variation of the above example that shows
   that it is doing lazy evaluation. The simplest way is to track which
   entries are turned into upper case.

7. (*) Produce a single `String` that is the result of concatenating the
   uppercase versions of all the `String`s.
   For example, the result should be `"HIHELLO..."`.

   Hint: use a `map` operation that turns the words into upper case,
   followed by a `reduce` operation that concatenates them.

8. (*) Produce a single `String` that is the result of concatenating the
   uppercase versions of all the `String`s.
   For example, the result should be `"HIHELLO..."`.

   Use a single `reduce` operation, without using `map`.

9.  (*) Produce a `String` that is all the words concatenated together, but
   with commas in between. For example, the result should be `"hi,hello,..."`.
   Note that there is no comma at the beginning, before `"hi"`, and also no comma
   at the end, after the last word.

For questions 10 and 11, use the `Dish` record type from the repository.

10. Use streams to filter the first two meat dishes.

11. Count the number of dishes in a stream using the map and reduce methods.

For the remaining questions, it can be useful to refer to a list of numbers provided, for example, by

```.java
    public static Integer[] getIntegerArray() {
        return new Integer[] { 1, 7, 3, 4, 8, 2 };
    }
```

12. Given a list of numbers, print out the list of the squares
    of each number. For example, given `[1, 2, 3, 4, 5]` you should print `[1, 4, 9, 16, 25]`.

13. Given two lists of numbers, print out all pairs of numbers. For example,
    given a list `[1, 2, 3]` and a list `[3, 4]` you should print:
    `[[1, 3], [1, 4], [2, 3], [2, 4], [3, 3], [3, 4]]`.
    For simplicity, you can represent each *pair* as a list with two elements.


14. Extend the previous example to return only pairs whose
    sum is divisible by `3`. For example, `[2, 4]` and `[3, 3]` are valid.

15. (*) Provide three ways to use streams to compute the sum of a list of
     numbers.

16. (*) Write a static method that produces a `List` of a specified length of
    random numbers. For example,

```.java
    List<Double> nums = randomNumberList(someSize);
```

Result is something like `[0.7096867136897776, 0.09894202723079482, ...]` 

17. (*) Write a static method that produces a `List` of numbers that go in order
    by a step size. For example,

```.java
    List<Integer> nums = orderedNumberList(50, 5, someSize);
```

Result is `[50, 55, 60, ...]`.

18. (*) Rewrite one of the solutions from Question 15 so that it can be executed 
in parallel; verify that you get the same answer as for the sequential code.

19. (**) Now, use streams to compute the product of some doubles. Show that the *serial* 
and *parallel* versions **do not** always result in the same answer.

    **Note:**

    This is a bit tricky, because it seems at first that multiplication is associative, 
as required by the parallel `reduce`.
    Also, it will be impossible to have differing results if you have a single-core computer!
