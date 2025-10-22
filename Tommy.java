package tommy;
public class Tommy {
    private int age; //成员变量1
    private String name; //成员变量2
    //构造器
    
    public Tommy(String name) {
        this.name = name;
        System.out.println("小狗的名字是 : " + name);
    }
    
    //设置age的值
    public void setAge(int age){
        this.age = age;
    }
    
    //获取age的值
    public int getAge(){
        return age;
    }
    
    //获取name的值
    public String getName(){
        return name;
    }
    
    public static void main(String[] args) {
        //创建一个对象
        Tommy mypuppy = new Tommy("Tommy");
        
        //通过方法来设定age的值
        mypuppy.setAge(2);
        
        //调用另一个方法获取age
        int age = mypuppy.getAge();
        System.out.println("小狗的年龄为：" + age);
        System.out.println("变量值 :" + mypuppy.getAge());
    }
}
