package aula13.estabelecimento;

import aula13.equipamentos.impressora.Deskjet;
import aula13.equipamentos.impressora.Impressora;
import aula13.equipamentos.impressora.Laserjet;
import aula13.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional equipamentoMultifuncional = new EquipamentoMultifuncional();
        equipamentoMultifuncional.copiar();

        Impressora impressora = new Deskjet();
        impressora.imprimir();

        Laserjet laserjet = new Laserjet();
        laserjet.imprimir();
    }
}
