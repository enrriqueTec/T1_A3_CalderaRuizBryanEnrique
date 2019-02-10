import scala.io.StdIn._

object Factorial {
  
    def factorialRecursivo(n:Int):Int={
    
    if(n==0){
      1
    }else{
      factorialRecursivo(n-1)*n
    }
  }
  def main(args: Array[String]): Unit = {
    println("Ingrese el numero a saber su factorial")
    var factorial=readInt()
    println("El número factorial es: "+factorialRecursivo(factorial))
  }
}