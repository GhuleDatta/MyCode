CREATE TABLE cust (
    cid CHAR(5) PRIMARY KEY,
    cname VARCHAR(50),
    Email VARCHAR(100) CHECK (Email LIKE '%@%.%'), -- Ensuring Email format
    contact BIGINT CHECK (contact >= 1000000000 AND contact <= 9999999999) -- Ensuring 10 digit Indian contact numbers
);


CREATE TABLE property (
    pid CHAR(5) PRIMARY KEY,
    area VARCHAR(1000),
    loc VARCHAR(1000),
    postcode INT CHECK (LENGTH(postcode) = 6), -- Ensuring 6-digit postcode
    floorsize NUMERIC CHECK (floorsize > 0), -- Ensuring positive floorsize
    rooms NUMERIC CHECK (rooms > 0), -- Ensuring positive number of rooms
    bathroom NUMERIC CHECK (bathroom > 0) -- Ensuring positive number of bathrooms
);
CREATE TABLE agency (
    aid CHAR(5) PRIMARY KEY,
    agency VARCHAR(500),
    adress VARCHAR(1000),
    ServesArea VARCHAR(1000),
    ContactLoc VARCHAR(1000) CHECK (LENGTH(ContactLoc) >= 3) -- Ensuring ContactLoc has at least 3 characters
);
CREATE TABLE agent (
    agid CHAR(5) PRIMARY KEY,
    pid CHAR(5) REFERENCES property(pid), -- Ensuring pid references an existing property
    aid CHAR(5) REFERENCES agency(aid) -- Ensuring aid references an existing agency
);
CREATE TABLE listing (
    Lid CHAR(5) PRIMARY KEY,
    agent VARCHAR(500), 
    Cid CHAR(5) REFERENCES cust(cid), -- Ensuring Cid references an existing cust(cid)
    pid CHAR(5) REFERENCES property(pid), -- Ensuring pid references an existing property(pid)
    listdate DATE CHECK (listdate <= CURRENT_DATE), -- Ensuring listdate is not in the future
    listprice NUMERIC CHECK (listprice > 0) -- Ensuring listprice is positive
);
CREATE TABLE offer (
    oid SERIAL PRIMARY KEY,
    agent CHAR(5) REFERENCES cust(cid), -- Ensuring agent references an existing cust(cid)
    pid CHAR(5) REFERENCES cust(cid), -- Ensuring pid references an existing cust(cid)
    Lid CHAR(5) REFERENCES listing(Lid), -- Ensuring Lid references an existing listing(Lid)
    validfrom DATE,
    pricevaliduntil DATE,
    price NUMERIC CHECK (price > 0), -- Ensuring price is positive
    notes TEXT,
    accepted BOOLEAN DEFAULT false
);




second conditions 

-- Customer Table
CREATE TABLE cust (
    cid CHAR(5) PRIMARY KEY,
    cname VARCHAR(50),
    Email VARCHAR(100) CHECK (Email LIKE '%@%.%'), -- Email format condition
    contact BIGINT CHECK (contact >= 1000000000 AND contact <= 9999999999) -- Indian 10-digit contact number condition
);

-- Property Table
CREATE TABLE property (
    pid CHAR(5) PRIMARY KEY,
    area VARCHAR(1000),
    loc VARCHAR(1000),
    postcode INT CHECK (LENGTH(postcode) = 6), -- 6-digit postcode condition
    floorsize NUMERIC CHECK (floorsize > 0), -- Positive floorsize condition
    rooms NUMERIC CHECK (rooms > 0), -- Positive number of rooms condition
    bathroom NUMERIC CHECK (bathroom > 0) -- Positive number of bathrooms condition
);

-- Agency Table
CREATE TABLE agency (
    aid CHAR(5) PRIMARY KEY,
    agency VARCHAR(500),
    address VARCHAR(1000),
    ServesArea VARCHAR(1000),
    ContactLoc VARCHAR(1000) CHECK (LENGTH(ContactLoc) >= 3) -- Contact location minimum length condition
);

-- Agent Table
CREATE TABLE agent (
    agid CHAR(5) PRIMARY KEY,
    pid CHAR(5) REFERENCES property(pid), -- Property foreign key reference
    aid CHAR(5) REFERENCES agency(aid) -- Agency foreign key reference
);

-- Listing Table
CREATE TABLE listing (
    Lid CHAR(5) PRIMARY KEY,
    agent CHAR(5) REFERENCES agent(agid), -- Agent foreign key reference
    Cid CHAR(5) REFERENCES cust(cid), -- Customer foreign key reference
    pid CHAR(5) REFERENCES property(pid), -- Property foreign key reference
    listdate DATE CHECK (listdate <= CURRENT_DATE), -- List date not in future condition
    listprice NUMERIC CHECK (listprice > 0) -- Positive list price condition
);

-- Offer Table
CREATE TABLE offer (
    oid SERIAL PRIMARY KEY,
    agent CHAR(5) REFERENCES agent(agid), -- Agent foreign key reference
    pid CHAR(5) REFERENCES property(pid), -- Property foreign key reference
    Lid CHAR(5) REFERENCES listing(Lid), -- Listing foreign key reference
    validfrom DATE,
    pricevaliduntil DATE,
    price NUMERIC CHECK (price > 0), -- Positive price condition
    notes TEXT,
    accepted BOOLEAN DEFAULT false
);

data for the database

-- Inserting data into 'cust' table
INSERT INTO cust (cid, cname, Email, contact)
VALUES 
    ('C001', 'Amit Shah', 'amit.shah@example.com', 9876543210),
    ('C002', 'Priya Deshmukh', 'priya.deshmukh@example.com', 9876543211),
    ('C003', 'Rahul Patil', 'rahul.patil@example.com', 9876543212),
    ('C004', 'Neha Sharma', 'neha.sharma@example.com', 9876543213),
    ('C005', 'Sneha Joshi', 'sneha.joshi@example.com', 9876543214);

-- Inserting data into 'property' table
INSERT INTO property (pid, area, loc, postcode, floorsize, rooms, bathroom)
VALUES 
    ('P001', '2 BHK Apartment', 'Pune', 411001, 1200, 2, 2),
    ('P002', '3 BHK Villa', 'Mumbai', 400001, 2500, 3, 3),
    ('P003', 'Commercial Space', 'Delhi', 110001, 5000, 10, 4),
    ('P004', 'Plot', 'Pune', 411002, 3000, NULL, NULL),
    ('P005', '1 BHK Flat', 'Mumbai', 400002, 800, 1, 1);

-- Inserting data into 'agency' table
INSERT INTO agency (aid, agency, address, ServesArea, ContactLoc)
VALUES 
    ('A001', 'Dream Homes Realty', '123 Main Street, Pune', 'Pune, Mumbai, Delhi', 'Pune'),
    ('A002', 'Cityscape Realty', '456 Park Avenue, Mumbai', 'Mumbai, Delhi', 'Mumbai'),
    ('A003', 'Metro Realty', '789 Broad Street, Delhi', 'Pune, Delhi', 'Delhi');

-- Inserting data into 'agent' table
INSERT INTO agent (agid, pid, aid)
VALUES 
    ('AG001', 'P001', 'A001'),
    ('AG002', 'P002', 'A001'),
    ('AG003', 'P003', 'A002'),
    ('AG004', 'P004', 'A002'),
    ('AG005', 'P005', 'A003');

-- Inserting data into 'listing' table
INSERT INTO listing (Lid, agent, Cid, pid, listdate, listprice)
VALUES 
    ('L001', 'Dream Homes Realty', 'C001', 'P001', '2023-03-10', 7500000),
    ('L002', 'Dream Homes Realty', 'C002', 'P002', '2023-03-11', 15000000),
    ('L003', 'Cityscape Realty', 'C003', 'P003', '2023-03-12', 50000000),
    ('L004', 'Cityscape Realty', 'C004', 'P004', '2023-03-13', 10000000),
    ('L005', 'Metro Realty', 'C005', 'P005', '2023-03-14', 3500000);

-- Inserting data into 'offer' table
INSERT INTO offer (agent, pid, Lid, validfrom, pricevaliduntil, price, notes, accepted)
VALUES 
    (1, 1, 1, '2023-03-10', '2023-03-15', 7400000, 'Negotiable', true),
    (2, 2, 2, '2023-03-11', '2023-03-16', 14800000, 'Includes furnishings', true),
    (3, 3, 3, '2023-03-12', '2023-03-17', 49000000, 'Immediate possession', true),
    (4, 4, 4, '2023-03-13', '2023-03-18', 9800000, 'Negotiable', false),
    (5, 5, 5, '2023-03-14', '2023-03-19', 3400000, 'Ready to move', true);

