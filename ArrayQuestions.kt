fun reverseArray(array: IntArray) {
    var start = 0
    var end = array.size - 1
    while (start < end) {
        // Swap elements at start and end indices
        val temp = array[start]
        array[start] = array[end]
        array[end] = temp

        // Update indices
        start++
        end--
    }
}

fun fibonacci() {
    var previous = 0
    var next = 1
    val number = 8
    for (i in 0..number) {

        print("$previous + ")

        val sum = previous + next
        previous = next
        next = sum
    }

}

fun addTwoArray() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)
    val resultArray = IntArray(array1.size + array2.size)

    for (i in array1.indices) {
        resultArray[i] = array1[i]
    }

    for (i in array2.indices) {
        resultArray[i + array1.size] = array2[i]
    }

    println("Array 1: ${array1.contentToString()}")
    println("Array 2: ${array2.contentToString()}")
    println("Result array: ${resultArray.contentToString()}")
}

fun getSortOfAnArray() {
    val array = intArrayOf(1, 2, 33, 4, 5)
}

fun getMaxOfAnArray() {
    val array = intArrayOf(1, 2, 33, 4, 5)
    var max = 0

    for (i in array.indices) {
        if (array[i] > max) {
            max = array[i]
        }
    }
    print(max)
}


fun getMinOfArray() {

    val array = intArrayOf(12, 2, 33, 4, 5)
    var min = array[0]

    for (i in array.indices) {
        if (min > array[i]) {
            min = array[i]
        }
    }

    print(min)

}

fun sortArray() {
    val array = intArrayOf(12, 2, 33, 4, 5)
    for (i in array.indices) {
        for (j in i + 1 until array.size) {
            if (array[i] > array[j]) {
                var temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }

    }
    println(array.contentToString())

}

fun sumArray() {
    var sum = 0
    val array = intArrayOf(12, 2, 33, 4, 5)

    for (i in array.indices) {
        sum += array[i]

    }
    println(sum)


}

fun facrtorial() {
    var count = 0
    var number = 5
    for (i in 1..10) {
        println(number * i)
    }
}

fun main() {
    fibonacci()
    facrtorial()
    val sum = Array(2) {
        intArrayOf(3)
    }




    addTwoArray()
    sumArray()

    val array = intArrayOf(1, 2, 33, 4, 5)
    println("Original array: ${array.contentToString()}")

    // Reverse the array using loop
    reverseArray(array)

    println("Reversed array: ${array.contentToString()}")
    getMinOfArray()
    sortArray()


}