package co.mintic.udea.java2;

public class Pruebas {
    public static void main(String[] args) {
        Jugador j = new Jugador("Explorador", 'm', 0, 5,100);
        Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);
        // 2. ·······
        j.golpear(e);
        j.golpear(e);
        //System.out.println(j.calcularDistanciaRespectoPersonaje(e));
        j.moverDerecha(10);
        j.moverAbajo(5);
        //3. ·······
        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();
        // 4. ······ OK
        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        // 5. ····· OK
        e.golpear(j);
        e.golpear(j);
        // 6. ·····
        j.golpear(e);
        j.golpear(e);
        // -------
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);

        // ······ OUTPUT JUGADOR

        System.out.println("JUGADOR nombre: " + j.getNombre());
        System.out.println("JUGADOR sexo: " + j.getSexo());
        System.out.println("JUGADOR posicionX: " + j.getPosicionX());
        System.out.println("JUGADOR PosicionY: " + j.getPosicionY());
        System.out.println("JUGADOR damage: " + j.getDamage());
        System.out.println("JUGADOR numeroBotiquines: " + j.getNumeroBotiquines());
        System.out.println("JUGADOR vida: " + j.getVida());
        System.out.println("==========================================================");
        System.out.println("==========================================================");
        // ········ OUTPUT ENEMIGO
        System.out.println("ENEMIGO nombre: " + e.getNombre());
        System.out.println("ENEMIGO sexo: " + e.getSexo());
        System.out.println("ENEMIGO posicionX: " + e.getPosicionX());
        System.out.println("ENEMIGO PosicionY: " + e.getPosicionY());
        System.out.println("ENEMIGO damage: " + e.getDamage());
        System.out.println("ENEMIGO vida: " + e.getVida());
        System.out.println("ENEMIGO evolucionesAplicadas: " + e.getEvolucionesAplicadas());
        System.out.println("ENEMIGO resistencia: " + e.getResistencia());




    }
}
