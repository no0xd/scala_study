package cn.hjx
import scala.collection.immutable.HashSet
import scala.collection.mutable

object HelloScalaSet {
  def main(args: Array[String]): Unit = {
    //-----------不可变的Set
    val set0=new HashSet[Int]()
    println(set0)
    val set1=set0+4
    println(set1)
    //set中的元素不会重复
    val set3=set1++Set(4,5,6)
    //Set(5, 6, 4)
    println(set3)

    val set4=Set(1,3,4)++set1
    println(set4.getClass)

    //-------------------可变Set

    val set_0=new mutable.HashSet[Int]()
    //添加元素
    set_0+=1
    set_0.add(4)
    set_0++=Set(2,3,5)
    println(set_0)

    //移除元素
    set_0-=5
    set_0.remove(2)
    println(set_0)

  }
}
