# Banking System – OOP Lab 2

This Java application simulates a simple **Banking System**, allowing basic operations on checking and credit accounts. It demonstrates core concepts of **Object-Oriented Programming (OOP)** such as abstraction, encapsulation, inheritance, and modular design.

---

## Project Context

This project was developed as part of the **Object-Oriented Programming** course at the **Technical University of Moldova (UTM)**. It involves working with real-world concepts like accounts and transactions, reading input data from files, and implementing service-based logic.

---

## Structure

The project is organized as follows:

```
src/
├── main/
│   └── java/
│       ├── constants/         # Enums for account and transaction types
│       │   ├── AccountType.java
│       │   └── Transaction.java
│       │
│       ├── entity/            # Core data classes
│       │   ├── Account.java
│       │   ├── Credit.java
│       │   └── Checking.java
│       │
│       ├── repository/        # In-memory data access
│       │   └── AccountRepository.java
│       │
│       ├── service/           # Business logic and services
│       │   ├── AccountService.java
│       │   ├── CheckingService.java
│       │   └── CreditService.java
│       │
│       └── Main.java          # Application entry point
│
└── resources/
    ├── accounts.txt           # Input data for accounts
    └── transactions.txt       # Input data for transactions
```

---

## Features Implemented

- Load accounts and transactions from files
- Store accounts in memory (repository pattern)
- Provide separate services for:
    - Checking accounts
    - Credit accounts
- Process transactions using business logic
- Display final account balances

---

## How to Run the Project

1. **Install Java (JDK 8 or later)**  
   Download and install from: [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)


2. **Clone the project**

```bash
  git clone https://github.com/Constantin-Stamate/Laborator_2_OOP.git
```

3. **Navigate into the project folder**

```bash
  cd Laborator_2_OOP
```

4. **Compile the Java files**

```bash
  javac src/main/java/**/*.java
```

5. **Run the application**

```bash
  java -cp src/main/java Main
```

> ⚠️ Make sure that `accounts.txt` and `transactions.txt` are located in the `resources/` folder and that your file reading logic points to the correct path.

---

## Useful Links

- [Java Official Documentation](https://docs.oracle.com/en/java/javase/)
- [OOP Concepts in Java](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
- [Java I/O File Reading](https://docs.oracle.com/javase/tutorial/essential/io/file.html)

---

## Author

This project was developed by **Constantin Stamate** as part of the **Object-Oriented Programming** course at **UTM**.

- GitHub: [Constantin-Stamate](https://github.com/Constantin-Stamate)
- Email: [constantinstamate.r@gmail.com](mailto:constantinstamate.r@gmail.com)

