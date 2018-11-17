def listLength[A](xs:List[A]):Int={
  if(xs==List()){
    0
  }
  else{
    1+listLength(xs.tail)
  }
}
val xs=1::2::3::4::Nil
listLength(xs)