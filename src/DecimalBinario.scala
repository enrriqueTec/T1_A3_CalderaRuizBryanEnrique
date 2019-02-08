
import scala.io.StdIn._
object DecimalBinario {

	def binario(dec:Int){

		if(dec>0){
			if(dec>0){
				if(dec<2){
					print(dec)
				}else{
					binario(dec/2)
					print(dec%2)
				}
			}else{

			}
		}
	}
	def main(args: Array[String]): Unit = {
	  println("ingrese el número decimal a transformar ")
	  var dec=readInt()
			println("El numero binario es: ")
			binario(dec)
	}
}