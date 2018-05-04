package cn.hjx
//在Scala中，类并不用声明为public。
//Scala源文件中可以包含多个类，所有这些类都具有公有可见性。
class HelloScalaClass {

}
object HelloScalaClass{
  def main(args: Array[String]): Unit = {
    val p=new Person
    println(p.id)
    println(p.age)
    

    new Student("aa",11)

  }
}
class Person {
  //用val修饰的变量是只读属性,有getter但没有setter
  val id = "9527"
  //用var修饰的变量既有getter,又有setter
  var age: Int = 18
  //类私有字段,只能在类的内部使用
  private var name: String = "唐伯虎"
  //对象私有字段,访问权限更加严格,Person类的方法只能访问到当前对象的字段
  private[this] val pet = "小强"
}
class Student(val name:String,val age:Int){
  println("执行了Student主构造器")
}
