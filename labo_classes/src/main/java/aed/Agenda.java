package aed;

import java.util.Vector;

public class Agenda {
    public Fecha _hoy;
    public Vector<Recordatorio> _recordatorios;

    public Agenda(Fecha fechaActual) {
        Fecha f = new Fecha(fechaActual);
        _hoy = f;
        //Por qué corre eso y no solo con Fecha _hoy = new Fecha(fechaActual);
        Vector<Recordatorio> r = new Vector<Recordatorio>();
        _recordatorios = r; 
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        _recordatorios.add(recordatorio);
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();

        sbuffer.append(this.fechaActual().toString() + "\n");
        sbuffer.append("=====\n");
        for (int i = 0; i < _recordatorios.size() ; i++) {
            if (this.fechaActual().equals(_recordatorios.get(i).fecha())) {
                sbuffer.append(_recordatorios.get(i).toString() + "\n");
            }
        }
        //porqué no funcionaba con sb2.append(System.lineSeparator())
        return sbuffer.toString();
    }

    public void incrementarDia() {
        _hoy.incrementarDia();
    }

    public Fecha fechaActual() {  
        return _hoy;  
    }

}
