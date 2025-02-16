# [java](./java.md)

- [java](#java)
  - [Type conversions](#type-conversions)
    - [1. **Char to Int**](#1-char-to-int)
    - [2. **Float to Int**](#2-float-to-int)
    - [3. **Int to Char**](#3-int-to-char)
    - [4. **Int to Float**](#4-int-to-float)
    - [5. **Float to String**](#5-float-to-string)
    - [6. **String to Float**](#6-string-to-float)
    - [7. **Int to String**](#7-int-to-string)
    - [4. **String to Int**](#4-string-to-int)
    - [5. **String to Char**](#5-string-to-char)
    - [6. **Char to String**](#6-char-to-string)
  - [Two decimal](#two-decimal)
    - [1. **Using `String.format`**](#1-using-stringformat)
    - [2. **Using `System.out.printf`**](#2-using-systemoutprintf)
    - [3. **Using `Math.round`**](#3-using-mathround)
    - [4. **Using `BigDecimal` (Precise and Recommended for Calculations)**](#4-using-bigdecimal-precise-and-recommended-for-calculations)
    - [5. **manually**](#5-manually)
  - [String](#string)
    - [The `String` Class in Java](#the-string-class-in-java)
      - [1. **Initializing Strings**](#1-initializing-strings)
      - [2. **Insert**](#2-insert)
      - [3. **Delete**](#3-delete)
      - [4. **Get**](#4-get)
      - [5. **Search**](#5-search)
      - [6. **Iterate**](#6-iterate)
      - [7. **Size (Length)**](#7-size-length)
      - [8. **Contains**](#8-contains)
      - [9. **Clear**](#9-clear)
      - [10. **isEmpty**](#10-isempty)
      - [11. **Sort**](#11-sort)
    - [Additional Helpful String Methods](#additional-helpful-string-methods)
    - [StringBuilder vs. StringBuffer](#stringbuilder-vs-stringbuffer)
    - [String Comparison in Java](#string-comparison-in-java)
  - [ArrayList](#arraylist)
    - [1. **Default Constructor**](#1-default-constructor)
    - [2. **Parameterized Constructor (with initial capacity)**](#2-parameterized-constructor-with-initial-capacity)
    - [3. **Using `Arrays.asList()`**](#3-using-arraysaslist)
    - [4. **Using `List.of()` (Java 9+)**](#4-using-listof-java-9)
    - [5. **Using Double-Brace Initialization**](#5-using-double-brace-initialization)
    - [6. **Using a Stream (Java 8+)**](#6-using-a-stream-java-8)
    - [7. **Using `Collections.addAll()`**](#7-using-collectionsaddall)
    - [8. **Using another Collection**](#8-using-another-collection)
    - [9. **Using `Collections.singletonList()`**](#9-using-collectionssingletonlist)
    - [10. **Using `addAll()` Method after Initialization**](#10-using-addall-method-after-initialization)
    - [1. **Insert (Adding Elements)**](#1-insert-adding-elements)
      - [Methods](#methods)
      - [Examples](#examples)
    - [2. **Delete (Removing Elements)**](#2-delete-removing-elements)
      - [Methods](#methods-1)
      - [Examples](#examples-1)
    - [3. **Get (Retrieving Elements)**](#3-get-retrieving-elements)
      - [Method](#method)
      - [Example](#example)
    - [4. **Search (Finding Elements)**](#4-search-finding-elements)
      - [Methods](#methods-2)
      - [Example](#example-1)
    - [5. **Iterate (Looping through Elements)**](#5-iterate-looping-through-elements)
      - [Methods](#methods-3)
      - [Example](#example-2)
    - [6. **Size (Checking Number of Elements)**](#6-size-checking-number-of-elements)
      - [Method](#method-1)
      - [Example](#example-3)
    - [7. **Contains (Checking for Element Existence)**](#7-contains-checking-for-element-existence)
      - [Example](#example-4)
    - [8. **Clear (Removing All Elements)**](#8-clear-removing-all-elements)
      - [Method](#method-2)
      - [Example](#example-5)
    - [9. **isEmpty (Checking if List is Empty)**](#9-isempty-checking-if-list-is-empty)
      - [Example](#example-6)
    - [10. **Sort (Ordering Elements)**](#10-sort-ordering-elements)
      - [Example](#example-7)
    - [Important Considerations with ArrayList](#important-considerations-with-arraylist)
    - [Conclusion](#conclusion)
  - [HashMap](#hashmap)
  - [1. **Initializing a HashMap**](#1-initializing-a-hashmap)
  - [2. **Inserting Elements into HashMap (`put` Method)**](#2-inserting-elements-into-hashmap-put-method)
  - [3. **Deleting Elements (`remove` Method)**](#3-deleting-elements-remove-method)
  - [4. **Retrieving Elements (`get` Method)**](#4-retrieving-elements-get-method)
  - [5. **Searching for Keys and Values (`containsKey` and `containsValue`)**](#5-searching-for-keys-and-values-containskey-and-containsvalue)
  - [6. **Iterating Through a HashMap**](#6-iterating-through-a-hashmap)
    - [Using `forEach` with Lambda Expressions](#using-foreach-with-lambda-expressions)
    - [Using `entrySet`](#using-entryset)
    - [Using `keySet` and `values`](#using-keyset-and-values)
  - [7. **Getting the Size of HashMap (`size` Method)**](#7-getting-the-size-of-hashmap-size-method)
  - [8. **Checking if HashMap Contains an Element (`contains`)**](#8-checking-if-hashmap-contains-an-element-contains)
  - [9. **Clearing All Elements (`clear` Method)**](#9-clearing-all-elements-clear-method)
  - [10. **Checking if HashMap is Empty (`isEmpty` Method)**](#10-checking-if-hashmap-is-empty-isempty-method)
  - [11. **Sorting a HashMap**](#11-sorting-a-hashmap)
  - [12. **Handling Collisions in HashMap**](#12-handling-collisions-in-hashmap)
  - [13. **Fail-Fast Behavior in HashMap**](#13-fail-fast-behavior-in-hashmap)
  - [14. **Complexity and Performance of HashMap Operations**](#14-complexity-and-performance-of-hashmap-operations)
  - [15. **Conclusion**](#15-conclusion)

## Type conversions

Here's how you can perform these type conversions in Java:

### 1. **Char to Int**

To convert a `char` to an `int`, you can simply assign it or cast it to `int`. The ASCII (or Unicode) value of the character will be used as the integer value.

```java
char ch = 'A';
int intValue = ch; // Implicit conversion
// or
int intValueExplicit = (int) ch; // Explicit casting
System.out.println(intValue); // Output: 65 (ASCII value of 'A')
```

### 2. **Float to Int**

To convert a `float` to an `int`, you need to use casting. This will truncate the decimal portion, so the result will be the integer part only.

```java
float floatValue = 9.99f;
int intValue = (int) floatValue; // Explicit casting
System.out.println(intValue); // Output: 9
```

### 3. **Int to Char**

To convert an `int` to a `char`, you can cast it directly. The integer value will be interpreted as a Unicode (or ASCII) character.

```java
int intValue = 65;
char ch = (char) intValue; // Explicit casting
System.out.println(ch); // Output: 'A' (character with ASCII value 65)
```

### 4. **Int to Float**

To convert an `int` to a `float`, you can assign it directly, as this is an implicit widening conversion.

```java
int intValue = 10;
float floatValue = intValue; // Implicit conversion
System.out.println(floatValue); // Output: 10.0
```

Here’s how you can perform these conversions in Java:

### 5. **Float to String**

```java
float floatValue = 3.14f;
String floatToString = Float.toString(floatValue);
// or
String floatToString2 = String.valueOf(floatValue);
```

### 6. **String to Float**

```java
String str = "3.14";
float stringToFloat = Float.parseFloat(str);
```

### 7. **Int to String**

```java
int intValue = 42;
String intToString = Integer.toString(intValue);
// or
String intToString2 = String.valueOf(intValue);
```

### 4. **String to Int**

```java
String str = "42";
int stringToInt = Integer.parseInt(str);
```

### 5. **String to Char**

To get a single character from a string, you can use `charAt(index)`:

```java
String str = "Hello";
char stringToChar = str.charAt(0); // gets the first character 'H'
```

### 6. **Char to String**

```java
char ch = 'H';
String charToString = Character.toString(ch);
// or
String charToString2 = String.valueOf(ch);
```

These methods will help you convert between these common types easily.

---

## Two decimal

To convert a float to two decimal places in Java, you can use any of the following methods:

### 1. **Using `String.format`**

```java
float number = 3.14159f;
String formatted = String.format("%.2f", number);
System.out.println(formatted);  // Output: 3.14
```

### 2. **Using `System.out.printf`**

```java
float number = 3.14159f;
System.out.printf("%.2f", number);  // Output: 3.14
```

### 3. **Using `Math.round`**

You can round the float to two decimal places by multiplying, rounding, and then dividing by 100:

```java
float number = 3.14159f;
float rounded = Math.round(number * 100) / 100f;
System.out.println(rounded);  // Output: 3.14
```

### 4. **Using `BigDecimal` (Precise and Recommended for Calculations)**

`BigDecimal` is a good choice if you need exact rounding and precision.

```java
float number = 3.14159f;
BigDecimal bd = new BigDecimal(Float.toString(number));
bd = bd.setScale(2, RoundingMode.HALF_UP);
System.out.println(bd);  // Output: 3.14
```

### 5. **manually**

```java
        float a = sc.nextFloat()*100;
        int b = (int) a;
        System.out.println(b/100.00);

```

Choose the method that best fits your needs. If you’re working with financial or high-precision data, `BigDecimal` is generally the best choice.

---

## String

Here's a comprehensive guide on initializing and using the `String` class in Java, along with an explanation of relevant methods such as `insert`, `delete`, `get`, `search`, `iterate`, `size`, `contains`, `clear`, `isEmpty`, and `sort`. I'll cover each operation in detail and how it applies to strings in Java, totaling over 1000 words.

---

### The `String` Class in Java

In Java, `String` is a built-in class that represents a sequence of characters. Strings are objects, not primitive types, and are immutable. Once created, the characters of a string cannot be changed. This immutability provides advantages, such as thread safety, but also requires extra care when performing operations that might alter the content of a `String`. For situations requiring modification, Java provides classes like `StringBuilder` and `StringBuffer`.

#### 1. **Initializing Strings**

- **Direct Assignment**: A string can be initialized directly using quotes, e.g., `String str = "Hello, World!";`.
- **Using `new` Keyword**: Alternatively, you can use the `new` keyword: `String str = new String("Hello, World!");`.
- **Empty String**: You can initialize an empty string as `String str = "";`.
- **From Character Array**: Convert an array to a string: `String str = new String(charArray);`.

#### 2. **Insert**

Since `String` objects are immutable, Java doesn't provide a direct `insert` method for `String`. However, if you need to insert text at a specific index within a string, you can use `StringBuilder`, which allows modifications.

```java
StringBuilder builder = new StringBuilder("Hello!");
builder.insert(5, ", World");
String result = builder.toString(); // Result: "Hello, World!"
```

#### 3. **Delete**

Similarly, the `String` class lacks a `delete` method. But with `StringBuilder`, you can delete characters at specified indices.

```java
StringBuilder builder = new StringBuilder("Hello, World!");
builder.delete(5, 7); // Deletes ", "
String result = builder.toString(); // Result: "HelloWorld!"
```

#### 4. **Get**

The `String` class has several methods to access characters:

- **`charAt(int index)`**: Returns the character at the specified index.
- **`substring(int beginIndex, int endIndex)`**: Returns a part of the string as a new string, from `beginIndex` (inclusive) to `endIndex` (exclusive).

Example:

```java
String str = "Hello, World!";
char ch = str.charAt(1); // 'e'
String subStr = str.substring(0, 5); // "Hello"
```

#### 5. **Search**

There are several ways to search within a `String`:

- **`indexOf(String str)`**: Returns the index of the first occurrence of the specified substring. If not found, it returns `-1`.
- **`lastIndexOf(String str)`**: Returns the index of the last occurrence of the specified substring.
- **`contains(CharSequence s)`**: Returns `true` if the string contains the specified sequence of characters.

```java
String str = "Hello, World!";
int index = str.indexOf("World"); // 7
boolean containsWorld = str.contains("World"); // true
```

#### 6. **Iterate**

Iterating over a `String` is commonly done in two ways:

- **Using `charAt`**: Access each character by its index.
- **Convert to `char` array**: Use `toCharArray()` to get a `char` array and iterate.

```java
String str = "Hello";
for (int i = 0; i < str.length(); i++) {
    System.out.print(str.charAt(i) + " ");
}

// Or using toCharArray
for (char c : str.toCharArray()) {
    System.out.print(c + " ");
}
```

#### 7. **Size (Length)**

The `length()` method in `String` returns the number of characters in the string. This is the equivalent of `size` in other collections.

```java
String str = "Hello, World!";
int length = str.length(); // 13
```

#### 8. **Contains**

The `contains` method checks if a `String` contains a specific sequence of characters.

```java
String str = "Hello, World!";
boolean containsHello = str.contains("Hello"); // true
```

#### 9. **Clear**

While `String` is immutable, you can “clear” it by reassigning an empty string to it.

```java
String str = "Hello, World!";
str = ""; // Clear the content
```

In mutable contexts, you may choose `StringBuilder` for a `clear`-like operation by setting its length to `0`.

```java
StringBuilder builder = new StringBuilder("Hello, World!");
builder.setLength(0); // Clears the content
```

#### 10. **isEmpty**

The `isEmpty()` method checks if a string is empty (i.e., has no characters, `length() == 0`).

```java
String str = "";
boolean isEmpty = str.isEmpty(); // true
```

#### 11. **Sort**

Sorting a string means rearranging its characters in a specific order, typically alphabetical. This is not a direct method on `String` but can be achieved by converting the string to a character array, sorting it, and creating a new string.

```java
String str = "edcba";
char[] charArray = str.toCharArray();
Arrays.sort(charArray);
String sortedStr = new String(charArray); // "abcde"
```

### Additional Helpful String Methods

- **`equals(String str)`** and **`equalsIgnoreCase(String str)`**: Check if two strings are equal or equal regardless of case.
- **`toUpperCase()`** and **`toLowerCase()`**: Convert all characters to uppercase or lowercase.
- **`trim()`**: Removes leading and trailing whitespace.
- **`replace(CharSequence target, CharSequence replacement)`**: Replaces all occurrences of a substring.

### StringBuilder vs. StringBuffer

For mutable strings, Java provides `StringBuilder` and `StringBuffer` classes, with `StringBuilder` being faster but not thread-safe, while `StringBuffer` is thread-safe.

### String Comparison in Java

String comparison in Java can be done using `equals` for exact matches or `compareTo` for lexicographical order.

```java
String a = "Apple";
String b = "Banana";
int result = a.compareTo(b); // Negative if a < b, zero if a == b, positive if a > b
```

---

The `String` class in Java is foundational, and understanding these methods is essential for efficient and effective text manipulation in Java applications. Since strings are immutable, modifying a `String` often requires reassignment, or you can use `StringBuilder` for cases where mutability is needed.

---

## ArrayList

In Java, there are several ways to initialize an `ArrayList`. Each approach varies depending on the situation and requirements, offering flexibility in how elements are added to the list. Here’s a rundown of the most common methods to initialize an `ArrayList`.

### 1. **Default Constructor**

This is the most straightforward way to initialize an empty `ArrayList`.

```java
ArrayList<String> list = new ArrayList<>();
```

### 2. **Parameterized Constructor (with initial capacity)**

You can initialize an `ArrayList` with a specified initial capacity. This is helpful if you know the approximate number of elements the list will contain, as it reduces the need for resizing.

```java
ArrayList<String> list = new ArrayList<>(10); // Initial capacity of 10
```

### 3. **Using `Arrays.asList()`**

You can initialize an `ArrayList` with a predefined list of elements using `Arrays.asList()`. However, this will return a fixed-size list, so you can't add or remove elements from it without creating a new list.

```java
ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Grapes"));
```

### 4. **Using `List.of()` (Java 9+)**

Introduced in Java 9, `List.of()` allows you to create an immutable list with elements. You can then pass this immutable list to an `ArrayList` constructor to get a mutable list with predefined elements.

```java
ArrayList<String> list = new ArrayList<>(List.of("Apple", "Banana", "Grapes"));
```

### 5. **Using Double-Brace Initialization**

This approach uses an anonymous inner class to initialize the `ArrayList`. Although concise, it’s generally discouraged due to performance and memory overhead.

```java
ArrayList<String> list = new ArrayList<String>() {{
    add("Apple");
    add("Banana");
    add("Grapes");
}};
```

### 6. **Using a Stream (Java 8+)**

You can use Java 8 Streams to initialize an `ArrayList` by collecting stream elements.

```java
ArrayList<String> list = Stream.of("Apple", "Banana", "Grapes")
                               .collect(Collectors.toCollection(ArrayList::new));
```

### 7. **Using `Collections.addAll()`**

`Collections.addAll()` is a convenient way to initialize an `ArrayList` with multiple elements.

```java
ArrayList<String> list = new ArrayList<>();
Collections.addAll(list, "Apple", "Banana", "Grapes");
```

### 8. **Using another Collection**

If you already have another collection (like a `Set` or another `List`), you can initialize an `ArrayList` with its elements.

```java
List<String> existingList = List.of("Apple", "Banana", "Grapes");
ArrayList<String> list = new ArrayList<>(existingList);
```

### 9. **Using `Collections.singletonList()`**

`Collections.singletonList()` creates a one-element list, which can then be used to initialize an `ArrayList`. Note that `Collections.singletonList()` itself returns an immutable list, so it's passed as an argument to create a mutable `ArrayList`.

```java
ArrayList<String> list = new ArrayList<>(Collections.singletonList("Apple"));
```

### 10. **Using `addAll()` Method after Initialization**

Another way to populate an `ArrayList` after initialization is by using the `addAll()` method. This can be done either from another collection or directly using `Arrays.asList()`.

```java
ArrayList<String> list = new ArrayList<>();
list.addAll(Arrays.asList("Apple", "Banana", "Grapes"));
```

An `ArrayList` in Java is a resizable array implementation in the `java.util` package, which offers a flexible, easy-to-use alternative to traditional arrays. It is part of Java's `List` interface and provides several powerful methods to handle elements dynamically, making it a popular choice when the number of elements in a list changes frequently. Here’s a detailed look at how to use `ArrayList` with various methods and operations, such as `insert`, `delete`, `get`, `search`, `iterate`, `size`, `contains`, `clear`, `isEmpty`, and `sort`.

### 1. **Insert (Adding Elements)**

Inserting elements into an `ArrayList` is straightforward, thanks to methods like `add()`:

#### Methods

- **`add(E element)`**: Adds the specified element to the end of the `ArrayList`.
- **`add(int index, E element)`**: Inserts the specified element at the specified position.

#### Examples

```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple"); // Adds "Apple" at the end
list.add("Banana"); // Adds "Banana" at the end

list.add(1, "Grapes"); // Inserts "Grapes" at index 1
System.out.println(list); // Output: [Apple, Grapes, Banana]
```

The `add()` method shifts elements to accommodate the new element at the specified index, if given.

### 2. **Delete (Removing Elements)**

Removing elements from an `ArrayList` can be done by index or by specifying the object.

#### Methods

- **`remove(int index)`**: Removes the element at the specified index.
- **`remove(Object obj)`**: Removes the first occurrence of the specified element.

#### Examples

```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Grapes");

list.remove(1); // Removes "Banana"
System.out.println(list); // Output: [Apple, Grapes]

list.remove("Apple"); // Removes "Apple" by element
System.out.println(list); // Output: [Grapes]
```

Using the `remove(int index)` shifts subsequent elements to the left, reducing the list's size by one.

### 3. **Get (Retrieving Elements)**

Retrieving elements at a specific index in `ArrayList` is handled by the `get()` method.

#### Method

- **`get(int index)`**: Returns the element at the specified position.

#### Example

```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Grapes");

String fruit = list.get(1); // Retrieves "Banana"
System.out.println(fruit); // Output: Banana
```

Attempting to access an out-of-bounds index will throw an `IndexOutOfBoundsException`.

### 4. **Search (Finding Elements)**

To search for elements in an `ArrayList`, you can use `contains()` or `indexOf()`.

#### Methods

- **`contains(Object obj)`**: Checks if the list contains the specified element.
- **`indexOf(Object obj)`**: Returns the index of the first occurrence of the specified element, or -1 if the element is not found.

#### Example

```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");

boolean hasApple = list.contains("Apple"); // true
int index = list.indexOf("Banana"); // 1

System.out.println(hasApple); // Output: true
System.out.println(index); // Output: 1
```

### 5. **Iterate (Looping through Elements)**

Java provides multiple ways to iterate through an `ArrayList`.

#### Methods

- **`for` loop**: Use a basic for loop with `get(int index)`.
- **Enhanced `for` loop**: Easier syntax, especially for collections.
- **Iterator**: Provides more control over elements with `Iterator` methods.

#### Example

```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Grapes");

// Using basic for loop
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}

// Using enhanced for loop
for (String fruit : list) {
    System.out.println(fruit);
}

// Using Iterator
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

### 6. **Size (Checking Number of Elements)**

The `size()` method returns the number of elements in an `ArrayList`.

#### Method

- **`size()`**: Returns the number of elements in the list.

#### Example

```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");

System.out.println(list.size()); // Output: 2
```

### 7. **Contains (Checking for Element Existence)**

The `contains()` method is used to check if an element exists in the list.

#### Example

```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");

boolean exists = list.contains("Apple"); // true
System.out.println(exists); // Output: true
```

### 8. **Clear (Removing All Elements)**

The `clear()` method removes all elements from the list, effectively making it empty.

#### Method

- **`clear()`**: Removes all elements from the list.

#### Example

```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");

list.clear();
System.out.println(list.size()); // Output: 0
System.out.println(list); // Output: []
```

### 9. **isEmpty (Checking if List is Empty)**

The `isEmpty()` method checks if the list contains any elements.

#### Example

```java
ArrayList<String> list = new ArrayList<>();
System.out.println(list.isEmpty()); // true

list.add("Apple");
System.out.println(list.isEmpty()); // false
```

### 10. **Sort (Ordering Elements)**

Sorting in an `ArrayList` can be done using `Collections.sort()` for natural ordering or a custom `Comparator`.

#### Example

```java
ArrayList<String> list = new ArrayList<>();
list.add("Banana");
list.add("Apple");
list.add("Grapes");

Collections.sort(list);
System.out.println(list); // Output: [Apple, Banana, Grapes]

// Custom sorting
Collections.sort(list, Collections.reverseOrder());
System.out.println(list); // Output: [Grapes, Banana, Apple]
```

### Important Considerations with ArrayList

- **Capacity Management**: Internally, an `ArrayList` maintains an array that grows dynamically, which incurs a slight overhead during resizing operations.
- **Performance**: Since `ArrayList` allows random access with constant time complexity `O(1)`, it is efficient for accessing elements. However, inserting and deleting at arbitrary positions may take longer due to shifting.
- **Null Elements**: `ArrayList` can store `null` elements. Be cautious when handling lists with nulls, as this can lead to `NullPointerException`.

### Conclusion

The `ArrayList` class is a flexible and powerful data structure in Java, offering a variety of methods for efficient storage, retrieval, and manipulation of data.

---

## HashMap

The `HashMap` class in Java is one of the most commonly used data structures in the Java Collections Framework (JCF). It provides a way to store and retrieve key-value pairs and operates on the principle of hashing. With a `HashMap`, you can store data in key-value format, which enables fast access, insertion, and deletion based on unique keys. Let’s dive deep into each of the essential operations provided by the `HashMap` class, including its initialization, methods for data manipulation, retrieval, and common operations like checking its size or whether it is empty.

## 1. **Initializing a HashMap**

To create a `HashMap`, you use the constructor to instantiate a new object of this class. Java provides a few constructors that let you initialize a `HashMap` with default settings or with custom initial capacities and load factors. Here’s how you can initialize a `HashMap`:

```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Basic initialization
        HashMap<String, Integer> map = new HashMap<>();

        // Initializing with specified initial capacity and load factor
        HashMap<String, Integer> customMap = new HashMap<>(16, 0.75f);
    }
}
```

The `initial capacity` specifies the number of buckets in the hash table, and the `load factor` is a measure of how full the `HashMap` can get before its capacity is automatically increased. The default load factor is 0.75, meaning that when the map reaches 75% of its capacity, it will resize.

## 2. **Inserting Elements into HashMap (`put` Method)**

The `put` method in `HashMap` allows you to add new key-value pairs or update the value of an existing key. Here’s how you use it:

```java
map.put("Apple", 10);
map.put("Banana", 20);
map.put("Cherry", 30);
```

If the key already exists, `put` will update the key with the new value, and it will return the old value. If the key does not exist, it will add a new entry to the map.

## 3. **Deleting Elements (`remove` Method)**

The `remove` method lets you delete key-value pairs based on the key. It returns the value associated with the key that was removed or `null` if the key does not exist.

```java
// Removing an element by key
map.remove("Banana");
```

You can also specify both the key and the value in the `remove` method. This variation will only remove the key if the value matches the specified value.

```java
map.remove("Cherry", 30);
```

## 4. **Retrieving Elements (`get` Method)**

The `get` method allows you to retrieve the value associated with a specific key. If the key is not present, `get` returns `null`.

```java
int appleCount = map.get("Apple"); // returns 10
```

You can also use `getOrDefault` if you want to specify a default value that should be returned when the key is not present:

```java
int mangoCount = map.getOrDefault("Mango", 0); // returns 0 if "Mango" is not found
```

## 5. **Searching for Keys and Values (`containsKey` and `containsValue`)**

The `containsKey` method checks if a specific key exists in the `HashMap`, while `containsValue` checks for the presence of a specific value.

```java
boolean hasApple = map.containsKey("Apple"); // returns true
boolean hasFifty = map.containsValue(50);    // returns false
```

## 6. **Iterating Through a HashMap**

There are multiple ways to iterate through a `HashMap`. Some of the common ways are:

### Using `forEach` with Lambda Expressions

```java
map.forEach((key, value) -> System.out.println(key + " -> " + value));
```

### Using `entrySet`

```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

### Using `keySet` and `values`

To iterate through only the keys:

```java
for (String key : map.keySet()) {
    System.out.println("Key: " + key);
}
```

To iterate through only the values:

```java
for (Integer value : map.values()) {
    System.out.println("Value: " + value);
}
```

## 7. **Getting the Size of HashMap (`size` Method)**

The `size` method returns the number of key-value pairs in the `HashMap`.

```java
int size = map.size(); // returns the size of the map
```

## 8. **Checking if HashMap Contains an Element (`contains`)**

`HashMap` does not directly have a `contains` method, but it provides `containsKey` and `containsValue` as mentioned above.

## 9. **Clearing All Elements (`clear` Method)**

The `clear` method removes all elements from the `HashMap`. After calling `clear`, the `HashMap` will be empty, with a size of 0.

```java
map.clear(); // removes all entries
```

## 10. **Checking if HashMap is Empty (`isEmpty` Method)**

The `isEmpty` method checks if there are any entries in the `HashMap`. It returns `true` if the map is empty, and `false` otherwise.

```java
boolean empty = map.isEmpty(); // returns true if map is empty
```

## 11. **Sorting a HashMap**

Since `HashMap` does not maintain order, you cannot directly sort it. If you want to sort by keys or values, you can use a `TreeMap` (for natural key order) or sort the entries using Java Streams. Here’s how to sort a `HashMap` by keys:

```java
import java.util.Map;
import java.util.TreeMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("Banana", 20);
map.put("Apple", 10);
map.put("Cherry", 30);

Map<String, Integer> sortedMap = new TreeMap<>(map);
```

Or, to sort by values, you can use streams:

```java
map.entrySet().stream()
    .sorted(Map.Entry.comparingByValue())
    .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
```

## 12. **Handling Collisions in HashMap**

Java’s `HashMap` uses separate chaining and tree-binning techniques to resolve collisions (when two keys hash to the same bucket). When the number of entries in a bucket exceeds a threshold, it is converted from a linked list to a balanced tree, which improves performance for large numbers of collisions.

## 13. **Fail-Fast Behavior in HashMap**

A `HashMap` is fail-fast, which means that if you try to modify the map while iterating through it (e.g., by using `put` or `remove`), a `ConcurrentModificationException` is thrown. This happens because `HashMap` uses a `modCount` variable to keep track of structural changes, ensuring safe iteration.

```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    if (entry.getKey().equals("Banana")) {
        map.remove("Banana"); // Throws ConcurrentModificationException
    }
}
```

To safely remove elements while iterating, use an `Iterator`:

```java
Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
while (iterator.hasNext()) {
    Map.Entry<String, Integer> entry = iterator.next();
    if (entry.getKey().equals("Banana")) {
        iterator.remove(); // Safe removal
    }
}
```

## 14. **Complexity and Performance of HashMap Operations**

The average time complexity of a `HashMap` is as follows:

- **Insertion (`put`)**: \(O(1)\) on average, \(O(n)\) in the worst case (during resizing).
- **Retrieval (`get`)**: \(O(1)\) on average.
- **Deletion (`remove`)**: \(O(1)\) on average.

In practice, `HashMap` is highly efficient for most scenarios, but performance can degrade if there are too many hash collisions.

## 15. **Conclusion**

In summary, `HashMap` in Java is a highly versatile and efficient data structure that enables the storage and retrieval of key-value pairs with optimal performance. Through methods like `put`, `get`, `remove`, `containsKey`, and others, it provides flexible and powerful mechanisms to handle data in a way that supports fast access and modification. However, be mindful of its fail-fast behavior and the potential need to handle sorting and collisions effectively.
