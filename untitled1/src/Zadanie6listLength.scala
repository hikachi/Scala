def listLength[A](xs:List[A]):Int={
  if(xs==List()){
    0
  }
  else{
    1+listLength(xs.tail)
  }
}
