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
    
    public boolean IsIn(Triangulo a, Ponto p){
        int contador=0;     //criando contador de quantas vezes a forma será tocada
        if(a.a.getX()< p.getX()){
            if(a.a.getY()>a.b.getY()&&p.getY()<=a.a.getY()&&p.getY()>=a.b.getY()){
                contador++;     //acrescentando no contador caso o valor Y no ponto A seja maior que no ponto B e se o ponto P estiver no intervalo entre os dois em Y
            }else{
               if(p.getY()>=a.a.getY()&&p.getY()<=a.b.getY()){
                   contador++;      //acrescentando no contador caso o valor Y no ponto B seja maior que no ponto A e se o ponto P estiver no intervalo entre os dois em Y
               } 
            }
            if(a.a.getY()>a.c.getY()&&p.getY()<=a.a.getY()&&p.getY()>=a.c.getY()){
                contador++;     //acrescentando no contador caso o valor Y no ponto A seja maior que no ponto C e se o ponto P estiver no intervalo entre os dois em Y
            }else{
               if(p.getY()>=a.a.getY()&&p.getY()<=a.c.getY()){
                   contador++;      //acrescentando no contador caso o valor Y no ponto C seja maior que no ponto A e se o ponto P estiver no intervalo entre os dois em Y
               } 
            }
        }else{
            if(a.b.getY()>a.c.getY()&&p.getY()<=a.b.getY()&&p.getY()>=a.c.getY()){
                contador++;     //acrescentando no contador caso o valor Y no ponto B seja maior que no ponto C e se o ponto P estiver no intervalo entre os dois em Y
            }else{
               if(p.getY()>=a.b.getY()&&p.getY()<=a.c.getY()){
                   contador++;      //acrescentando no contador caso o valor Y no ponto C seja maior que no ponto B e se o ponto P estiver no intervalo entre os dois em Y
               } 
            }   
        }
        return contador==1;
    }
    
    
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
