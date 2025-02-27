package exercicios_set.OperacaoBasicas;

import java.util.Objects;

public class Convidado {
    private String name;
    private String codigo;

    public Convidado(String name, String codigo) {
        this.name = name;
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Convidado convidado))
            return false;

        return getCodigo() == convidado.getCodigo();
    }

    @Override
    public String toString() {
        return "Convidado [codigo=" + codigo + ", name=" + name + "]";
    }

}
