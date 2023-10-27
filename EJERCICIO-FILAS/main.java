import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        Lista lsl = new Lista();
        int opcion = 0, elemento;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Agregar un dato al inicio\n2. Mostrar todos los datos de la lista\n3. Insertar después de un número\n4. Calcular promedio\n5. Salir"));
            switch (opcion) {
                case 1:
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento"));
                    lsl.insertaInicio(elemento);
                    break;
                case 2:
                    lsl.mostrarLista();
                    break;
                case 3:
                    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número después del cual deseas insertar"));
                    int nuevoElemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el nuevo elemento"));
                    boolean insertado = lsl.insertarDespuesDe(numero, nuevoElemento);
                    lsl.mostrarLista();
                    if (insertado) {
                        JOptionPane.showMessageDialog(null, "Se ha insertado el elemento: " + nuevoElemento + " después de " + numero);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el número para insertar después.");
                    }
                    break;
                case 4:
                    double promedio = lsl.calcularPromedio();
                    JOptionPane.showMessageDialog(null, "El promedio de los elementos en la lista es: " + promedio);
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción Incorrecta");
            }
        } while (opcion != 5);
    }
}
