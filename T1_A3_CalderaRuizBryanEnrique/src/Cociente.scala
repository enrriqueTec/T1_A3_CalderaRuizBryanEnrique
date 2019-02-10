
import scala.io.StdIn._

object Cociente {
  def divisores(divisor:Double, dividendo:Double){
    
    if (divisor>dividendo){
      
      if(dividendo==divisor){
        println(divisor/dividendo)
      }else{
        var num=divisor/dividendo
         
        if(num- Math.floor(num)==0){
         println(num)
          divisores(divisor, dividendo+1)
        }else{
          divisores(divisor, dividendo+1)
        }
      }
    }else{
      println("Ya hay divisore enteros")
    }
  }
  def main(args: Array[String]): Unit = {
    println("Ingrese el número divisor")
    var div=readInt()
    println("Ingrese el número dividendo")
    var dividendo=readInt()
    divisores(div, dividendo)
  }
}