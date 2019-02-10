import scala.io.StdIn._

object Divisores {
  def divisoresRecursivo(num:Int,divisor:Int){
   
    if(num>=divisor){
      if(num%divisor==0){
        println(divisor)
        divisoresRecursivo(num,divisor+1)
      }else{
        divisoresRecursivo(num,divisor+1)
      }
    }
  }
  def main(args: Array[String]): Unit = {
    println("Ingrese el número a obtener divisores")
    var num=readInt()
    println("Los divisores son:")

    divisoresRecursivo(num,1)
  }
}