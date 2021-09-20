
package calculadoradematrices1;

public abstract class Operaciones {
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones p= new Operaciones() {};
        
        p.crearMatriz();
    }
    
    public void crearCarros(){
        CalculadoraDeMatrices1 suma= new CalculadoraDeMatrices1();
        
        suma.setM("");
        System.out.println(suma.getM());
    }

    private void crearMatriz() {
        
    }
    
}
