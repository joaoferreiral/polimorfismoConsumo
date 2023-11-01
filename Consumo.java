import java.util.Date;

public class Consumo {
    static private int ultimoId = 0;
    private int idConsumo;
    private Date data;
    private char tipoConsumo;
    private char tipoCliente;
    private double valorConsumo;
    private double valorConta;

    public Consumo(double valorConsumo) {
        ultimoId++;
        this.idConsumo = ultimoId;
        this.data = new Date();
        this.valorConsumo = valorConsumo;
        this.tipoConsumo = 'C';
        this.tipoCliente = 'P';
        fechaConta(valorConsumo);
    }
    public Consumo(double valorConsumo, char tipoCliente) {
        ultimoId++;
        this.idConsumo = ultimoId;
        this.data = new Date();
        this.valorConsumo = valorConsumo;
        this.tipoCliente = tipoCliente;
        this.tipoConsumo = 'P';
        fechaConta(valorConsumo, tipoCliente);
    }

    public int getIdConsumo() {
        return idConsumo;
    }
    public Date getData() {
        return data;
    }
    public char getTipoConsumo() {
        return tipoConsumo;
    }
    public void setTipoConsumo(char tipoConsumo) {
        this.tipoConsumo = tipoConsumo;
    }
    public char getTipoCliente() {
        return tipoCliente;
    }
    public double getValorConsumo() {
        return valorConsumo;
    }
    public double getValorConta() {
        return valorConta;
    }

    @Override
    public String toString() {
        return "Consumo{" +
                "idConsumo=" + idConsumo +
                ", data=" + data +
                ", tipoConsumo=" + tipoConsumo +
                ", tipoCliente=" + tipoCliente +
                ", valorConsumo=" + valorConsumo +
                ", valorConta=" + valorConta +
                '}';
    }

    public void fechaConta(double valorConsumo) {
        this.valorConta = valorConsumo * 1.1;
    }
    public void fechaConta(double valorConsumo, char tipoCliente) {
        if(tipoCliente == 'F') {
            this.valorConta = valorConsumo - 10;
        } else if (tipoCliente == 'A') {
            if (valorConsumo <= 30) {
                this.valorConta = valorConsumo - 3;
            } else if (valorConsumo > 30) {
                this.valorConta = valorConsumo - 5;
            }
        } else {
            this.valorConta = valorConsumo;
        }
    }
}
