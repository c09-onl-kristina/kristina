public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            int a = Integer.parseInt(arg);
            if(a>=0)
                count++;

        }
        System.out.println(count);


    }
}
