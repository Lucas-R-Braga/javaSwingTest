## Getting Started

# Military Enlistment App (Java Swing)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Java_Swing-007396?style=for-the-badge&logo=java&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

📖 Read this in other languages: [Português (Brasil)](./README.pt-BR.md)

## 📖 Overview
This project is a **Java Swing desktop application** that simulates the **Brazilian military enlistment process**.  
It allows registering candidates with personal information and automatically verifies their enlistment status based on age.


##  🚀  Features
- Register candidates with personal data (name, parents, phone, email, height, weight, birth year).  
- Automatic calculation of **age** and **military status**.  
- Calculation of late enlistment fine (**R$ 5.00 per delayed year**).  
- Simple and intuitive **Java Swing interface**. 

## 📊 Enlistment Rules
  - **Under 18 years old** → Not old enough for enlistment.  
  - **Exactly 18 years old** → Must enlist immediately (within the legal period).  
  - **Between 19 and 44 years old** →  
    - If late, fine of **R$ 5.00 per year** is applied.  
    - If still within the enlistment year, it’s valid.  
  - **45 years or older** → No mandatory enlistment.


## 🛠️ Technologies  
- **Java 17+**  
- **Java Swing** (GUI framework)  
- Compatible IDEs: **VS Code / Eclipse / IntelliJ IDEA**


## ▶️ How to Run  
### 🔹 Option 1 – Download and run the `.jar` (recommended)  
You can directly download the executable `.jar` from GitHub:
📥 Download
[![Download .jar](https://img.shields.io/badge/Download-.JAR-blue?style=for-the-badge&logo=java)](https://github.com/Lucas-R-Braga/javaSwingTest/blob/main/AlistamentoMilitarApp.jar)


### 🔹 Option 2 - Compile manually
1. Compile this project:
   ---> javac -d bin src/alistamentoMilitarApp/*.java src/entities/*.java

2. Create the .jar file:
   ---> jar cfm AlistamentoMilitarApp.jar manifest.txt -C bin .

3. Run the application:
   ---> java -jar AlistamentoMilitarApp.jar


📋 Example Usage
1. Open the application
2. Fill in the registration form (name, birth year, etc).
3. Click confirm to register the candidate.
4. The system will display the enlistment status in the output area.


📌 Notes
- Age is calculated using: 
  
  - Fine calculation formula:
    - int currentYear = LocalDate.now().getYear();
    - return currentYear - birthYear;

----------------------------------------------------  
👤 Author

Developed by Lucas Braga

📧 Contact: devlucas.braga@gmail.com

📧 www.linkedin.com/in/lucas-braga-4009a32b4
