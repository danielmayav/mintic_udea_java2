package co.mintic.udea.java2;

public class Jugador extends Personaje{

    private int numeroBotiquines = 0;

    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }
    //      ·······     METODOS     ·······
    public void usarBotiquin() {
        if(numeroBotiquines > 0) {
            if(getVida() < 95){
                double vida = getVida() + 5;
                setVida(vida);
                numeroBotiquines--;
            }
            else {
                setVida(100);
                numeroBotiquines--;
            }
        }
    }

    public void recogerBotiquin() {
        if(getNumeroBotiquines() < 5) {
            numeroBotiquines++;
        }
    }

    public void moverDerecha(double d) {
        double posX = getPosicionX();
        setPosicionX(posX + d);
    }

    public void moverIzquierda(double d) {
        double posX = getPosicionX();
        setPosicionX(posX - d);
    }

    public void moverArriba(double d) {
        double posY = getPosicionY();
        setPosicionY(posY + d);

    }

    public void moverAbajo(double d) {
        double posY = getPosicionY();
        setPosicionY(posY - d);
    }

    public void golpear(Enemigo p){
        double distancia = calcularDistanciaRespectoPersonaje(p);
        double hit = getDamage() / distancia;
        double vida = p.getVida() - hit;
        if((p.getVida() - hit) > 0) {
            p.setVida(vida);
            p.evolucionar();
        }
        else p.setVida(0);

    }

    //         ·······  GETTER  ······
    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    //         ······   SETTER   ······
    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
}
