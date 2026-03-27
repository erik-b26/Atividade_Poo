
public class Pessoa {
    String nome;
    double altura;
    int idade;
    double peso;

    public Pessoa(String nome, double altura, int idade, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;
    }

    public double calcularIMC(){
        return  peso/(altura*altura);
    }
    public Boolean maioridade(){
        if (idade>=18){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }
}
