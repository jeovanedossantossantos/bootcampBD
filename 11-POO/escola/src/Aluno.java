class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private String matricula;

    public Aluno(String nome, int idade, String curso, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;

    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCurso() {
        return this.curso;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nCurso: " + this.curso;
    }
}