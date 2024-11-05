# Type conversions

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

### Summary

| Conversion        | Example Code                        |
|-------------------|-------------------------------------|
| `char` to `int`   | `int intValue = (int) ch;`         |
| `float` to `int`  | `int intValue = (int) floatValue;` |
| `int` to `char`   | `char ch = (char) intValue;`       |
| `int` to `float`  | `float floatValue = intValue;`     |

These conversions cover the main cases of narrowing and widening conversions in Java.