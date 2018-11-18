
def potega2 (x:Float, n:Int) = {

  def licz(acc: Float, podstawa: Float, n: Int): Float =
    n match {
      case 0 => acc
      case _ => if (n % 2 == 0) licz(acc, podstawa * podstawa, n / 2)
      else licz(acc * podstawa, podstawa * podstawa, n / 2)
    }
}//koniec match


def potega(x: Float, n: Int):Float = {
  if (n == 0) {
    1
  }
  else {
    if (n % 2 == 1) {
      x * potega(x, n - 1)
    }

    else potega(x, n / 2) ** 2
  }
}

potega(2,3)