def zad3(x:List[(Double,Double)]):List[Double]={
  if(x.length==0){

   List()}
  else
    List(x.head._1+x.head._2)++zad3(x.tail)
}

val kr=(1.0,2.0)::(2.0,3.0)::(3.0,4.0)::Nil;;
zad3(kr)