package poo3;

public class Electrodomestico {
	   
    //Constantes
   
    //PONER EL COLOR POR DEFECTO COMO BLANCO
	
    protected final static String COLOR_DEF="blanco";
   

    //CONSUMO ENERGETICO POR DEFECTO COMO "F"

    protected final static char CONSUMO_ENERGETICO_DEF='F';
   

    //PRECIO BASA PARA CADA ELECTRODOMESTICO

    protected final static double PRECIO_BASE_DEF=100;
    
   //PRECIO POR DEFECTO PARA CADA ELECTRODOMESTICO
    
    protected final static double PESO_DEF=5;
   
    //ATRIBUTOS
   
   //PRECIO BASE
    
    protected double precioBase;
   
    //COLORES 

    protected String color;
  
    //CONSUMO ENERGETICO
  
    protected char consumoEnergetico;
   
    //PESO
    
    protected double peso;
   
    //METODOS
   
    private void comprobarColor(String color){ //PRIVADO
   
        //Colores disponibles
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEF;
        }
          
          
    }
      
    //COMPROBAR CONSUMO ELECTRICO
    
    public void comprobarConsumoEnergetico(char consumoEnergetico){ //VOID
          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        }
          
    }
   
    //GETTERS Y SETTERS

    
    public double getPrecioBase() {
        return precioBase;
    }
   
    public String getColor() {
        return color;
    }
   
 
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    
    public double getPeso() {
        return peso;
    }


    //MODULO PRECIO FINAL
    
    public double precioFinal(){
        double plus=0;
        switch(consumoEnergetico){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }
   
        return precioBase+plus;
    }
   
    //CONSTRUCTOR POR DEFECTO

    public Electrodomestico(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   
    /*CONSTRUCTOR CON 2 PARAMETROS 
     * (preciobaso y peso)*/
    
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   
    
    /* 
     * CONSTRUCTOR DE 4 PARAMETROS
     * (precio base, peso, consumoelectronico y color)
     * */
    
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
   
}