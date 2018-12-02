

sealed  trait LazyTR[String,Int]
case class LLeaf (value:()=>Int) extends LazyTR[String,Int]
case class LNode( ope:()=>String,left:()=>LazyTR[String,Int],right:()=>LazyTR[String,Int])extends LazyTR[String,Int]



//def ll(x:Int)={x}
val t=LNode(()=>"+",  ()=>LLeaf( ()=>20), ()=> LNode(()=> "*",()=> LLeaf(()=>2),()=>LLeaf( ()=>2)))

def dzia(t:LazyTR[String,Int]):Int={
  t match{
    case LNode(op,l,r)=> (op()) match{
      case "+"=> dzia(l())+ dzia(r())
      case "-"=> dzia(l())-dzia(r())
      case "*"=>dzia(l())*dzia(r())
    }
    case le:LLeaf => le.value()
  }
}

dzia(t)


sealed  trait LTR[String,Int]
case class LLLeaf (value:Int) extends LTR[String,Int]
case class LLLNode( ope:String,child:Stream[ LTR[String,Int] ])extends LTR[String,Int]
/*
def ldzia(t:Stream[ LTR[String,Int] ]):Int={
  t.take(1).toList match{
    case LLLNode(op,tail)=> (op) match{
      case "+"=> ldzia(tail)+ ldzia(tail)
      case "-"=> ldzia(tail)-ldzia(tail)
      case "*"=>ldzia(tail)*ldzia(tail)
    }
    case le:LLLeaf => le.value
  }
}
//LLLeaf(20) #::LLLeaf(12) #::Stream.empty
val t2=LLLNode("+",Stream.cons(LLLeaf(1),Stream.cons(LLLeaf(23),Stream.empty)))

//ldzia(t2)