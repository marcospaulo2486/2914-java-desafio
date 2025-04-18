public class compra implements Comparable<compra> {
 private String descricao;
 private double valor;

    public compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "compra: " +
                "descricao ='" + descricao +
                ", valor=" + valor
                ;
    }
    @Override
    public int compareTo(compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}

