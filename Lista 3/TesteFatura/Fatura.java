public class Fatura{
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numeroUm, String descricaoUm, int quantidadeUm, double precoUm ){ //construtor
        numero = numeroUm;
        descricao = descricaoUm;
        quantidade = quantidadeUm;
        preco = precoUm;
    }
    public void setNumero(String numeroUm){ //modificar número
        numero = numeroUm;
    }

    public void setDescricao(String descricaoUm){ //modificar descrição
        descricao = descricaoUm;
    }

    public void setQuantidade(int quantidadeUm){ //modificar quantidade
        quantidade = quantidadeUm;
    }

    public void setPreco(double precoUm){ //modificar preço
        preco = precoUm;
    }

    public String getNumero(){ //exibir número
        return numero;
    }

    public String getDescricao(){ //exibir descrição
        return descricao;
    }

    public int getQuantidade(){ //exibir quantidade
        return quantidade;
    }

    public double getPreco(){ //exibir preço
        return preco;
    }

    public double getQuantidadeFatura(){ //exibir a quantidade da fatura
        return (preco * quantidade);
    }
    
}