public class Main {
    public static void main(String[] args) {
        Produto livro = new Livro("O Senhor dos Anéis", 89.90, "J.R.R. Tolkien", 1178, true);
        Produto camisa = new Camisa("Camisa Polo", 59.99, "Azul", "M", "Algodão");

        System.out.println("=== Livro ===");
        livro.exibirInfo();

        System.out.println("\n=== Camisa ===");
        camisa.exibirInfo();
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
    }
}

class Livro extends Produto {
    private String autor;
    private int numeroPaginas;
    private boolean capaDura;

    public Livro(String nome, double preco, String autor, int numeroPaginas, boolean capaDura) {
        super(nome, preco);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.capaDura = capaDura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Capa Dura: " + (capaDura ? "Sim" : "Não"));
    }
}

class Camisa extends Produto {
    private String cor;
    private String tamanho;
    private String material;

    public Camisa(String nome, double preco, String cor, String tamanho, String material) {
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Material: " + material);
    }
}
