package cn.hjx

import scala.collection.mutable.ArrayBuffer

object HelloScalaArray {
  def main(args: Array[String]): Unit = {
    //---------------定长数组
    //使用new,相当于调用了数组的apply方法,直接为数组赋值
    val arr1=new Array[Int](8)
    //直接打印定长数据,基内容为类型加hashcode
    println(arr1)
    //将数组转换成数组缓冲,就可以看到缓冲中的内容
    //ArrayBuffer(0, 0, 0, 0, 0, 0, 0, 0)
    println(arr1.toBuffer)

    val arr2=Array[Int](10)
    //ArrayBuffer(10)
    println(arr2.toBuffer)

    //Array中可以放置不同的类型
    val arr3=Array("hadoop",1,"spark")
    println(arr3(2))


    //----------------------变长数组
    val ab=ArrayBuffer[Int]()
    ab+=1
    ab+=(2,3,4,5)
    ab++=Array(6,7)
    ab++=ArrayBuffer(8,9)
    //ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(ab)
    //指定下标插入
    ab.insert(0,-1,0)
    println(ab)
    //指定下标处删除元素个数,包含当前下标的元素
    ab.remove(0,2)
    println(ab)

    //----------------------遍历数组
    val arr=Array(1,2,3,4,5,6,7,8)
    for(i<-arr){
      print(i+"\t")
    }
    println()
    //逆序
    for(i<-(0 until arr.length).reverse){
      print(arr(i)+"\t")
    }
    println()

    //--------------------数组转换
    val arr_0 =Array(1,2,3,4,5,6,7,8)
    //yield实现
    val res0=for(i<-arr_0) yield i*2
    println(res0.toBuffer)
    //map实现
    val res1=arr_0.map(_*2)
    println(res1.toBuffer)
    //综上,map实现要更简洁

    //过滤偶数元素*2 yield实现
    val res2=for(i<-arr_0 if(i%2==0)) yield i*2
    println(res2.toBuffer)
    //过滤偶数元素*2 filter&map 实现
    val res3=arr_0.filter(_%2==0).map(_*2)
    println(res3.toBuffer)
    //综上,使用函数的方式要更简洁,并且有着更好的可读性

    //--------------数组常用算法
    //最大值
    val r0=arr_0.max
    println(r0)
    //求和
    val r1=arr_0.sum
    println(r1)
    //排序
    val r2=arr.sorted
    println(r2.toBuffer)
    //会生成一个新的Array((),(),()..)
    arr_0.map(println(_))
    //不会生成新的Array
    arr_0.foreach(println)








  }


}
