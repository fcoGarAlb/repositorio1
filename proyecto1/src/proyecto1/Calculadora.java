
package proyecto1;

/**
 * Clase Calculadora
 * 
 * @author redes
 * @version 1.0
 * @since 01/2023
 */
public class Calculadora {
    
    // Atributos
    
    /**
     * Representa el operando primero de la operación
     */
    private int num1;
    /**
     * Representa el operando segundo de la operación 
     */
    private int num2;
    
    // Constructores
    
    /**
     * Inicializa la instancia con los dos números pasados
     * @param a Valor primero
     * @param b Valor segundo
     */
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    
    // Metodos publicos
    
    /**
     * Suma los operandos almacenados en el objeto
     * @return Devuelve el resultado de la suma
     */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
    /**
     * Resta al mayor operando al menor operando
     * @return Devuelve el resultado de la resta
     */
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
        
    /**
     * Comprueba si el primer operando es mayor que el segundo
     * @return Devuelve verdadero o falso
     */
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    
    /**
     * Multiplica los operandos almacenados en el objeto
     * @return Devuelve el resultado de la multiplicación
     */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    /**
     * Divide el primer operando entre el segundo del objeto
     * @return Devuelve el resultado de la división entera de los operandos
     */
    public int divide(){
        int result=num1/num2;
        return result;
    }
    
    /**
     * Divide el primer operando entre el segundo (este no puede ser 0)
     * @return <ul>
     *          <li>El resultado de la división entera</li>
     *          <li>null: Si el segundo operando es cero</li>
     *          </ul>
     */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }

    /**
     * Divide el primer operando entre el segundo (este no puede ser 0)
     * @return El resultado de la división entera
     * @throws java.lang.ArithmeticException si el segundo operando es 0
     */
    public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     *  Metodo principal de entrada al program hace una división
     * @param args los pasados desde la línea de comandos
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 2);
        System.out.println(calcu.divide0());
    }
}
