package implementation

class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var curX = 0
        var curY = 0


        for (i in 0 until park.size){
            for (j in 0 until park[i].length-1){
                if (park[i][j] == 'S'){
                    curX = i
                    curY = j
                    break
                }
            }
        }

        for (route in routes){
            val (dir , dis) = route.split(" ")
            val distance = dis.toInt()

            for(k in 0 until distance){
                when(dir){
                    "N" -> {
                        if (curX <= 0 || park[curX - 1][curY] == 'X') {
                            curX += k
                            break
                        }
                        curX--
                    }
                    "S" -> {
                        if (curX >= park.size - 1 || park[curX + 1][curY] == 'X') {
                            curX -= k
                            break
                        }
                        curX++
                    }
                    "E" -> {
                        if (curY >= park[0].length - 1 || park[curX][curY + 1] == 'X') {
                            curY -= k
                            break
                        }
                        curY++
                    }
                    "W" -> {
                        if (curY <= 0 || park[curX][curY - 1] == 'X') {
                            curY += k
                            break
                        }
                        curY--
                    }
                }

            }

        }
        return intArrayOf(curX,curY)
    }
}