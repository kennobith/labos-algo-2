package aed;

public class Fecha {
    public Fecha(int dia, int mes) {
        _dia = dia;
        _mes = mes;
    }

    public Fecha(Fecha fecha) {
        _dia = fecha.dia();
        _mes = fecha.mes();
    }

    public Integer dia() {
        return _dia;
    }

    public Integer mes() {
        return _mes;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();

        sbuffer.append(dia().toString());
        sbuffer.append("/");
        sbuffer.append(mes().toString());

        return sbuffer.toString();
    }

    @Override
    public boolean equals(Object otra) {
        if (otra == null || otra.getClass() != this.getClass()){
            return false;
        }

        Fecha f = (Fecha) otra;
        return f.dia() == this.dia() && f.mes() == this.mes();
    }

    public void incrementarDia() {
        if (diasEnMes(_mes) < _dia + 1 && _mes != 12){
            _dia = 1;
            _mes += 1;
        } else if (_mes == 12 && _dia == 31) {
            _dia = 1;
            _mes = 1;
        } else {
            _dia += 1;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

    private int _dia;
    private int _mes;
}
