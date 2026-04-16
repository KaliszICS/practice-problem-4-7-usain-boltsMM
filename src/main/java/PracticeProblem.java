import java.util.Random;
public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int randomNumber(int num, int num1){
        Random random = new Random();
       
       int numero;
       
        numero = random.nextInt(num-1, num1+1);
        
        return numero;
        
    }
    
    public static char randomChar(String time){
        Random random = new Random();
        
        char character;
        
        character = time.charAt(random.nextInt(time.length()));
        
        return character;
    }    
    
    public static int randomEvenNumber(int num, int num2){
        Random random = new Random();
        
        int sombero;
        
        sombero = random.nextInt(num-1, num+1);
        
        return sombero*2;
    }

}
