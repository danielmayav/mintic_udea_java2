package co.mintic.udea.java2;

public class Personaje {
    //      ·····   ATRIBUTOS   ·····
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida = 100;

    //      ······  CONSTRUCTOR     ······
    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }

    //      ······   METODOS   ·······
    public void golpear(Personaje p) {
        double distancia = calcularDistanciaRespectoPersonaje(p);
        double hit = getDamage() / distancia;
        double vidaFinal = p.getVida() - hit;
        if((p.getVida() - hit) > 0) {
            p.setVida(vidaFinal);
        }
        else {
            p.setVida(0);
        }
    }

    public void recibirImpacto(double d) {
        double nuevaVida = (getVida()- d);
        if(nuevaVida > 0) {
        setVida(nuevaVida);
        }
        else setVida(0);
    }

    public double calcularDistanciaRespectoPersonaje(Personaje p) {
        double distancia;
        distancia = Math.sqrt(Math.pow(getPosicionX()- p.getPosicionX(),2 ) + Math.pow(getPosicionY() - p.getPosicionY(),2));
        return distancia;
    }

    //      ····    GETTERS    ····
    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public double getVida() {
        return vida;
    }

    //      ·····       SETTERS     ·······
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}
