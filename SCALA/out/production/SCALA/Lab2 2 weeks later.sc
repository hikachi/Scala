/*
def zd5ahelp(a:Int,x:Int,b:Int):(Int,Int,Int)={
  (x>b) match
  {
    case true => (a,b,b)
    case false => (a,x,b)
  }
}
def zd5a(a:Int,x:Int,b:Int):Int= {
  (x<a) match {
    case true => a
    case false => x
  }
}

val compo= (zd5a _ tupled) compose(zd5ahelp _ tupled)
compo (3,5,8)

def zd5b(x:Double,y:Double,x2:Double,y2:Double):Double={
  (scala.math.pow((y2-y),2))+(scala.math.pow((x2-x),2))
}
def pierwiastek(x:Double): Double =
{
  scala.math.sqrt(x)
}

val compoB= (pierwiastek _)compose(zd5b _ tupled)
compoB(1,2,1,2)
compoB (3,5,3,10)

*/
def zd5c(t:Double,s:Double):(Double,Double)=
{
  ((s/t),t)

}

def przyspieszenie(v:Double,t:Double) :Double=
{
  v/t

}

val compoC= (przyspieszenie _ tupled) compose (zd5c _ tupled)

compoC(3.0,6.0)