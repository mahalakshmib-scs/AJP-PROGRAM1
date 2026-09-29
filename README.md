README.md (Student Instructions)
# Quadrilateral Inheritance Hierarchy Assignment

## Objective

Write a Java program to create an inheritance hierarchy for geometric shapes.

The hierarchy must contain:


Quadrilateral
|
Trapezoid
|
Rectangle
|
Square


Use `Quadrilateral` as the superclass.

Create a separate `Point` class to represent x-y coordinates.

---

## Requirements

### Point Class

Create a class Point with:

### Instance Variables


private double x;
private double y;


### Methods

- Constructor to initialize x and y values
- getX()
- getY()
- displayPoint()

---

# Quadrilateral Class

Superclass of all shapes.

Private variables:


Point point1;
Point point2;
Point point3;
Point point4;


Methods:

- Constructor to initialize four points
- displayPoints()

---

# Trapezoid Class

Inherited from Quadrilateral.

Additional variables:


double base1;
double base2;
double height;


Methods:


calculateArea()


Formula:

Area = ((base1 + base2) * height) / 2


---

# Rectangle Class

Inherited from Trapezoid.

Additional variables:


double length;
double width;


Methods:


calculateArea()



Formula:

Area = length * width


---

# Square Class

Inherited from Rectangle.

Additional variable:


double side;


Methods:


calculateArea()



Formula:

Area = side * side


---

# Main Class

Create objects for:

1. Trapezoid
2. Rectangle
3. Square


Display:

- Shape name
- Points
- Area


Example Output:


Trapezoid Area : 48.0

Rectangle Area : 50.0

Square Area : 25.0


---

## Submission Instructions

1. Complete all Java files.
2. Do not change class names.
3. Push your code to GitHub.
4. GitHub Actions will automatically evaluate your program.
