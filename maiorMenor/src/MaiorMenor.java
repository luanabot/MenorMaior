public class MaiorMenor {

    // Atributo 1: array nativo de inteiros que vou analisar
    private final int[] numeros;

    // Atributo 2: variável para guardar o maior valor encontrado
    private int maior;

    // Atributo 3: variável para guardar o menor valor encontrado
    private int menor;

    // Construtor: recebe o array gerado lá no main e guarda nos atributos
    public MaiorMenor(int[] numeros) {
        this.numeros = numeros;

        // Começo o maior com o menor valor possível de um int
        // assim qualquer número do array vai ser maior que ele
        this.maior = Integer.MIN_VALUE;

        // Começo o menor com o maior valor possível de um int
        // assim qualquer número do array vai ser menor que ele
        this.menor = Integer.MAX_VALUE;
    }

    // Método que percorre o array e determina o maior elemento
    public void encontrarMaior() {

        // Passo por cada número do array
        for (int numero : numeros) {

            // Se o número atual for maior que o que eu guardei, atualizo
            if (numero > maior) {
                maior = numero;
            }
        }
    }

    // Getter para acessar o maior de fora da classe
    public int getMaior() { return maior; }

    // Getter para acessar o menor de fora da classe
    public int getMenor() { return menor; }

    // Main: aqui eu gero os elementos e passo para a classe
    public static void main(String[] args) {

        // Gero o array aqui no main com os valores que quero analisar
        int[] valores = {3, 17, -5, 42, 8, 1};

        // Passo o array como parâmetro para a classe
        MaiorMenor mm = new MaiorMenor(valores);

        // Chamo o método que encontra o maior elemento
        mm.encontrarMaior();

        // Mostro o resultado no console
        System.out.println("Maior elemento: " + mm.getMaior()); // esperado: 42
    }
}