package Task21;
//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
public class Task21 {
    public static void main(String[] args) {
        String string = new String();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        //String time
        long startTime = System.currentTimeMillis();
        for (int i =0; i <1000;i++) {
            string = string+string+string;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time for String: " + (endTime-startTime) + "ms");

        //StringBuilder Time
        long startTime1 = System.currentTimeMillis();
        for (int i =0; i <1000;i++) {
            stringBuilder.append(1);
            stringBuilder.append(1);
            stringBuilder.append(1);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Total execution time for String: " + (endTime1-startTime1) + "ms");

        //StringBuffer Time

        long startTime2 = System.currentTimeMillis();
        for (int i =0; i <1000;i++) {
            stringBuffer.append(1);
            stringBuffer.append(1);
            stringBuffer.append(1);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Total execution time for String: " + (endTime2-startTime2) + "ms");
    }

}
