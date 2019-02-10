
import scala.io.StdIn._
object Vocales {
  def cantidadVocales(cad:String, posi:Int,voc:Int):Int={
   
    
		  if(posi<=cad.length()-1){
     
      if(cad.charAt(posi).toUpper=='A'||cad.charAt(posi).toUpper=='E'||cad.charAt(posi).toUpper=='I'||cad.charAt(posi).toUpper=='O'||cad.charAt(posi).toUpper=='U'){
          println(voc)
        cantidadVocales(cad,posi+1,voc+1)
        return voc
      }else{
       cantidadVocales(cad,posi+1,voc+1)
      }
    }else{
       return voc

    }
  }
  def main(args: Array[String]): Unit = {
    println("Ingrese la cadena a leer")
    var cad=readLine()
    println(cantidadVocales(cad,0,0))
  }
}