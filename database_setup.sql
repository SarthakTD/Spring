-- Database setup script for your Spring application
-- Run these commands in your PostgreSQL database

-- 1. Create a new database specifically for your application (optional but recommended)
CREATE DATABASE spring_auth_db;

-- 2. If you want to use the default 'postgres' database, make sure the 'users' table will be created
-- The application will auto-create the table due to spring.jpa.hibernate.ddl-auto=update

-- 3. Connect to your database and verify the connection
\c spring_auth_db;

-- 4. Check if the users table exists (after running the application)
-- \dt

-- 5. Sample query to check users (after some data is inserted)
-- SELECT * FROM users;
