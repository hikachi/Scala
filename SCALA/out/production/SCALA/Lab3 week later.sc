val testlist =1::2::3::4::5::6::7::8::9::10::Nil
def append (l1:List[Any] ,x:Any):List[Any]={

  l1.foldRight(List(x)){(x,y)=>x::y}
}
append(testlist,"XDD")