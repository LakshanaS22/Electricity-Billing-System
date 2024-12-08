Electricity Billing System
The Electricity Billing System is a console-based application designed to automate the management of electricity billing for customers. The system allows an admin to add new bills, view existing bills, and process bill payments. It integrates with a MySQL database to store and manage customer data and billing records.

Approach:
Admin Login: The admin logs into the system using a username and password for security purposes. If credentials are valid, they are granted access to the system.

Bill Management: Once logged in, the admin can perform actions like adding new bills, viewing the current list of bills, and marking bills as paid.

Database Integration: The system is backed by a MySQL database, which holds records of all customer bills and their statuses (e.g., "UNPAID", "PAID").

Real-time Updates: Whenever a bill is paid, the system updates the database with the latest information.

Features:
Admin Login: Secure login for admin access.
Add Bill: Admin can add a new bill by entering customer details such as name, address, units consumed, and the amount.
View Bills: Admin can view all bills stored in the system.
Pay Bill: Admin can mark a bill as "PAID" by selecting the bill from the list and confirming payment.
Technologies Used:
Java: The main programming language used for building the console-based application.
MySQL: The database management system to store customer bills and statuses.
JDBC (Java Database Connectivity): Used for connecting Java to the MySQL database.
Scanner (Java): For taking user input in the console-based application.
Setup Instructions:
Install MySQL:

Download and install MySQL server from the official website.
Set up a database called ElectricityBillingDB.
Set Up MySQL Database:

Create the necessary tables in the ElectricityBillingDB database by running the provided SQL script.
Example SQL script:

sql
Copy code
CREATE TABLE bill (
    bill_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(100),
    customer_address VARCHAR(255),
    units INT,
    amount DOUBLE,
    status VARCHAR(20)
);
Clone the Repository: Clone the project repository from GitHub:

bash
Copy code
git clone https://github.com/your-username/electricity-billing-system.git
Configure Database Connection:

In the DBConnection.java file, update the database connection details (username, password, and database name) to match your MySQL setup.
Run the Project:

Compile the Java files using the following command:
bash
Copy code
javac -cp ".;lib/mysql-connector-j-9.1.0.jar" src/*.java
Run the project:
bash
Copy code
java -cp ".;lib/mysql-connector-j-9.1.0.jar" Main
Commands:
To Start the Application: After compiling the Java code, you can start the program using:

bash
Copy code
java -cp ".;lib/mysql-connector-j-9.1.0.jar" Main
To View All Bills: Inside the program, select option 2 to view all bills.

To Add a New Bill: Select option 1 and enter the details when prompted.

To Pay a Bill: Select option 3, enter the bill ID, and confirm payment.

How It Works:
Admin Login:

The admin enters their username and password.
If valid credentials are provided, the admin gains access to the system.
Adding a Bill:

Admin enters the customer's name, address, and electricity units consumed.
The system calculates the amount (assuming a rate of 5.0 per unit).
The bill is then added to the database with a status of "UNPAID".
Viewing Bills:

Admin can view all bills currently in the system with customer details and their current status.
Paying a Bill:

Admin can mark a bill as "PAID" by entering the bill ID.
The system updates the status in the database.
