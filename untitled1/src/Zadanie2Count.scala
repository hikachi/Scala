def count[A](x:A, xs:List[A]):Int= {
if(xs==Nil)throw new Exception("pusta lista")
if(xs.length==0){ 0 }
else{
  if (xs.head==x){
    1+count(x,xs.tail)
  }
  else{
    0+count(x,xs.tail)
  }
}
}