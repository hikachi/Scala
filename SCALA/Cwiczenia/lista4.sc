type ParaIX[Param]=(Int,Param)
type ParaIF=ParaIX[Float]
val x:ParaIF=(3,3.14f)
//Warianty

sealed trait Kolor
case object Trefl extends Kolor
case object Karo extends Kolor

sealed trait Karta
case class Blotka(kolor:Kolor,wartosc:Int)extends Karta
case class Walet(kolor:Kolor) extends Karta

val k1=Walet(Trefl)


val przedzial:Int=>Int=>List[Int]=a=>b=>if(a>b) Nil else b::(przedzial (a)(b-1))

def map[A,B](f:A=>B)(xs:List[A]):List[B]=xs match
  {
  case Nil=>Nil
  case x::xs=>f(x)::map(f)(xs)
}
//BT tree
sealed trait BT[+A]
case object Empty extends BT[Nothing]
case class Node[+A](elem:A, left:BT[A], right:BT[A]) extends BT[A]

val t = Node(1,Node(2,Empty,Node(3,Empty,Empty)),Empty)

def breadthBT[A](tree:BT[A])={
  def helper[A](q:List[BT[A]]):List[A]=
    q match{
      case Nil=>Nil
      case Empty::tail=>helper(tail)
      case Node(wartosc,lewo,prawo)::tail=> wartosc::helper(tail++List(lewo,prawo))
    }
  helper(List(tree))
}

def wewnatrznascieza[A](tree:BT[A]):Int={
  def helper[A](depth:Int,tre:BT[A]):Int=
    tre match{
      case Empty=>0
      case Node(_,lewo,prawo)=>depth + helper((depth+1),lewo)+helper((depth+1),prawo)
    }
  helper(0,tree)
}
wewnatrznascieza(t)
def zewnetrzna[A](tree:BT[A]):Int={
  def helper[A](depth:Int,tre:BT[A]):Int=
    tre match{
      case Empty=>depth
      case Node(_,lewo,prawo)=>helper((depth+1),lewo)+helper((depth+1),prawo)
    }
  helper(0,tree)
}


sealed trait Graphs[A]
case class Graph[A](succ: A=>List[A]) extends Graphs[A]

def breadthSearch[A] (g: Graph[A]) (startNode: A): List[A] = {
  def search(visited: List[A])(toVisit: List[A]): List[A] = toVisit match {
    case Nil => Nil
    case h::t =>
      if (visited contains h) search(visited)(t)
      else h::search(h::visited)((g succ h) ++ t)
  }
  search (Nil) (List(startNode))
}
