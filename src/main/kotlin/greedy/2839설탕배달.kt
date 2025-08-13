package greedy

//
////
////
/////*
////2839 설탕배달.kt
////
////설탕을 최소한의 봉지로 이동시키고싶음
////5kg과 3kg의 봉지가 있음
////
////
////
////입력
////첫번째줄에 설탕의 무개 N
////N은 3 <= N <= 5000
////
////출력
////봉지의 최소갯수 / 만들수 없다면 -1
////
////
////몫 / 나머지 %
////
////설탕 5를 저장할곳
////설탕 3을 저장할 곳
////나머지를 저장할곳
////
////
////
//// */
////
////
////
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toInt() // 18
//    var ans = -1
//
//    var sugarFive = n / 5   //3
//    var rest = n % 5    // 3
//    var sugarThree = rest / 3 //1
//
//
//    if (rest == 0) {
//        print(sugarFive)
//        return@with
//    }
//
//
//    while (true) {
//        rest = n - (sugarFive * 5)
//
//        if (sugarFive <0) {
//            ans = -1
//            break
//        }
//
//
//        if (rest % 3 == 0) {
//            sugarThree = rest /3
//            ans = sugarFive + sugarThree
//            break
//        } else {
//            sugarFive--
//        }
//
//    }
//
//    print(ans)
//
//}
////
////
////
////fun main() = with(System.`in`.bufferedReader()) {
////    val n = readLine().toInt()
////    var sugarFive = n / 5
////    var ans = -1
////
////    while (sugarFive >= 0) {
////        val rest = n - (sugarFive * 5)
////        if (rest % 3 == 0) {
////            val sugarThree = rest / 3
////            ans = sugarFive + sugarThree
////            break
////        }
////        sugarFive--
////    }
////
////    print(ans)
////}