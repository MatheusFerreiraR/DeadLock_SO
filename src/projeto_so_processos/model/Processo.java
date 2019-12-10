package projeto_so_processos.model;

import java.util.Random;

/**
 * @author Professor Xavier
 * @author a1980009
 */
public class Processo {
//    Atributos
    private String nome;
    private String recurso;
    private Requerimento requerimento;

//    Construtor

    public Processo(String nome, String recurso, Requerimento requerimento) {
        this.nome = nome;
        this.recurso = recurso;
        this.requerimento = requerimento;
    }
    
    
//    My Métodos
   
    
//    Gets and Sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public Requerimento getRequerimento() {
        return requerimento;
    }

    public void setRequerimento(Requerimento requerimento) {
        this.requerimento = requerimento;
    }

   
    
}
