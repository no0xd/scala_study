package cn.hjx

object HelloScalaTuple {
  def main(args: Array[String]): Unit = {
    //元组可以装多个不同的类型
    val t0=(1,"aaa",23.3)
    println(t0)
    //Map是对偶的集合,对偶是元组最简单的形式
    //获取元组中的元素也可以使用._加下标的方法,元组中的元素是从1开始的
    println(t0._1)

    //将对偶的集合转换成Map
    val arr=Array(("tom",85),("jerry",99))
    val map=arr.toMap
    println(map)

    //拉链操作
    val names=Array("tom","jerry","kitty")
    val scores=Array(85,99)
    //最终集合元素以较少元素的为主
    val ns=names.zip(scores)
    //ArrayBuffer((tom,85), (jerry,99))
    println(ns.toBuffer)
    //将对偶的集合转换为Map
    val map2=ns.toMap
    println(map2)



  }

}
