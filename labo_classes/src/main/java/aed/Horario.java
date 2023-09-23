package aed;

public class Horario {
    private int _hora;
    private int _minutos;

    public Horario(int hora, int minutos) {
        _hora = hora;
        _minutos = minutos;
    }

    public int hora() {
        return _hora;
    }

    public int minutos() {
        return _minutos;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();

        sbuffer.append(Integer.toString(hora()));
        sbuffer.append(":");
        sbuffer.append(Integer.toString(minutos()));

        return sbuffer.toString();
    }

    @Override
    public boolean equals(Object otro) {
        if (otro == null || otro.getClass() != this.getClass()){
            return false;
        }

        Horario h = (Horario) otro;

        return h.hora() == _hora && h.minutos() == _minutos;
    }


}
