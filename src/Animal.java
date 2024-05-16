public abstract class Animal {
    private String nome;
    private String raça;
    private boolean castrado;
    private double idade;
    private String especie;
    private String sexo;

    public Animal(String nome, String raça, boolean castrado, double idade, String especie, String sexo) {
        this.nome = nome;
        this.raça = raça;
        this.castrado = castrado;
        this.idade = idade;
        this.especie = especie;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
