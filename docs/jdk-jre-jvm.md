# ☕ JDK vs JRE vs JVM — Explained for Java Developers

Understanding the relationship between the **Java Development Kit (JDK)**, **Java Runtime Environment (JRE)**, and **Java Virtual Machine (JVM)** is essential for writing, running, and managing Java applications. Here's a breakdown tailored for learners and project contributors.

---

## 🧰 Java Development Kit (JDK)

The full toolkit needed to **develop**, **compile**, and **run** Java programs.

### 🔗 Includes:
- `javac` — Java compiler (transforms `.java` → `.class`)
- `java` — Command-line launcher to run Java bytecode
- **JRE** and **JVM**
- Developer tools like `javadoc`, `jar`, `jshell`, etc.

### 📌 Use Case:
Required for **Java development** — writing, building, testing.

---

## 🔥 Java Runtime Environment (JRE)

The environment that allows you to **run** Java applications but not develop or compile them.

### 🔗 Includes:
- **JVM** for executing `.class` files
- Core Java libraries and runtime files

### 🚫 Excludes:
- `javac` (compiler)
- Development tools

### 📌 Use Case:
Used by end users who only want to **run** Java applications.

---

## ⚙️ Java Virtual Machine (JVM)

The heart of Java’s portability — interprets and runs compiled bytecode.

### 🧠 Responsibilities:
- Executes `.class` files
- Manages memory (garbage collection)
- Handles threading and security
- Enables platform independence

### 📌 Use Case:
Present inside both JRE and JDK — responsible for **running** Java code.

---

## 🗂️ Quick Comparison Table

| Feature             | JDK  | JRE  | JVM  |
|---------------------|-------|-------|-------|
| Compile `.java`     | ✅    | ❌    | ❌    |
| Run `.class`        | ✅    | ✅    | ✅    |
| Includes JVM        | ✅    | ✅    | ✅    |
| Developer Tools     | ✅    | ❌    | ❌    |
| Suitable for Dev     | ✅    | ❌    | ❌    |
| Suitable for Runtime | ✅    | ✅    | ✅    |

---

## 🧪 Real Project Usage Example

In your **File Organizer** project:
- You write `.java` → requires **JDK**
- You compile them into `.class` → uses `javac` (from JDK)
- You execute the app → uses `java` (via JVM)

---

## 🧭 Additional Resources

- [Java SE Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)
- Use [SDKMAN!](https://sdkman.io/) to manage multiple JDKs on Unix-based systems

---

Want to explore how the JVM manages memory (heap, stack, metaspace), or how JDK tooling like `javadoc` or `jar` fits into project packaging? Let's level up your dev environment too!