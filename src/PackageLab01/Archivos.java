
package PackageLab01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





public class Archivos {
String Dirección="C:\\OttoBitDate"; // direccion
File f = new File(Dirección); // instacia de la carpeta
File fu = new File(Dirección + "\\user");
File ft = new File(Dirección + "\\Transaccion");
File Usuario = new File(Dirección + "\\user", "Usuarios.txt"); 
File Transaccion = new File(Dirección + "\\Transaccion", "Transaccion.txt");
String SplitsGeneral = ",";

Archivos (int tip, String data[]){
    

switch(tip){
    case 0:
    CrearArchivoUsuarios(data);
    break;
}

}
Archivos (){
    



}

void BuscarA(int MyID, int ID,NodosUsuario A, Double Cant){
      
   if (A == null) {           
            JOptionPane.showMessageDialog(null,"Usuario no encontrado");
           
        } else if (A.ID == ID) {
           CrearArchivoTransaccion(MyID, (ID),Cant);
            System.out.println("Encontrado");
        } else if (ID > A.ID) {
                 System.out.println(ID + " " + A.ID);
            BuscarA(MyID,ID, A.LD,Cant);
            
        } else {
                  System.out.println(ID + " " + A.ID);
           BuscarA(MyID,ID, A.LI,Cant);
        }
        }

void CrearArchivoUsuarios(String Data[]){

   
        boolean b = false; 
        boolean equals = false;
       
        
        if(Usuario.exists()){
         try(Scanner scan = new Scanner (Usuario)){
               while(scan.hasNextLine()&& equals == false){
                   String linea = scan.nextLine();
                   String data[]= linea.split(SplitsGeneral);
                   String IDC = data[2];
                   
                    
                   if((Data[2]).equals(IDC)){
                   equals = true;
                  
                   }
               }
               
               
           }
           catch (Exception ex) {
        System.out.println("Error, al comprobar, se comprobó que el comprobador no comprueba bién");
    }
        }
        
        
        
        if(equals == true){
             
         JOptionPane.showMessageDialog(null,"Error, Numero ID ya ingresado");
        }else {
        
       
        if (!Usuario.exists()){  //Verifica si existe el archivo, si no existe, crea uno 
            f.mkdir();
            fu.mkdir();
            try {
                Usuario.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error en la creacion de datos para Usuarios");
            }
        }
        // Aqui se guardan el archivo de las personas
            System.out.println(Data[0] + " " + Data[1] + " " + Data[2] + " " + Data[3]);
        if((!Data[0].equals(""))&& (!Data[1].equals("")) && (!Data[2].equals("")) && (!Data[3].equals(""))){
        try(FileWriter cl= new FileWriter(Usuario.getAbsolutePath(),true)){
        BufferedWriter sw = new BufferedWriter(cl);
        sw.write(Data[0]+SplitsGeneral+Data[1]+SplitsGeneral+Data[2]+SplitsGeneral+Data[3]);
        sw.newLine();
        sw.flush();
        sw.close();
        cl.close();
       
        }
        
        catch (Exception ex) {
            System.out.println("Error en la escritura de la cuenta Usuario");
        }
        }else {
        System.out.println("Datos vacio, invalidando guardado de datos");
        }
        }
        } 

void CrearArchivoTransaccion(int Ori, int Des, double Val){
     if (!Transaccion.exists()){  //Verifica si existe el archivo, si no existe, crea uno 
            f.mkdir();
            ft.mkdir();
            try {
                Transaccion.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error en la creacion de dato de transacciones");
            }
        }
    
     
       try(FileWriter cl= new FileWriter(Transaccion.getAbsolutePath(),true)){
        BufferedWriter sw = new BufferedWriter(cl);
        sw.write(Ori+SplitsGeneral+Des+SplitsGeneral+Val);
        sw.newLine();
        sw.flush();
        sw.close();
        cl.close();
}catch(Exception ex){
System.out.println("Error a guardar la transaccion");
}
      

}





NodosUsuario CargarNodoUsuario(){
    NodosUsuario P = null;
    
    
    

if(Usuario.exists()){

    try(Scanner Scan = new Scanner(Usuario)){
while(Scan.hasNextLine()){
String Line = Scan.nextLine();
String DatosLine[] = Line.split(SplitsGeneral);

if(P == null){
P = new NodosUsuario(DatosLine);    

}else {

 P.Insert(DatosLine);
    
}
    
    

}

}catch(Exception e){
    System.out.println("Error al crear un nodo de usuario");  
}

    
    
    
}


return P;
}
/*
void CargarTransacción(int ID, int TipeDate){

      
    if (ft.exists()){


 try(Scanner Scans = new Scanner (ft)){
               while(Scans.hasNextLine()){
                   String linea = Scans.nextLine();
                   String data[]= linea.split(",");
                    
                  if(!(data[1].equals(ID)) && !(data[2].equals(ID)) ){
                  System.out.println("Analize");
                Lab01_GraficaArbo_l00.DateTable.addRow(new Object[]{});
           
                  switch(TipeDate){
                      case 1:
                          Returned = data[0];
                          
                          break;
                      case 2:
                          Returned = data[1];
                          break;
                      case 3:
                          Returned = data[2];
                          break;
                  
                  }
               
                 
                  }
               
               }                 
         }catch(Exception ex){
    System.out.println("Error en la carga de datos de la tabla");
    }

}else{
    System.out.println("Transacción vacia");
}

}

NodoTransaccion CargarNodoBloques(){

 NodoTransaccion A = null;
if(Transaccion.exists()){
 
    try(Scanner Scan = new Scanner(Transaccion)){

   
    NodoTransaccion P = null;         
 while(Scan.hasNextLine()){
String Line = Scan.nextLine();
String DatosLine[] = Line.split(SplitsGeneral);

 // System.out.println(DatosLine[2]);
if(P == null){  
P = new NodoTransaccion(Integer.parseInt(DatosLine[0]), Integer.parseInt(DatosLine[1]), Double.parseDouble(DatosLine[2]));
A=P;
   // System.out.println("p = null");
}else {

P.Next= new NodoTransaccion(Integer.parseInt(DatosLine[0]), Integer.parseInt(DatosLine[1]), Double.parseDouble(DatosLine[2]));
P = P.Next;
   
}

}
   
}catch(Exception e){
    System.out.println("Error al crear un nodo de usuario");  
}

    
    
 
}
   
return A;
        }*/
        }






    

