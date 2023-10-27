public class Menu {
    protected Nodo inicio, fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    // Otras funciones (insertaInicio, insertaFin, mostrarLista, eliminarInicio, eliminarFinal, eliminarElemento, etc.)

    // Nueva función para insertar al final de la lista
    public void insertaFinal(int e) {
        if (!vacia()) {
            fin.siguiente = new Nodo(e);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(e);
        }
    }

    // Nueva función para insertar después de un número en la lista
    public boolean insertarDespuesDe(int elemento, int nuevoElemento) {
        Nodo nuevoNodo = new Nodo(nuevoElemento);
        Nodo actual = inicio;
        
        while (actual != null) {
            if (actual.dato == elemento) {
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
                if (actual == fin) {
                    fin = nuevoNodo;
                }
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Nueva función para calcular el promedio de los elementos
    public double calcularPromedio() {
        int suma = 0;
        int contador = 0;
        Nodo actual = inicio;

        while (actual != null) {
            suma += actual.dato;
            contador++;
            actual = actual.siguiente;
        }

        if (contador == 0) {
            return 0; // Evitar división por cero.
        }

        return (double) suma / contador;
    }
}
