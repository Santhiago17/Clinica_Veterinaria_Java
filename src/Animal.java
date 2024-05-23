public class Animal {
    private String nome;
    private String raca;
    private String castrado;
    private double idade;
    private String especie;
    private String sexo;

    public Animal(String nome, String raca, String castrado, double idade, String especie, String sexo) {
        this.nome = nome;
        this.raca = raca;
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCastrado() {
        return castrado;
    }

    public void setCastrado(String castrado) {
        if (castrado.equalsIgnoreCase("não") || castrado.equalsIgnoreCase("nao")) {
            this.castrado = castrado;
        } else {
            throw new IllegalArgumentException("Valor inválido para castrado: " + castrado);
        }
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
