package teste09.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import teste09.dominio.Funcionarios;

public class Teste {

  public static void main(String[] args) {
    List<Funcionarios> funcionariosDaEmpresa = new ArrayList<>();
    funcionariosDaEmpresa.add(new Funcionarios("George", 35D));
    funcionariosDaEmpresa.add(new Funcionarios("Judite", 52D));
    funcionariosDaEmpresa.add(new Funcionarios("Claudia", 30.0));
    funcionariosDaEmpresa.add(new Funcionarios("Alex", 20D));
    funcionariosDaEmpresa.add(new Funcionarios("Lucas", 18D));


    funcionariosDaEmpresa.sort(new OrdenacaoByName());

    StringBuilder st = new StringBuilder();


    
    for (Funcionarios funcionarios : funcionariosDaEmpresa) {
        st.append(funcionarios.toString());
    }

    criarPdfFuncionarios(st.toString());

    

  }

  public static void criarPdfFuncionarios(String tabelaFunc) {
    
    File tesFile = new File("");
    if (tesFile.isFile()) {
      tesFile.delete();
    }

    try (BufferedWriter bf = new BufferedWriter(new FileWriter(tesFile))) {
      bf.write(tabelaFunc);
      bf.newLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}

class OrdenacaoByName implements Comparator<Funcionarios> {

  @Override
  public int compare(Funcionarios funcionario ,Funcionarios outroFuncionario) {
      return funcionario.getNome().compareTo(outroFuncionario.getNome());
  }
  
  
}