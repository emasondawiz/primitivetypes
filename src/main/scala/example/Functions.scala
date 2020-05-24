package example

object Function {

    def max(x:Int,y:Int):Int = {
    if(x > y) 
    x
    else
    y
} 

    def power(x:Int) : Double= math.pow(x,2)

    def isOddNumber(x:Int):Boolean={
        if(x%2==0) true
        else false
    }

    def intMultiples(x:Int):List[Int]=List(1,2,3,4,5).map(_*x)
}
