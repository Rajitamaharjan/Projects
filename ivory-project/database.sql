-- User table
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    password VARCHAR(150) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL,
    role VARCHAR(20),
    imageUrl VARCHAR(255)
);


-- Product table
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    productName VARCHAR(50) NOT NULL,
    price VARCHAR(50) NOT NULL,
    description VARCHAR(255) NOT NULL,
    category VARCHAR(50) NOT NULL,
    image VARCHAR(255) NOT NULL,
    quantity VARCHAR(50) NOT NULL,
    dateAdded VARCHAR(50) NOT NULL,
    dateModified VARCHAR(50) NOT NULL
);


-- order table

CREATE TABLE orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    orderId VARCHAR(50) NOT NULL,
    userId VARCHAR(50) NOT NULL,
    productId VARCHAR(50) NOT NULL,
    quantity VARCHAR(50) NOT NULL,
    dateAdded VARCHAR(50) ,
    dateModified VARCHAR(50),
    totalPrice VARCHAR(50) NOT NULL
);
