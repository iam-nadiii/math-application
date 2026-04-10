public class MathApp {
    public static void main(String[] args) {

       /* 1.Create two variables to represent the salary for Bob and Gary, name them
            bobSalary and garySalary. Create a new variable named
            highestSalary. Determine whose salary is greater using Math.max() and
            store the answer in highestSalary. Set the initial salary variables to any value
            you want. Print the answer (i.e "The highest salary is ...")
        */

        int bobSalary = 3000,  garySalary = 2990;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is $" + highestSalary + ".");

//        2. Find and display the smallest of two variables named carPrice and
//                truckPrice. Set the variables to any value you want.

        int carPrice = 20000, truckPrice = 60000;

        System.out.println("The cheapest price for trucks or cars is $" + Math.min(carPrice, truckPrice));



        // 3. Find and display the area of a circle whose radius is 7.25
        double area = Math.PI * 7.25 * 7.25;

        System.out.printf("The area of the circle is %.2f.", area);
        System.out.println();



        // 4. Find and display the square root a variable after it is set to 5.0
        double finalValue =  Math.sqrt(5.0);
        System.out.printf("The square root of 5.0 is %.2f.\n", finalValue);



//        5. Find and display the distance between the points (5, 10) and (85, 50)
        double distance = Math.sqrt(Math.pow((85-5), 2) + Math.pow((50-10), 2));

        System.out.printf("The distance between the points (5, 10) and (85, 50) is %.2f.\n", distance);


//        6. Find and display the absolute (positive) value of a variable after it is set to -3.8
        double absoluteValue = -1 * -3.8;

        System.out.println("The absolute value of -3.8 is " + absoluteValue + ".");

//        7. Find and display a random number between 0 and 1
        System.out.printf("An example of a random number between 0 and 1 is %.2f.\n", Math.random());

//        8. Calculate how many minutes are in 24 days, use a variable for each value you
//calculate with. BONUS: How many milliseconds?

        int numberOfMinutes = 24 * 24 * 60;

        int numberOfMilliSeconds = numberOfMinutes * 60 * 10;

        System.out.println("Ther are " + numberOfMinutes + " minutes in 24 days.");

        System.out.println("There are " + numberOfMilliSeconds + " seconds in 24 days. ");



    }
}






