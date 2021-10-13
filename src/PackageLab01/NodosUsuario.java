package PackageLab01;

import javax.swing.JOptionPane;

public class NodosUsuario extends Usuario {

    
    NodosUsuario LI;
    NodosUsuario LD;
    
    
 NodosUsuario(){


}   
 
NodosUsuario(String Data[]){
Nombre = Data[0];
Apellido = Data[1];
ID = Integer.parseInt(Data[2]);
Contraseña = Data[3];

}
    
    void Insert(String Date[]) {
   

            if (Integer.parseInt(Date[2]) < ID) {

                if (LI == null) {
                    LI = new NodosUsuario(Date);
                } else {
                    LI.Insert(Date);

                }

            } else {
                if (Integer.parseInt(Date[2]) > ID) {

                    if (LD == null) {
                        LD = new NodosUsuario(Date);

                    } else {
                        LD.Insert(Date);
                    }

                } else if (Integer.parseInt(Date[2]) == ID) {
                    JOptionPane.showMessageDialog(null, "Error inesperado encontrado, por favor comuniquese con los desarrolladores Error EQU_ALID");
                    System.out.println("Error: El ID de usuario: " + Date[0] + " Es identico al " + Nombre + " \nID USUARIO " + Date[0] + ": " + Date[2]  + " ID USUARIO REFERENTE " + Nombre + ": " + ID + "\nEl usuario " + Date[0] + " estará en la base de datos de los usuario pero no dentro del programa" );
                }

            }

        }

    
}
