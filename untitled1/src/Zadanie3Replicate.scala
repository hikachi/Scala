def replicate[A](x:A,n:Int):List[A]={
  if(n==0){
    List()
  }
  else{
    List(x):::replicate(x,n-1)
  }
}
