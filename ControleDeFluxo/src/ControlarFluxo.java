import java.util.Scanner;

public class ControlarFluxo {
    public static void main(String[] args) { 

      
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um numero");
        int number1 = scanner.nextInt();

        System.out.println("insira outro numero");
        int number2 = scanner.nextInt();
    
        try{
         contar(number1, number2);
        } catch (invalidosexceptions e){

            System.out.println("o primeiro deve ser menor que o segundo");

        }
        


}
            

         static void contar (int number1, int number2) throws invalidosexceptions{

          if (number1>number2){
         throw new invalidosexceptions();
          }

          for (int i = number1; i <= number2; i++){
            
            System.out.println(i);

          }


         }
        }
            

        
    

