
🔥 Core Java Interview Questions (Topic-Wise)
1️⃣ Java Basics & Fundamentals

What are the main features of Java?

What is JVM, JDK, and JRE?

Explain the differences between JVM and JRE.

What are wrapper classes in Java?

Why is Java platform-independent?

Explain Just-In-Time (JIT) compiler.

What is the difference between Java and C++?

What are reserved keywords in Java?

What is bytecode?

Explain main() method in Java.

2️⃣ Data Types & Variables

What are the data types in Java?

Difference between primitive and non-primitive data types.

What is type casting in Java?

Difference between widening and narrowing type casting.

What is the default value of primitive data types?

Why is String not a primitive data type in Java?

3️⃣ Operators & Control Flow

What are different types of operators in Java?

Difference between == and .equals().

What is the ternary operator in Java?

Difference between break and continue.

What is a switch statement? Can we use String in switch?

What is fall-through in switch-case?

Can we use null in switch-case?

4️⃣ OOPs Concepts

What is Object-Oriented Programming (OOP)?

Explain the four pillars of OOP.

What is the difference between class and object?

What is constructor? Types of constructors.

Difference between constructor and method.

Can constructors be inherited?

What is this keyword in Java?

What is super keyword in Java?

Difference between this() and super().

What is method overloading vs overriding?

What is runtime polymorphism in Java?

Can static methods be overridden? Why?

Can we overload main() method in Java?

What is encapsulation in Java?

What is abstraction in Java?

What is interface? How is it different from abstract class?

Can interface have default methods?

Can interface extend another interface?

Can abstract class have constructor?

5️⃣ Strings & Immutable Objects

Why is String immutable in Java?

Difference between String, StringBuilder, and StringBuffer.

What is String Pool in Java?

What is interned string?

Difference between new String("abc") and "abc".

6️⃣ Arrays & Collections

What is an array in Java?

Difference between array and ArrayList.

Can array size be changed after creation?

What is the difference between List, Set, and Map?

Difference between HashMap and Hashtable.

Difference between HashSet and TreeSet.

Difference between ArrayList and LinkedList.

Difference between HashMap and ConcurrentHashMap.

What is the difference between fail-fast and fail-safe iterators?

Difference between Comparable and Comparator.

7️⃣ Exception Handling

What is an exception in Java?

Difference between checked and unchecked exceptions.

What is try-catch-finally block?

Can we have try without catch?

Can we have multiple catch blocks?

Difference between throw and throws.

What is Throwable class in Java?

What happens if finally block has return statement?

8️⃣ Multithreading & Concurrency

What is multithreading in Java?

Difference between process and thread.

What is thread lifecycle in Java?

Difference between Runnable and Thread class.

Difference between start() and run() methods.

What is synchronization in Java?

Difference between synchronized method and synchronized block.

What is volatile keyword in Java?

Difference between sleep() and wait().

Difference between notify() and notifyAll().

What is a deadlock in Java? How to prevent it?

9️⃣ Memory Management

What is garbage collection in Java?

Difference between final, finally, and finalize().

What is memory leak in Java?

Explain heap and stack memory.

What are strong, weak, soft, and phantom references?

🔟 Advanced Core Java

What is a marker interface in Java? Examples.

What is the difference between transient and volatile keywords?

Difference between shallow copy and deep copy.

What is serialization and deserialization in Java?

What is reflection in Java?

What are annotations in Java?

Difference between static method and instance method.

Can we make constructor private in Java? Why?

What is Singleton class in Java?

What is Enum in Java?

What is autoboxing and unboxing?

What are varargs in Java?

Difference between String.valueOf() and Integer.parseInt().

What is a functional interface?

Explain lambda expressions.

What is Stream API in Java 8?

What is Optional in Java 8?

Difference between parallel stream and normal stream.

What is CompletableFuture in Java?

---
# Core Java Interview Questions & Answers

## 1️⃣ Java Basics

### 1. What are the main features of Java?
- Object-Oriented  
- Platform Independent (Write Once, Run Anywhere)  
- Simple and Secure  
- Robust (memory management, exception handling)  
- Multithreaded  
- Portable  
- High Performance (with JIT compiler)  
- Distributed  

---

### 2. What is JVM, JDK, and JRE?
- **JVM (Java Virtual Machine):** Executes Java bytecode, provides platform independence.  
- **JRE (Java Runtime Environment):** Provides JVM + libraries to run Java programs.  
- **JDK (Java Development Kit):** JRE + development tools (compiler, debugger) → used to develop Java applications.  

---

### 3. Explain the differences between JVM and JRE.
- **JVM**: Abstract machine that runs Java bytecode.  
- **JRE**: JVM + libraries + supporting files (runtime environment).  
👉 JVM is part of JRE.  

---

### 4. What are wrapper classes in Java?
- Wrapper classes convert **primitive types** (int, char, etc.) into **objects**.  
- Example: `int → Integer`, `char → Character`.  
- Used in collections (because collections only store objects).  

---

### 5. Why is Java platform-independent?
- Java code is compiled into **bytecode**, which runs on **JVM**.  
- Since every OS has its own JVM, the same bytecode can run anywhere.  

---

### 6. Explain Just-In-Time (JIT) compiler.
- JIT is part of JVM.  
- Converts bytecode into **native machine code at runtime**.  
- Improves performance of Java applications.  

---

### 7. What is the difference between Java and C++?
- Java is **purely object-oriented** (except primitives), C++ is **object-oriented but allows procedural programming**.  
- Java is **platform-independent**, C++ is **platform-dependent**.  
- Java has **automatic memory management (Garbage Collector)**, C++ requires **manual memory management**.  
- Java does not support **multiple inheritance** (uses interfaces), C++ supports it.  

---

### 8. What are reserved keywords in Java?
- Keywords that are **predefined by Java** and cannot be used as identifiers.  
- Example: `class`, `public`, `static`, `void`, `int`, `new`, `return`.  
- Java has **53 reserved keywords** (since Java 17).  

---

### 9. What is bytecode?
- Intermediate code generated by the Java compiler (`.class` file).  
- Not machine-specific, runs on JVM.  
- Ensures portability across platforms.  

---

### 10. Explain main() method in Java.
- Entry point of every Java application.  
- Syntax:  
  ```java
  public static void main(String[] args)
  ```
- **public** → accessible everywhere.  
- **static** → JVM can call without creating an object.  
- **void** → no return value.  
- **String[] args** → command-line arguments.  

---

## 2️⃣ Data Types & Variables

### 1. What are the data types in Java?
Java has two categories of data types:  

**a) Primitive Data Types (8 types):**  
- byte (1 byte)  
- short (2 bytes)  
- int (4 bytes)  
- long (8 bytes)  
- float (4 bytes)  
- double (8 bytes)  
- char (2 bytes, Unicode)  
- boolean (1 bit, true/false)  

**b) Non-Primitive Data Types:**  
- String  
- Arrays  
- Classes  
- Interfaces  

---

### 2. Difference between primitive and non-primitive data types.

| Feature                | Primitive                        | Non-Primitive                  |
|-------------------------|----------------------------------|---------------------------------|
| **Definition**          | Basic built-in types             | Derived/Reference types         |
| **Size**                | Fixed                           | Can vary                       |
| **Stored in**           | Stack                           | Heap (reference stored in stack)|
| **Examples**            | int, char, boolean              | String, Array, Objects          |

---

### 3. What is type casting in Java?
Type casting is converting one data type into another.  
- Example:  
  ```java
  int x = 10;
  double y = (double) x;  // type casting int → double
  ```

---

### 4. Difference between widening and narrowing type casting.

- **Widening (Implicit):**  
  Smaller data type → Larger data type.  
  No data loss, done automatically.  
  Example: `int → long → float → double`  

- **Narrowing (Explicit):**  
  Larger data type → Smaller data type.  
  May cause data loss, requires explicit cast.  
  Example: `double → float → int → byte`  

---

### 5. What is the default value of primitive data types?

| Data Type  | Default Value |
|------------|---------------|
| byte       | 0             |
| short      | 0             |
| int        | 0             |
| long       | 0L            |
| float      | 0.0f          |
| double     | 0.0d          |
| char       | '\u0000' (null char) |
| boolean    | false         |

---

### 6. Why is String not a primitive data type in Java?
- String is a **class** in `java.lang` package.  
- It provides many **methods (like length(), substring(), concat())** which primitive types do not.  
- Being an object allows Strings to be immutable and powerful.  
- Primitive types are stored in stack, but Strings are objects stored in heap.  
