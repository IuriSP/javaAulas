package aula014;
public abstract class Pessoa {
    
    
    //Atributos de Pessoa
    protected String nome;
    protected String sexo;
    protected int idade;
    protected int experiencia;
    
    //Método construtor de Pessoa
   public Pessoa(String nome, int idade, String sexo){
       this.nome = nome;
       this.idade = idade;
       this.sexo = sexo;
       this.experiencia = 0;
   }
    
    //Métodos de Pessoa
    protected void ganharExp(){
        this.experiencia = 500;
        System.out.println("Experiencia atual: " + this.experiencia);
    }
    //Getters
    public String getNome(){
        return this.nome;
    }
    public String getSexo(){
        return this.sexo;
    }
    public int getIdade(){
        return this.idade;
    }
    public int getExperiencia(){
        return this.experiencia;
    }
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setExperiencia(int xp){
        this.idade = xp;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ","
                + " sexo=" + sexo + ", idade=" + idade +
                ", experiencia=" + experiencia + '}';
    }
    
    
}
