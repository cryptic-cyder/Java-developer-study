public class TestGarbage1 {

    public void finalize(){
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        /*catch (Exception e){
            System.out.println("An exception occurs...");
        }*/

        finally {   // if particular exception is not handled then finally block will definitely be executed
            System.out.println("Rest of the code...");
        }

        //System.out.println("Rest of the code...");

        /*try{
            //int a=4, b=0;
            //System.out.println(a/b);

            String s = null; //null value
            System.out.println(s.charAt(0));
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch (NullPointerException e){
            System.out.println("Null-Pointer exception");
        }*/


        /*TestGarbage1 s1 = new TestGarbage1();
        TestGarbage1 s2 = new TestGarbage1();

        s1=null;
        s2=null;

        System.gc();*/
    }

}
