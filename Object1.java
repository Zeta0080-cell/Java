package object1;
public class Object1 
{
    private int age;
    private String name;
    
    //构造器
    public  Object1(String name)
    {
        this.name = name;
        System.out.println("小狗的名字是" + name);
    }
    
    //设置age的值
    public void SetAge(int age)
    {
        this.age = age;
    }
    
    //获取age的值
    public int GetAge()
    {
        return age;
    }
    
    //获取name的值
    public String GetName()
    {
        return name;
    }
    
    //主方法
    public static void main(String[] args) 
    {
       //new一个对象
        Object1 object = new Object1("Tommy");
        //通过方法设置age
        object.SetAge(5);
        // 调用另一个方法获取 age
        int age = object.GetAge();
        System.out.println("小狗的年龄为 : " + age);
    }
}
