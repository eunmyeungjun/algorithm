package implementation

fun main()=with(System.`in`.bufferedReader()) {

    val alphabet = readln()
    val alphabetCount = alphabet.length
    val alphabetArray = alphabet.toCharArray()
    var result = alphabetCount
    val i = 0

    while (i in 0 until alphabetCount) {
        if (alphabetArray[i] == 'c' && alphabetArray[i + 1] == '=') {
            result -= 1
            continue
        }
        if (alphabetArray[i] == 'c' && alphabetArray[i + 1] == '-') {
            result -= 1
            continue
        }
        if (alphabetArray[i] == 'd' && alphabetArray[i + 1] == 'z' && alphabetArray[i + 2] == '=') {
            result = result - 2
            continue
        }
        if (alphabetArray[i]=='d' && alphabetArray[i+1]=='-'){
            result -=1
            continue
        }
        if(alphabetArray[i]=='l' &&alphabetArray[i+1]=='j'){
            result -=1
            continue
        }
        if(alphabetArray[i]=='n' &&alphabetArray[i+1]=='j'){
            result -=1
            continue
        }
        if(alphabetArray[i]=='s' &&alphabetArray[i+1]=='='){
            result -=1
            continue
        }
        if(alphabetArray[i]=='z' &&alphabetArray[i+1]=='='){
            result -=1
            continue
        }

    }
    println(result)
}

