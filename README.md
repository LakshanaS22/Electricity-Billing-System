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

```sql
CREATE TABLE bill (
    bill_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(100),
    customer_address VARCHAR(255),
    units INT,
    amount DOUBLE,
    status VARCHAR(20)
);
