package Activity.dio;

public class Mes {
    private String mes;
    private Double temperatura;
    private Integer diaChuvoso;

    public Mes(String mes, Double temperatura, Integer diaChuvoso) {
        this.mes = mes;
        this.temperatura = temperatura;
        this.diaChuvoso = diaChuvoso;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public Integer getDiaChuvoso() {
        return diaChuvoso;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                ", diaChuvoso=" + diaChuvoso +
                '}';
    }
}


