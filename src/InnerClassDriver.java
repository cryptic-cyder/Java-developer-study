public class InnerClassDriver {

    public static void main(String[] args) {

        InnerClassInterface innerClassInterface = new InnerClassInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous inner class...");
            }
        };

        innerClassInterface.sayHello();
    }
}
