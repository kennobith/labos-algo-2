package aed;

public class Recordatorio {
    private String _mensaje;
    private Fecha _fecha;
    private Horario _horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        _mensaje = mensaje;
        _fecha = new Fecha(fecha);
        _horario = horario;
    }

    public Horario horario() {
        return _horario;
    }

    public Fecha fecha() {
        Fecha f = new Fecha(_fecha);
        return f;
    }

    public String mensaje() {
        return _mensaje;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();

        sbuffer.append(_mensaje);
        sbuffer.append(" @ ");
        sbuffer.append(_fecha);
        sbuffer.append(" ");
        sbuffer.append(_horario);

        return sbuffer.toString();
    }

}
