package pack2;

public class Teacher extends Person{//Teacher类继承Person类，获得父类属性
	 public Course Course;//添加Teacher类的特有属性(所授课程)
	 Teacher (String i,String n,String s){
	  super(i,n,s);//super()实例化子类，为父类属性赋值
	 }
	 public void Selectcourse (Course ce) {
		 this.Course = ce;
	 }
	 public String toString() {//重写toString()方法，将相关属性以既定方式输出显示
	  return "编号:"+this.ID+" 姓名:"+this.Name+" 性别:"+this.Sex+" 所授课程:"+this.Course.Name;
	 }

	}

