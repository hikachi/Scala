def irepeat[A](x:Int)(llist:Stream[A]):Stream[A]= {
    def helper(element: A, reps: Int, tail: Stream[A]):Stream[A] ={
      if (reps == 0) tail
      else helper(element, reps - 1, element #:: tail)
  }
  llist match{
    case Stream.Empty=>Stream.Empty
    case head #::tail=> helper(head,x,irepeat(x)(tail))
  }
}