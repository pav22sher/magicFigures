package course.module1;

/**
 * Урок10: блок finally!
 */
public class Lesson10 {
    public static void main (String args[]){
        try{
            int divByZero = 1/0;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Блок finally 1");//это выполнится
        }
        System.out.println("После блока finally 1");//это выполнится
        System.out.println();//есть ли смысл в блоке finally?
        divByZero();//пример с методом
        System.out.println();//в методе виден смысл блока finally
    }

    private static void divByZero(){
        try{
            int divByZero = 1/0;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return;
        }
        finally{
            System.out.println("Блок finally 2");//это выполнится
        }
        System.out.println("После блока finally 2");//это не выполнится
    }
}
