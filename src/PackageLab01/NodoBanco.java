
package PackageLab01;



public class NodoBanco extends Banco {
    private double TotalMoneda = getContenido();
    Archivos k = new Archivos();
    NodosUsuario PUsuarios;
    Bloque Genesis = null,B,A;
    
    
    NodoBanco(){
        
    PUsuarios = k.CargarNodoUsuario();    
   // BlockChain(k.CargarNodoBloques());
        
        
     
    }
    
   void Recorrer(){
   A = Genesis;
   while(A != null){
       System.out.println(A);
       A=A.NextBlock();
   }
   
   }
   
/*    
    
        void BlockChain(NodoTransaccion S){
  int i = 0;
  NodoTransaccion SB = null;
          
  while(S != null){
    
       
      while(i < 3){
          System.out.println(i);
            if (Genesis == null){
             Genesis = new Bloque();
             System.out.println("Creando bloque Genesis");
                     
             SB = S;
              System.out.println(S);
            S = S.Next;
           Genesis.Agred(SB,i); 
       B = Genesis;
       
       System.out.println("Bloque Genesis creado, transacción guardada exitosamente");
       break;
      }else{
          
        if(B.Transacciones[i] == null){
            SB = S;
          
            
            System.out.println(S);
           // System.out.println(i);
           
           if(S != null){
           S = S.Next;
           }
            System.out.println(SB);
           if(SB != null){
          B.Agred(SB, i);
               
               System.out.println("Transaccción añadida");  
          if(i != 2){
          break;
          }
               
           }
          
          if(i == 2){
             
          Bloque A = new Bloque();
          B.Hash = A;
          B = A;
             
              System.out.println("Creando nuevo bloque");
     
          Hash.HashCode = 
         Continuará...
               
          
          }
        
     
          
        
        }
        i++;
      
            }
      }
      i = 0;
   
      
  }
  
  }*/
    
}
