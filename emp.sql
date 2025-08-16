-- Create a table named 'students'
CREATE TABLE students (
    id INTEGER PRIMARY KEY,
    name TEXT,
    age INTEGER
);

-- Insert sample data
INSERT INTO students (id, name, age) VALUES
(1, 'John', 18),
(2, 'Sara', 20),
(3, 'Mike', 19);

-- View the data
SELECT * 
FROM students
where age>18;
