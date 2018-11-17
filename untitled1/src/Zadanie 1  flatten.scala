def flatten[A](xss: List[List[A]]): List[A] = {
  if (xss.length == 0) {
    List()
  }
  else {
    xss.head ::: flatten(xss.tail)
  }
}
