def flatten[A](xss: List[List[A]]): List[A] = {
  if (xss.length == 0) {
    List()
  }
  else {
    xss.head ::: flatten(xss.tail)
  }
}
val l1=1::2::3::4::Nil
val l2=5::6::7::8::9::Nil
val lista=l1::l2::Nil
flatten(lista)
