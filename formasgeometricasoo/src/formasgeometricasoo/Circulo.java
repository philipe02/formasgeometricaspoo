package formasgeometricasoo;

public class Circulo {
    private double raio;    //representando o círculo com raio e um ponto centro
    private Ponto centro;   
    
    public Circulo(){   // criando circulo padrão onde centro no ponto 0,0 e raio 1
        this.centro=new Ponto(); raio=1;
    }
    
    public Circulo(Ponto p, double raio){   //criando círculo que pode ser definido
        this.centro = p;this.raio=raio;
    }
    
    public double area(Circulo a){
        return (Math.PI*Math.pow(a.getRaio(), 2));
    }       //criando função que calcula área de um círculo
    
    public double perimetro(Circulo a){
        return (2*Math.PI*a.getRaio());
    }       //criando função que calcula perímetro de um círculo
    
    public boolean isIn(Circulo a, Ponto b){    //criando função pra testar se o ponto está dentro do círculo
        return a.getCentro().distancia(b) <= a.getRaio();
    }        

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }
}
