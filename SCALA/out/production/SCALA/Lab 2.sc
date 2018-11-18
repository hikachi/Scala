def sumuj (mainlist:List[(Int,Int)]):Int={

  def sumrec(lista:List[(Int,Int)],suma1:Int,suma2:Int):Int={
    lista match {
      case Nil => suma1/suma2
      case hd::tl => sumrec(tl,suma1+hd._1,suma2+hd._2 )
    }

  }
  sumrec(mainlist,0,0)
}

def xd(x:Int)={
  (x<0)  match{
    case true=> 0
    case false=> 1
  }
}
xd(-5)
val x=(4,1)::(4,1)::Nil
sumuj(x)


val testlist =1::2::3::4::5::6::7::8::9::10::Nil

def pred(x:Int)={
  if(x>5){
    true
  }
  else false
}


def a(y:Double,x:Double): Double ={
  y-x
}
def zad3(x:Double,y:Double,z:Double=>Double,a:Double=>Double)=
{
  scala.math.pow(x,y)



}

zad3(0,3,2,0)