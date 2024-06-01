public class Animal {
    private String nome;
    private String raca;
    private String castrado;
    private int idade;
    private String especie;
    private String sexo;
    private Tutor tutor;

    public Animal(String nome, String raca, String castrado, int idade, String especie, String sexo,Tutor tutor) {
        this.nome = nome;
        this.raca = raca;
        this.castrado = castrado;
        this.idade = idade;
        this.especie = especie;
        this.sexo = sexo;
        this.tutor = tutor;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
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

    @Override
    public String toString() {
        return "Animal{" +
                "\n nome='" + nome + '\'' +
                ",\n raca='" + raca + '\'' +
                ",\n castrado='" + castrado + '\'' +
                ",\n idade=" + idade +
                ",\n especie='" + especie + '\'' +
                ",\n sexo='" + sexo + '\'' +
                ",\n tutor=" + tutor +
                '}';
    }
}





