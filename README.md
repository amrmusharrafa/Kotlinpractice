# Kotlin Practice 🚀

A practical Kotlin learning repository based on **Kotlin in Action — 2nd Edition** by Sebastian Aigner, Roman Elizarov, Svetlana Isakova, and Dmitry Jemerov.

This repository is my practical laboratory for learning Kotlin.

The goal is **not simply to finish the book**.

The goal is to understand Kotlin deeply enough to:

* Write Kotlin without constantly copying examples.
* Understand idiomatic Kotlin code.
* Solve programming problems using Kotlin.
* Understand the Kotlin standard library.
* Understand Kotlin's relationship with Java.
* Build a strong foundation for Android development.
* Understand coroutines and Flow.
* Write clean, maintainable Kotlin.
* Apply what I learn to real projects.

---

# 🎯 Study Philosophy

For every important concept:

```text
READ
  ↓
UNDERSTAND
  ↓
WRITE THE CODE MYSELF
  ↓
EXPERIMENT
  ↓
BREAK IT
  ↓
FIX IT
  ↓
SOLVE EXERCISES
  ↓
CREATE MY OWN EXAMPLE
  ↓
REVIEW
  ↓
COMMIT
  ↓
PUSH
```

## The most important rule

> **Do not measure progress by pages or chapters completed. Measure progress by what I can write and explain without help.**

---

# 📚 Book Structure

Kotlin in Action, 2nd Edition contains **18 chapters divided into three parts**.

```text
PART 1 — Introducing Kotlin
    Chapter 1
    Chapter 2
    Chapter 3
    Chapter 4
    Chapter 5
    Chapter 6
    Chapter 7
    Chapter 8

PART 2 — Embracing Kotlin
    Chapter 9
    Chapter 10
    Chapter 11
    Chapter 12
    Chapter 13

PART 3 — Concurrent Programming with Coroutines and Flows
    Chapter 14
    Chapter 15
    Chapter 16
    Chapter 17
    Chapter 18
```

---

# 🟦 PART 1 — Introducing Kotlin

## Chapter 1 — Kotlin: What and Why

Topics:

* Kotlin philosophy
* Kotlin's primary characteristics
* Static typing
* Object-oriented programming
* Functional programming
* Kotlin/JVM
* Kotlin for Android
* Kotlin Multiplatform
* Kotlin tooling
* Compiling and running Kotlin

### Practice

* Write basic Kotlin programs.
* Run Kotlin from the IDE.
* Compare Kotlin and Java syntax.
* Understand how Kotlin fits into the JVM ecosystem.

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 2 — Kotlin Basics

Topics:

* Functions
* Variables
* `val`
* `var`
* String templates
* Classes
* Properties
* Custom accessors
* Packages
* Enums
* `when`
* Smart casts
* `if`
* `while`
* `for`
* Ranges
* Progressions
* Exceptions
* `try`
* `catch`
* `finally`

### Practice

Build small console programs using:

* Conditions
* Loops
* Functions
* Classes
* Enums
* Ranges
* Exceptions

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 3 — Defining and Calling Functions

Topics:

* Function declarations
* Parameters
* Return values
* Named arguments
* Default parameters
* Extension functions
* Top-level functions
* Local functions
* Infix calls
* Varargs
* Destructuring
* Collection utilities
* Java interoperability

### Practice

Create:

* Utility functions
* Extension functions
* Functions with default arguments
* Functions using named arguments
* Functions accepting variable numbers of arguments

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 4 — Classes, Objects, and Interfaces

Topics:

* Classes
* Constructors
* Properties
* Interfaces
* Inheritance
* Visibility modifiers
* Data classes
* Sealed classes
* Object declarations
* Companion objects
* Nested classes
* Inner classes
* Delegation

### Practice

Create realistic domain models.

Examples:

* `Person`
* `Employee`
* `Product`
* `Bearing`
* `Inventory`
* `Customer`

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 5 — Programming with Lambdas

Topics:

* Lambda expressions
* Function types
* Higher-order functions
* `it`
* Collection operations
* `filter`
* `map`
* `reduce`
* `fold`
* Function references
* Member references
* Constructor references
* SAM interfaces
* Java APIs
* Lambdas with receivers

### Practice

* Rewrite loops using collection operations.
* Create higher-order functions.
* Use Java APIs from Kotlin.
* Practice function references.
* Compare imperative and functional solutions.

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# ⭐ Chapter 6 — Working with Collections and Sequences

**CURRENT CHAPTER**

This is where the repository currently begins its serious collection practice.

Topics:

## Lists

* `List`
* `MutableList`
* `listOf`
* `mutableListOf`
* Indexing
* Iteration
* Adding elements
* Removing elements

## Sets

* `Set`
* `MutableSet`
* Uniqueness
* Set operations

## Maps

* `Map`
* `MutableMap`
* Keys
* Values
* `mapOf`
* `mutableMapOf`

## Collection Operations

Practice:

* `filter`
* `map`
* `flatMap`
* `flatten`
* `any`
* `all`
* `none`
* `find`
* `first`
* `last`
* `count`
* `partition`
* `groupBy`
* `associate`
* `associateBy`
* `associateWith`
* `zip`
* `fold`
* `reduce`

## Sequences

Learn:

* `Sequence`
* Lazy evaluation
* Intermediate operations
* Terminal operations
* `asSequence()`

## Chapter 6 Projects

Build progressively harder exercises:

1. Number analyzer
2. Student grade analyzer
3. Word frequency counter
4. Contact list
5. Shopping list
6. Product inventory
7. Bearing inventory/search system

### Status

* [ ] Lists
* [ ] Sets
* [ ] Maps
* [ ] Collection operations
* [ ] Ranges
* [ ] Sequences
* [ ] Exercises
* [ ] Mini-project

---

# Chapter 7 — Working with Nullable Values

Topics:

* Nullable types
* `?`
* Safe calls
* `?.`
* Elvis operator `?:`
* `!!`
* Smart casts
* Nullability and Java
* Platform types
* Nullable collections
* Let and null handling
* Type parameters and nullability

### Practice

Create programs that safely handle missing data.

Examples:

* Missing customer
* Missing product
* Missing inventory item
* Optional database fields

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 8 — Basic Types, Collections, and Arrays

Topics:

* Primitive types
* Numbers
* Booleans
* Characters
* Strings
* Arrays
* Collections
* Java primitive types
* Boxing and unboxing
* Type conversions

### Practice

* Arrays
* Numeric calculations
* String processing
* Primitive vs boxed types
* Java/Kotlin interoperability

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# 🟩 PART 2 — Embracing Kotlin

# Chapter 9 — Operator Overloading and Other Conventions

Topics:

* Operator overloading
* `operator`
* Arithmetic operators
* Comparison operators
* `equals`
* `compareTo`
* `contains`
* `get`
* `set`
* `invoke`
* Destructuring
* Conventions

### Practice

Create classes that support:

* `+`
* `-`
* `*`
* `/`
* `[]`
* comparisons
* destructuring

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 10 — Higher-Order Functions: Lambdas as Parameters and Return Values

Topics:

* Function types
* Passing functions
* Returning functions
* Higher-order functions
* Inline functions
* `inline`
* `noinline`
* `crossinline`
* Non-local returns
* `reified`

### Practice

* Create custom higher-order functions.
* Understand function types.
* Experiment with inline functions.
* Compare inline and non-inline behavior.

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 11 — Generics

Topics:

* Generic functions
* Generic classes
* Type parameters
* Constraints
* Variance
* Covariance
* Contravariance
* `in`
* `out`
* Star projections
* Type erasure
* Reified type parameters
* Type aliases

### Practice

Create:

* Generic containers
* Generic utility functions
* Generic repositories
* Covariant classes
* Contravariant classes

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 12 — Annotations and Reflection

Topics:

* Annotations
* Annotation targets
* Annotation parameters
* Reflection
* Kotlin reflection
* Java reflection
* `KClass`
* `KCallable`
* Runtime inspection

### Practice

* Create custom annotations.
* Inspect classes using reflection.
* Experiment with properties and functions.

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 13 — DSL Construction

Topics:

* DSL concepts
* Lambda with receiver
* Type-safe builders
* Extension functions
* Infix functions
* Operator conventions
* Kotlin DSL design

### Practice

Build small DSLs.

Examples:

* HTML-like DSL
* Configuration DSL
* Query DSL
* Inventory DSL

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# 🟨 PART 3 — Concurrent Programming with Coroutines and Flows

# Chapter 14 — Coroutines

Topics:

* Coroutines
* Suspending functions
* `suspend`
* Coroutine builders
* `launch`
* `async`
* `await`
* Dispatchers
* Coroutine context
* Cancellation basics

### Practice

Create asynchronous programs.

Examples:

* Parallel tasks
* Network-style simulation
* Delayed operations
* Concurrent calculations

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 15 — Structured Concurrency

Topics:

* Structured concurrency
* Coroutine scopes
* Parent-child relationships
* Cancellation
* Exception propagation
* Coroutine lifecycle
* `CoroutineScope`
* `supervisorScope`

### Practice

* Create parent and child coroutines.
* Experiment with cancellation.
* Experiment with failures.
* Observe coroutine hierarchy.

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 16 — Flows

Topics:

* `Flow`
* Cold flows
* Hot flows
* Collecting flows
* Flow lifecycle
* `StateFlow`
* `SharedFlow`

### Practice

Create flows representing:

* Timers
* User events
* Inventory changes
* Search results
* Application state

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 17 — Flow Operators

Topics:

* Intermediate operators
* Terminal operators
* Transformations
* Combining flows
* Filtering
* Mapping
* Custom operators
* Flow collection

### Practice

Build:

* Search pipelines
* Data-processing pipelines
* Reactive inventory updates
* Multiple-flow combinations

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# Chapter 18 — Error Handling and Testing

Topics:

* Error propagation
* Coroutine exceptions
* `CoroutineExceptionHandler`
* Error handling in Flow
* Testing coroutines
* Testing Flow
* Unit testing
* Reliable asynchronous code

### Practice

Write tests for:

* Functions
* Collections
* Classes
* Coroutines
* Flows
* Error cases

### Status

* [ ] Read
* [ ] Practiced
* [ ] Exercises completed
* [ ] Reviewed

---

# 🧪 Practice Method

For every major concept:

## 1. Reproduce

Implement the book's example yourself.

## 2. Modify

Change something.

For example:

```text
Change the input.
Change the type.
Change the collection.
Change the function.
Change the logic.
```

## 3. Break

Intentionally introduce an error.

Observe:

* Compiler error
* Runtime exception
* Warning
* Type inference
* Nullability behavior

## 4. Explain

Explain the concept in your own words.

## 5. Create

Build an example that wasn't in the book.

## 6. Solve

Solve a problem without looking at the solution.

---

# 🧠 The "Can I Really Use It?" Test

A concept is considered learned only when I can answer:

### Understanding

* What is it?
* Why does it exist?
* When should I use it?
* When should I avoid it?

### Coding

* Can I write a simple example?
* Can I modify it?
* Can I use it in a real problem?

### Debugging

* Can I understand common errors?
* Can I predict what will happen?

### Explanation

* Can I explain it without reading the book?

If not, mark the concept as **still learning**.

---

# 📁 Repository Organization

Use one repository for the entire Kotlin journey.

```text
practisekotlin/
│
├── README.md
│
├── chapter-01/
├── chapter-02/
├── chapter-03/
├── chapter-04/
├── chapter-05/
│
├── chapter-06-collections/
│   ├── lists/
│   ├── sets/
│   ├── maps/
│   ├── sequences/
│   └── exercises/
│
├── chapter-07-nullability/
├── chapter-08-basic-types/
├── chapter-09-operators/
├── chapter-10-higher-order-functions/
├── chapter-11-generics/
├── chapter-12-annotations-reflection/
├── chapter-13-dsl/
├── chapter-14-coroutines/
├── chapter-15-structured-concurrency/
├── chapter-16-flows/
├── chapter-17-flow-operators/
└── chapter-18-error-handling-testing/
```

The structure can evolve when necessary.

---

# 📝 Notes Template

For difficult concepts, create a `notes.md`.

Use:

```text
# Concept

## What is it?

## Why does it exist?

## Syntax

## Simple example

## My own example

## Important details

## Common mistakes

## What confused me?

## What I learned

## Questions remaining
```

---

# 🌳 Git Workflow

This repository is also a record of my progress.

After completing a meaningful practice session:

```bash
git status
```

Then:

```bash
git add .
```

Then create a meaningful commit:

```bash
git commit -m "Practice Kotlin collections"
```

Then:

```bash
git push
```

---

# ✍️ Commit Message Examples

Good:

```text
Practice Kotlin lists and sets
Practice Kotlin maps
Practice collection operations
Practice Kotlin sequences
Practice nullable types
Practice Kotlin lambdas
Practice Kotlin generics
Practice coroutine basics
Practice Flow operators
Add collections exercises
Add bearing inventory collection example
```

Avoid:

```text
update
changes
test
stuff
fix
asdf
```

Git history should tell the story of what I learned.

---

# 📊 Overall Progress

## Part 1 — Introducing Kotlin

* [ ] Chapter 1 — Kotlin: What and Why
* [ ] Chapter 2 — Kotlin Basics
* [ ] Chapter 3 — Defining and Calling Functions
* [ ] Chapter 4 — Classes, Objects, and Interfaces
* [ ] Chapter 5 — Programming with Lambdas
* [ ] Chapter 6 — Working with Collections and Sequences
* [ ] Chapter 7 — Working with Nullable Values
* [ ] Chapter 8 — Basic Types, Collections, and Arrays

## Part 2 — Embracing Kotlin

* [ ] Chapter 9 — Operator Overloading and Other Conventions
* [ ] Chapter 10 — Higher-Order Functions
* [ ] Chapter 11 — Generics
* [ ] Chapter 12 — Annotations and Reflection
* [ ] Chapter 13 — DSL Construction

## Part 3 — Concurrent Programming with Coroutines and Flows

* [ ] Chapter 14 — Coroutines
* [ ] Chapter 15 — Structured Concurrency
* [ ] Chapter 16 — Flows
* [ ] Chapter 17 — Flow Operators
* [ ] Chapter 18 — Error Handling and Testing

---

# 🏆 Milestones

## Milestone 1 — Kotlin Fundamentals

Complete Chapters 1–5.

Goal:

> I can write normal Kotlin programs comfortably.

---

## Milestone 2 — Kotlin Core

Complete Chapters 6–8.

Goal:

> I understand Kotlin collections, sequences, nullability, types, and arrays.

---

## Milestone 3 — Idiomatic Kotlin

Complete Chapters 9–13.

Goal:

> I understand the features that make Kotlin different from Java and can write more idiomatic Kotlin.

---

## Milestone 4 — Concurrent Kotlin

Complete Chapters 14–18.

Goal:

> I understand coroutines, structured concurrency, Flow, error handling, and testing.

---

# 📱 Android Preparation

After completing the core Kotlin material, connect the knowledge to Android development.

Focus on:

* Jetpack Compose
* Android lifecycle
* ViewModel
* State
* Coroutines
* Flow
* Room
* Retrofit
* Dependency Injection
* Navigation
* Testing
* Android architecture

The goal is not to memorize Android APIs.

The goal is to understand **why the Kotlin code inside Android applications works.**

---

# 🔥 Golden Rules

1. **Understand before memorizing.**
2. **Write code yourself.**
3. **Don't blindly copy the book.**
4. **Experiment with important concepts.**
5. **Break code intentionally.**
6. **Read compiler errors carefully.**
7. **Solve exercises without immediately looking at solutions.**
8. **Build your own examples.**
9. **Review previous concepts.**
10. **Keep meaningful Git history.**
11. **Don't rush through chapters.**
12. **Measure ability, not page count.**

---

# 🚀 Final Objective

The final goal is not:

> "I finished Kotlin in Action."

The final goal is:

> **"I understand Kotlin well enough to use it to solve real problems."**

Eventually, when facing a new problem:

```text
Understand the problem
        ↓
Choose the appropriate data structures
        ↓
Choose the appropriate Kotlin features
        ↓
Design the solution
        ↓
Implement it
        ↓
Test it
        ↓
Debug it
        ↓
Refactor it
        ↓
Explain it
```

That is the skill this repository is designed to build.
