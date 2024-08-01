package lec3;

/*
Records are a special kind of class introduced in Java 14 as a
preview feature and made stable in Java 16. They are designed
to be a concise way to create classes that are primarily data
carriers, reducing the boilerplate code required for POJOs.

Characteristics:
 - Immutable by default.
 - Automatically provide implementations for toString(),
   equals(), hashCode(), and accessor methods.
 - Require a concise syntax to declare fields.
 */
public record PersonRecord(String name, int age) {

}
