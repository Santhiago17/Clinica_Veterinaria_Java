public class Consulta {
    private String motivo;
    private Animal animal;

    public Consulta(String motivo, Animal animal) {
        this.motivo = motivo;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "\n motivo='" + motivo + '\'' +
                ",\n animal=" + animal.getNome() +
                '}';
    }

}