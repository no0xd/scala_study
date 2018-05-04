package cn.hjx
import scala.collection.mutable.ListBuffer
//序列其实就是List
object HelloScalaSeq {
  def main(args: Array[String]): Unit = {
    //------------------不可变的序列
    val list0=List(1,2,3)
    println(list0)
    val list1=0::list0
    println(list1)
    val list2=list0.::(0)
    println(list2)

    val list3=0+:list0
    println(list3)
    val list4=list0.+:(0)
    println(list4)

    //综上,:: 和 +: 都是插入到List最前面

    //:+则是追加到后面,从出现的位置上也可以区分出来
    val list5=list0:+4
    println(list5)
    val list6=list0.:+(4)
    println(list6)

    //将两个List追加到一起
    val lst0=List(1,2,3)
    val lst1=List(4,5,6)
    //++操作时,与元素所处的先后位置有关
    val lst2=lst0++lst1
    //List(1, 2, 3, 4, 5, 6)
    println(lst2)
    val lst3=lst1++lst0
    //List(4, 5, 6, 1, 2, 3)
    println(lst3)

    //++:插入到之前
    val lst4=lst0++:lst1
    println(lst4)
    val lst5=lst1.++:(lst0)
    println(lst5)

    //:::与list的先后顺序有关系
    val lst6=lst0:::lst1
    println(lst6)
    val lst7=lst1:::lst0
    println(lst7)



    //:+ 会把lst1整个插入到List中,作为一个元素
    val lst8=lst1:+lst0
    println(lst8)


    //-------------可变序列

    val lb0=ListBuffer[Int](1,2,3)
    val lb1=new ListBuffer[Int]

    lb0+=4
    println(lb0)
    lb1.append(5)
    println(lb1)

    //将lb1中的元素添加到lb0中,没有生成新的List
    lb0++=lb1;
    println(lb0)

    //生成了一个新集合
    val lb2=lb0++lb1
    println(lb2)
    //生成了一个新集合
    val lb3=lst0:+5
    println(lb3)



















  }
}
