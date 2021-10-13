
package PackageLab01;


public class Bloque {
 
 

private Bloque NextBloque;  
private int BlockHashCode;
private int MyHashCode;
private Transaccion Transaccion1;
private Transaccion Transaccion2;
private Transaccion Transaccion3; 
// Coloque info que debe estar en el nodo
  
  Bloque( int Ori[], int Des[], double Valuet[]){


 
     
     

     Transaccion1 = new Transaccion(Ori[0],Des[0],Valuet[0]);
     Transaccion2 = new Transaccion(Ori[1],Des[1],Valuet[1]);
     Transaccion3 = new Transaccion(Ori[2],Des[2],Valuet[2]);
     
 // MyHashCode = Hashed();
  
  }
  
  Bloque(){

  }

  void BlockChain(Bloque A){ 
 NextBloque = A;
      


  }
  int Hashed (){
  int MyHash = 0;
  Object A[][] = new Object[3][3];{
  A[0][0] = Integer.toString(Transaccion1.Origen);
  A[0][1] = Integer.toString(Transaccion1.Destino);
  A[0][2] = String.valueOf(Transaccion1.ValorOrigenAnte);
  
  A[1][0] = Integer.toString(Transaccion2.Origen);
  A[1][1] = Integer.toString(Transaccion2.Destino);
  A[1][2] = String.valueOf(Transaccion2.ValorOrigenAnte);
  
  A[2][0] = Integer.toString(Transaccion3.Origen);
  A[2][1] = Integer.toString(Transaccion3.Destino);
  A[2][2] = String.valueOf(Transaccion3.ValorOrigenAnte);
  }
  
  for (int i = 0; i < 3 ;i++){
  for (int j = 0; j < 3 ;j++){
  
  MyHash += A[i][j].hashCode();
  }
  
  }
    
     
 
      
return MyHash;
  }
    Bloque NextBlock (){
  return NextBloque;
  }
}
