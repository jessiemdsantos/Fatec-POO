
package fatec.poo.model;

/**
 *
 * @author Jéssica
 */
public class Comodo {
    private int tipo;
    private double medLarg;
    private double medComp;
    private double medAlt;
    private int potLampada;

    public Comodo(int tipo, int potLampada) {
        this.tipo = tipo;
        this.potLampada = potLampada;
    }

    public void setMedLarg(double medLarg) {
        this.medLarg = medLarg;
    }

    public void setMedComp(double medComp) {
        this.medComp = medComp;
    }

    public void setMedAlt(double medAlt) {
        this.medAlt = medAlt;
    }

    public int getTipo() {
        return tipo;
    }

    public int getPotLampada() {
        return potLampada;
    }
    public double calcQtdeLampada(){
        switch (getTipo()) {
            case 1: //1 - Sala
                return (medLarg * medComp * medAlt * 20)/getPotLampada();
            case 2: //2 - Quarto
                return (medLarg * medComp * medAlt * 25)/getPotLampada();
            case 3: //3 - Cozinha
                return (medLarg * medComp * medAlt * 18)/getPotLampada();
            default: //4 - Banheiro
                return (medLarg * medComp * medAlt * 15)/getPotLampada();
        }
    }
    
}
