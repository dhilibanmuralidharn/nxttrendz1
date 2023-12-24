create table if not exists product(
    productid INT PRIMARY KEY AUTO_INCREMENT,
    productName varchar (255),
    price Double
);

create table if not exists review(
    reviewid INT PRIMARY KEY AUTO_INCREMENT,
    reviewcontent varchar(255),
    rating INT
);