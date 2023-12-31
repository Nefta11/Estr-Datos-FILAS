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

    public int eliminarFinal() {
        int e = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            Nodo recorrer = inicio;
            while (recorrer.siguiente != fin) {
                recorrer = recorrer.siguiente;
            }
            fin = recorrer;
            fin.siguiente = null;
        }
        return e;
    }
    /*1. Si la lista está vacía, retornar false.
2. Si el elemento a eliminar es el primer elemento, eliminar el primer elemento y retornar true.
3. Inicializar un nodo actual apuntando al inicio de la lista y otro nodo anterior inicializado como nulo.
4. Mientras el nodo actual no sea nulo y el valor del nodo actual no coincida con el elemento a eliminar:
   a. Actualizar el nodo anterior como el nodo actual.
   b. Actualizar el nodo actual como el siguiente nodo en la lista.
5. Si el nodo actual es nulo, mostrar un mensaje de error y retornar false.
6. Si se encontró el elemento, ajustar los enlaces del nodo anterior para eliminar el elemento.
7. Retornar true para indicar que el elemento fue eliminado con éxito.
 */


    public boolean eliminarElemento(int elemento) {
        if (vacia()) {
            System.out.println("La lista está vacía. No se puede eliminar un elemento.");
            return false;
        }

        if (inicio.dato == elemento) {
            eliminarInicio();
            return true;
        }

        Nodo actual = inicio;
        Nodo anterior = null;

        while (actual != null && actual.dato != elemento) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("El elemento no se encontró en la lista.");
            return false;
        }

        anterior.siguiente = actual.siguiente;
        return true;
    }


   /*  public void encontrarDato(int e) {
        System.out.println("");
        Nodo recorrido = inicio;

        while (recorrido.dato != e || recorrido!= null) {
            //System.out.print("[" + recorrido.dato + "]-->");
            recorrido = recorrido.siguiente;
        }
        if(recorrido.dato == e){
            System.out.println("El dato"+ e +" Existe");
        }else{
            System.out.println("El dato"+e+" no existe");
        }
    }*/


}




/*
public void encontrarElemento(int e) {
        nodo recorrido = inicio;
        int contador = 1;
        while (recorrido != null) {
            if (recorrido.dato == e) {
                System.out.println("El elemento " + e + " se encuentra en la posicion: " + contador);
                break;
            } else {
                contador++;
                recorrido = recorrido.direccion;
            }
        }
        if (recorrido == null) {
            System.out.println("No existe el elemento");
        }

    }
*/



 /*
    Algoritmo para eliminar un nodo en particular
    1. Si la lista No está vacía , entonces:
    a. Si inicio es igual a fin, y , el elemento es igual a dato de inicio, entonces:
        a.q apuntar inicio y fin a nulo.
    b. Si no, si el elemento es igual a dato de inicio, entonces:
        b.1 apuntar inicio a siguiente de inicio
    c. si no
        c.1 crear dos nodos: anterior y temporal
        c.2 apuntar anterior a inicio
        c3. apuntar temporal a siguiente de inicio
        c4. mientras temporal sea diferente de nulo y dato de temporal sea diferente de elemnto, entonces
            c4.1 apuntar anterior a siguiente de anterior
            c4.2 apuntar a temporal a siguiente de temporal
        c5 si temporal es diferente de nulo, entonces
            c.5.1 apuntar siguiente de anterior a siguiente de temporal
            c5.2 si temporal es igual fin, entonces
                c5.2.1 apuntar fin a anterior
  */