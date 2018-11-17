def palindrome[A](xs:List[A]):Boolean={
  if(xs.reverse==xs){
    true
  }
  else{
    false
  }
}