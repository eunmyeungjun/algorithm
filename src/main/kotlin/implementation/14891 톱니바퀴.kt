package implementation

import java.util.*

fun main()= with(System.`in`.bufferedReader()){
    val gears = Array<LinkedList<Char>>(4) { LinkedList() }
    for (i in 0 until 4) {
        val gearNum = readln()
        for (char in gearNum) {
            gears[i].add(char)
        }
    }
    val k = readln().toInt()

    for(i in 0 until k){
        val plan = readln().split(" ")
        val whatGear=plan[0].toInt() - 1
        val direction = plan[1].toInt()
        if(direction==1){
            when(whatGear){
                0->if (gears[0][2]==gears[1][6]){
                    rotate(gears,0)
                    break
                }
                else{
                    if (gears[1][2]==gears[2][6]){
                        rotate(gears,0)
                        deRotate(gears,1)
                        break
                    }
                    else {
                        if (gears[2][2] == gears[3][6]) {
                            rotate(gears, 0)
                            deRotate(gears, 1)
                            rotate(gears, 2)
                            break
                        } else {
                            rotate(gears, 0)
                            deRotate(gears, 1)
                            rotate(gears, 2)
                            deRotate(gears, 3)
                            break
                        }
                    }

                }
                1->if(gears[0][2]==gears[1][6]){
                    rotate(gears,1)
                    continue
                }
                    else {rotate(gears,1)
                    deRotate(gears,0)
                    continue


                }

            }




            }
        }

    }

fun rotate(gears : Array<LinkedList<Char>>,i :Int,) {
    gears[i].addFirst(gears[i].removeLast())
}
fun deRotate(gears: Array<LinkedList<Char>>, i: Int){
    gears[i].addLast(gears[i].removeLast())
}





































/* 이거 코드가 너무너무너무 길어지는데?
fun main()=with(System.`in`.bufferedReader()) {
    val gearFirst = readln().toMutableList().toCharArray()
    val gearSecond = readln().toMutableList().toCharArray()
    val gearThird = readln().toMutableList().toCharArray()
    val gearFourth = readln().toMutableList().toCharArray()
    val k = readln().toInt()


    for (i in 0 until k) {
        val (x, y) = readln().split(" ")
        val whatGear = x.toInt()
        val dircetion = y.toInt()
        when (whatGear) {
            1 -> if (dircetion == 1) {
                if (gearFirst[2] == gearSecond[6]) {
                    gearFirst.add(gearFirst
                } else {
                    if (gearSecond[2] == gearThird[6]) {
                        gearSecond.plus(gearSecond.drop(0))

                    } else {

                    }
                }
            }
            2->{}
            3->{}
            4-> {}

        }
    }
}
*/





