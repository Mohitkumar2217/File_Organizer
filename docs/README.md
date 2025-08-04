# 📘 Java File Organizer — Developer Documentation

This document explains the internal architecture, modular components, and development flow of the Java File Organizer. Built as a phase-driven project, it demonstrates practical use of Java I/O, modularization, exception handling, and automation.
- created only by java programming

---

## 🧱 Project Architecture

---

## 🧩 Phase-Wise Breakdown

### 1️⃣ Phase 1: File Detection
- Detects files in a given directory (ignores folders)
- Uses `File::isFile` to filter and collect testable files

```java
List<File> files = detectFiles("samples/");
```
### 2️⃣ Phase 2: Type Categorization
- Uses extension mapping to identify categories
- Falls back to "Misc" for unknown extensions

```java
String type = getFileType(file); // e.g., "Images", "Documents"
```
### 3️⃣ Phase 3: File Movement
- Dynamically creates category folders
- Moves files using Files.move(...)
  boolean success = moveFile(file, targetDir);
```java
  boolean success = moveFile(file, targetDir);
```
### 4️⃣ Phase 4: Error Handling
- Handles IOException, permission errors
- Logs failed moves to error-log.txt
- Skips unreadable or hidden files with clear message

### 5️⃣ Phase 5: Summary Report Generation
- Logs move history with timestamps
- Outputs to organizer-summary.txt in readable format
```java
  logSummary(fileName, targetPath, success);
```

### 🧪 Test Strategy
### 🔬 Manual Testing
- /samples/ contains mixed files: .jpg, .exe, .txt, etc.
- Used for initial debugging and feature validation
### ⚙️ Automated Testing
- TestRunner.java automates batch runs across:
  - Empty folders
  - Duplicate filenames
  - Files with no extension or unsupported types
- Prints summary results for each test case

### 🧠 Design Principles
- Modularity: Each logical step is broken into dedicated methods
- Reusability: Categorization and movement logic is used across both CLI and automated tests
- Transparency: Logs and reports provide clear insight into program behavior
- Accessibility: Code is beginner-friendly and well-commented to support community learning

### 📄 Resources
- extensions.md: Full breakdown of supported file types
- jdk-jre-jvm.md: Concept guide for underlying Java environment
- Flowchart: See flowchart.png for visual overview

