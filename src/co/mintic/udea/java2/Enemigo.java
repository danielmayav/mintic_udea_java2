package co.mintic.udea.java2;

public class Enemigo extends Personaje {

    //      ······  ATRIBUTOS
    private int evolucionesAplicadas = 0;
    private int resistencia = 1;

    //      ······  CONSTRUCTOR
    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    //          ·······     METODOS     ········

    public void evolucionar() {
        if((getVida()<= 30) && (getEvolucionesAplicadas() == 0)) {
            double damage = getDamage();
            setDamage(damage + 20);
            evolucionesAplicadas++;
        }
        else if((getVida()<= 10) && (getEvolucionesAplicadas() == 1)){
            resistencia++;
            evolucionesAplicadas++;
        }
    }

    @Override
    public void recibirImpacto(double d) {
        double dano = d/resistencia;
        double vida = getVida();
        setVida(vida - dano);
    }

    // GETTERS ···········

    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    // SETTERS ··········


    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
}
