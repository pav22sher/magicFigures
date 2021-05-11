package course.module1;

/**
 * Урок9: порядок важен!
 */
public class Lesson9 {
    public static void main (String args[]){
        try {
            int divByZero = 30 / 0;
            int a[] = new int[5];
            a[10] = 2;
        } catch (ArithmeticException e){ //сначало указываются более узкие исключения
            System.out.println(e.getMessage());
        } catch (Exception e) { //потом более широкие (ArithmeticException наследник Exception)
            System.out.println(e.getMessage());
        }/* catch (ArrayIndexOutOfBoundsException e){//нельзя ставить наследника Exception после Exception
            System.out.println(e.getMessage());      //т.к. все исключения поймает блок выше
        }*/
    }
}
