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


def zd5c(t:Double,s:Double):(Double,Double)=
{
  (s/t,t)

}

def przyspieszenie(v:Double,t:Double) :Double=
{
  v/t

}

val compoC= (przyspieszenie _ tupled) compose (zd5c _ tupled)

def  zd2(predykat:(Int)=>Boolean,lista:List[Int]):List[Int] ={

  def help(predykat:(Int)=>Boolean,l1:List[Int],l2:List[Int]): List[Int] ={
    l1 match {
      case Nil=> l2
      case hd::tl=> if (predykat(hd)==true)
        help(predykat,tl,hd::l2)
      else{
        help(predykat,tl,l2)
      }
    }
  }
  help(predykat,lista,Nil)
}



val testlist =1::2::3::4::5::6::7::8::9::10::Nil
zd2 (x=>x>5, testlist)

def rownanie (x:Double)(y:Double)(a:Double)(z:Double):Double= {
  scala.math.pow(x,z)*scala.math.pow(y,a)/ scala.math.pow((x+y),(z+a))

}

rownanie(1.0)(5.0)(0.0)(3.0)

// FUNKCJE



def sigma (x:Double)(y:Double)(a:Double)(z:Double):Double=
{
  def rownanie (x1:Double,y2:Double) (a:Double,z:Double)(sum:Double):Double=
  {
    if (x1==y2)
    {
      sum
    }
    else
    {
      rownanie((x1+1.0),y2) (a,z)(sum+scala.math.pow(x, z) * scala.math.pow(y, a) / scala.math.pow((x + y), (z + a)))
    }
  }

  rownanie(x,y)(a,z)(0.0)
}
def mnozenie (x:Double)(y:Double) (a:Double) (z:Double):Double= {
  def helper (x1:Double,y2:Double)(a:Double,z:Double)(ilo:Double):Double= {
    if (x1==y2)
    {
      ilo
    }
    else
      {
        helper((x1+1.0),y2) (a,z) ((ilo * (sigma(x1)(y2)(a)(z))  ))
      }
  }
  helper(x,y)(a,z)(1.0)
}


rownanie(50.0)(123.0)(2.0)(3.0)
sigma(50.0)(123.0)(2.0)(3.0)
mnozenie(50.0)(123.0)(2.0)(3.0)

