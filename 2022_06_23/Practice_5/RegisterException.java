package Practice_5;


public class RegisterException extends Exception {
    public RegisterException(String message) {
        super(message);
    }

    public RegisterException() {

    }
}

class  Demo{
    private static String[] names={"lzt","zks","yl"};

    public static void main(String[] args) {
        try {
            CheckUsername("yl");
        }catch (RegisterException e){
            System.out.println(e.getMessage());
        }
    }
    public static boolean CheckUsername(String name) throws RegisterException {
        for ( String uname : names) {
            if(!name.equals(uname)){
                throw new RegisterException("亲,"+name+"已经被注册了");
            }
        }
        return true;
    }
}
