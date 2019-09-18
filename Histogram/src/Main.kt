import java.util.Scanner

fun main() {

    var grade = 0
    var totalGrade = 0
    var averageGrade: Any
    var numberOfStudents = 0
    var passingStudents = 0
    var highest = 0
    var lowest = 100
    var failRow = String()
    var cGradeRow = String()
    var bGradeRow = String()
    var aGradeRow = String()
    var sGradeRow = String()

    println("Lowest and Highest Marks are 0 to 100 ")
    println("To see the results Please Enter a value over 100 ")


    while (grade <= 100) {
        println("Please enter a valuer between 0 to 100")
        val input = Scanner(System.`in`)
        val result:Int = input.nextInt()

        if (result < 0) {
            println("Please enter a valuer between 0 to 100")
        }else if (result >=0 && (result <= 39)) {

            grade = result
            totalGrade += grade
            numberOfStudents++
            failRow += "*"
            if (grade > highest){
                highest = grade
            }
            if (grade < lowest){
                lowest = grade
            }

        }else if (result >=40 && (result <= 49)) {

            grade = result
            totalGrade += grade
            numberOfStudents++
            passingStudents++
            cGradeRow += "*"
            if (grade > highest) {
                highest = grade
            }
            if (grade < lowest) {
                lowest = grade
            }

        }else if (result >=50 && (result <= 59)) {

            grade = result
            totalGrade += grade
            numberOfStudents++
            passingStudents++
            bGradeRow += "*"
            if (grade > highest) {
                highest = grade
            }
            if (grade < lowest) {
                lowest = grade
            }
        }else if (result >=60 && (result <= 69)) {

            grade = result
            totalGrade += grade
            numberOfStudents++
            passingStudents++
            aGradeRow += "*"
            if (grade > highest) {
                highest = grade
            }
            if (grade < lowest) {
                lowest = grade
            }
        }else if (result >=70 && (result <= 100)) {

            grade = result
            totalGrade += grade
            numberOfStudents++
            passingStudents++
            sGradeRow += "*"
            if (grade > highest) {
                highest = grade
            }
            if (grade < lowest) {
                lowest = grade
            }
        }else if (result >= 101) {


            println("Number of students added in the system are $numberOfStudents")
            println("The total grade added is $totalGrade")
            averageGrade = (totalGrade / numberOfStudents).toDouble()
            println("The average grade is $averageGrade")
            println("The number of passing students are $passingStudents")
            println("The highest grade is $highest")
            println("The lowest grade is $lowest")
            println("Here are the results")
            println("|0 -  39 |$failRow")
            println("|40 - 49 |$cGradeRow")
            println("|50 - 59 |$bGradeRow")
            println("|60 - 69 |$aGradeRow")
            println("|70 - 100|$sGradeRow")

            grade = result
        }
    }

}

/*

 */