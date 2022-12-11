public class App {
    public static void main(String[] args) throws Exception {
       
        /* Escribir los char desde el final hasta el principio */
        
        char [] arr = {'a','m','o','r'};
        int j = arr.length-1;
        for (int i = j; i>=0; i--){
            System.out.println(arr[i]);
        }
        
        String frase = "Hola mundo";
        char [] arr2 = frase.toCharArray();
        for(int i = arr2.length -1; i>=0; i--){
            System.out.print(arr2[i]);
        }

    }
}
