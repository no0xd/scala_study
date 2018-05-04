package cn.hjx

object HelloScala {
  def main(args: Array[String]): Unit = {
    println("hello scala")
    val x=123
    //块表达式
    //else () class Unit 相当于java中的void
    val y={ if(x<100) 1 }
    println(y)

    //DSL风格
    for(i <- 1.to(10)){
      print(i+"\t")
    }

    println()

    val arr=Array(1,2,3)
    for(a<-arr){
      print(a+"\t")
    }

    println()




    //每个生成器都可以带一个条件 if前面没有分号
    for(i<-1 to 3;j<-1 to 3 if i!=j){
      print(10*i+j+"\t")
    }

    println()

    //for 推导式 如果for循环的循环体以yield开始,则该循环会构建出一个集合
    //Vector(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    //每次迭代都会生成集合中的一个值
    val v=for(i<-1 to 10 ) yield i*10
    println(v)
    //DSL原型 map中应用的是一个自定义的函数
    val v2=1.to(10).map(_*10)
    println(v2)

    val v3=for(i <- 1 to 10 if i%2==1) yield i
    println(v3)

    val intArr=1 to 10
    val v4=intArr.filter(_%2==1)
    println(v4)

    //until 相当于[0,10) 前闭后开 避开了下标越界问题
    for(i <-0 until intArr.length){
      print(intArr(i)+"\t")
    }

    println()
    //RichInt 隐式转换 进行了方法增强
    //操作符重载 -相当于是方法名
    val v5=1.-(10)
    println(v5)
    val intVal=1
    val v6=1.-(10)
    println(v6)
    val intVal2=10
    val valv7=intVal.-(intVal2)
    println(valv7)

    //在scala到处都是对象  .后面都是方法名
    //a.b(c) <==> abc a调用方法名的b的方法,传入的参数是c
    //a.-(c) <==> a-c 具象化上面的描述

    //在scala的世界里 一切皆是对象
    //函数式的强大之处之一就在于,函数作为一个引用,或者说作为一个实例,是可以作为参数传入到方法中的,可以认为是一个特殊的方法
    //此处还有柯里化的情况,使用方法也可以作为参数传入方法之中
    //这样的话,方法里的资源就可以经由这个自定义的函数进行操作
    //由此,实现了业务逻辑(自定义的函数)和被操作的资源之间的解耦

    val r=1 to 10
    val f1=(x:Int)=>x*10
    val f2=(x:Int)=>x+10

    println(r.map(f1))
    println(r.map(f2))
    //此处相当于是一个匿名函数
    r.map(_*10)

    r.map( (x:Int)=>(x*10) )
    //r里面的元素是Int
    r.map( (x)=>(x*10) )

    r.map( _*10 )


    //方法的参数是函数,该函数输入的参数是一个Int,返回的是一个Int,x是该函数的引用
    def m0(f:Int=>Int):Int={
      //此处执行了函数
      f(3)
    }
    val f0=(x:Int)=>x*11

    val res0=m0(f0)
    println(res0)

    //当函数传入方法之后,如果以后要修改,只需要改变函数的定义,因为方法的定义如果不可更改的话,此时修改函数就可以更改相应的操作
    //相当于是业务逻辑的修改,实现了资源与操作的解耦




    //val arr0指向的数组是不可以改变了,但是数组里的元素的值是可以改变的
    val arr0=Array(1,2,3,4,5)
    arr0(1)=200
    println(arr0)
    println(arr0.toBuffer)
    arr0.map(println(_))



















  }



}
