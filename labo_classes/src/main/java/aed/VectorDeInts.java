package aed;

class VectorDeInts implements SecuenciaDeInts {
    private static final int CAPACIDAD_INICIAL = 1;
    private int _longitud;
    private int[] _elems;
    private int _capacidad;

    public VectorDeInts() {
        _longitud = 0;
        _elems = new int[CAPACIDAD_INICIAL];
        _capacidad = 1;
    }

    public VectorDeInts(VectorDeInts vector) {
        _longitud = vector.longitud();
        _capacidad = vector.capacidad();
        _elems = new int[_capacidad];
        for(int i = 0; i < _longitud; i++) {
            _elems[i] = vector.obtener(i);
        }
    }

    public int longitud() {
        return _longitud;
    }

    public int capacidad() {
        return _capacidad;
    }

    public void agregarAtras(int i) {
        _longitud++;
        if (_longitud > _capacidad) {
            _capacidad = _capacidad * 2;
            int[] res = new int[_capacidad];
            for(int j = 0; j < _longitud-1; j++) {
                res[j] = _elems[j];
            }
            res[_longitud-1] = i;
            _elems = res;
        } else {
            _elems[_longitud-1] = i;
        }
    }

    public int obtener(int i) {
        return _elems[i];
    }

    public void quitarAtras() {
        _longitud--;
    }

    public void modificarPosicion(int indice, int valor) {
        _elems[indice] = valor;
    }

    public VectorDeInts copiar() {
        VectorDeInts res = new VectorDeInts();
        for(int i=0; i < _longitud; i++){
            res.agregarAtras(_elems[i]);
        }
        return res;
    }

}
