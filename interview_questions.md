## 1. What is Java? 
```
1. Java is a high-level, object-oriented programming language.

+ It's platform-independent — write once, run anywhere using JVM.

+ Java is used for web, mobile (Android), desktop, and enterprise apps.

+ It supports OOP principles like inheritance, polymorphism, etc.

+ Java code is compiled to bytecode (.class) and run by the JVM.
```
## 2  Why is Java a platform independent language?
```
Java language was developed so that it does not depend on any hardware or software because the compiler compiles the code and then converts it to platform-independent byte code which can be run on multiple systems.

The only condition to run that byte code is for the machine to have a runtime environment (JRE) installed in it.
```

## 3. Why is Java not a pure object oriented language?
```
Java supports primitive data types - byte, boolean, char, short, int, float, long, and double and
 hence it is not a pure object oriented language.
```
## 4.pure object-oriented programming

+ A pure object-oriented programming (OOP) language is one where everything is treated as an object, including primitives like integers, characters, and booleans. 
+ In such languages, all functionalities are performed through objects, and there is no distinction between primitive and non-primitive types.

#### 5.Characteristics of Pure OOP Languages:
- `Everything is an Object:` Even primitive data types and functions are treated as objects.
- `Encapsulation:` Data and methods are bundled together.
- `Inheritance:` Objects can inherit properties and behaviors from other objects.
- `Polymorphism:` The ability to define methods in different forms.
- `Abstraction:` Objects hide the internal implementation details.
- `No Standalone Functions:` All functions are part of some object.
#### 6.Examples of Pure Object-Oriented Languages:
- `Smalltalk:` Considered the closest to a pure object-oriented language because everything, including control structures and numbers, is an object.
- `Ruby:` Treats everything as an object but is slightly less strict than Smalltalk.
#### 7.Why Java is Not Pure:
Java is considered not purely object-oriented because:

It includes primitive data types (e.g., int, char, boolean) that are not objects.
It allows for static methods, which are not part of an object.
Some operations, like arithmetic (+, -, etc.), are not method calls on objects.
#### 8. Why Pure OOP is Rare:
+Pure OOP languages can sometimes be inefficient or overly restrictive for certain tasks, like mathematical computations, where using primitive types directly is faster. 
+ As a result, most modern OOP languages, like Java and Python, are a mix of object-oriented and procedural programming styles to balance efficiency with OOP principles.

## 10. JDK , JRE ,JVM

### 🧠 Definitions First
|Term|	Full Form|	Purpose|
|------|-------|---------|
|JDK|	Java Development Kit	|Tools to write, compile, and run Java code|
|JRE|	Java Runtime Environment|	Environment to run Java applications|
|JVM	|Java Virtual Machine|	Converts bytecode into machine code (platform-specific)|

### 🔁 Step-by-Step Java Program Execution
#### ✅ Step 1: Write Code
You write code in a `.java` file.
```sh
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
``
####✅ Step 2: Compile using JDK (javac)
```sh
javac Hello.java
```
+ This converts` .java `→ `Hello.class` (Bytecode)

#### ✅ Step 3: Run using JVM (via JRE)

+ java Hello

+ JVM inside JRE takes Hello.class

+ It translates bytecode → machine code

+ Executes on your OS (Windows/Linux/Mac)

#### 🔄 Relationship Diagram
```sh
       You (Developer)
             ↓
        [JDK] 👨‍💻
     ┌─────────────┐
     │ javac       │  ← Compiles .java to .class (Bytecode)
     └─────────────┘
             ↓
        [JRE] 🎯
     ┌─────────────┐
     │   JVM       │  ← Runs .class files
     └─────────────┘
             ↓
     Your Program Runs ✔
```

### 🚀 Execution Flow in One Line:
```
.java → [JDK: javac] → .class → [JRE: JVM] → machine code → output
```

## 11. Heap memory and stack memory
### 🟩 Heap Memory – "Big Storage Area"
#### ✅ What goes into Heap?
+ All objects

+ Instance variables (from new)

+ Classes like Student` s = new Student();`

### 🔁 Shared by all threads.
### ❌ Garbage collected:
+ When no reference to an object exists, it's eligible for garbage collection.

📌 Example:
```
Student s1 = new Student(); // s1 (in stack), new Student() (in heap)
```
### 🟦 Stack Memory – "Method & Variable Area"
#### ✅ What goes into Stack?
+ Local variables (int x = 10)

+ Method calls (each method has its own frame)

+ Reference variables (not objects themselves)

### 🔁 One stack per thread (not shared)
#### ⛔ Automatically deleted after method call ends
📌 Example:
```
public void show() {
    int a = 5;         // 'a' is in stack
    Student s = new Student(); // 's' in stack, object in heap
}
```
### 🔄 Diagram (Mental Model)
```
JVM Memory
├── Stack (Thread 1)
│   ├── Method: main()
│   │   ├── int x = 10;
│   │   ├── Student s1 → 📍
│
├── Heap
│   ├── 📍 Student object (s1)
│   ├── 📍 String object

```

## 12.♻️ What is Garbage Collection in Java?
Garbage Collection is a process in Java that:

+ ✅ Automatically removes objects from memory `(heap)`  that are no longer being used — so you don’t have to delete them manually.

### 👀 Real-World Analogy:
+ Imagine you're working on a desk.

+ You keep important things (in use) in front of you.

+ Old papers (you no longer need) are thrown into the trash.

+ Garbage Collector is like the cleaner who comes and removes that trash for you — automatically.

### 🛠️ How it works (Step-by-Step)
You create an object:
```
Student s = new Student();
```
+ JVM stores it in `heap`  memory.

+ When the object is no longer used:
```
s = null;  // Now object has no reference
```
+ Java's Garbage Collector (GC) detects it and removes it from heap to free memory.

### 🔍 When does GC run?
+ Automatically by the JVM

You can request it manually:

🧪 Example:
```
public class Demo {
    public static void main(String[] args) {
        Student s = new Student(); // Object created in heap
        s = null;                  // Now it's garbage
        System.gc();               // Request GC
    }
}
```
### ✅ Which objects are garbage?
 Any object that:

+ Has no reference pointing to it

+ Is not reachable from any part of the code


# 🟢 Basic Java Variable & Data Type Questions
## 13. What is a variable in Java?
Answer:
+ A variable is a name given to a memory location used to store data. It can hold different types of values depending on its data type.

## 14. What are the types of variables in Java?
Answer:

Local variables – Declared inside methods.

Instance variables – Non-static variables declared in a class.

Static variables – Declared using static keyword, shared among all objects.

## 15. What is a data type in Java?
Answer:
A data type defines what kind of data a variable can hold, like integers, decimals, characters, etc.

## 16. What are the two categories of data types in Java?
Answer:

+ `Primitive data types`  – int, float, char, boolean, etc.

+ `Non-primitive` (Reference) data types – String, Arrays, Objects, Classes, etc.

## 17. List all 8 primitive data types in Java.
|Data Type|	Size	|Example|
|----------|-----|---------|
|byte	|1 byte|	127|
|short	|2 bytes	|32000|
|int	|4 bytes	|100000|
|long|	8 bytes	|1234567890L|
|float	|4 bytes|	3.14f|
|double	8 bytes	|3.14159|
|char|	2 bytes|	'A'|
|boolean|	1 bit|	true/false|

## 🟡 Intermediate Questions
### 18. What is the default value of primitive data types?
Answer:

|Type|	Default Value|
|-----|------------|
|int|	0|
|boolean|	false|
|char	|'\u0000'|
|Object|	null|

### 19. What is the difference between float and double?
Answer:

+ float: 4 bytes, less precision (3.14f)

+ double: 8 bytes, more precision (3.1415926535)

### 20. What is typecasting in Java?
Answer:
+ Typecasting is converting one data type into another.

+ `Implicit1` (Widening) – smaller → larger (e.g., `int` to` double`)

+ `Explicit` (Narrowing) – larger → smaller (e.g., `double` to` int`)
```
int a = 10;
double b = a;          // Widening
int c = (int) b;       // Narrowing
```

### 21. Can we store char in an int?
Answer:
Yes, because char is internally stored as a Unicode integer value.
```
char ch = 'A';
int num = ch;   // num will be 65
```
## 🔴 Advanced & Tricky Questions
### 22. Can a local variable have a default value?
Answer:
+ ❌ `No`. Local variables must be initialized before use, or you'll get a compile-time error.

### 23. What is the size of a boolean in Java?
Answer:
+ Technically, it uses 1 bit, but the JVM uses 1 byte for storage (cannot address less than 1 byte in memory).

### 24. Can you store a float value in a long variable directly?
Answer:
No. You need explicit casting:
```
float f = 10.5f;
long l = (long) f;  // Narrowing conversion
```
### 25. Is String a primitive data type?
Answer:
+ ❌ No. String is a non-primitive (reference) type. It is a class in Java.

### 26. What is the range of int in Java?
Answer:
+ int is 4 bytes → range is:
+ -2,147,483,648 to 2,147,483,647


## 26. 🔥 List of Useful Java Escape Sequences
|Escape Sequence|	Description|	Example Output|
|---------------|-------------|--------------|
| \n	|New Line	| Moves to next line|
| \t	|Tab (horizontal space)|	Adds a tab space|
| \\	|Backslash |(\)	Prints \|
| \"	|Double quote (")|	Prints "Text"|
| \'	|Single quote (')	|Prints 'Text'|
| \b	|Backspace|	Deletes one character (varies)|
| \r	|Carriage return (rarely used)|	Moves to start of the line|

🧪 Example Code:
```
public class EscapeDemo {
    public static void main(String[] args) {
        System.out.println("Line1\nLine2");
        System.out.println("Tabbed\tText");
        System.out.println("Quote: \"Hello Chirag\"");
        System.out.println("Backslash: \\Java\\DSA");
    }
}
```
## 27 Operations 

### 🔹 1. Arithmetic Operations
These perform basic math operations.

|Operator|	Meaning|	Example|
|-------|----------|----------|
| + |	Addition|	a + b|
| - |	Subtraction	|a - b|
| *	| Multiplication	|a * b| 
| / |	Division	|a / b| 
| % |	Modulus |	a % b|

### 🔹 2. Relational / Comparison Operations
Used to compare two values.

|Operator	|Meaning	|Example|
|-------|-----------|---------|
| == | 	Equal to | 	a == b  |
| !=  |Not equal to | 	a != b |
| >	  | Greater than	 | a > b  |
| <	 | Less than | 	a <  b  |
| >=	 | Greater than or equal to	 | a >= b | 
| <=	 | Less than or equal to	 | a<= b |

### 🔹 3. Logical Operations
Used to combine multiple conditions.

| Operator| 	Meaning| 	Example| 
|----------|------|-----------|
|&& |	Logical AND |	a > 5 && b < 10 |
| "||" |logical OR| |
| !	 | Logical NOT | 	!(a > 5) | 

🔹 4. Assignment Operations
Used to assign values to variables.

|Operator | 	Meaning | 	Example |
|----------|------------|----------|
| =	 |Assignment  |	a = 10 | 
| += | 	Add and assign| 	a += 5 → a = a + 5 |
| -= | 	Subtract and assign|	a -= 5|
| *= | 	Multiply and assign|	a *= 2|
| /= |	Divide and assign|	a /= 2|
| %=	| Modulus and assign|	a %= 3|

🔹 5. Unary Operations
Operate on a single operand.

|Operator|	Meaning|	Example|
|------|---------|---------|
|+|	Unary plus|	+a|
|-	|Unary minus|	-a|
|++	|Increment|	a++, ++a|
|--	|Decrement	|a--, --a|
|!	|Logical NOT|	!true|

### 🔹 6. Bitwise Operations
Operate on bits and perform bit-by-bit operations.

|Operator	| Meaning	| Example| 
|---------|----------|---------|
|&|	Bitwise AND|	a & b|
| `	` | 	Bitwise OR  |  |
| ^ |	Bitwise XOR| 	a ^ b| 
| ~	| Bitwise Complement| 	~a|
| <<	| Left shift	| a << 2 |
| >>| 	Right shift| 	a >> 2| 
| >>>| 	Unsigned right shift| 	a >>> 2| 

## 28✅ Ternary Operator Syntax:
```
condition ? expression_if_true : expression_if_false;
```
🔰 Example: Check if a person is eligible to vote
```
public class TernaryExample {
    public static void main(String[] args) {
        int age = 20;

        String result = (age >= 18) ? "✅ Eligible to vote" : "❌ Not eligible to vote";

        System.out.println(result);
    }
}
```
#### 🧠 Explanation:
+ (age >= 18) is the condition.

+ If it's true, it returns "✅ Eligible to vote".

+ If it's false, it returns "❌ Not eligible to vote".

The result is stored in the variable result and then printed.

🧪 Another Example: Find the maximum of two numbers
```
public class MaxExample {
    public static void main(String[] args) {
        int a = 10, b = 15;

        int max = (a > b) ? a : b;

        System.out.println("Maximum is: " + max);
    }
}
```

## 29.🔍 What is instanceof?
The instanceof operator checks whether an object is an instance of a specific class or implements a specific interface.

✅ Syntax:
```
object instanceof ClassName
```
Returns true if object is an instance of ClassName, otherwise false.

### 🔰 Example: Animal 🐾 - Dog 🐶 - Cat 🐱
```
class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal a = new Dog();  // upcasting

        // Check object type
        System.out.println("a instanceof Animal: " + (a instanceof Animal)); // true
        System.out.println("a instanceof Dog: " + (a instanceof Dog));       // true
        System.out.println("a instanceof Cat: " + (a instanceof Cat));       // false
    }
}
```
🧠 Explanation:
+ a is a reference of type Animal pointing to a Dog object.

+ a instanceof Animal → ✅ true (because Dog is an Animal)

+ a instanceof Dog → ✅ true (because it’s actually a Dog)

+ a instanceof Cat → ❌ false (because it’s not a Cat)

### 💡 Real Use Case: Safe Downcasting
+ Use instanceof to safely type cast an object.

```
if (a instanceof Dog) {
    Dog d = (Dog) a;  // safe downcasting
    System.out.println("Dog object found!");
}
```
+ This avoids ClassCastException at runtime.

❌ Without instanceof (Dangerous):
```
Dog d = (Dog) a; // May throw ClassCastException if 'a' is not actually a Dog
```
### 📦 Bonus: instanceof with interfaces
```
interface Drawable {}

class Circle implements Drawable {}

public class InterfaceCheck {
    public static void main(String[] args) {
        Drawable d = new Circle();
        System.out.println(d instanceof Circle);     // true
        System.out.println(d instanceof Drawable);   // true
    }
}
```

# Candition statement 

### ✅ 30 . What is a conditional statement in Java?
Answer:
+ Conditional statements in Java are used to make decisions based on certain conditions.
+ These statements execute different blocks of code depending on whether a condition is true or false.
+ Examples include if, if-else, if-else if, switch, and the ternary operator.

### ✅ 31. What's the difference between if and if-else?
Answer:

+ `if`  executes a block only if the condition is true.

+ `if-else1` provides an alternative block to execute when the condition is false.
```
if (x > 10) {
    // only runs if x > 10
} else {
    // runs if x <= 10
}
```
### ✅ 32. When do you use if-else if-else ladder?
Answer:
Use it when you have multiple conditions to check one after another.
```
if (score >= 90) {
    // Grade A
} else if (score >= 75) {
    // Grade B
} else {
    // Grade C
}
```
## ✅ 33. What is a nested if statement?
Answer:
An if statement inside another if. It's used when one condition depends on another.
```
if (age >= 18) {
    if (hasID) {
        System.out.println("You can vote.");
    }
}
```

### ✅ 34. What is the switch statement in Java?
Answer:
+ The switch statement allows you to test a variable against multiple values.
```
int day = 2;
switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Invalid day");
}
```
### ✅ 35. Can we use switch with String in Java?
Answer:
_+ ✅ Yes, from Java 7 onwards, switch supports String.

```
String role = "admin";

switch(role) {
    case "admin": System.out.println("Welcome Admin!"); break;
    case "user": System.out.println("Welcome User!"); break;
    default: System.out.println("Unknown role");
}
```
### ✅ 36. Can a condition be more than one line in an if statement?
Answer:
Yes. Complex conditions using logical operators (&&, ||, !) are allowed.
```
if (age >= 18 && hasLicense && !isSuspended) {
    System.out.println("You can drive.");
}
```
### ✅ 37. What happens if you forget the break in a switch case?
Answer:
+ It causes fall-through, meaning the code continues executing the next cases until it hits a break or the end of the switch block.

### ✅ 38. Can we write if without curly braces {}?
Answer:
+ `Yes, but only one statement can be executed. For multiple statements, {} is required.
```
if (x > 10)
    System.out.println("X is big");  // okay
// Not okay:
//     System.out.println("Line 1");
//     System.out.println("Line 2");

```

# loop 

### 🔁 What is a Loop in Java?
+ A loop is used to execute a block of code repeatedly as long as a condition is true.

### ✅ Types of Loops in Java:
###  1.` for loop `
  Used when you know how many times you want to run the loop.
```
for (int i = 1; i <= 5; i++) {
    System.out.println("i = " + i);
}
```
🧠 Output:
```
i = 1  
i = 2  
i = 3  
i = 4  
i = 5
```
### 2. `while loop` 
Used when you don’t know how many times you want to run the loop, but only need a condition.
```
int i = 1;
while (i <= 5) {
    System.out.println("i = " + i);
    i++;
}
```
### 3. do-while loop
Like while, but it executes at least once, even if the condition is false.
```
int i = 1;
do {
    System.out.println("i = " + i);
    i++;
} while (i <= 5);
```
### 4. for-each loop (Enhanced for loop)
Used to iterate over arrays or collections.
```
int[] numbers = {10, 20, 30};

for (int num : numbers) {
    System.out.println(num);
}
```
### ⛔ Loop Control Statements:
#### 🔹 break
Stops the loop entirely.
```
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.println(i); // prints 1, 2
}

```
#### 🔹 continue
Skips the current iteration and continues with the next.
```
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i); // prints 1, 2, 4, 5
}
```
📦 Real-World Example: Sum of numbers from 1 to 10
```
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;
}
```
System.out.println("Sum = " + sum); // Output: Sum = 55



### ✅ Basic Interview Questions on Loops
### 39. What are the different types of loops in Java?
Answer:

+ for loop – used when the number of iterations is known.

+ while loop – used when the number of iterations is unknown, but condition-based.

+ do-while loop – same as while, but executes at least once.

+ for-each loop – used to iterate through arrays or collections.

### 40. What is the difference between while and do-while loop?
Answer:

|while loop| 	do-while loop |
|--------|-----------|
|Condition is checked before loop body|	Condition is checked after loop body|
|May never execute if condition is false |	Executes at least once, even if condition is false|
```
int x = 10;

while (x < 5) {
    System.out.println("This won't print");
}

```
```
do {
    System.out.println("This will print once");
} while (x < 5);
```
### 41. How does the for-each loop work in Java?
Answer:
+ The enhanced for loop (for-each) is used to iterate over arrays and collections without using an index.
```
int[] nums = {10, 20, 30};
for (int n : nums) {
    System.out.println(n);
}
```
It doesn't allow you to modify elements or access index directly.

### 42. What is an infinite loop? How to avoid it?
Answer:
An infinite loop is a loop that never terminates because its condition always evaluates to true.
```
while (true) {
    System.out.println("Infinite");
}
```
#### Avoid it by:

+ Ensuring proper condition

+ Updating loop variable

+ Adding a break condition when needed

### 43. What is the use of break and continue in loops?
Answer:

+ `break1` : Exits the loop immediately.

+ `continue` : Skips the current iteration and proceeds to the next.
```
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);  // prints 1, 2, 4, 5
}
```

## 44. What will be the output of this code?
```
int i = 1;
while (i++ < 3) {
    System.out.print(i + " ");
}
```
Answer:
```
Output: 2 3
```
Explanation:

1st iteration: i = 2 (prints 2)

2nd iteration: i = 3 (prints 3)

Loop stops when i++ < 3 becomes false


🔧 What is a Function (Method) in Java?
A function (or method) in Java is a block of code that performs a specific task. It can be called multiple times to reuse logic and avoid code duplication.

# function 

###  ✅ Types of Methods in Java:
Type	Description
+ `Predefined Methods`	Built-in, like System.out.println()
+ `User-defined Methods	` Created by the programmer

### 🧱 Basic Structure of a Method:
```
returnType methodName(parameters) {
    // code block
    return value;
}
```
🔰 Example: Simple Method
```
public class MyClass {

    // user-defined method
    static void greet() {
        System.out.println("Hello, Chirag!");
    }

    public static void main(String[] args) {
        greet();  // calling the method
    }
}
```
### ⚙️ Method with Parameters and Return Value
```
public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("Sum = " + result);
    }
}
```

### 🔷 1. What is a static method in Java?
+ A static method belongs to the ` class itself`, not the object.
+ You can call it without creating an object.

✅ Example:
```
public class Demo {
    static void greet() {
        System.out.println("Hello from static method!");
    }

    public static void main(String[] args) {
        greet();  // ✅ No need to create an object
    }
}
```
🧠 Key Points:
```
Use ClassName.methodName() or just methodName() from inside main.
```
Common use: main() method is static!

### 🔶 2. What is a non-static method in Java?
+ A non-static method belongs to an object, not the class.
+ You must create an object to call it.

✅ Example:
```
public class Demo {
    void sayHi() {
        System.out.println("Hi from non-static method!");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();  // ✅ object creation
        obj.sayHi();            // calling non-static method
    }
}
```

### ❓ Can a static method access a non-static method?
+ ✅ Yes — but only by creating an object of the class.
Because:

+ static methods belong to the class

 +non-static methods belong to the object (instance)

+ So inside a static method like main(), you cannot directly access non-static methods or variables.

🔧 Example
```
public class Demo {

    // non-static method
    void show() {
        System.out.println("Non-static method called");
    }

    // static method
    public static void main(String[] args) {
        // Cannot call show(); directly ❌

        // ✅ Create an object to call non-static method
        Demo obj = new Demo();
        obj.show();  // Now it's valid ✅
    }
}
```


## 45: What is the difference between static and non-static methods?
Answer:

|Feature|	Static Method |	Non-Static Method|
|-------|-------------|-----------------------|
|Belongs| to	Class|	Object|
|Called by|	ClassName.method()|	object.method()|
|Object needed?	|❌ No|	✅ Yes|
|Example	|main(),  utility methods |	getName(), display() etc.|






###  46. What is public in Java?
+ public is an access modifier — it means the class or method is accessible from anywhere.

✅ Example:
```
public class Car {
    public void start() {
        System.out.println("Car started");
    }
}
```
You can use start() method from any other class or package if the method is public.

###  47. What is private in Java?
+ private means the method/variable is only accessible inside the same class. No other class can access it directly.

✅ Example:
```
public class Secret {
    private void secretMessage() {
        System.out.println("This is private");
    }

    public static void main(String[] args) {
        Secret s = new Secret();
        s.secretMessage(); // ✅ Allowed here
    }
}
```
```
public class Outside {
    public static void main(String[] args) {
        Secret s = new Secret();
        // s.secretMessage(); ❌ Error: not accessible here
    }
}
```

###  48. Can a static method access non-static variables or methods?
Answer:
❌ No, not directly.
✅ But you can access them by creating an object.

```
class Demo {
    int x = 10;
    static void show() {
        // System.out.println(x); ❌ error
        Demo d = new Demo();      // ✅
        System.out.println(d.x);
    }
}
```
### ✅ 49. Can private methods be accessed outside the class?
Answer:
❌ No.
They can only be accessed within the same class.
```
class Secret {
    private void show() {
        System.out.println("Private");
    }

    public static void main(String[] args) {
        Secret s = new Secret();
        s.show();  // ✅ allowed here
    }
}
```
### ✅ 50. What is an object in Java? How is it created?
Answer:
An object is an instance of a class. You create it using the new keyword.
```
class Dog {
    void bark() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog(); // Object created
        d.bark();
    }
}
```
### 52. Difference between class and object?
### Class	Object
+ Blueprint/template	Instance of a class
+ No memory until object created	Takes memory when created
+ Example: Car	Car c1 = new Car();

### ✅ 52. What happens if you call a non-static method from static without object?
Answer:
+ You get a compile-time error:

```
Non-static method cannot be referenced from a static context.
```
### ✅ 53. Can a constructor be static?
Answer:
+ ❌ No.
+ Constructors are used to create objects, and static methods belong to the class, not instances.
+ So it doesn't make sense for constructors to be static.

# Array

### 54🧠 What is an Array in Java?
+ An array is a collection of elements of the same data type stored in a contiguous block of memory.

+ Think of it like a row of lockers 📦 where each locker holds one value.

✅ Array Syntax in Java
```
datatype[] arrayName = new datatype[size];
```
📌 Example:
```
int[] numbers = new int[5]; // creates array of 5 integers
```
You can also initialize it directly:
```
int[] numbers = {10, 20, 30, 40, 50};
```
### 🔁 Accessing Array Elements
Arrays are zero-indexed (starts at index 0).

```
System.out.println(numbers[0]); // 10
numbers[2] = 100;
```
        // Change value at index 2
✅ Full Example
```
public class MyArray {
    public static void main(String[] args) {
        int[] marks = {95, 88, 76, 64, 100};

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i+1) + ": " + marks[i]);
        }
    }
}
```
### 55. ✅ Types of Arrays in Java
+ `One-dimensional array` 
→ int[] arr = new int[5];

+ `Two-dimensional array`  (matrix)
→ int[][] matrix = new int[3][3];

+ Multidimensional arrays
→ Like 3D or more, rarely used directly.


### 56. What is the default value of an array element in Java?
Depends on type:

+ int → 0

+ boolean → false

+ String or objects → null

### 57. How to find the length of an array?
```
int[] arr = {1, 2, 3};
System.out.println(arr.length); // Output: 3
```
### 58. Can you increase the size of an array?
+ ❌ No. Java arrays are fixed size.
+ ✅ But you can use ArrayList to handle dynamic resizing.

### 59. How to sort an array?
```
import java.util.Arrays;

int[] arr = {5, 1, 3, 2};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
```
// [1, 2, 3, 5]
### 60.. What is the difference between array and ArrayList?
|Feature	|Array|	ArrayList|
|-----------|----------|----------|
|Size	| Fixed	DynamicType	Can be primitive |	Only objects|
|Performance| 	Faster |	Slightly slower|
|Methods| 	Limited |Rich (add, remove) |

### 61.✅ String to Primitive Data Type Conversion Table
|Data Type |	Conversion | Method	Example |
|---------|-----------|------------------|
|int|	Integer.parseInt(String)	|int i = Integer.parseInt("123");|
|double|	Double.parseDouble(String)|	double d = Double.parseDouble("12.5");|
|float|	Float.parseFloat(String)|	float f = Float.parseFloat("3.14");|
|long|	Long.parseLong(String)|	long l = Long.parseLong("100000");|
|boolean|	Boolean.parseBoolean(String)|	boolean b = Boolean.parseBoolean("true");|
|short|	Short.parseShort(String)	|short s = Short.parseShort("10");|
|byte|	Byte.parseByte(String) |	byte b = Byte.parseByte("5");|



### 62. 🔁 Reverse: Primitive → String
You can also convert back using String.valueOf() or concatenation.
```
int x = 100;
String str = String.valueOf(x);       // "100"

double d = 5.75;
String str2 = d + "";                 // "5.75" (shortcut)
```

### 63🔍 Why is String non-primitive?
+ It's actually a class in Java (java.lang.String).

+ That means a String is an object, not a simple data value.

+ It comes with built-in methods like:
```
name.length();
name.toUpperCase();
name.charAt(0);
```
Primitive types like int, float, boolean, etc., do not have methods — they hold simple values only.

### 64.✅ 1. String.valueOf() → Converts any data type into a String
🔸 Usage:
```
String s1 = String.valueOf(100);           // int to String
String s2 = String.valueOf(3.14);          // double to String
String s3 = String.valueOf(true);          // boolean to String
String s4 = String.valueOf('A');           // char to String
String s5 = String.valueOf(new int[]{1,2}); // object to String (prints memory ref)
```
## stack 
### 65. 📘 What is a Stack?
+ Stack is a `LIFO` (Last In First Out) data structure.

+ The last item added is the first one to be removed.

Operations:

+ `push()` → Add item

+ `pop()` → Remove top item

+ `peek()` → See top item

+ `isEmpty()` → Check if stack is empty

#### ✅ 1. Java Built-in Stack (java.util.Stack)
```
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at top
        System.out.println("Top: " + stack.peek()); // 30

        // Pop element
        System.out.println("Popped: " + stack.pop()); // 30

        // Check if empty
        System.out.println("Is empty? " + stack.isEmpty()); // false

        // Print stack
        System.out.println("Stack: " + stack); // [10, 20]
    }
}
```
### 🛠️ 2. Custom Stack Implementation
```
class MyStack {
    int[] stack;
    int top;
    int capacity;

    MyStack(int size) {
        stack = new int[size];
        top = -1;
        capacity = size;
    }

    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack st = new MyStack(5);
        st.push(10);
        st.push(20);
        System.out.println(st.peek());  // 20
        st.pop();
        System.out.println(st.peek());  // 10
    }
}
```
#### 🧠 Use Cases of Stack:
+ Undo feature in editors

+ Balanced parentheses check

+ Backtracking (e.g., maze, recursion)

+ Browser history navigation

## 66.🔸 Scanner vs BufferedReader
|Feature|	Scanner|	BufferedReader|
|--------|-----------|--------------|
|Package|	java.util |	java.io|
|Ease of use	Very easy |— supports methods like nextInt(), nextLine(), etc.|	More manual — you only get strings via readLine()|
|Input type|	Parses input types directly (int, long, etc.)	|Always returns String, you have to manually parse|
|Performance|	Slower (internally does more work like parsing, tokenizing)|	Faster (uses a buffer — good for large input)|
|Best for |	Simple input (like coding interviews or small programs)	|Fast input needs (like competitive programming or file reading)|

#### ✅ Example using Scanner
```
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
String name = sc.next();
```
#### ✅ Example using BufferedReader
```
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String line = br.readLine();         // Reads a whole line
int a = Integer.parseInt(line);      // Manual conversion
```
#### 🔑 When to Use What?
+ Use Case	Recommended
+ Quick and easy input	✅ Scanner
+ Competitive programming / performance critical	✅ BufferedReader


## time and space Complecity 
### 67. What is Time Complexity?
Answer:
+ Time complexity is a measure of the amount of time an algorithm takes to complete as a function of the input size (n). It helps estimate how efficiently an algorithm performs as input grows.

 ### 68  What is Space Complexity?
Answer:
+ Space complexity measures the amount of memory (RAM) used by an algorithm as a function of the input size. It includes the space for input, output, and auxiliary variables or data structures used.

#### ✅ 1. Linear Search → O(n)
+ 🔹 What:
Linear search checks each element one-by-one until it finds the target or reaches the end.

 +🔹 Time Complexity:
+ `Best case`: O(1) → if the element is the first one

+ `Worst case`: O(n) → if the element is last or not present

🔹 Example:
```
int[] arr = {10, 20, 30, 40};
int x = 30;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == x) {
        // found
        break;
    }
}
```
+ 🔹 Why O(n)?
+ Because in the worst case, we check all n elements.

### ✅ 2. Binary Search → O(log n)
+ 🔹 What:
Binary search divides the array in half at every step, only works on sorted arrays.

+ 🔹 Time Complexity:
Always O(log n)

🔹 Example:
```
int[] arr = {10, 20, 30, 40, 50}; // sorted
int low = 0, high = arr.length - 1;
int x = 40;
while (low <= high) {
    int mid = (low + high) / 2;
    if (arr[mid] == x) {
        break;
    } else if (x < arr[mid]) {
        high = mid - 1;
    } else {
        low = mid + 1;
    }
}
```
🔹 Why O(log n)?
Because each step halves the input, like:

Step 1: n

Step 2: n/2

Step 3: n/4

... until 1 element remains

So total steps ≈ log₂(n)

#### ✅ 3. Constant Time → O(1)
🔹 What:
Operations that take the same time regardless of input size.

🔹 Example:
```
int[] arr = {10, 20, 30, 40};
System.out.println(arr[2]); // Accessing index 2 directly
```
🔹 Why O(1)?
Because accessing any element by index in an array takes constant time.



### ✅ Most common Big O complexities
|Big O|	Name|	Example algorithm|
|-------|-----------------|----------|
|O(1) |	Constant |time	Array element access|
|O(log n)	| Logarithmic| time	Binary Search|
|O(n)	| Linear time |	Linear Search, traversing an array|
|O(n log n) |	Linearithmic |time	Merge Sort, Heap Sort|
|O(n²) |	Quadratic | time	Bubble Sort, simple nested loops|
|O(n³) |	Cubic  |time	Triple nested loops|
|O(2ⁿ)	| Exponential |time	Recursive Fibonacci|
|O(n!) |	Factorial| time	Solving traveling salesman brute force|


### ✅ Explained with examples
#### ✅ O(1) — Constant Time

Takes same time regardless of input size.
```
System.out.println(arr[5]);   // direct access
```
#### ✅ O(log n) — Logarithmic Time

+ Problem size halves every step.

+ Example: `binary search`.

#### ✅ O(n) — Linear Time

Process all n elements once.

```
for(int i=0; i<n; i++) { ... }
```
#### ✅ O(n log n) — Linearithmic Time

Logarithmic behavior for each of n items.

Classic example: merge sort, heap sort.

```
// divide + conquer merge sort
```
#### ✅ O(n²) — Quadratic Time
```
for(int i=0; i<n; i++)
   for(int j=0; j<n; j++)
```
+ Bubble sort, selection sort, insertion sort worst-case.

#### ✅ O(n³) — Cubic Time
```
for(int i=0; i<n; i++)
  for(int j=0; j<n; j++)
    for(int k=0; k<n; k++)
```
#### ✅ O(2ⁿ) — Exponential Time

+ Time doubles with each extra input.

Brute-force recursion


// naive fibonacci
#### ✅ O(n!) — Factorial Time

all permutations of n items

e.g. traveling salesman problem brute force



⏱️ Time Complexity Ranking (Best ➜ Worst):

+ O(1)        → Constant time         ✅ Best
+ O(log n)    → Logarithmic time      ✅ Very Good
+ O(n)        → Linear time           👍 Acceptable
+ O(n log n)  → Linearithmic time     👍 Good (e.g., efficient sorting)
+ O(n²)       → Quadratic time        ⚠️ Only okay for small input
+ O(2ⁿ)       → Exponential time      ❌ Very slow (avoid if possible)
+ O(n!)       → Factorial time        ❌ Extremely slow (brute-force)






### 🔹 69. What is the time complexity of Binary Search?
Answer:
O(log n) — because the input size is halved in each step.

### 🔹 70. What is the time and space complexity of Linear Search?
Answer:

Time: O(n)

Space: O(1) (no extra space needed)

### 🔹 71. What is the time complexity of Bubble Sort?
Answer:

Worst & Average case: O(n²)

Best case (if array is already sorted): O(n)

###  72. What is Big O, Big Ω (Omega), and Big Θ (Theta)?
Answer:

O(f(n)): Worst-case complexity

Ω(f(n)): Best-case complexity

Θ(f(n)): Average-case or exact complexity

### 🔹 73. Can you give the time complexity of common operations in an array?
Operation	Time Complexity
Access (by index)	O(1)
Search (unsorted)	O(n)
Insert (at end)	O(1) (amortized)
Delete (from index)	O(n)

### 🔹 74. What is the space complexity of recursive functions?
Answer:
+ It's equal to the maximum depth of the recursive call stack.
+ E.g., for a function that recurses n times: Space = O(n)

### 🔹 75. What is the time complexity of Merge Sort?
Answer:

+ Time: O(n log n) — because the array is split log(n) times, and each split takes O(n) to merge.

+ Space: O(n) — because of the auxiliary arrays used.

### 🔹 76. What is the space and time complexity of DFS (Depth First Search) in a graph?
Answer:

+ Time: O(V + E)

+ Space: O(V) for visited array and call stack
+ Where V = number of vertices, E = number of edges

+ Let me know if you want visual charts, MCQs, or DSA-specific complexity Q&A next.



#  Java OOPs 


Ii# ☕ Java OOPs Concepts - Classes, Objects, Constructors, Methods & `this` Keyword

This document explains the core **Object-Oriented Programming (OOP)** concepts in Java:

* ✅ Classes
* ✅ Objects
* ✅ Constructors (Default, Parameterized, Copy)
* ✅ Methods (Instance, Static, Overloading)
* ✅ `this` Keyword

> Learn the theory and implementation of Java fundamentals with clean, well-structured examples.

---

## 📌 Table of Contents

* [📌 Table of Contents](#-table-of-contents)
* [📘 What is a Class?](#-what-is-a-class)
* [📦 What is an Object?](#-what-is-an-object)
* [🏗️ Java Constructors](#%ef%b8%8f-java-constructors)

  * [Default Constructor](#default-constructor)
  * [Parameterized Constructor](#parameterized-constructor)
  * [Copy Constructor](#copy-constructor)
* [🖁️ `this` Keyword in Java](#-this-keyword-in-java)
* [🔧 Methods in Java](#-methods-in-java)

  * [Instance Method](#instance-method)
  * [Static Method](#static-method)
  * [Method Overloading](#method-overloading)
* [📚 Summary Table](#-summary-table)
* [📁 Folder Structure](#-folder-structure)
* [▶️ How to Run](#%e2%96%b6%ef%b8%8f-how-to-run)
* [🙌 Author](#-author)
* [📜 License](#-license)

---

## 📘 What is a Class?

A **class** in Java is a user-defined blueprint or prototype from which objects are created. It contains fields (variables) and methods to define object behavior.

```java
public class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}
```

---

## 📦 What is an Object?

An **object** is a real-world instance of a class. It holds actual data and can invoke class methods.

```java
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();    // Object created
        s1.id = 101;
        s1.name = "Chirag";
        s1.display();  // Output: 101 Chirag
    }
}
```

---

## 🏗️ Java Constructors

A **constructor** is a special method used to initialize objects. It is invoked automatically when the object is created.

### Default Constructor

```java
public class Student {
    Student() {
        System.out.println("Default constructor called.");
    }
}
```

### Parameterized Constructor

```java
public class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
```

### Copy Constructor

```java
public class Student {
    int id;
    String name;

    Student(Student s) {
        id = s.id;
        name = s.name;
    }
}
```

---

## 🖁️ `this` Keyword in Java

`this` refers to the **current object** in a class. Common uses include:

### Referring to instance variables

```java
Student(int id, String name) {
    this.id = id;
    this.name = name;
}
```

### Constructor chaining

```java
Student() {
    this(0, "Default");
}
```

---

## 🔧 Methods in Java

### Instance Method

```java
void greet() {
    System.out.println("Hello from instance method");
}
```

### Static Method

```java
static void showCollege() {
    System.out.println("XYZ College");
}
```

### Method Overloading

```java
int add(int a, int b) {
    return a + b;
}

double add(double a, double b) {
    return a + b;
}
```

---

## 📚 Summary Table

| Concept        | Description                           |
| -------------- | ------------------------------------- |
| Class          | Blueprint/template for objects        |
| Object         | Instance of a class                   |
| Constructor    | Initializes objects                   |
| `this` keyword | Refers to current class object        |
| Method         | Function that defines object behavior |

---

## 📁 Folder Structure

```
JavaOOPsConcepts/
│
├── src/
│   ├── Student.java
│   ├── Main.java
│
├── README.md
```

---

## ▶️ How to Run

### Using Command Line:

```bash
javac Student.java
javac Main.java
java Main
```

### Using an IDE:

* Open the project in IntelliJ IDEA, Eclipse, or VS Code.
* Right-click on `Main.java` and click **Run**.

---

## 🙌 Author

**Chirag Sankhe**
🎓 Java | Spring Boot | Backend Developer
📢 [LinkedIn](https://www.linkedin.com) | 🌐 Portfolio Coming Soon

---

## 📜 License

This project is open-source and available under the [MIT License](LICENSE).



# ☕ Java Polymorphism

Polymorphism is one of the four main pillars of Object-Oriented Programming (OOP) in Java. It means "many forms" and allows a method or object to behave in different ways depending on the context.

---

## 📈 Types of Polymorphism

| Type                      | Implemented Through | Compile Time / Run Time |
| ------------------------- | ------------------- | ----------------------- |
| Compile-time Polymorphism | Method Overloading  | Compile-time            |
| Runtime Polymorphism      | Method Overriding   | Run-time                |

---

## 🔢 Compile-time Polymorphism (Method Overloading)

### What is it?

Method overloading allows multiple methods in the same class with the same name but different parameters.

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

## ⏱️ Runtime Polymorphism (Method Overriding)

### What is it?

Method overriding means a subclass provides its own implementation of a method declared in the parent class.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // Output: Dog barks
    }
}
```

---

## 📅 Overloading vs Overriding

| Feature          | Overloading    | Overriding               |
| ---------------- | -------------- | ------------------------ |
| Same class       | ✅              | ❌ (requires inheritance) |
| Method signature | Changes        | Must remain the same     |
| Execution time   | Compile time   | Runtime                  |
| Binding          | Static binding | Dynamic binding          |

---

## 🔐 Can We Override These?

| Feature               | Can Be Overridden? |
| --------------------- | ------------------ |
| static methods        | ❌ No               |
| private methods       | ❌ No               |
| final methods/classes | ❌ No               |
| constructors          | ❌ No               |

---

## 🧪 Real-world Example

Think of a superclass `Vehicle` and subclasses like `Car`, `Bike`, `Truck`. Each subclass overrides a method `move()`:

```java
Vehicle v = new Bike();
v.move(); // Bike-specific implementation
```

---

## 📃 Polymorphism Interview Questions (For Freshers)

### 1. What is polymorphism in Java?

Polymorphism allows one method or object to behave differently based on context. It includes overloading and overriding.

### 2. What is method overloading?

Same method name with different parameters in the same class. Happens at compile-time.

### 3. What is method overriding?

Subclass provides specific implementation of a superclass method. Happens at runtime.

### 4. Can we override static methods?

No. Static methods are class-level, not instance-level.

### 5. What is dynamic method dispatch?

When a superclass reference calls a subclass overridden method at runtime.

### 6. Can we overload or override constructors?

Constructors can be overloaded, but not overridden (they are not inherited).

### 7. What’s the difference between overloading and overriding?

Overloading is compile-time, overriding is runtime. Overloading changes parameters, overriding keeps the same method signature.

### 8. How does polymorphism support abstraction?

By allowing abstract methods to be implemented differently in different subclasses.

### 9. Example code output:

```java
class Parent {
    void show() { System.out.println("Parent"); }
}
class Child extends Parent {
    void show() { System.out.println("Child"); }
}

Parent p = new Child();
p.show(); // Output: Child
```

---

## 📊 Summary

* Polymorphism = many forms
* Overloading = same method name, different parameters (compile time)
* Overriding = same method signature in subclass (runtime)
* Helps in code flexibility, abstraction, and reusability 

**Java Inheritance - Complete In-Depth Explanation**

---

### 1. Introduction to Inheritance

Inheritance is a core concept of Object-Oriented Programming (OOP). In Java, inheritance allows a new class (called the **child class** or **subclass**) to acquire the properties and behaviors of an existing class (called the **parent class** or **superclass**).

**Purpose of Inheritance:**

* Promotes **code reuse** (write once, use multiple times)
* Enables **polymorphism**
* Supports **method overriding**
* Facilitates code organization in a hierarchical structure

### Key Terms:

* **Superclass (Parent class):** The class being inherited from.
* **Subclass (Child class):** The class that inherits from the superclass.
* **`extends` keyword:** Used to declare inheritance in Java.

---

### 2. How Inheritance Works in Java

When a subclass inherits from a superclass:

* It **automatically gets access** to all `public` and `protected` members (fields and methods) of the superclass.
* **Constructors are not inherited** but the subclass can call the constructor using `super()`.
* The subclass can **override** the superclass methods.

### Example:

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.bark(); // Subclass method
    }
}
```

---

### 3. Types of Inheritance in Java

#### a) Single Inheritance

A subclass inherits from a single superclass.

```java
class A {
    void show() { System.out.println("Class A"); }
}

class B extends A {
    void display() { System.out.println("Class B"); }
}
```

#### b) Multilevel Inheritance

A subclass inherits from a class, which itself is a subclass of another class.

```java
class A {
    void showA() { System.out.println("Class A"); }
}

class B extends A {
    void showB() { System.out.println("Class B"); }
}

class C extends B {
    void showC() { System.out.println("Class C"); }
}
```

#### c) Hierarchical Inheritance

Multiple subclasses inherit from one superclass.

```java
class Parent {
    void speak() { System.out.println("Parent speaks"); }
}

class Child1 extends Parent {
    void cry() { System.out.println("Child1 cries"); }
}

class Child2 extends Parent {
    void laugh() { System.out.println("Child2 laughs"); }
}
```

#### ❌ d) Multiple Inheritance (Not supported via classes)

Java does not support multiple inheritance with classes to avoid ambiguity (Diamond Problem).

#### ✅ e) Interface-Based Multiple Inheritance

Java allows multiple inheritance using interfaces.

```java
interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() { System.out.println("Show from A"); }
    public void display() { System.out.println("Display from B"); }
}
```

---

### 4. `super` Keyword in Java

The `super` keyword refers to the immediate parent class.

#### Uses of `super`:

* Call the **parent class constructor**
* Call the **parent class method**
* Access the **parent class variable**

#### Example:

```java
class Animal {
    String color = "White";
    
    Animal() {
        System.out.println("Animal constructor called");
    }
    
    void display() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    String color = "Black";

    Dog() {
        super(); // Calls Animal constructor
    }

    void printColor() {
        System.out.println(super.color); // Access parent class variable
    }

    void display() {
        super.display(); // Call parent class method
        System.out.println("Dog eats bones");
    }
}
```

---

### 5. Access Modifiers in Inheritance

#### a) `public`

* Accessible from **anywhere**
* Fully inheritable

#### b) `protected`

* Accessible within the **same package** or **subclass in other packages**
* Inheritable

#### c) `default` (no modifier)

* Accessible only within the **same package**
* Inheritable only if subclass is in the same package

#### d) `private`

* Accessible only within the **same class**
* **Not inherited** by subclasses

#### Access Table:

| Modifier  | Same Class | Same Package | Subclass (same pkg) | Subclass (diff pkg) | Other Class |
| --------- | ---------- | ------------ | ------------------- | ------------------- | ----------- |
| public    | ✅          | ✅            | ✅                   | ✅                   | ✅           |
| protected | ✅          | ✅            | ✅                   | ✅                   | ❌           |
| default   | ✅          | ✅            | ✅                   | ❌                   | ❌           |
| private   | ✅          | ❌            | ❌                   | ❌                   | ❌           |

---

### 6. Constructor Behavior in Inheritance

* Constructors are **not inherited**.
* The subclass constructor calls the superclass constructor using `super()`.
* If no constructor is explicitly defined, Java inserts a default `super()` call.

---

### 7. Method Overriding in Inheritance

* Subclass can override the method of its parent class using the same method signature.
* Use `@Override` annotation.

```java
class Parent {
    void message() {
        System.out.println("Message from Parent");
    }
}

class Child extends Parent {
    @Override
    void message() {
        System.out.println("Message from Child");
    }
}
```

---

### 8. Final Keyword and Inheritance

* `final class`: cannot be extended.
* `final method`: cannot be overridden.
* `final variable`: value cannot be changed.

```java
final class A {
    // Cannot be subclassed
}

class B {
    final void show() {
        System.out.println("Final method");
    }
}
```

---

### 9. Interview Questions

**Java Inheritance - Interview Questions and Answers**

---

### 1. What is inheritance in Java and why is it used?

Inheritance is a feature of object-oriented programming where a class (child/subclass) inherits fields and methods from another class (parent/superclass).

**Why it's used:**

* Code **reusability**
* Improves **maintainability**
* Promotes **hierarchical classification**
* Enables **polymorphism**

Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

---

### 2. Explain different types of inheritance in Java.

| Type             | Description                                | Supported in Java        |
| ---------------- | ------------------------------------------ | ------------------------ |
| **Single**       | One subclass inherits one superclass       | Yes                      |
| **Multilevel**   | A subclass inherits another subclass       | Yes                      |
| **Hierarchical** | Multiple subclasses inherit one superclass | Yes                      |
| **Multiple**     | One class inherits from multiple classes   | No                       |
| **Hybrid**       | Combination of above types                 | Partially via interfaces |

---

### 3. Why multiple inheritance is not supported in Java?

Java doesn't support multiple inheritance using **classes** to avoid **ambiguity/conflicts**, especially with the **Diamond Problem**.

---

### 4. How is multiple inheritance achieved in Java?

Through **interfaces**. Interfaces only define method signatures (no implementation), hence no conflict arises.

Example:

```java
interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    public void show() {
        System.out.println("Multiple inheritance using interfaces");
    }
}
```

---

### 5. What is method overriding and how does it relate to inheritance?

Method overriding is when a subclass **provides a specific implementation** of a method already defined in the superclass.

Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```

---

### 6. What is the role of `super` in inheritance?

* Access **parent class methods/variables**
* Call **parent class constructor**

Example:

```java
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls Animal constructor
        System.out.println("Dog constructor");
    }
}
```

---

### 7. How do access modifiers affect inheritance?

| Modifier    | Inherited? | Accessible in subclass?        |
| ----------- | ---------- | ------------------------------ |
| `public`    | Yes        | Yes                            |
| `protected` | Yes        | Yes (same package or subclass) |
| `default`   | Yes        | Yes (only in same package)     |
| `private`   | No         | No                             |

---

### 8. What happens if no constructor is defined in a subclass?

If a subclass doesn't define a constructor, Java automatically inserts a **default no-arg constructor** and calls the **superclass’s no-arg constructor**.

---

### 9. Can constructors be inherited in Java?

No, constructors are **not inherited** in Java. However, a subclass can call a superclass constructor using `super()`.

---

### 10. What is the purpose of the `final` keyword with respect to inheritance?

* `final` **class**: Cannot be extended

```java
final class A { }
class B extends A { } // Error
```

* `final` **method**: Cannot be overridden

```java
class A {
    final void show() { }
}
class B extends A {
    void show() { } // Error
}
```

---



### Java Access Modifiers – Interview Questions & Answers

---

#### 1. What are Access Modifiers in Java?

**Answer:**
Access modifiers in Java define the **scope and visibility** of classes, methods, and variables. They control where the members of a class can be accessed.

Java provides four types of access modifiers:

* `public`
* `protected`
* `default` (no keyword)
* `private`

---

#### 2. What are the different types of access modifiers in Java?

| Modifier    | Accessible within Class | Same Package | Subclass (any package) | Anywhere |
| ----------- | ----------------------- | ------------ | ---------------------- | -------- |
| `public`    | ✅                       | ✅            | ✅                      | ✅        |
| `protected` | ✅                       | ✅            | ✅                      | ❌        |
| (default)   | ✅                       | ✅            | ❌                      | ❌        |
| `private`   | ✅                       | ❌            | ❌                      | ❌        |

---

#### 3. What is the default access modifier in Java?

**Answer:**
If no access modifier is specified, Java applies the **default (package-private)** access modifier, which means the member is accessible **only within the same package**.

---

#### 4. Can a class be declared private in Java?

**Answer:**
**Top-level classes** **cannot** be `private` or `protected`. They can only be:

* `public` or
* default (package-private)

Only **nested (inner) classes** can be declared `private`.

---

#### 5. What is the difference between private and protected access modifiers?

| `private`                         | `protected`                                   |
| --------------------------------- | --------------------------------------------- |
| Accessible only in the same class | Accessible in the same package and subclasses |
| Cannot be inherited               | Can be inherited                              |

---

#### 6. Can private members be accessed in subclasses?

**Answer:**
No. **Private members are not inherited**, hence cannot be accessed directly in subclasses, even in the same package.

---

#### 7. What does the `protected` access modifier allow that default does not?

**Answer:**
`protected` members are accessible in:

* the **same package**
* **subclasses** even if they are in **different packages**

Whereas default (package-private) is restricted to the **same package only**.

---

#### 8. Can we reduce the visibility of a method while overriding it?

**Answer:**
**No.** Java does **not allow reducing visibility** when overriding a method.
For example:

```java
public class Parent {
    public void show() {}
}

public class Child extends Parent {
    // This would cause a compile-time error
    private void show() {}
}
```

---

#### 9. Can constructors be `protected` or `private`?

**Answer:**
Yes:

* A `private` constructor is used in **Singleton** or **Factory** patterns.
* A `protected` constructor is often used in **inheritance control**.

---

#### 10. When would you use a `private` constructor?

**Answer:**
To prevent instantiation from outside the class, such as in:

* Singleton pattern
* Utility/helper classes

### 🔐 Encapsulation in Java – Explained

#### ✅ What is Encapsulation?

Encapsulation is one of the four fundamental Object-Oriented Programming (OOP) concepts in Java. It refers to **wrapping data (variables) and code (methods) together into a single unit**, i.e., a class, and **restricting direct access** to some of the object's components.

In simple terms, **encapsulation = data hiding**.

---
### 🔐 Encapsulation in Java – Explained

#### ✅ What is Encapsulation?

Encapsulation is one of the four fundamental Object-Oriented Programming (OOP) concepts in Java. It refers to **wrapping data (variables) and code (methods) together into a single unit**, i.e., a class, and **restricting direct access** to some of the object's components.

In simple terms, **encapsulation = data hiding**.

---

#### ✅ Why Use Encapsulation?

1. **Protects data from unauthorized access.**
2. **Increases security** by controlling access through getters/setters.
3. **Improves maintainability** by isolating internal code from external changes.
4. **Helps in achieving loose coupling** between components of the system.

---

#### ✅ How is Encapsulation Achieved in Java?

1. Declare variables of a class as `private`.
2. Provide `public` getter and setter methods to access and update the value of private variables.

---

#### 𞲾 Example:

```java
public class Student {
    // Step 1: private data members
    private String name;
    private int age;

    // Step 2: public getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}
```

#### 🔍 Usage:

```java
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Chirag");
        s.setAge(25);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
```

---

#### ✅ Advantages of Encapsulation:

* Protects the integrity of the data.
* Makes code more flexible and easier to manage.
* Simplifies unit testing.
* Provides control over data via business logic inside setters.

---

#### 📌 Real-life Analogy:

Think of a **capsule** – it contains medicine inside a shell. You can only access the medicine in a controlled way. Similarly, in Java, an object encapsulates data and restricts direct access to it.

---

### 🧩 Abstraction in Java – Explained

#### ✅ What is Abstraction?

**Abstraction** is an OOP concept that focuses on hiding complex implementation details and showing only the **essential features** of an object.

It allows us to **focus on what an object does** instead of how it does it.

---

#### ✅ Why Use Abstraction?

1. **Reduces complexity** by hiding internal implementation.
2. **Improves code reusability** and scalability.
3. **Supports loose coupling**.
4. **Enhances maintainability and flexibility**.

---

#### ✅ How is Abstraction Achieved in Java?

1. Using **Abstract Classes**
2. Using **Interfaces**

---

#### 𞲾 Example Using Abstract Class:

```java
abstract class Animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Bark
        myDog.eat();        // This animal eats food.
    }
}
```

---

#### ✅ Example Using Interface:

```java
interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.drive();  // Car is driving
    }
}
```

---

#### ✅ Why Use Abstract Methods If Users Don't See Them?

Even though **users don't directly see** or interact with methods like `abstract void makeSound();`, these methods are **crucial for developers** designing reusable, flexible systems.

##### 🔧 Developer’s View:

An **abstract method**:

* Forces subclasses (like `Dog`, `Cat`) to **implement behavior**.
* Provides a **common interface or contract** so that objects can be treated uniformly.

##### 🧑‍💻 User’s View:

A user (or another part of the code) might only see:

```java
Animal animal = new Dog();
animal.makeSound();  // Output: Bark
```

They **don't care** about `abstract void makeSound();` — they just know the `Dog` makes a sound.

##### ✅ Why It's Useful:

* Encourages **consistency** in child classes.
* Enables **polymorphism**: code can use `Animal` references to call methods, even if it doesn’t know the specific subclass.
* Separates **what should happen** from **how it happens** — a core principle of **abstraction**.

---

#### ✅ Key Differences Between Abstraction and Encapsulation:

| Feature          | Abstraction                       | Encapsulation                      |
| ---------------- | --------------------------------- | ---------------------------------- |
| Purpose          | Hides implementation details      | Hides internal data (data hiding)  |
| Achieved through | Abstract classes and interfaces   | Access modifiers + getters/setters |
| Focus            | What an object does               | How data is accessed/modified      |
| Example          | Animal abstraction, Vehicle, etc. | Private fields with public methods |

---

#### 📌 Real-life Analogy:

Think of a **TV remote** – you can press buttons to change channels or adjust volume, but you don’t know or care how the circuit inside works. That’s abstraction!

---

### 🧠 Interview Questions on Abstraction

1. **What is abstraction in Java?**

   * Abstraction is a concept that hides internal implementation details and shows only the essential features to the user.

2. **How is abstraction implemented in Java?**

   * Using abstract classes and interfaces.

3. **Why do we use abstract methods if users never directly call them?**

   * Abstract methods provide a standard structure for subclasses to implement. They help enforce consistency and enable polymorphism.

4. **What is the difference between abstract class and interface?**

   * Abstract class can have both abstract and concrete methods, while interfaces can only have abstract methods (prior to Java 8). From Java 8 onward, interfaces can have default and static methods.

5. **Can we create an object of an abstract class?**

   * No, we cannot instantiate an abstract class directly.

6. **Can an abstract class have a constructor?**

   * Yes, it can. The constructor is called when a subclass is instantiated.

7. **When should you use an abstract class over an interface?**

   * Use abstract classes when you want to share code among closely related classes. Use interfaces to define a contract for unrelated classes.

8. **Can a class be both abstract and final?**

   * No, an abstract class must be extended, while a final class cannot be extended. Hence, they are contradictory.

9. **Can we have an abstract method in a non-abstract class?**

   * No, if a class contains an abstract method, it must be declared abstract.

10. **What happens if a subclass does not implement all abstract methods of the parent abstract class?**

* Then the subclass must also be declared abstract.
---
# arrayList

### 1. What is an ArrayList?
+ ArrayList is a resizable array in Java.

+ It belongs to the java.util package.

+ Unlike normal arrays, its size can grow and shrink dynamically when elements are added or removed.

+ It stores elements in order (insertion order) and allows duplicates.

### 2. Array vs ArrayList
|Feature|	Array	|ArrayList|
|---------|----------|-----------|
|Size |	Fixed|	Dynamic  (resizes automatically)|
|Data |type	Can store primitives and objects |	Can only store objects (primitives are wrapped in wrapper classes)|
|Performance|	Fast for fixed-size data |	Slightly slower due to resizing and shifting|
|Memory	|Fixed	|May use extra memory for capacity growth|

### 3. Internal Working of ArrayList
+ Internally, ArrayList uses a normal array (Object[]) to store elements.

+ Default capacity = 10.

+ When you add elements beyond its capacity:

+ It creates a new array with 1.5x the old capacity (in Java 8+).

+ Copies old elements into the new array.

+ Index-based access is O(1) (just like arrays).

+ Insertion/deletion in middle is O(n) (because elements must shift).

### 4. Declaration & Initialization
```
import java.util.ArrayList;

ArrayList<Integer> list1 = new ArrayList<>(); // Default capacity 10
ArrayList<String> list2 = new ArrayList<>(20); // Custom capacity
```
### 5. Common Methods
|Method |	Description|
|--------|-----------|
|add(E e) |	Adds element at end|
|add(int index, E e) |	Adds at specific index|
|get(int index) |	Returns element at index|
|set(int index, E e) |	Replaces element at index|
|remove(int index)	 |Removes element at index|
|remove(Object o)	 |Removes first occurrence|
|size()	|Returns number of elements|
|contains(Object o) |	Checks if element exists|
|clear()|	Removes all elements|
|isEmpty()	|Checks if list is empty|

#### 6. Example
```
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Insert at index
        fruits.add(1, "Orange");

        // Access
        System.out.println(fruits.get(2)); // Mango

        // Replace
        fruits.set(2, "Grapes");

        // Remove by index
        fruits.remove(0);

        // Remove by object
        fruits.remove("Orange");

        // Loop through
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```
### 7. Time Complexity
|Operation	|Time Complexity|
|---------|------------------|
|Get / Set |	O(1)|
|Add at end	|O(1) amortized|
|Add at index	|O(n)|
|Remove at index	|O(n)|
|Search by index	|O(1)|
|Search by value|	O(n)|

### 8. Advantages
+ ✅ Dynamic resizing
+ ✅ Easy to use (many built-in methods)
+ ✅ Fast random access (O(1) time)

### 9. Disadvantages
+ ❌ Slower for inserting/removing in middle (O(n) due to shifting)
+ ❌ Uses more memory than arrays (due to capacity buffer)
+ ❌ Not thread-safe (use Collections.synchronizedList or CopyOnWriteArrayList for multi-threading)

---
# Strings
### 1. Basics of Strings

+ String is a `class` , `not a primitive `type.

### Can be created in two ways:

+ String s1 = "Hello"; // String literal
+ String s2 = new String("Hello"); // Using 'new' keyword

### 2. Immutability

+ Once created, a String cannot be changed.

+ Modifying a String creates a new object.

```
String s = "Java";
s.concat(" World");
System.out.println(s); // Still "Java"
```
### 3. String Pool

+ String literals are stored in a special memory area called the `String Constant Pool` (SCP).

If a literal already exists, Java reuses it

## Java String Methods Cheat Sheet

## Creation
- `String s = "Hello";`
- `String s = new String("Hello");`

## Length & Access
- `length()` – number of characters  
- `charAt(int index)` – character at given index  

## Comparison
- `equals(String)` – content equals (case-sensitive)  
- `equalsIgnoreCase(String)` – ignores case  
- `compareTo(String)` – lexicographical compare  
- `compareToIgnoreCase(String)` – ignores case in compare  

## Case Conversion
- `toUpperCase()` – all caps  
- `toLowerCase()` – all lowercase  

## Substring & Search
- `substring(int beginIndex)` – from index to end  
- `substring(int beginIndex, int endIndex)` – range  
- `indexOf(String)` – first occurrence  
- `lastIndexOf(String)` – last occurrence  
- `contains(CharSequence)` – true if found  
- `startsWith(String)` – check prefix  
- `endsWith(String)` – check suffix

## Substring & Search

### 1. `substring(int beginIndex)`
Returns the substring from the given index to the end.
```
String str = "Java Programming";
System.out.println(str.substring(5));
```
+  Output: Programming
### 2. substring(int beginIndex, int endIndex)
Returns the substring between beginIndex (inclusive) and endIndex (exclusive).
```

String str = "Java Programming";
System.out.println(str.substring(0, 4));
```
// Output: Java
### 3. indexOf(String)
Returns the index of the first occurrence, or -1 if not found.
```
String str = "Java Programming";
System.out.println(str.indexOf("Pro"));
```
// Output: 5
### 4. lastIndexOf(String)
Returns the index of the last occurrence, or -1 if not found.
```
String str = "Java Programming Java";
System.out.println(str.lastIndexOf("Java"));
```
// Output: 17
### 5. contains(CharSequence)
Checks if the String contains the given sequence.
```
String str = "Java Programming";
System.out.println(str.contains("Java")); // true
System.out.println(str.contains("Python")); // false
```
### 6. startsWith(String)
Checks if the String starts with the given prefix.

```
String str = "Java Programming";
System.out.println(str.startsWith("Java")); // true
System.out.println(str.startsWith("Pro")); // false
```
### 7. endsWith(String)
Checks if the String ends with the given suffix.
```
String str = "Java Programming";
System.out.println(str.endsWith("ming")); // true
System.out.println(str.endsWith("Java")); // false

```

## Modification (creates new String)
- `concat(String)` – join strings  
- `replace(char old, char new)` – replace chars  
- `replace(CharSequence old, CharSequence new)` – replace words  
- `replaceAll(String regex, String replacement)` – regex replace  
- `replaceFirst(String regex, String replacement)` – regex replace first match  
- `trim()` – remove spaces at start/end  
- `strip()` – remove all Unicode whitespaces  
- `stripLeading()` – remove leading spaces  
- `stripTrailing()` – remove trailing spaces  

### 1. concat(String) – join strings
```
String s1 = "Java";
String s2 = " World";
String result = s1.concat(s2);
System.out.println(result); // Java World
```

+ Joins two strings (creates a new one).

### 2. replace(char old, char new) – replace characters
```
String str = "Java";
String replaced = str.replace('a', 'o');
System.out.println(replaced); // Jovo
```

+ Replaces all occurrences of a character.

### 3. replace(CharSequence old, CharSequence new) – replace words/substrings
```
String str = "Java is fun. Java is powerful.";
String replaced = str.replace("Java", "Python");
System.out.println(replaced); // Python is fun. Python is powerful.
```

+ Replaces all occurrences of a word or substring.

### 4. replaceAll(String regex, String replacement) – regex replace
```
String str = "Java123Programming456";
String replaced = str.replaceAll("\\d+", " "); // replace digits with space
System.out.println(replaced); // Java Programming
```

+ Uses regular expressions for matching.

### 5. replaceFirst(String regex, String replacement) – regex replace first match
```
String str = "one two one two";
String replaced = str.replaceFirst("one", "ONE");
System.out.println(replaced); // ONE two one two
```

+ Replaces only the first match found.

### 6. trim() – remove spaces at start/end (ASCII spaces only)
```
String str = "   Hello World   ";
System.out.println(str.trim()); // "Hello World"
```
### 7. strip() – remove all Unicode whitespaces at start/end
```
String str = "\u2002\u2003Hello World\u2002"; // has Unicode spaces
System.out.println(str.strip()); // "Hello World"
```
### 8. stripLeading() – remove leading (start) whitespaces
```
String str = "   Hello World   ";
System.out.println(str.stripLeading()); // "Hello World   "
```
### 9. stripTrailing() – remove trailing (end) whitespaces
```
String str = "   Hello World   ";
System.out.println(str.stripTrailing()); // "   Hello World"
```
## Splitting & Joining
- `split(String regex)` – split into array  
- `String.join(CharSequence delimiter, elements…)` – join elements  

## Checking
- `isEmpty()` – true if length == 0  
- `isBlank()` – true if empty or whitespace only  
- `matches(String regex)` – regex match  

## Conversion
- `valueOf(anyType)` – convert to String  
- `toCharArray()` – convert to char[]  
- `getBytes()` – byte representation  
- `intern()` – put in String pool  
"""

### Java String Interview Questions & Answers
### 1. What is a String in Java?

+ A String is an object of the String class that represents a sequence of characters.
+ It’s immutable, meaning once created, it cannot be changed.

### 2. Difference between String, StringBuilder, and StringBuffer
|Feature | 	String	 | StringBuilder | 	StringBuffer  |
|---------|------------|------------|-----------------------|
|Mutability |	No	 |Yes |	Yes |
|Thread-safe |	Yes |	No	 |Yes |
|Performance	 |Slow  |for changes	Fast |	Slower than StringBuilder |
|Usage	 |When text is fixed |	When modifying often (single thread) |	When modifying often (multi-thread) |
## 3. Why are Strings immutable in Java?

+ For security (used in passwords, URLs)

+ For thread safety (shared between threads)

+ For caching in String Pool (reuse without modification)

+ To allow safe use in hash-based collections (HashMap keys)

## 4. What is the String Constant Pool (SCP)?

+ A special memory area where Java stores string literals to save memory.
+ If a literal already exists, Java reuses it instead of creating a new object.

Example:
```
String s1 = "Java";
String s2 = "Java";
System.out.println(s1 == s2); // true (same SCP reference)
```
### 5. Difference between == and .equals() in Strings

+ == → compares references (memory addresses)

+ .equals() → compares content
```
String a = "Java";
String b = new String("Java");
System.out.println(a == b); // false
System.out.println(a.equals(b)); // true
```
### 6. How to create a String in Java?

+ String literal (uses SCP)

+ String s = "Hello";

+ Using new keyword (creates a new object in heap)

+ String s = new String("Hello");

### 7. What does .intern() do?

+ Moves the string to the SCP and returns its reference if not already present.
```
String s1 = new String("Java");
String s2 = s1.intern();
String s3 = "Java";
System.out.println(s2 == s3); // true
```
### 8. How to reverse a String in Java?
```
String str = "Java";
String reversed = new StringBuilder(str).reverse().toString();
System.out.println(reversed); // avaJ
```
### 9. How to check if a String is a palindrome?
```
String str = "madam";
boolean isPalindrome = str.equals(new StringBuilder(str).reverse().toString());
System.out.println(isPalindrome); // true
```
### 10. Difference between replace() and replaceAll()

+ replace() → works with char or CharSequence (no regex)

+ replaceAll() → works with regex
```
System.out.println("Java123".replace("123", "")); // Java
System.out.println("Java123".replaceAll("\\d+", "")); // Java
```
### 11. What is matches() in String?

+ Checks if the string matches a regex.
```
System.out.println("Java123".matches("Java\\d+")); // true
```
### 12. How to split a String in Java?
```
String csv = "apple,banana,grape";
String[] fruits = csv.split(",");
for (String f : fruits) {
    System.out.println(f);
}
```

### 13. How to convert between String and other types?
// String to int
```
int num = Integer.parseInt("123");
```
// int to String
```
String numStr = String.valueOf(123);
```
### memory ,  intern() , new 

### 1. String Storage Locations

+ Java stores Strings in two places:

#### a) Heap Memory

+ All String objects (including those created with new String()) live in the heap.

+ Mutable objects like StringBuilder and StringBuffer are also in the heap.

###  b) String Constant Pool (SCP)

+ A special part of the heap.

+ Stores string literals for reusability.

+ If the same literal exists, Java reuses the reference instead of creating a new object.

2. Example
```
String s1 = "Java";            // Goes into SCP
String s2 = "Java";            // Points to the same SCP object
String s3 = new String("Java");// Creates a new object in heap (not in SCP)
```

### Memory diagram:
```
Heap:
   [s3: Java]  ← new String("Java")

SCP:
   [Java] ← shared by s1 and s2

```
#### 3. Immutability and Memory

Strings are immutable — any change creates a new object:
```
String s = "Hello";
s.concat(" World");
System.out.println(s); // Hello (unchanged)
```

Memory after concat:

SCP:
```
   [Hello]
   [Hello World] ← created new, but unused unless assigned
```
### 4. intern() Method

Moves or returns a String from SCP:
```
String s1 = new String("Java");
String s2 = s1.intern();
String s3 = "Java";
System.out.println(s2 == s3); // true
```
### 5. Performance Tip

+ String literals are faster and memory-efficient.

+ Use `StringBuilder` or `StringBuffer`  if you modify strings frequently (avoids creating many objects).

+ If you want, I can draw you a full


### 1. == (Reference Comparison)

+ Checks whether two references point to the same object in memory.

+ Does not compare the content of the strings.

Example:
```
String s1 = "Java";
String s2 = "Java";
System.out.println(s1 == s2); // true (same SCP reference)

String s3 = new String("Java");
System.out.println(s1 == s3); // false (different objects in memory)
```
### 2. .equals() (Content Comparison)

Defined in String class to compare the actual text inside strings.

Returns true if the sequence of characters matches, regardless of memory location.

Example:
```
String s1 = "Java";
String s3 = new String("Java");

System.out.println(s1.equals(s3)); // true (content matches)
```
### 3. Combined Example
```
String a = "hello";
String b = "hello";
String c = new String("hello");

System.out.println(a == b);       // true  (same SCP object)
System.out.println(a.equals(b));  // true  (same content)

System.out.println(a == c);       // false (different memory)
System.out.println(a.equals(c));  // true  (same content)
```
##   immutability

### 🔹 What does immutability mean?

+ `Immutable` = cannot be changed after creation.

+ In Java, String objects are immutable — once you create a String, its value cannot be modified.

+ Any "change" you do (like concatenation, replace, etc.) will actually create a new String object in memory.

🔹 Example
```
String s1 = "Java";
s1.concat(" World");

System.out.println(s1);
```
// Output: Java


+ 👉 Even though we called concat(), s1 is still "Java" because a new string "Java World" was created, but s1 still points to "Java".

### 🔹 Correct way to update
```
String s1 = "Java";
s1 = s1.concat(" World"); // assign new object back to s1
System.out.println(s1);   // Output: Java World
```
### 🔹 Why are Strings immutable?

#### Security

+ Strings are often used for sensitive data (like usernames, passwords, URLs).

+ If mutable, someone could change your password string value after authentication.

### String Pool (SCP)

Because Strings are immutable, they can be shared in the String Constant Pool safely without risk of being changed by another reference.

### Thread-safety

+ Immutable objects can be shared among multiple threads without synchronization issues.

+ Caching & Performance

+ Hashcode of a String is cached (since it won’t change), so Strings work faster as keys in HashMap, HashSet.

🔹 Example: Why immutability is useful
```
String a = "Hello";
String b = a;

a = a.concat(" World");

System.out.println(a); // Hello World
System.out.println(b); // Hello
````

+ 👉 b stays unchanged because "Hello" was not modified; a new object was created for "Hello World".

✅ In summary:

+ Strings in Java are immutable.

+ Any modification creates a new object.

## 📘 StringBuilder in Java

+ `StringBuilder` is a mutable sequence of characters.

+ Unlike String, you can change content without creating new objects.

+ Faster when you do lots of modifications (append, insert, delete, etc.).

+ Not thread-safe (for single-threaded performance).

+ 👉 For thread-safe version → use StringBuffer.

### 🔹 Commonly Used StringBuilder Methods with Examples
```
public class StringBuilderDemo {
    public static void main(String[] args) {
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

```
### 🔹 Output
```
append: Hello World
insert: Hello Java World
delete: Hello World
deleteCharAt: HelloWorld
replace: Hello Java
setCharAt: hello Java
reverse: avaJ olleh
length: 10
capacity: 21
charAt(2): a
substring: avaJ
capacity after ensureCapacity: 50
```
### 🔹 Summary Table
|Method	 | Description|
|----------|------------------|
|append(str) |	Add string at end|
|insert(index, str)	| Insert string at index |
|delete(start, end)	| Delete characters in range |
|deleteCharAt(index)	| Delete single character |
|replace(start, end, str)	|Replace part with new string|
|setCharAt(index, ch) |	Change character at position|
|reverse()	| Reverse the sequence|
|length() |	Number of characters|
|capacity()	|Buffer size (can grow)|
|charAt(index)|	Get char at index|
|substring(start, end)|	Extract substring (returns String)|
|ensureCapacity(min) |	Ensure buffer size| 

### ⚡ Key difference:
```
String → immutable, every change creates a new object.
StringBuilder → mutable, modifies in place (faster for lots of changes).
```
---
ChatGPT can
---
## Recursion
### 1. What is Recursion?

+ Recursion is when a function calls itself directly or indirectly to solve a problem.

#### A recursive function must have:

+ `Base case` → condition to stop recursion.

+ `Recursive case` → function calls itself for a smaller problem.

#### 2. How Recursion Works (Stack Concept)

+ Every time a function is called:

+ A new stack frame is created in memory.

+ The function execution is paused until the recursive call finishes.

+ After reaching the base case, the stack unwinds (returns back step-by-step).


### 1. Direct Recursion

+ Definition: A function calls itself directly.

Example:
```
public class DirectRecursion {
    static void printNumbers(int n) {
        if (n == 0) return; // Base case
        System.out.println(n);
        printNumbers(n - 1); // Directly calls itself
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
```

Output:
```

5
4
3
2
1
```
### 2. Indirect Recursion

 + Definition: Function A calls function B, and function B calls function A.

Example:
```
public class IndirectRecursion {
    static void functionA(int n) {
        if (n <= 0) return;
        System.out.println("A: " + n);
        functionB(n - 1); // Calls functionB
    }

    static void functionB(int n) {
        if (n <= 0) return;
        System.out.println("B: " + n);
        functionA(n - 2); // Calls functionA
    }

    public static void main(String[] args) {
        functionA(5);
    }
}

```
Output:
```
A: 5
B: 4
A: 2
B: 1
```
### 3. Tail Recursion

+ Definition: The recursive call is the last statement in the function, and nothing happens after the recursive call returns.

+ Can be optimized in some languages to avoid extra stack frames (Java doesn’t do this automatically).

Example:
```
public class TailRecursion {
    static void tailPrint(int n) {
        if (n == 0) return;
        System.out.println(n);
        tailPrint(n - 1); // Last action
    }

    public static void main(String[] args) {
        tailPrint(5);
    }
}
```

Output:
```
5
4
3
2
1
```
### 4. Head Recursion

+ Definition: The recursive call happens before any other processing in the function.

Example:
```
public class HeadRecursion {
    static void headPrint(int n) {
        if (n == 0) return;
        headPrint(n - 1); // First action
        System.out.println(n); // Runs after returning
    }

    public static void main(String[] args) {
        headPrint(5);
    }
}
```

Output:
```
1
2
3
4
5
```
### Key Difference Between Head & Tail Recursion
|Feature	 | Head Recursion |	Tail Recursion|
|-----------|----------|-----------------------|
|Order of execution |	Processes after returning from recursive call |	Processes before next recursive call|
|Output  |for print(5)	1, 2, 3, 4, 5 |	5, 4, 3, 2, 1|

### 1. What is recursion?

Recursion is when a function calls itself to solve a smaller instance of the same problem until a base case is reached.

Example:
```
int factorial(int n) {
    if (n <= 1) return 1; // base case
    return n * factorial(n - 1); // recursive case
}
```

### 2. Difference between recursion and iteration
|Recursion |	Iteration |
|----------|--------------|
|Uses function calls & stack | 	Uses loops | 
|Can be more readable for divide-and-conquer  |	Usually more memory efficient |
|May cause StackOverflowError if too deep | 	No risk of stack overflow| 
### 3. What is a base case? Why important?

+ Base case stops recursion to prevent infinite calls.

+ Without it, recursion continues until stack overflow.

### 4. Types of recursion

+ Direct → function calls itself directly.

+ Indirect → function A calls B, B calls A.

+ Tail → recursive call is last statement.

+ Head → recursive call happens before other processing.

### 5. Advantages & Disadvantages

+ ✅ Simple for problems like tree traversal, backtracking.
+ ❌ Higher memory use, slower than iteration for some problems.

### 6. Factorial
```
int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
```
// factorial(5) → 120

### 7. Fibonacci
```
int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}
```
// fib(5) → 5

### 8. Sum of first N natural numbers
```
int sum(int n) {
    if (n == 0) return 0;
    return n + sum(n - 1);
}
```
// sum(5) → 15

### 9. Reverse a string
```
String reverse(String s) {
    if (s.isEmpty()) return s;
    return reverse(s.substring(1)) + s.charAt(0);
}
```
// reverse("abc") → "cba"

### 10. Length of string
```
int length(String s) {
    if (s.equals("")) return 0;
    return 1 + length(s.substring(1));
}
```
// length("hello") → 5

### 11. Max element in array
```
int max(int[] arr, int n) {
    if (n == 1) return arr[0];
    return Math.max(arr[n - 1], max(arr, n - 1));
}
```
// max([1,5,3,9], 4) → 9

### 12. Print numbers head vs tail
```
void headPrint(int n) {
    if (n == 0) return;
    headPrint(n - 1);
    System.out.print(n + " ");
}

void tailPrint(int n) {
    if (n == 0) return;
    System.out.print(n + " ");
    tailPrint(n - 1);
}
```

### 13. Palindrome check
```
boolean isPalindrome(String s, int start, int end) {
    if (start >= end) return true;
    return (s.charAt(start) == s.charAt(end)) &&
           isPalindrome(s, start + 1, end - 1);
}
```
// isPalindrome("madam", 0, 4) → true

### 14. Binary search
```
int binarySearch(int[] arr, int left, int right, int key) {
    if (left > right) return -1;
    int mid = (left + right) / 2;
    if (arr[mid] == key) return mid;
    if (key < arr[mid]) return binarySearch(arr, left, mid - 1, key);
    return binarySearch(arr, mid + 1, right, key);
}
```

### 15. Count occurrences
```
int count(int[] arr, int n, int x) {
    if (n == 0) return 0;
    return (arr[n - 1] == x ? 1 : 0) + count(arr, n - 1, x);
}
// count([1,2,3,2], 4, 2) → 2

16. Tower of Hanoi
void hanoi(int n, char from, char to, char aux) {
    if (n == 1) {
        System.out.println("Move disk 1 from " + from + " to " + to);
        return;
    }
    hanoi(n - 1, from, aux, to);
    System.out.println("Move disk " + n + " from " + from + " to " + to);
    hanoi(n - 1, aux, to, from);
}
```

### 17. Subsets (Power set)
```
void subsets(String s, String current, int index) {
    if (index == s.length()) {
        System.out.println(current);
        return;
    }
    subsets(s, current + s.charAt(index), index + 1);
    subsets(s, current, index + 1);
}
```
### 18. Permutations
```
void permute(String s, String ans) {
    if (s.isEmpty()) {
        System.out.println(ans);
        return;
    }
    for (int i = 0; i < s.length(); i++) {
        permute(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
    }
}

```
### 19. N-Queens

(Backtracking + recursion, bit long — usually asked for conceptual understanding.)

### 20. Maze paths
```
void maze(int row, int col, String path) {
    if (row == 1 && col == 1) {
        System.out.println(path);
        return;
    }
    if (row > 1) maze(row - 1, col, path + "D");
    if (col > 1) maze(row, col - 1, path + "R");
}
```
# 2D array 
### 📌 1. What is a 2D Array in Java?

A 2D array is like a matrix — a collection of data arranged in rows and columns.

Declaration
```
int[][] arr;        // ✅ Preferred
int arr[][];        // ✅ Also valid
````
Initialization
```
int[][] arr = new int[3][4]; // 3 rows, 4 columns
```

Here:

+ arr.length → 3 → number of rows

+ arr[0].length → 4 → number of columns

### 📌 2. Ways to Initialize a 2D Array
#### a) Static Initialization
```
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### b) Dynamic Initialization (Using Loops)
```
int[][] arr = new int[2][3];
arr[0][0] = 10;
arr[0][1] = 20;
arr[1][0] = 30;
arr[1][1] = 40;
```

### 📌 3. Traversing a 2D Array
Using Nested Loops
```
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

### 📌 4. Input from User
```
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
```

### 📌 5. Common Interview Questions on 2D Arrays
#### Q1. Find the Sum of All Elements
```
int sum = 0;
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
    }
}
System.out.println("Sum = " + sum);
```
#### Q2. Search for an Element
```
int target = 5;
boolean found = false;

for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == target) {
            System.out.println("Found at: " + i + "," + j);
            found = true;
            break;
        }
    }
}
```
if (!found) System.out.println("Not Found");

#### Q3. Print Transpose of a Matrix

+ Transpose → Rows become columns and columns become rows.

+ int[][] transpose = new int[arr[0].length][arr.length];
```
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
        transpose[j][i] = arr[i][j];
    }
}
```
#### Q4. Rotate Matrix by 90 Degrees
+ Approach

+ Take transpose

+ Reverse each row
```
// Step 1: Transpose

for (int i = 0; i < arr.length; i++) {
    for (int j = i; j < arr[0].length; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}

// Step 2: Reverse each row

for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length / 2; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[i][arr[0].length - j - 1];
        arr[i][arr[0].length - j - 1] = temp;
    }
}
```
### Q5. Spiral Order Traversal

Given a matrix, print elements in spiral order.
```
List<Integer> spiral = new ArrayList<>();
int minr = 0, minc = 0;
int maxr = arr.length - 1;
int maxc = arr[0].length - 1;

while (minr <= maxr && minc <= maxc) {
    for (int j = minc; j <= maxc; j++) spiral.add(arr[minr][j]);
    minr++;

    for (int i = minr; i <= maxr; i++) spiral.add(arr[i][maxc]);
    maxc--;

    if (minr <= maxr) {
        for (int j = maxc; j >= minc; j--) spiral.add(arr[maxr][j]);
        maxr--;
    }

    if (minc <= maxc) {
        for (int i = maxr; i >= minr; i--) spiral.add(arr[i][minc]);
        minc++;
    }
}
```
System.out.println(spiral);

#### Q6. Find Row with Maximum Sum
int maxSum = Integer.MIN_VALUE;
int rowIndex = -1;
```
for (int i = 0; i < arr.length; i++) {
    int sum = 0;
    for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
    }
    if (sum > maxSum) {
        maxSum = sum;
        rowIndex = i;
    }
}
```
System.out.println("Row " + rowIndex + " has max sum = " + maxSum);

### Q7. Count Zeros and Ones in a Binary Matrix
```
int zeros = 0, ones = 0;

for (int[] row : arr) {
    for (int num : row) {
        if (num == 0) zeros++;
        else if (num == 1) ones++;
    }
}
```
System.out.println("Zeros = " + zeros + ", Ones = " + ones);

📌 6. Frequently Asked Interview Questions
|Question |	Concept Tested |
|--------|-----------------------|
|Find the sum of all elements |	Basic traversal |
|Search for an element	 |Linear search in 2D array|
|Transpose a matrix	|Index manipulation|
|Rotate matrix 90 degrees	|Transpose + reverse|
|Spiral order traversal |	Boundary management|
|Find row column with max sum	|Nested loops and tracking max|
|Count zeros and ones |in binary matrix	Simple traversal|
|Diagonal sum in square | matrix	Index handling|

---

## Types of Sorting in Java

+ There are mainly two categories:

### A. Primitive Sorting (Arrays of int, char, etc.)

+ Sorting primitive data types like `int[]`,` double[]`,` char[]`.

### Uses Arrays.sort().

### B. Object Sorting (Strings, Objects, Lists, etc.)

+ Sorting objects using `Comparable` or `Comparator` interfaces.

#### Uses Arrays.sort() or Collections.sort().

### 2. Sorting an Array of Integers
```
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        Arrays.sort(arr); // Ascending order

        System.out.println("Ascending: " + Arrays.toString(arr));

        // Descending order
        Integer[] arr2 = {5, 2, 8, 1, 3};
        Arrays.sort(arr2, (a, b) -> b - a);

        System.out.println("Descending: " + Arrays.toString(arr2));
    }
}
```


Output:
```
Ascending: [1, 2, 3, 5, 8]
Descending: [8, 5, 3, 2, 1]
```

#### ✅ Key Point: For primitive arrays, use Arrays.sort(arr).
 + For descending order, convert to Integer[] because primitive int doesn't support custom comparators.

### 3. Sorting a String 
```
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Chirag", "Rahul", "Aman", "Zara"};

        Arrays.sort(names); // Ascending
        System.out.println("Ascending: " + Arrays.toString(names));

        Arrays.sort(names, (a, b) -> b.compareTo(a)); // Descending
        System.out.println("Descending: " + Arrays.toString(names));
    }
}

```
Output:
```
Ascending: [Aman, Chirag, Rahul, Zara]
Descending: [Zara, Rahul, Chirag, Aman]
```
### 4. Sorting an ArrayList
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));

        Collections.sort(list);  // Ascending
        System.out.println("Ascending: " + list);

        Collections.sort(list, Collections.reverseOrder()); // Descending
        System.out.println("Descending: " + list);
    }
}
```

Output:
```
Ascending: [1, 2, 3, 5, 8]
Descending: [8, 5, 3, 2, 1]
```
### 5. Sorting Objects Using Comparable

If you have a custom class, you can implement Comparable:
```
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Sort by id (ascending)
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Chirag"));
        list.add(new Student(1, "Rahul"));
        list.add(new Student(2, "Aman"));

        Collections.sort(list);
        System.out.println(list);
    }
}
```

Output:
```
[1 - Rahul, 2 - Aman, 3 - Chirag]
```
### 6. Sorting Objects Using Comparator
```
import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Chirag"));
        list.add(new Student(1, "Rahul"));
        list.add(new Student(2, "Aman"));

        // Sort by name ascending
        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));
        System.out.println("By Name Asc: " + list);

        // Sort by id descending
        Collections.sort(list, (a, b) -> b.id - a.id);
        System.out.println("By ID Desc: " + list);
    }
}
```
### 7. Common Interview Questions on Sorting
#### Q1. How do you sort an array in descending order in Java?
 + Convert to Integer[] and use:

+ Arrays.sort(arr, Collections.reverseOrder());

#### Q2. Difference between Comparable and Comparator?
+ Feature	Comparable	Comparator
+ Package	java.lang	java.util
+ Method	compareTo()	compare()
+ Sorting	Natural order (default)	Custom sorting
+ Multiple Sorts	❌ No	✅ Yes
#### Q3. Time Complexity of Arrays.sort()?

+ Uses Dual-Pivot Quicksort → O(n log n) in average case.

Summary Table
| Task | 	Method | 
|---------|-----------|
| Sort int[] |  ascending	Arrays.sort(arr)| 
| Sort int[] |  descending	Arrays.sort(arr, Collections.reverseOrder()) (use Integer[]) | 
| Sort String[] | ascending	Arrays.sort(arr) | 
| Sort String[] | descending	Arrays.sort(arr, (a,b)->b.compareTo(a))| 
| Sort ArrayList  | ascending	Collections.sort(list) | 
| Sort ArrayList  | descending	Collections.sort(list, Collections.reverseOrder()) | 
| Sort custom objects	 |Implement Comparable or use Comparator | 

## 1. Bubble Sort 🫧

+ Idea → Repeatedly compare adjacent elements and swap if they are in the wrong order.
 +It “bubbles up” the largest element at the end after each pass.

```
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: If no swaps, array is sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

Output:
```

[1, 2, 4, 5, 8]

```
Time Complexity:
```
Worst & Average: O(n²)

Best (sorted): O(n)

Space: O(1)
```
## 2. Selection Sort 🎯

+ Idea → Find the minimum element in the unsorted part and place it at the beginning.
```
import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

Output:
```
[11, 12, 22, 25, 64]

```
Time Complexity:
```
Worst, Average, Best: O(n²)

Space: O(1)
```
## 3. Insertion Sort 🧩

+ Idea → Build a sorted list one element at a time by inserting elements into their correct position.
```
import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move greater elements ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

Output:
```
[5, 6, 11, 12, 13]
```

Time Complexity:
```
Worst & Average: O(n²)

Best (sorted): O(n)

Space: O(1)
```
### 4. Merge Sort 🪄 (Divide and Conquer)

+ Idea → Divide array into halves, sort them recursively, and merge back.

```
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
```

Output:
```
[5, 6, 7, 11, 12, 13]

```
Time Complexity:
```
Best, Average, Worst: O(n log n)

Space: O(n)
```
## 5. Quick Sort ⚡ (Divide and Conquer)

+ Idea → Pick a pivot, partition array into two halves, sort recursively.
```
import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot to correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
```

Output:
```
[1, 5, 7, 8, 9, 10]
```

Time Complexity:
```
Best & Average: O(n log n)

Worst (sorted array): O(n²)

Space: O(log n)
```
6. Comparison Table
```
| Algorithm | 	Time Best	 | Time Average	  |Time Worst	 | Space	 | Stability |
|-----------|-------------|---------------|-----------|----------|-----------|
| Bubble	   | O(n)        | 	O(n²)         |	O(n²)    | 	O(1)    | 	✅ Yes | 
| Selection | 	O(n²)      |  	O(n²)        |	O(n²)    | 	O(1)    |	❌ No  |
| Insertion	| O(n)        | O(n²)          | O(n²)	    |  O(1)	  | ✅ Yes |
| Merge     | 	O(n log n)	| O(n log n)     | O(n log n)| 	O(n)   |✅ Yes  | 
| Quick	    | O(n log n)	 | O(n log n)     | 	O(n²)    |O(log n)	| ❌ No  | 
| Heap      |	O(n log n)  | 	O(n log n)   	| O(n log n)	| O(1)  | 	❌ No  | 
```

### 8. Most Asked Interview Questions

+ Which sorting algorithm is fastest? → QuickSort (on average).

+ Which is stable and efficient? → MergeSort.

+ When to use Insertion Sort? → Small arrays, nearly sorted data.

+ Why does Java’s Arrays.sort() use Dual-Pivot QuickSort? → Better average performance.
---


# 🧠 Bit Manipulation in Java

Bit manipulation allows us to perform operations directly on **binary representations** of integers.  
Here are the **most important formulas** and **examples** you need to master.

---

## 📌 1. Get ith Bit
**Formula:**
```java
(int)((num >> i) & 1)
```
**Explanation:** Right shift `num` by `i` and AND with `1`.

**Example:**
```java
int num = 42;  // 101010
int i = 3;
System.out.println((num >> i) & 1); // Output: 1
```

---

## 📌 2. Set ith Bit (Turn ON → 1)
**Formula:**
```java
num = num | (1 << i);
```
**Explanation:** Shift `1` left by `i` and OR with `num`.

**Example:**
```java
int num = 42;  // 101010
int i = 1;
num = num | (1 << i);
System.out.println(num); // Output: 44 (101100)
```

---

## 📌 3. Clear ith Bit (Turn OFF → 0)
**Formula:**
```java
num = num & ~(1 << i);
```
**Explanation:** Create a mask with all `1`s except the `i-th` bit as `0`, then AND it.

**Example:**
```java
int num = 42;  // 101010
int i = 3;
num = num & ~(1 << i);
System.out.println(num); // Output: 34 (100010)
```

---

## 📌 4. Toggle ith Bit (Flip 0 ↔ 1)
**Formula:**
```java
num = num ^ (1 << i);
```
**Explanation:** XOR flips the ith bit.

**Example:**
```java
int num = 42;  // 101010
int i = 1;
num = num ^ (1 << i);
System.out.println(num); // Output: 40 (101000)
```

---

## 📌 5. Check ith Bit (ON / OFF)
**Formula:**
```java
if ((num & (1 << i)) != 0) {...}
```
**Example:**
```java
int num = 42;  // 101010
int i = 4;
if ((num & (1 << i)) != 0)
    System.out.println("ON");
else
    System.out.println("OFF");
// Output: ON
```

---

## 📌 6. Update ith Bit (Set to `value`)
**Formula:**
```java
num = (num & ~(1 << i)) | (value << i);
```
**Explanation:**
1. Clear ith bit → `(num & ~(1 << i))`
2. Set ith bit to `value` → `| (value << i)`

**Example:**
```java
int num = 42;  // 101010
int i = 1;
int value = 1;
num = (num & ~(1 << i)) | (value << i);
System.out.println(num); // Output: 42
```

---

## 📌 7. Clear All Bits from LSB to i
**Formula:**
```java
num = num & (~((1 << i) - 1));
```
**Example:**
```java
int num = 42;  // 101010
int i = 3;
System.out.println(num & (~((1 << i) - 1))); // Output: 40 (101000)
```

---

## 📌 8. Clear All Bits from MSB to i
**Formula:**
```java
num = num & ((1 << (i + 1)) - 1);
```
**Example:**
```java
int num = 42;  // 101010
int i = 3;
System.out.println(num & ((1 << (i + 1)) - 1)); // Output: 10 (01010)
```

---

## 📌 9. Check Power of 2
**Formula:**
```java
(num & (num - 1)) == 0
```
**Example:**
```java
int num = 16;  // 10000
System.out.println((num & (num - 1)) == 0); // Output: true
```

---

## 📌 10. Count Set Bits (Number of 1s)
**Formula:**
```java
Integer.bitCount(num);
```
**Example:**
```java
int num = 42;  // 101010
System.out.println(Integer.bitCount(num)); // Output: 3
```

---

## 📌 11. Remove Rightmost Set Bit
**Formula:**
```java
num = num & (num - 1);
```
**Example:**
```java
int num = 42; // 101010
num = num & (num - 1);
System.out.println(num); // Output: 40 (101000)
```

---

## 📌 12. Get Rightmost Set Bit
**Formula:**
```java
num & -num;
```
**Example:**
```java
int num = 42;  // 101010
System.out.println(num & -num); // Output: 2 (10)
```

---

## 🧩 Quick Reference Table

| **Operation**         | **Formula**                | **Example** |
|------------------------|----------------------------|-------------|
| Get ith Bit            | `(num >> i) & 1`           | 1           |
| Set ith Bit            | `num | (1 << i)`           | 44          |
| Clear ith Bit          | `num & ~(1 << i)`          | 34          |
| Toggle ith Bit         | `num ^ (1 << i)`           | 40          |
| Check ith Bit          | `(num & (1 << i)) != 0`    | true        |
| Update ith Bit         | `(num & ~(1 << i)) | (value << i)` | 42 |
| Clear LSB              | `num & (~((1 << i) - 1))`  | 40          |
| Clear MSB              | `num & ((1 << (i + 1)) - 1)` | 10        |
| Check Power of 2       | `(num & (num - 1)) == 0`   | true        |
| Count Set Bits         | `Integer.bitCount(num)`    | 3           |
| Remove Rightmost 1     | `num & (num - 1)`          | 40          |
| Get Rightmost 1        | `num & -num`               | 2           |

---

### **Author:** Chirag Sankhe  
**Topic:** Bit Manipulation in Java  
**Level:** Beginner → Advanced 🚀

