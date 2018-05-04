package cn.hjx

object HelloScalaMap {
  def main(args: Array[String]): Unit = {
    //------------------两种Map,一种是immutable包下的Map,该Map中的内容不可变
    //创建Map方式一: 指向 ->
    val scores0=Map("tom"->85,"jerry"->99,"kitty"->100)
    println(scores0)
    //创建Map方式二: 元组 ()
    val scores1=Map(("tom",85),("jerry",99),("kytty",100))
    println(scores1)

    //获取和修改Map中的值
    println(scores1("tom"))
    println(scores1.getOrElse("jack",0))
    //下面将报错,因为map默认是不可变的相当于定长数组不可改变长度
    //    scores1("tom")=88
    //    println(scores1("tom"))

    //--------------------------另一种是mutable包下的Map,该Map中的内容可变
    val scores3=scala.collection.mutable.Map(("tom",85),("jerry",99),("kytty",100))
    scores3("tom")=88
    println(scores3)
    scores3-="jerry"
    scores3.remove("jerry")
    println(scores3)


  }
}
