
import scala.io.StdIn._
object Vocales {
  def cantidadVocales(cad:String, posi:Int,voc:Int):Int={
   
    
		  if(posi<=cad.size){
     
      if(cad.charAt(posi)=='A'||cad.charAt(posi)=='E'||cad.charAt(posi)=='I'||cad.charAt(posi)=='O'||cad.charAt(posi)=='U'){
       
       println(voc)
        cantidadVocales(cad,posi+1,voc+1)
        return voc
      }else{
       if(posi==cad.size){
          cantidadVocales(cad,posi,voc)
       }else{
         cantidadVocales(cad,posi,voc)
       }
     
      }
      
    }else{
      return 0
    }
  }
  def main(args: Array[String]): Unit = {
    println("Ingrese la cadena a leer")
    var cad=readLine()
    println(cantidadVocales(cad,0,0))
  }
}