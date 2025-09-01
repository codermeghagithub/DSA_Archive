## What Is an Exception?
The term exception is shorthand for the phrase "exceptional event."

**Definition:** An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.
When an error occurs within a method, the method creates an object and hands it off to the runtime system. The object, called an **exception object**, contains information about the error, including its type and the state of the program when the error occurred. Creating an exception object and handing it to the runtime system is **called throwing an exception.**

## link: 
check this documentation for deep understanding about Exception:
https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html

## What is Exception Handling?
Exception handling is a programming construct that allows you to catch and handle runtime errors (exceptions) that might occur during program execution. Instead of letting the program crash, you can define how to respond to specific error conditions.
### Java Exception Keywords
Java provides five keywords that are used to handle the exception. The following table describes each.
throw:
The "throw" keyword is used to throw an exception.
throws
The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.
**Java finally block** is always executed, whether an exception is handled or not. Therefore, it contains all the necessary statements that need to be printed regardless of whether an exception occurs or not.

### Exception Hierarchy in Java
Java's exception hierarchy is built around the Throwable class:

**Throwable/** :boom: Root of all errors and exceptions
  - 🖱️Error/ :x: Serious problems that applications should not catch (unchecked)
    - OutOfMemoryError/ :battery: JVM runs out of memory
    - StackOverflowError/ :repeat: Call stack overflows
    - VirtualMachineError/ :gear: JVM-related critical error
  - Exception/ :warning: Conditions applications might want to catch
    - RuntimeException/ :fast_forward: Unchecked exceptions
      - NullPointerException/ :no_entry_sign: Null reference error
      - ArrayIndexOutOfBoundsException/ :1234: Array index out of range
      - IllegalArgumentException/ :interrobang: Illegal or inappropriate argument
      - NumberFormatException/ :hash: Invalid number format
    - CheckedExceptions/ :clipboard: Must be handled or declared
      - IOException/ :file_folder: Input/output operation failure
      - SQLException/ :card_index: Database access error
      - ClassNotFoundException/ :mag: Class not found
      - InterruptedException/ :zzz: Thread interrupted during execution


### Types of Exceptions
1. Checked Exceptions: Must be handled at compile time using try-catch or throws clause

Examples: IOException, SQLException, ClassNotFoundException

2. Unchecked Exceptions (Runtime Exceptions): Can be handled optionally

Examples: NullPointerException, ArrayIndexOutOfBoundsException

3. Errors: Serious problems that applications shouldn't try to handle

Examples: OutOfMemoryError, StackOverflowError

### Exception Handling Keywords
### 👨🏻‍💻 All the syntax are bellow  👨🏻‍💻
1. **try-catch Block**

```java
public class BasicExceptionHandling {
    public static void main(String[] args) {
        try {
            // Risky code that might throw an exception
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the specific exception
            System.out.println("Array index is out of bounds!");
            System.out.println("Error message: " + e.getMessage());
        }
        
        System.out.println("Program continues executing...");
    }
}
```
2. **Multiple Catch Blocks**
```java
try {
    // Risky code
    String str = null;
    str.length();
    int[] arr = {1, 2};
    arr[5] = 10;
} catch (NullPointerException e) {
    System.out.println("Null pointer: " + e.getMessage());
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index error: " + e.getMessage());
} catch (Exception e) {
    System.out.println("General exception: " + e.getMessage());
}
```



**3. try-catch-finally Block**
```java

try {
    // Risky code
    FileInputStream file = new FileInputStream("file.txt");
    // Process file
} catch (FileNotFoundException e) {
    System.out.println("File not found: " + e.getMessage());
} catch (IOException e) {
    System.out.println("IO error: " + e.getMessage());
} finally {
    // This block always executes
    System.out.println("Cleanup code here");
    // Close resources if needed
}
```


**4. Throws Keyword - Method exception declaration**

```java
// Method that declares exceptions it might throw
public void readFile(String fileName) throws IOException, FileNotFoundException {
    FileInputStream file = new FileInputStream(fileName);
    // File operations
    file.close();
}

// Multiple exceptions in throws clause
public void processData(String data) throws NumberFormatException, IllegalArgumentException {
    if (data == null) {
        throw new IllegalArgumentException("Data cannot be null");
    }
    int number = Integer.parseInt(data);
}

// Caller must handle the exceptions
public static void main(String[] args) {
    try {
        readFile("example.txt");
        processData("123");
    } catch (IOException e) {
        System.out.println("IO Error: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.out.println("Number format error: " + e.getMessage());
    } catch (IllegalArgumentException e) {
        System.out.println("Invalid argument: " + e.getMessage());
    }
}


```

**5. throw Keyword (Custom Exceptions)**
```java
// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Custom runtime exception
class CustomRuntimeException extends RuntimeException {
    public CustomRuntimeException(String message) {
        super(message);
    }
}

// Using throw keyword
public void validateAge(int age) throws CustomException {
    if (age < 0) {
        throw new CustomException("Age cannot be negative: " + age);
    }
    if (age > 150) {
        throw new CustomRuntimeException("Invalid age: " + age);
    }
}

// Usage
public static void main(String[] args) {
    try {
        validateAge(-5);
    } catch (CustomException e) {
        System.out.println("Custom exception: " + e.getMessage());
    } catch (CustomRuntimeException e) {
        System.out.println("Runtime exception: " + e.getMessage());
    }
}

```

### Try-With-Resources - Automatic resource management

```java
// Single resource
try (FileInputStream file = new FileInputStream("file.txt")) {
    // Use the resource
    // Resource automatically closed
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}

// Multiple resources
try (FileInputStream input = new FileInputStream("input.txt");
     FileOutputStream output = new FileOutputStream("output.txt");
     BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
    
    // Use all resources
    // All resources automatically closed
    
} catch (IOException e) {
    System.out.println("IO Error: " + e.getMessage());
}

// With catch and finally
try (Scanner scanner = new Scanner(System.in)) {
    // Use scanner
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
} finally {
    System.out.println("Cleanup if needed");
}
```

### Multi-Catch - Handling multiple exceptions in one block
```java
// Multi-catch with pipe (|) operator
try {
    // Code that may throw multiple exception types
    String str = "abc";
    int number = Integer.parseInt(str);
    int result = 10 / 0;
} catch (NumberFormatException | ArithmeticException e) {
    // Handle both exceptions in same block
    System.out.println("Math error: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Other error: " + e.getMessage());
}

// Multiple multi-catch blocks
try {
    // Risky operations
} catch (IOException | SQLException e) {
    // Handle IO and SQL exceptions
    System.out.println("Data access error: " + e.getMessage());
} catch (NumberFormatException | IllegalArgumentException e) {
    // Handle parsing and argument exceptions
    System.out.println("Input error: " + e.getMessage());
} catch (Exception e) {
    // Handle all other exceptions
    System.out.println("Unexpected error: " + e.getMessage());
}
```

8. ### Exception Propagation - How exceptions move up call stack

```java
// Multi-catch with pipe (|) operator
try {
    // Code that may throw multiple exception types
    String str = "abc";
    int number = Integer.parseInt(str);
    int result = 10 / 0;
} catch (NumberFormatException | ArithmeticException e) {
    // Handle both exceptions in same block
    System.out.println("Math error: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Other error: " + e.getMessage());
}

// Multiple multi-catch blocks
try {
    // Risky operations
} catch (IOException | SQLException e) {
    // Handle IO and SQL exceptions
    System.out.println("Data access error: " + e.getMessage());
} catch (NumberFormatException | IllegalArgumentException e) {
    // Handle parsing and argument exceptions
    System.out.println("Input error: " + e.getMessage());
} catch (Exception e) {
    // Handle all other exceptions
    System.out.println("Unexpected error: " + e.getMessage());
}

```
### Chained Exceptions - Linking exceptions together
```java
// Exception chaining - linking exceptions
class ServiceException extends Exception {
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

public void databaseOperation() throws ServiceException {
    try {
        // Database operation that fails
        throw new SQLException("Database connection failed");
    } catch (SQLException e) {
        // Wrap original exception in new exception
        throw new ServiceException("Service failed", e);
    }
}

// Using chained exceptions
public static void main(String[] args) {
    try {
        databaseOperation();
    } catch (ServiceException e) {
        System.out.println("Service error: " + e.getMessage());
        
        // Get the original cause
        Throwable cause = e.getCause();
        if (cause != null) {
            System.out.println("Original cause: " + cause.getMessage());
        }
        
        // Print full stack trace
        e.printStackTrace();
    }
}

```
### Complete Structure - All elements combined

```java
// Complete exception handling structure with all elements
public class CompleteExceptionSyntax {
    
    // Method with throws declaration
    public void complexMethod() throws IOException, SQLException {
        
        // try-with-resources with multiple catches and finally
        try (FileInputStream file = new FileInputStream("data.txt");
             Scanner scanner = new Scanner(file)) {
            
            // Risky operations
            String data = scanner.nextLine();
            int number = Integer.parseInt(data);
            
            if (number < 0) {
                throw new IllegalArgumentException("Negative number not allowed");
            }
            
        } catch (FileNotFoundException | SecurityException e) {
            // Multi-catch for file access errors
            System.out.println("File access error: " + e.getMessage());
            throw new IOException("Cannot process file", e);
            
        } catch (NumberFormatException e) {
            // Handle parsing error
            System.out.println("Invalid number format: " + e.getMessage());
            
        } catch (IllegalArgumentException e) {
            // Handle validation error
            System.out.println("Validation error: " + e.getMessage());
            
        } catch (Exception e) {
            // Catch-all for unexpected errors
            System.out.println("Unexpected error: " + e.getMessage());
            
        } finally {
            // Cleanup code (optional with try-with-resources)
            System.out.println("Method execution completed");
        }
    }
    
    // Usage example
    public static void main(String[] args) {
        CompleteExceptionSyntax example = new CompleteExceptionSyntax();
        
        try {
            example.complexMethod();
        } catch (IOException | SQLException e) {
            System.out.println("Method failed: " + e.getMessage());
            
            // Print stack trace
            e.printStackTrace();
        }
    }
}
```

## Java throw and throws :
We use the throws keyword in the ,ethod declaration to declare the type of exceptions that might  occur within it .

## The throw  keyword:
It  is used to explicitly throw a single exception 


### ✅ What is a Method Signature in Java?

A method signature is the unique identifier of a method. It is the combination of:

**🔹 Method name + Parameter list (types and order)**

✅ It does NOT include the return type, access modifiers, throws clause, or method body.
**Example :**
```java
public int add(int a, int b) {  
    return a + b;  
}
```
Method name: add

Parameter list: (int, int)

👉 So, the method signature is:

**Output :**
add(int, int)

#### ⚠️ What’s Not Part of the Signature?

* public (access modifier)

* int (return type)

* throws (exception declaration)

### 🔄 Why Method Signature Matters?

It's how the compiler differentiates between methods — especially in method overloading.

Two methods in the same class cannot have the same signature.

### 🔁 Example of Overloading (Different Signatures):
```java
void print(String msg)           // signature: print(String)
void print(String msg, int num)  // signature: print(String, int)
```

✅ **These are valid — different parameter lists = different signatures.**
```java
❌ Invalid (Same Signature):
int display(int a) { return a; }
double display(int a) { return (double)a; } // ❌ compile error — same signature!
```

## when we wnat to create cutom ection that time 
*  Fist give name your exception name.
*  then extends that custum excetion 
*  then Exception is a built-in class in Java's exception hierarchy.


``` java
class MeghaException extends Exception {
    public MeghaException(String message) {
        super(message);
    }
}
```
**Explaination**
public class AgeException extends Exception

You are creating a new exception type called AgeException.

**public AgeException(String message)**

This is the constructor for your custom exception.

It takes a String message — an explanation of the error.

**super(message);**

Calls the constructor of the parent class Exception with the message.

This lets Java store and later retrieve the error message when you call getMessage() on the exception.

2. **Method That Throws the Custom Exception**
public static void validateAge(int age) throws AgeException {


**public static void validateAge(int age)**

Declares a method named validateAge that takes an integer age.

It's static so you can call it without creating an object.

**throws AgeException**

This tells Java and anyone calling this method:
“This method might throw an AgeException, so you need to handle it.”

This is required because AgeException is a checked exception (extends Exception).

if (age < 18) {
    throw new AgeException("Age must be 18 or older to register.");
}


if (age < 18)**

Checks if the age is less than 18.

**throw new AgeException("Age must be 18 or older to register.");**

If the age is less than 18, you create a new instance of your custom exception with the message "Age must be 18 or older to register."

You then throw that exception, meaning the normal flow of the program stops here, and control jumps to whoever catches this exception.
### Why extends Exception?
1. What is Exception in Java?

Exception is a built-in class in Java's exception hierarchy.

It represents conditions that a reasonable application might want to catch and handle.

It is the superclass of all checked exceptions.
**Even though return types are different, method signatures are the same: display(int)**

 ### ✅ Can we use custom exceptions with both throw and throws in Java?
🔹Yes, you can (and often should) use custom exceptions with both throw and throws.

**They serve different purposes:**

| Keyword | What it does                                              | Use with Custom Exceptions?                         |
|---------|-----------------------------------------------------------|-----------------------------------------------------|
| `throw` | Actually throws an instance of a custom exception         | ✅ Yes — required to throw it                       |
| `throws`| Declares that a method might throw that custom exception  | ✅ Yes — required if it's a checked exception       |


### ✅ Why Use throw and throws If We Already Have a catch Block?

Catching exceptions (try-catch) and throwing them (throw, throws) are complementary, not replacements for each other.

They serve different purposes in exception handling.

🔹 1. throw — To create and send the exception

You use throw to manually raise an exception — custom or built-in — when your code detects a problem.You can’t catch an exception unless it has been thrown first — either by Java or by you (throw).

### 🔹 2. throws — To declare that a method might throw an exception

Tells the caller of the method: “You need to handle this.”

Especially required for checked exceptions (like IOException, SQLException).

### 🔹 3. catch — To handle the exception

Used to respond when an exception occurs.

Without a throw, there would be nothing to catch.