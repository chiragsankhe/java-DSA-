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
|-----|-----|-------|
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
`		`
| !	 | Logical NOT | 	!(a > 5) | 

🔹 4. Assignment Operations
Used to assign values to variables.

|Operator | 	Meaning | 	Example |
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


