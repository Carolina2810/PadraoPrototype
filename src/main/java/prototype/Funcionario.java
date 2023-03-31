package prototype;

public class Funcionario implements Cloneable {

    private int ra;
    private String nome;
    private Hospital hospital;
    private String localNascimento;

    public Funcionario(int ra, String nome, Hospital hospital, String localNascimento) {
        this.ra = ra;
        this.nome = nome;
        this.hospital = hospital;
        this.localNascimento = localNascimento;
    }

    public int getRA() {
        return ra;
    }

    public void setRA(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    @Override
    public Funcionario clone() throws CloneNotSupportedException {
        Funcionario funcionarioClone = (Funcionario) super.clone();
        funcionarioClone.hospital = (Hospital) funcionarioClone.hospital.clone();
        return funcionarioClone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", hospital=" + hospital +
                ", localNascimento='" + localNascimento + '\'' +
                '}';
    }
}

