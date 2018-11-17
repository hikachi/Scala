def siema (x:(Int,Int,Int))={
  x._3+x._2+x._1
}
val k3=(1,"dziesiec","True")
val k4=(3,5,7)
val k5=1::3::5::7::Nil
siema(k4)
def lacz(lista:List[String],separator:String):String={
  if (lista.tail==Nil){
    lista.head}
  else lista.head+separator+lacz(lista.tail,separator)
}
val listawyrazow="czesc"::"jestem"::"adam"::Nil
lacz(listawyrazow,"@")




def wieksza(x:Int,lt:List[Int]):Boolean={
  if(lt.tail==List()){
    if(lt.head<x){
      true
    }
    else{
      false
    }
  }
  else{
    if(lt.head<x){
      wieksza(x,lt.tail)
    }
    else{
      false
    }
  }
}
wieksza(5,k5)