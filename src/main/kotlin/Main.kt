fun main() {
numbers()

}
//
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements
//(ii) prints out the index of 158
//(iii) prints out the elements in ascending order.
fun numbers(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sumNums=numbers[2] +numbers[5]
    println(sumNums)
    println(numbers.sum())
    println(numbers.indexOf(158))
    println(numbers.sorted())
    var person=Person("Jemima",19,5.0,59.0)
    println(names("Biology","Geography","Mathematics").contentToString())

}
//2. Given a list of Person objects, each with the attributes, name,
//age, height, and weight. Sort the list in order of descending age
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)


//3. Create a function that takes in 3 names and returns a string array
//containing all 3 names.
fun names(subject1:String,subject2: String,subject3: String):Array<String>{
    var allSubjects= arrayOf(subject1,subject2,subject3)
    return allSubjects


}

//4. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of all the vehicles in the list.
data class Car(var registration:String,var mileage:Double)

