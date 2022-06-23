package Practice_7_1;

public class ListCopy {
    private int length;
    private Object[] obj;
    private int index = 0;

    public ListCopy(int length) {
        this.length = length;
        obj = new Object[length];
    }

    public void add(Object o) {

        if (index == length) {

            Object[] newobj = new Object[length + length / 2];
            System.arraycopy(obj, 0, newobj, 0, length);

            newobj[length] = o;
            obj = newobj;
            index++;
            length = length + length / 2;
        } else {
            obj[index] = o;
            index++;
        }

    }

    public void show() {
        for (Object o : obj) {
            System.out.println(o);
        }
    }

    public int size() {
        return index;
    }

    public Object get(int i) {
        return obj[i];
    }


    public boolean contain(Object hello) {
        for (Object o : obj) {
            if(o!=null){
                if (o.equals(hello)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean remove(int i) {
        if(i>index){
            return false;
        }else{
            Object[] newobj=new Object[length];
            System.arraycopy(obj,0,newobj,0,i);
            System.arraycopy(obj,i+1,newobj,i,length-i-1);
            obj=newobj;
            index--;
            return true;
        }
    }
}
