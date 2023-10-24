import javax.swing.JOptionPane;

public class ListaSimpleLigadas {
    public static void main(String[] args) {
        Lista lsl = new Lista();
        int opcion = 0, elemento;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Agregar un dato al inicio\n2. Mostrar todos los datos de la lista\n3. Ingresar un dato al final\n4. Eliminar nodo al inicio\n5. Eliminar nodo al final\n6. Eliminar elemento por valor\n7. Salir"));
            switch (opcion) {
                case 1:
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento"));
                    lsl.insertaInicio(elemento);
                    break;
                case 2:
                    lsl.mostrarLista();
                    break;
                case 3:
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el elemento al final"));
                    lsl.insertaFin(elemento);
                    break;
                case 4:
                    int elementoEliminado = lsl.eliminarInicio();
                    if (elementoEliminado != -1) {
                        JOptionPane.showMessageDialog(null, "Se ha eliminado el nodo al inicio con elemento: " + elementoEliminado);
                    }
                    break;
                case 5:
                    int e = lsl.eliminarFinal();
                    if (e != -1) {
                        JOptionPane.showMessageDialog(null, "Se ha eliminado el nodo al fin con elemento: " + e);
                    }
                    break;
                case 6:
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el elemento a eliminar"));
                    boolean eliminado = lsl.eliminarElemento(elemento);
                    if (eliminado) {
                        JOptionPane.showMessageDialog(null, "Se ha eliminado el elemento: " + elemento);
                    } else {
                        JOptionPane.showMessageDialog(null, "El elemento no se encontró en la lista.");
                    }
                    break;
                case 7:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción Incorrecta");
            }
        } while (opcion != 7);
    }
}
