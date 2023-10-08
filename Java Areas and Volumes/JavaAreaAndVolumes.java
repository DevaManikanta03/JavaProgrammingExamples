// import java.util.Scanner;
/* 1. Write a program that computes the area of circle. */
// class AreaOfCircle{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the radius : ");
//         double radius = input.nextDouble();
//         double area = Math.PI * Math.pow(radius, 2);
//         System.out.printf("The Area of circle: %.3f CM^2", area);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Write a program that computes the Area of a triangle. */
// class AreaOfTriangle{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of base (b): ");
//         double b = input.nextDouble();
//         System.out.print("Enter the value of height (h): ");
//         double h = input.nextDouble();

//         double area = (0.5) * b * h;
//         System.out.printf("The area of triangle is: %.3f CM^2" , area);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program that computes the Area of a triangle --- Heron's formula . */
// class AreaOfTriangleHeronFormula{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of a : ");
//         double a = input.nextDouble();
//         System.out.print("Enter the value of b : ");
//         double b = input.nextDouble();
//         System.out.print("Enter the value of c : ");
//         double c = input.nextDouble();

//         double s = (a + b + c) / 2;
//         System.out.printf("The value of S : %.3f",s);

//         double area = Math.sqrt(s * (s-a) * (s - b) * (s - c));
//         System.out.printf("\nThe area of the triangle is: %.3f", area); 
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program that computes the Area of a Parallelogram. */
// class AreaOfParallelogram{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the base of the parallelogram (b) : ");
//         double b = input.nextDouble();
//         System.out.print("Enter the height of the parallelogram (h) : ");
//         double h = input.nextDouble();

//         double area = b * h;
//         System.out.printf("The Area of parallelogram : %.3f", area);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program that computes the Area of a Rhombus. */
// class AreaOfRhombus{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the length of diagonal 1 (d1) : ");
//         double d1 = input.nextDouble();
//         System.out.print("Enter the length of diagonal 2 (d2) : ");
//         double d2 = input.nextDouble();

//         double area = (d1 * d2) / 2;
//         System.out.printf("The Area of Rhombus: %.3f", area);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program that computes the Area of a Trapezium. */
// class AreaOfTrapezium{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Parallel Side Length - 1 (l1) : ");
//         double l1 = input.nextDouble();
//         System.out.print("Enter the Parallel Side Length - 2 (l2) : ");
//         double l2 = input.nextDouble();
//         System.out.print("Enter the Height of the Trapezium (h) : ");
//         double h = input.nextDouble();

//         double area = ((l1 + l2) * h) / 2;
//         System.out.printf("The area of trapezium: %.3f", area);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 7. Write a program that computes the Volume and Surface Area of a Cone. */
// class ConeSurfaceAreaAndVolume{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the radius of the Cone (r) : ");
//         double r = input.nextDouble();
//         System.out.print("Enter the height of the Cone (h) : ");
//         double h = input.nextDouble();

//         double slantHeight = Math.sqrt(Math.pow(r, 2) + Math.pow(h,2));
//         double SA = Math.PI * ((r * slantHeight) + Math.pow(r, 2));    //Surface Area - SA
//         double volume = (Math.PI * Math.pow(r, 2) * h) / 3;

//         System.out.printf("The Slant height of Cone : %.3f", slantHeight);
//         System.out.printf("\nThe Surface Area of Cone : %.3f", SA);
//         System.out.printf("\nThe Volume of Cone : %.3f", volume);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 8. Write a program that computes the Volume and Surface Area of a Cuboid. */
// class CuboidVolumeSurfaceArea{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the length of the cuboid (l) : ");
//         double l = input.nextDouble();
//         System.out.print("Enter the width of the cuboid (w) : ");
//         double b = input.nextDouble();
//         System.out.print("Enter the height of the cuboid (h) : ");
//         double h = input.nextDouble();

//         double SA = 2 * ((l*b) + (b*h) + (h*l)); 
//         double volume = l * b * h;

//         System.out.printf("The Surface Area of Cuboid: %.3f", SA);
//         System.out.printf("\nThe Volume of Cuboid : %.3f", volume);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 9. Write a program that computes the Volume and Surface Area of a Sphere. */
// class SphereVolumeAndSurfaceArea{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the radius of the Sphere (r) : ");
//         double radius = input.nextDouble();
        
//         double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;
//         double SA = 4 * Math.PI * Math.pow(radius, 2);

//         System.out.printf("The Surface Area of the Sphere : %.3f", SA);
//         System.out.printf("\nThe Volume of the Cuboid : %.3f", volume);

//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 10. Write a program that computes the Perimeters of a Circle, Rectangle, and Trianlge. */
// class PerimetersOfCircleRectangleTriangle{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Radius of the Circle (r) : ");
//         double r = input.nextDouble();
        
//         double perCircle = 2 * Math.PI * r; //Perimeter of Circle
//         System.out.printf("The Perimeter of Circle : %.3f\n",perCircle);
//         System.out.print("-----------------------------------------\n");
//         System.out.print("Enter the Sides of Triangle: ");
//         System.out.print("\nEnter the value of Side 1 (S1): ");
//         double s1 = input.nextDouble();
//         System.out.print("Enter the value of Side - 2 (S2): ");
//         double s2 = input.nextDouble();
//         System.out.print("Enter the value of Side - 3 (S3): ");
//         double s3 = input.nextDouble();

//         double perTriangle = s1 + s2 + s3;  //Perimeter of Triangle
//         System.out.printf("The Perimeter of Triangle : %.3f\n",perTriangle);
//         System.out.print("-----------------------------------------\n");
//         System.out.print("Enter the Sides of the Rectangle: \n");
//         System.out.print("Enter the Length of the Rectangle: ");
//         double l = input.nextDouble();
//         System.out.print("Enter the Width of the Rectangle: ");
//         double w = input.nextDouble();

//         double perRectangle = 2 * (l + w);  //Perimeter of Rectangle
//         System.out.printf("The Perimeter of Rectangle : %.3f\n",perRectangle);
        
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 11. Write a program that computes the Area and Perimeter Rectangle. */
// class PerimeterAreaRectangle{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Length of Rectangle (l) : ");
//         double l = input.nextDouble();
//         System.out.print("Enter the Width of Rectangle (w) : ");
//         double b = input.nextDouble();

//         double perRectangle = 2 * (l + b);
//         double areaRectangle = l * b;

//         System.out.printf("The Area of the rectangle : %.3f",areaRectangle);
//         System.out.printf("\nThe Perimeter of the rectangle : %.3f", perRectangle);
//     }
// }