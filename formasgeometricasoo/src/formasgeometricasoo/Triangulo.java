package formasgeometricasoo;
public class Triangulo {
    private Ponto a, b, c;
    public Triangulo(){
        this.a =new Ponto(); this.b=new Ponto(1,1); this.c=new Ponto(2,0);
    }       //criando triângulo padrão como 0,0; 1,1 e 2,0
    
    public Triangulo(Ponto a, Ponto b, Ponto c){
        this.a=a; this.b=b; this.c=c;
    }       //criando triângulo que pode ser definido
    
    public double area(Triangulo a){
        return ((a.a.getX()*a.b.getY())+(a.b.getX()*a.c.getY())+(a.c.getX()*a.a.getY())-(a.a.getY()*a.b.getX())-(a.b.getY()*a.c.getX())-(a.c.getY()*a.a.getX()));
    }       //criando função que calcula a área do triângulo
    
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

    public Ponto getC() {
        return c;
    }

    public void setC(Ponto c) {
        this.c = c;
    }
        
}
