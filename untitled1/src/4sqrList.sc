def sqrList(xs:List[Int]):List[Int]={
  if(xs.length==0){
    List()
  }
  else{
    List(xs.head*xs.head):::sqrList(xs.tail)
  }
}