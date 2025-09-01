## Why use a Java finally block?
finally block in Java can be used to put "cleanup" code, such as closing a file, closing a connection, etc.
The important statements to be printed can be placed in the finally block.
## Usage of the finally Block
Let's see the different cases where the Java finally block can be used.

Case 1: 

## when we wnat to create cutom ection that time 
*  Fist give name your exception name.
*  then extends that custum excetion 
*  then Exception is a built-in class in Java's exception hierarchy.


### Checked vs Unchecked Exceptions

Checked Exceptions:
Extend Exception (but not RuntimeException).

The compiler forces you to either handle these exceptions (try-catch) or declare them (throws).

Examples: IOException, SQLException, and your custom exceptions like AgeException.

Unchecked Exceptions:
Extend RuntimeException.

The compiler does not force handling or declaration.

Examples: NullPointerException, IllegalArgumentException.

Errors:
Extend Error.

These are serious problems usually outside your program's control, like OutOfMemoryError.

You generally do not catch or extend Error.
### 3. Why choose Exception for your custom exception?

You want to create a checked exception, so callers must explicitly deal with it.

This enforces better error handling and makes your API clearer.

For something like an invalid age, it makes sense to force the user of your method to handle or declare this situation.