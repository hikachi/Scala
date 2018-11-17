
sealed  trait TR[String,Int]
case class Leaf (value:Int) extends TR[String,Int]
case class Node(ope:String,left:TR[String,Int],right:TR[String,Int])extends TR[String,Int]

def dzia(t:TR[String,Int]):Int={
  t match{
    case Node(op,l,r)=> op match{
      case "+"=> dzia(l)+ dzia(r)
      case "-"=> dzia(l)-dzia(r)
      case "*"=>dzia(l)*dzia(r)
    }
    case le:Leaf => le.value
  }
}

val t=Node("+",Leaf(10),Node("*",Leaf(2),Leaf(2)))
dzia(t)
