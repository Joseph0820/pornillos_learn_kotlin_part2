//1
fun main() {
  // Write your code below
  for(i in 1..5){
    println("Hello, Codey!")
    println("i = $i")
  }
}
//2
fun main() {
  println("-- 1st for loop output --")
  // Write your code below
  for (i in 10 downTo 1) {
    println("i = $i")
  }
  println("\n-- 2nd for loop output --")
  // Write your code below
  for (j in 1 until 10) {
    println("j = $j")
  }
  println("\n-- 3rd for loop output --")
  // Write your code below
  for (k in 1..10 step 2) {
    println("k = $k")
  }
}
//3
fun main() {
  val mySchedule = listOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")
 
  val myTasks = setOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")

  println("-- mySchedule Output --")
  // Write your code below
  for (task in mySchedule) {
    println(task)
  }
  println("\n-- myTasks Output --")
  // Write your code below
  for ((taskIndex, task) in myTasks.withIndex()) {
    println("$taskIndex: $task")
  }
}
//4
fun main() {
  val favoriteColors = mapOf("Jesse" to "Violet", "Megan" to "Red", "Tamala" to "Blue", "Jordan" to "Pink")
  
  println("\n-- Key: Value Output --")
  // Write your code below
  
  println("\n-- Only Values Output --")
  // Write your code below
  
}
//5
fun main() {
  var counter = 0
  var index = 0
  val schoolGrades = listOf("Kindergarten", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th")

  println("-- counter Output --")
  // Write your code below
  while (counter < 5) {
    println(counter)
    counter +=1
  }
  println("\n-- Elementary School Grades --")
  // Write your code below
  while (schoolGrades[index] != "6th") {
    println(schoolGrades[index])
    index++
  }
}
//6
fun main() {
  var index = 0
  val celsiusTemps = listOf(0.0, 87.0, 16.0, 33.0, 100.0, 65.0)
  val fahr_ratio = 1.8
  var fahr: Double

  println("-- Celsius to Fahrenheit --")
  // Write your code below
  do {
    fahr = celsiusTemps[index] * fahr_ratio + 32.0
    println("${celsiusTemps[index]}C = ${fahr}F")
    index ++
  } while (fahr != 212.0)
}
//7
fun main() {
  // Write your code below
  for (i in 1..6) {
    for (j in 'A'..'F') {
      print("$j$i ")
    }
    println()
  }
}
//8
fun main() {
  val rooms = listOf("Kitchen", "Living Room", "Basement", "Bathroom")

  println("-- Room Search --")
  for (room in rooms) {
    print("$room: ")
    // Write your code below
    if (room == "Living Room") {
      println("Found It!")
      break
    }
    println("Found Nothing.")
  }

  println("\n-- Divide By Zero --")
  for (number in 12 downTo -12 step 4) {
    // Write your code below
    if (number == 0) {
      continue
    }
    println("120/number = ${120/number}")
  }
}
//9
fun main() {
  // Write your code below
  grid@ for (i in 1..6) {
    for (j in 'A'..'F') {
      // Write your code below
      if (j == 'C') {
        continue@grid
      }
      print("$j$i ")
    }
    println()
  }
}
//10
// Write your code below
fun smores() {
  println("Roast a marshmallow.")
  println("Place marshmallow on a graham cracker.")
  println("Place chocolate on marshmallow.")
  println("Put a new graham cracker on chocolate.")
  println("Enjoy!")
}

fun main() {
  // Write more code below
  smores() 
}

//11
// Write your code below
fun getSpeed(distance: Int, time: Int) {
  var speed = distance / time
  println("$speed meters per second")
}

fun main() {
  // Write more code below
  getSpeed(10, 3)
  
}
//12
// Write your code below
fun getPrice(price: Double, couponCode: String = "None") {
  var finalPrice: Double

  if (couponCode == "save15") {
    finalPrice = price * .85
  } else {
    finalPrice = price
  }
 
 println("The total price is $finalPrice.")
}

fun main() {
  // Write more code below
  getPrice(price = 48.0, couponCode = "save15")
  
}
//13
// Write your code below
fun ozToTsp(oz: Double): Double {
  var tsp = oz * 6
  return tsp
}

fun main() {
  // Write more code below
  var tspNeeded = ozToTsp(.75)
  println("You will need $tspNeeded tsp of vanilla extract for this recipe.")
}
//14
// Write your code below
fun ozToTsp(oz: Double): Double {
  var tsp = oz * 6
  return tsp
}

fun main() {
  // Write more code below
  var tspNeeded = ozToTsp(.75)
  println("You will need $tspNeeded tsp of vanilla extract for this recipe.")
}
//15
// Write your code below
fun pyramidVolume(l: Int, w: Int, h: Int) = (l * w * h) / 3


fun main() {
  var length = 5
  var width = 8
  var height = 14

  // Write more code below
  var volume = pyramidVolume(length, width, height)
  println("The volume of this pyramid is $volume.")
  
}
//16
fun main() {
  // Write your code below
  
  // anonymous function 
  var area = fun(base: Int, height: Int): Int {
    return (base * height) / 2
  }
  println(area(15, 19))

  // lambda expression
  var perimeter = {side1: Int, side2: Int -> (side1 + side2) * 2}
  println(perimeter(15, 24))

}
//17
class Book {
  val pages = 320
  val title = "Harry Potter and the Sorcerer's Stone"
  val author = "J.K. Rowling"
}

// Write your code above 📕

fun main() {
  
}
//18
class Building {
  val yearBuilt = 2016
  val height = 400 // Feet
  val type = "Limestone"
}

fun main() {
  // Write your code below 🏙
  var residentialBuilding = Building()
  println(residentialBuilding.yearBuilt) 
  println(residentialBuilding.height)
  println(residentialBuilding.type)
}

//19
// Write your class below 
class Person(val name: String, val age: Int, val favoriteColor: String)

fun main() {
  // Create your instances below 

  val me = Person("Maggie", 26, "Green")
  val myFriend = Person("Jose", 25, "Red")

  println("${me.name} is ${me.age} years old and my favorite color is ${me.favoriteColor}.")

  println("${myFriend.name} is ${myFriend.age} years old and their favorite color is ${myFriend.favoriteColor}.")

}
//20
class Employee(val firstName: String, val lastName: String, val yearsWorked: Int) {
  // Write your code below 
  val fullName = "$firstName $lastName"

  init {
    if (yearsWorked > 1) {
      println("$fullName is eligible for a raise!")
    } else {
      println("$fullName is not eligible for a raise just yet.")
    } 
  }
} 

fun main() {
  // Create an instance below 👩🏻‍💼
  val projectManager = Employee("Maria", "Gonzalez", 2)
}
//21
class Dog(val name: String, val breed: String, val competitionsParticipated: List<String>) {
  
  init {
    for (comp in competitionsParticipated) {
      println("$name participated in $comp.")
    }
  }

  // Write your function below 
  fun speak() {
   println("$name says: Woof!")
  }
}

fun main() {
  // Write your instance below 🐩
  var maxie = Dog("Maxie", "Poodle", listOf("Westminster Kennel Club Dog Show", "AKC National Championship"))
  maxie.speak()

}