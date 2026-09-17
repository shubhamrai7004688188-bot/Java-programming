public class methodOverloading {

        static int add (int a, int b){
            int sum= a+b;
            return sum;

        }
        static int add(int a, int b, int c){
            int sum= a+b+c;
            return sum;
        }

        public static void main(String[] args) {
            int result = add(6, 5);
            int result2 =add(7,8 ,9 );
            System.out.println("sumof two no is " + result);
            System.out.println("sum of three no " + result2);

        }
    
    
}
