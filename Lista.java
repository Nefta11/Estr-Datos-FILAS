public class Lista {
    protected Nodo inicio, fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void insertaInicio(int e) {
        inicio = new Nodo(e, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    public void insertaFin(int e) {
        if (!vacia()) {
            fin.siguiente = new Nodo(e);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(e);
        }

    }

    public void mostrarLista() {
        System.out.println("");
        Nodo recorrido = inicio;

        while (recorrido != null) {
            System.out.print("[" + recorrido.dato + "]-->");
            recorrido = recorrido.siguiente;
        }
    }

    public int eliminarInicio() {
        if (vacia()) {
            System.out.println("La lista está vacía. No se puede eliminar el nodo al inicio.");
            return -1;
        }

        int elementoEliminado = inicio.dato;

        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
        }

        return elementoEliminado;
    }

    public int eliminarFinal(){
        int e = fin.dato;
        if (inicio==fin){
            inicio = fin =null;
        }else{
            Nodo recorrer= inicio;
            while(recorrer.siguiente != fin){// no tiene que apuntar a null si no a fin..
                recorrer =recorrer.siguiente;
            }
            fin=recorrer;
            fin.siguiente=null;
        }
        return e;
    }
}
