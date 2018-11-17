val testlist =1::2::3::4::5::6::7::8::9::10::Nil
val testlist2=11::22::33::44::55::66::77::88::99::Nil


def leftsum (l1:List[Int]):Int={
  l1.foldLeft(0)((a,b)=>a+b)
  }

def rightsum(l1:List[Int]):Int={
  l1.foldRight(0)((a,b)=>a+b)
}

leftsum(testlist)
rightsum(testlist)


def reverser(l1:List[Any]):List[Any]={
l1.foldLeft(List[Any]()){(x,y)=> y::x}

}
reverser(testlist)

def contact(l1:List[Any],l2:List[Any]):List[Any]={
   l1.foldRight(l2){(x,y)=>x::y}
}
contact(testlist,testlist2)

def append (l1:List[Any] ,x:Any):List[Any]={

  l1.foldRight(List(x)){(x,y)=>x::y}
}
append(testlist,"XDD")