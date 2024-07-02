public class ProdutoApp {
    public static void main(String[] args) {
        
        Livro livro = new Livro(368, "Scott Cawthon",41.88, "Five Nights at Freddy's  Olhos Prateados");
        System.out.println("Nome: " + livro.getNome());
        System.out.println("Páginas: "+ livro.getPaginas());
        System.out.println("Preço: R$" + livro.getPreco());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("É extenso? " + livro.isExtenso());
        System.out.println("É caro?" + livro.isCaro());
        System.out.println("Preço com desconto: R$" + livro.desconto());
    }
}