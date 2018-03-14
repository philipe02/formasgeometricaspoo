package formasgeometricasoo;
import java.lang.Math;
public class Ponto {
    private double x, y;     //criando as coordenadas do ponto
    public Ponto(){     //definindo ponto padrão como 0,0
        x=0; y=0;
    }
    public Ponto(double x, double y){   // criando ponto que pode ser definido
        this.x=x; this.y=y;
    }
    
    public double distancia(Ponto a){   //criando função que calcula distância entre o ponto que chama a função e outro passado por parâmetro
        return Math.sqrt(Math.pow(a.x-this.x,2)+ Math.pow(a.y-this.y,2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}
