import kotlin.random.Random

//import kotlin.random.Random
//fun main() {
//    var number = 1
//    while(number <= 5){
//        println("Число: $number")
//        number++

//    var number = 1
//    while(number <= 10){
//        println(number)
//        number++
//        if (number == 5){
//            println("Останавливаемся на $number")
//            break
//        }
//    }

//    var number = 0
//    while(number < 10){
//        number++
//        if(number == 3){
//            println("Останавливаемся на $number")
//            continue
//        }
//        println(number)
//    }

//    println("Напишите что-нибудь (для выхода выведите 'выход'):")
//    while(true){
//        val input = readLine()
//        if (input == "выход"){
//            println("До свидание!")
//            break
//        }
//        println("Вы ввели: $input")
//    }

//    var letter = 'A'
//    while (letter <= 'Z'){
//        print(letter)
//        letter++
//    }
//
//    var lever = 0
//    println("Добро пожаловать в Подземелье!")
//    while (lever < 5) {
//        println("\nВы на уровне $lever.")
//        println("Выберите действие: [1] Вперёд | [2] Осмотреться | [0] Сдаться")
//        val input = readLine()
//        when (input) {
//            "1" -> {lever++
//                println("Вы переходите на уровне $lever")}
//            "2" -> {println("Вы осматриваетесь. Тут ничего интересного $lever")
//                continue}
//            "0" -> {println("Вы сдались. Игра окончена $lever")
//                break}
//            else -> {println("Неверный ввод. Попробуйте снова.")
//                continue}
//        }
//
//
//        if (lever == 5)
//            println("Поздравляем! Вы выбрались из под земелья!")
//
//
//    }

//    print("Введите пароль: ")
//    var password: String? = readln()
//
//    while (password != "qwerty"){
//        print("Введите пароль: ")
//        password = readln()
//    }
//    println("Доступ разрешён!")
//var password: String?
//
//do {
//    print("Введите пароль: ")
//    password = readln()
//} while (password != "qwerty")
//
//println("Доступ разрешён!")


//    for (i in 1..5) {
//    println("Шаг $i")
//    }


//    val fruits = listOf("apple", "banana", "cherry")
//    for (fruit in fruits)    {
//        println("Фрукт: $fruit")
//    }

//    val sentence = "Kotlin is awesome"
//    val words = sentence.split(" ")
//    println(words)

//    val data = "apple,banana,orange"
//    val fruits  =data.split(",")
//    for (fruit in fruits){
//        println(fruit)
//    }

//    val messy = "word1,word2;word3|word4"
//    val parts = messy.split(",",";","|")
//    println(parts)

//    val fullName = "Иванов Иван"
//    val parts = fullName.split(" ")
//    val lastName = parts[0]
//    val firstName = parts[1]
//    println("Фамилия: $lastName, Имя: $firstName")

//    print("Введите числа через пробел: ")
//    val input = readln()
//    val number = input.split(" ")
//    var sum = 0
//    for (numbers in number){
//        sum += numbers.toInt()
//    }
//    println("Сумма чисел: $sum")

//   print("Введие первое число, знак операции и второе число через пробел: ")
//   val input = readln().split(" ")
//    val symbol = input[1]
//    val firstNumber = input[0].toDouble()
//    val secondNumber = input[2].toDouble()
//    var result = 0.0
//    when (symbol){
//        "/" -> result = firstNumber / secondNumber
//        "*" -> result = firstNumber * secondNumber
//        "+" -> result = firstNumber + secondNumber
//        "-" -> result = firstNumber - secondNumber
//        else -> println("Некоректный ввод")
//    }
//    println("$firstNumber $symbol $secondNumber = $result")
//    println(Random.nextInt())
//}

//import  kotlin.random.Random
//fun main() {
//    println(Random.nextLong())
//    println(Random.nextFloat())
//    println(Random.nextDouble())
//    Random.nextInt(  100)
//    Random.nextInt(  1,   100)
//    Random.nextLong( 100)
//    Random.nextLong( 1,  100)
//    Random.nextDouble( 5.0)
//    Random.nextDouble( 0.0,  5.0)
//}

//import kotlin.random.Random
//fun main(){
//    val target = Random.nextInt(1,100)
//    println("Угадай число от 1 до 100")
//    while (true){
//        print("Введите число: ")
//        val input = readln().toInt()
//when {
//    input < target -> println("Загадочное число больше.")
//    input < target -> println("Загадочное число меньше.")
//    else -> {
//        println("Поздравляю! Ты угадал число: $target")
//    }
//}
//    }
//}

fun main(){
    val dice1 = Random.nextInt(1, 7)
    val dice2 = Random.nextInt(1,7)
    val sum = dice1 + dice2
    println("Первый кубик: $dice1")
    println("Второй кубик: $dice2")
    println("Сумма: $sum")
}
