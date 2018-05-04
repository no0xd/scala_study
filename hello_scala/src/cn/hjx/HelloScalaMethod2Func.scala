package cn.hjx

object HelloScalaMethod2Func {

  def m1(x:Int,y:Int):Int=x+y

  val f1=m1 _

  def main(args: Array[String]): Unit = {
    val res=f1(1,2)
    println(res)

  }

}
