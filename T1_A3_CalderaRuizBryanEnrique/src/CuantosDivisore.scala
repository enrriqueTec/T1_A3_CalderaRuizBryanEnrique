import scala.io.StdIn._

object CuantosDivisore {
   def divisores(divisor:Double, dividendo:Double,cont:Int):Int={
   var a=0
    if (divisor>dividendo){
      
      if(dividendo==divisor){
        println(divisor/dividendo)
      }else{
        var num=divisor/dividendo
         
        if(num- Math.floor(num)==0){
         a =cont+1
          divisores(divisor, dividendo+1,cont+1)
        }else{
          divisores(divisor, dividendo+1,cont)
        }
      }
    }else{
      println("Ya hay divisore enteros")
    }
    return cont
  }
  def main(args: Array[String]): Unit = {
    println("Ingrese el número divisor")
    var div=readInt()
    println("Ingrese el número dividendo")
    var dividendo=readInt()
    println(divisores(div, dividendo,0))
  }
}