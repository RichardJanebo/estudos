package aula13.equipamentos.multifuncional;

import aula13.equipamentos.copiadora.Copiadora;
import aula13.equipamentos.digitalizadora.Digitalizadora;
import aula13.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora,Copiadora,Digitalizadora {
    public void imprimir(){
        System.out.println("COPIANDO");
    }

    public void copiar(){
        System.out.println("COPIANDO");
    }

    public void digitalizar(){
        System.out.println("DIGITALIZANDO");
    }
}
