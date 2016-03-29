import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 使用迭代器
 * Created by Archer on 2016/3/29.
 */
public class IteratorDemo01 {

    public static void main(String[] args) {
        List<String> mList=new ArrayList<String>();

        mList.add("A");
        mList.add("B");
        mList.add("C");
        mList.add("D");
        mList.add("E");
        mList.add("F");
        mList.add("G");

        //初始化迭代器,使用remove方法

        Iterator<String> iterator=mList.iterator();
        while (iterator.hasNext()){
            String string=iterator.next();
            if ("A".equals(string)){
                iterator.remove();
            }else{
                System.out.println(string);

            }
        }

    }
    /**
     *
     */
}
