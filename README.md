# Electricity Billing System

## Project Description

The **Electricity Billing System** is a console-based application designed to automate the management of electricity billing for customers. This system enables admins to add new bills, view existing bills, and mark bills as paid. The system integrates with a MySQL database to store and manage customer data and billing records.

## Features

- **Admin Login**: Secure login for admin access.
- **Add Bill**: Admin can add a new bill by entering customer details such as name, address, units consumed, and the amount.
- **View Bills**: Admin can view all bills stored in the system.
- **Pay Bill**: Admin can mark a bill as "PAID" by selecting the bill from the list and confirming payment.

## Technologies Used

- **Java**: The main programming language used for building the console-based application.
- **MySQL**: The database management system to store customer bills and statuses.
- **JDBC (Java Database Connectivity)**: Used for connecting Java to the MySQL database.
- **Scanner (Java)**: For taking user input in the console-based application.

## Setup Instructions

### 1. Install MySQL
- Download and install MySQL server from the [official website](https://dev.mysql.com/downloads/installer/).
- Set up a database called `ElectricityBillingDB`.

### 2. Set Up MySQL Database
- Create the necessary tables in the `ElectricityBillingDB` database by running the following SQL script:

## Compile and Run the Project
### Compile the Java files:

javac -cp ".;lib/mysql-connector-j-9.1.0.jar" src/*.java

### Run the Project:

java -cp ".;lib/mysql-connector-j-9.1.0.jar" Main


## How It Works

### Admin Login
-The admin logs in using a valid username and password.
-If credentials are correct, the admin gains access to the system.

### Adding a Bill
-The admin enters the customer's name, address, and electricity units consumed.
-The system calculates the amount based on a fixed rate (e.g., 5.0 per unit).
-The bill is stored in the database with a "UNPAID" status.

### Viewing Bills
-The admin can view all existing bills with customer information and bill status.
-Paying a Bill
-Admin selects a bill by its ID and marks it as "PAID".
-The system updates the bill's status in the database
![image](https://github.com/user-attachments/assets/155ed557-f944-4522-8d40-508e266d01bc)
![image](https://github.com/user-attachments/assets/f7733652-38e4-4688-a605-92b75bfcbce8)


