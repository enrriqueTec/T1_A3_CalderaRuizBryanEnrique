import scala.io.StdIn._

object Sumatoria {
  def sumatoriaRecursivo(inicio:Int, fin:Int):Int={
    
    if(fin==inicio){
      return 0
    }else{
      return fin+ sumatoriaRecursivo(inicio,fin-1)
    }
  }
  def main(args: Array[String]): Unit = {
    println("Ingrese el inicio de la sumatoria")
    var inicio=readInt()
    println("Ingrese el fin de la sumatoria")
    var fin=readInt()
    
    println("La sumatoria es: "+sumatoriaRecursivo(1,10) )
    
  }
}