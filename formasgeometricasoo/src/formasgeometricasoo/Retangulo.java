package formasgeometricasoo;
import java.lang.Math;
public class Retangulo {
    private Ponto a, b;    //criando dois pontos para representar o retângulo 
    public Retangulo(){
        this.a=new Ponto(); this.b=new Ponto(2,1); //criando retângulo padrão 0,0; 2,1        
    }
    public Retangulo(Ponto a, Ponto b){
        this.a = a; this.b = b;      
    }       //criando retângulo que pode ser definido

    public double area(Retangulo a){
        return (Math.abs(a.a.getX() - a.b.getX())* Math.abs(a.a.getY() - a.b.getY()));         
    }       //criando função que calcula a área de um retângulo
    
    public double perimetro(Retangulo a){
        return (Math.abs(a.a.getX() - a.b.getX())*2 + Math.abs(a.a.getY() - a.b.getY())*2);
    }       //criando função que calcula o perímetro de um retângulo
    public Ponto getA() {
        return a;
    }

    public void setA(Ponto a) {
        this.a = a;
    }

    public Ponto getB() {
        return b;
    }

    public void setB(Ponto b) {
        this.b = b;
    }
}
