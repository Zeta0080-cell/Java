package testarray;
public class TestArray {
    public static void main(String[] args) {
       double[] myList = {1.9, 2.9, 3.4, 3.5};
       
       //打印数组的所有元素
       for(int i = 0; i < myList.length; i ++)
       {
           System.out.println(myList[i] + " ");
       }
       
       // 查找最大元素
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);
    }
    
}
