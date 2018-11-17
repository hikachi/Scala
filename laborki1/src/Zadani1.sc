import scala.collection.immutable

def listsum(l1:List[Int],l2:List[Int]):List[Int]={
  if(l1==List() || l2==List()){
    List()
  }
  else{
    List(l1.head+l2.head) ++ listsum(l2.tail,l1.tail)
  }
}

val testlista1=1::2::3::4::5::Nil;;
val testlista2=1::2::3::4::5::Nil;;
listsum(testlista1,testlista2)


def dlugosc[A](lista:List[A]):Int={
  if(lista==List()){
    0
  }
  else{
    1+dlugosc(lista.tail)
  }
}

dlugosc (testlista1)


def lacz(lista:List[String]):String={
  if (lista.tail==Nil){
    lista.head}
  else lista.head+lacz(lista.tail)
}
val listawyrazow="czesc"::"jestem"::"adam"::Nil
lacz(listawyrazow)