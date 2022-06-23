package Practice_1;

/**
 * ①抛出异常throw
 * 在java中，提供了一个throw关键字，它用来抛出一个指定的异常对象。那么，抛出一个异常具体如何操作呢？
 * 1. 创建一个异常对象。封装一些提示信息(信息可以自己编写)。
 * 2. 需要将这个异常对象告知给调用者。怎么告知呢？怎么将这个异常对象传递到调用者处呢？通过关键字throw就可以完成。
 * throw 异常对象。throw用在方法内，用来抛出一个异常对象，将这个异常对象传递到调用者处，并结束当前方法的执行。
 */

public class ThrowDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 22};
        int index = 4;
        int element = getElement(arr, index);
        System.out.println(element);
        System.out.println("over");
    }

    /*
     * 根据 索引找到数组中对应的元素
     */
    public static int getElement(int[] arr, int index) {
        //判断  索引是否越界
        if (index < 0 || index > arr.length - 1) {
             /*
             判断条件如果满足，当执行完throw抛出异常对象后，方法已经无法继续运算。
             这时就会结束当前方法的执行，并将异常告知给调用者。这时就需要通过异常来解决。
              */
            throw new ArrayIndexOutOfBoundsException("哥们，角标越界了~~~");
        }
        int element = arr[index];
        return element;
    }
}