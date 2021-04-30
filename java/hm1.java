import java.text.DecimalFormat;
import java.util.Random;

public class RandomTest2 {
    public static void main(String[] args) {
        int[] arr = new int[3];    //创建一个长度为3的数组
        int[] arr1 = new int[10];
        int x = 0;
        int count = 0;
        Integer loop = 100000000;
        Random random1 = new Random();
        Random random = new Random();               //随机产生数字
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");            //数字格式化输出形如111,111,111
        while(x <= loop){
            int index = 0;                           //初始化一个索引为0
            while (index < arr.length){                  //若索引号小于数组长度则进入循环
                int num = random.nextInt(101);          //在[0,101)内产生随机数
                if ( !contains(arr , num)){                   //若数字内不包含产生的随机数则执行if语句
                    arr[index++] = num;                        //将随机数装入数组
                }
            }
            /*for (int i = 0; i < arr.length; i++) {
                System.out.println("随机的三个数为：" +arr[i]);
            }*/
            int index1 = 10;
            int index2 = 0;
            while(index < index1 & index2 < arr1.length){
                int num1 = random1.nextInt(101);
                arr1[index2++] = num1;
            }
            /*for (int i = 0; i < arr1.length; i++) {
                System.out.println("随机的十个数字为：" + arr1[i]);
            }*/
            if (ArrayContains(arr, arr1)){
                count++;
            }
            x++;
        }

        String num = decimalFormat.format(loop*10);
        String Winnum = decimalFormat.format(count);

        System.out.println("中奖几率为：" + Winnum + "/" + num);
        System.out.println("约为：" + (float)count/(loop*10)*100 + "%");


        /*for (int i = 0; i < arr1.length; i++) {
            System.out.println("随机号码为：" + arr1[i]);           //打印输出产生的10个随机数字
        }*/

    }
    public static boolean contains(int [] arr, int key){             //创建一个判断数组内是否包含数字的方法
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){                                 //如果数组内包含关键数字返回ture
                return true;
            }
        }
        return false;
    }

    public static boolean ArrayContains(int[] arr2 , int[] arr3){
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if(arr2[i] == arr3[i]){
                    return true;
                }

            }

        }
        return false;
    }
}
