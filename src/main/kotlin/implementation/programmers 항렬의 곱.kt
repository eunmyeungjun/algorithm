package implementation



fun main(){
    val arr1  = arrayOf(arrayOf(1,4), arrayOf(3,2), arrayOf(4,1))
    val arr2 = arrayOf(arrayOf(3,3), arrayOf(3,3))
    var answer = arrayOf<IntArray>()

    val result = mutableListOf<Int>()

    for (i in 0 until arr1.size){
        result +=  (arr1[i][0] * arr2[i][0] )

    }









}



// (a11, a12), (a21, a22)
// (b11,b12) , (b21 ,b22)
// [  (a11*b11)+(a12 *b21) , (a11*b12) + (a12*b12) ]  , [a21*b12 + a22*b21     a21*b12 + a22 b22]