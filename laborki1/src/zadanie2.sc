def eachNth(l:List[Int],x:Int):List[Int]={
  if(l.length==0) {
    List()
  }else {


    if (x == 0) {
      l.head :: eachNth(l.tail, x)
    }
    else {

      eachNth(l.tail, x - 1)
    }
  }
}

val l1=1::2::3::4::5::6::7::8::9::10::Nil;;
eachNth(l1,3)