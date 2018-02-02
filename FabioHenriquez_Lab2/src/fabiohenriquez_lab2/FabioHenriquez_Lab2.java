
package fabiohenriquez_lab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FabioHenriquez_Lab2 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String opcion="";
      ArrayList<Detectives> Lista = new ArrayList();
      ArrayList Cas = new ArrayList();
      ArrayList Evi = new ArrayList();
      ArrayList Men = new ArrayList();
        while (!opcion.equalsIgnoreCase("f")) {
           opcion = JOptionPane.showInputDialog(""
                   + "a- Agregar Detectives \n"
                   + "b- Listar Detectives\n"
                   + "c- Modificar Detectives\n"
                   + "d- Eliminar Detectives\n"
                   + "e- Log in\n"
                   + "f- Salir \n");
            if (opcion.equalsIgnoreCase("a")){
                     String Nom =  JOptionPane.showInputDialog("Ingrese su Nombre: ");
                     String Nacionalidad =  JOptionPane.showInputDialog("Ingrese su Nacionalidad: ");
                     String Edad = JOptionPane.showInputDialog("Ingrese su Edad: ");
                     String AñosL =  JOptionPane.showInputDialog("Ingrese cantidad de años laborando: ");
                     int Nivel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Nivel: "));
                     String ListaC = JOptionPane.showInputDialog("Ingrese su Lista de Casos: ");
                     String Buzon =  JOptionPane.showInputDialog("Ingrese su Buzon: ");
                     String Usuario =  JOptionPane.showInputDialog("Ingrese su Usuario: ");
                     String Contraseña = JOptionPane.showInputDialog("Ingrese su Contraseña: ");
                     Lista.add(new Detectives(Nom,Nacionalidad,Edad,AñosL,Nivel,ListaC,Buzon,Usuario,Contraseña));
                }
            if (opcion.equalsIgnoreCase("b")) { // Listar detectives
                String salida="";
                for (Object temp : Lista) {
                    if (temp instanceof Detectives) {
                        
                    
                    salida += Lista.indexOf(temp.toString());
                    salida+=temp+"\n";
                    }
                }
                 JOptionPane.showMessageDialog(null, salida);
            }// Fin de listar Detectives 
            if (opcion.equalsIgnoreCase("c")) {
                int pos= Integer.parseInt(JOptionPane.showInputDialog("Posicion a Modificar: "));
                if (pos>=0 && pos<Lista.size() && Lista.get(pos) instanceof Detectives) {
                    String Nombre = JOptionPane.showInputDialog("Nuevo Nombre: ");
                     String Nacionalidad =  JOptionPane.showInputDialog("Nueva Nacionalidad: ");
                     String Edad = JOptionPane.showInputDialog("Nueva Edad: ");
                     String AñosL =  JOptionPane.showInputDialog("Ingrese  Nueva cantidad de años laborando: ");
                     int Nivel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo Nivel: "));
                     String ListaC = JOptionPane.showInputDialog("Ingrese su nueva Lista de Casos: ");
                     String Buzon =  JOptionPane.showInputDialog("Ingrese su nuevo Buzon: ");
                     String Usuario =  JOptionPane.showInputDialog("Ingrese su nuevo Usuario: ");
                     String Contraseña = JOptionPane.showInputDialog("Ingrese su nueva Contraseña: ");
                    ((Detectives)Lista.get(pos)).setNombre(Nombre);
                    ((Detectives)Lista.get(pos)).setNacionalidad(Nacionalidad);
                    ((Detectives)Lista.get(pos)).setEdad(Edad);
                    ((Detectives)Lista.get(pos)).setAños_L(AñosL);
                    ((Detectives)Lista.get(pos)).setNivel(Nivel);
                    ((Detectives)Lista.get(pos)).setListaC(ListaC);
                    ((Detectives)Lista.get(pos)).setBuzon(Buzon);
                    ((Detectives)Lista.get(pos)).setUsuario(Usuario);
                    ((Detectives)Lista.get(pos)).setContraseña(Contraseña);
                }
            }//fin de modificar
             if (opcion.equalsIgnoreCase("d")) {
                 int posi= Integer.parseInt(JOptionPane.showInputDialog("Posicion a eliminar: "));
                 if (posi>=0 && posi<Lista.size() && Lista.get(posi) instanceof Detectives) {
                     Lista.remove(posi);
                 }
            }//fin de elminar
            if (opcion.equalsIgnoreCase("e")) { // LOGIN
                Detectives f = new Detectives();
                String usuario= JOptionPane.showInputDialog("Ingrese Usuario: ");
                String contraseña= JOptionPane.showInputDialog("Ingrese Contraseña: ");
                
                
                 for (int i = 0; i < Lista.size(); i++) {
                if(Lista.get(i).getUsuario().equals(usuario)){
                    if(contraseña.equals(Lista.get(i).getContraseña())){
                    String op="";
                    while (!op.equalsIgnoreCase("g")) {
                   op = JOptionPane.showInputDialog(""
                   + "a- Listar mis Datos \n"
                   + "b- Listar casos \n"
                   + "c- Registrar casos \n"
                   + "d- Modificar Casos\n"
                   + "e- Enviar Mensajes\n"
                   + "f- Listar Mensajes \n"
                   + "g- Log out \n");
                    if (op.equalsIgnoreCase("a")) {//inicio listar
                        String salida="";
                        for (Object temp : Lista) {
                            if (temp instanceof Detectives) {


                            salida += Lista.indexOf(temp.toString());
                            salida+=temp+"\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                    }//fin de listar
                    if (op.equalsIgnoreCase("b")) {
                        String salida="";
                        for (Object temp : Cas ) {
                            if (temp instanceof Casos && temp instanceof Evidencia) {


                            salida += Cas.indexOf(temp.toString())+Evi.indexOf(temp.toString());
                            salida+=temp+"\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                    }
               
                    
                    if (op.equalsIgnoreCase("c")) {

                     String Lugar =  JOptionPane.showInputDialog("Ingrese Lugar: ");
                     String Descripcion =  JOptionPane.showInputDialog("Ingrese Descripcion: ");
                     String Tipo = JOptionPane.showInputDialog("Ingrese Tipo (Homicidio,robo,secreto,violacion: ");
                     String D_A =  JOptionPane.showInputDialog("Detective a Cargo: ");
                     String Estado = JOptionPane.showInputDialog("Estado (En proseso, resuelto");
                     ////////////////////////
                     Cas.add(new Casos(Lugar,Descripcion,Tipo,D_A,Estado));
                     String Nom="";
                     String Desc="";
                     String n_p="";
                     String Evid = JOptionPane.showInputDialog("Desea Ingresar alguna evidencia al caso? [s/n]: ");
                        if (Evid.equals("s") || Evid.equals("S")) {
                            int C_Evid = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de evidencias que desea ingresar: "));
                            for (int j = 0; j < C_Evid; j++) {
                                 Nom +=  JOptionPane.showInputDialog("Ingrese Lugar: ");
                                 Desc +=  JOptionPane.showInputDialog("Ingrese Descripcion: ");
                                 n_p += JOptionPane.showInputDialog("Ingrese Nivel de Peligrosidad (Alto,Medio,Bajo): ");
                                Evi.add(new Evidencia(Nom,Desc,n_p));

                            }
                        }
                    
                    
                    }
                    if (op.equalsIgnoreCase("d")) {
                         int pos= Integer.parseInt(JOptionPane.showInputDialog("Posicion del caso a Modificar: "));
                if (pos>=0 && pos<Cas.size() && Cas.get(pos) instanceof Casos) {
                     String Lugar =  JOptionPane.showInputDialog("Ingrese Lugar: ");
                     String Descripcion =  JOptionPane.showInputDialog("Ingrese Descripcion: ");
                     String Tipo = JOptionPane.showInputDialog("Ingrese Tipo (Homicidio,robo,secreto,violacion: ");
                     String D_A =  JOptionPane.showInputDialog("Detective a Cargo: ");
                     String Estado = JOptionPane.showInputDialog("Estado (En proseso, resuelto");
                    ((Casos)Cas.get(pos)).setLugar(Lugar);
                    ((Casos)Cas.get(pos)).setDescripcion(Descripcion);
                    ((Casos)Cas.get(pos)).setTipo(Tipo);
                    ((Casos)Cas.get(pos)).setD_A(D_A);
                    ((Casos)Cas.get(pos)).setEstado(Estado);
                    }
                    }
                    if (op.equalsIgnoreCase("e")) { // inicio de mensajes
                            String Emisor =  JOptionPane.showInputDialog("Ingrese Emisor: ");
                            String Receptor =  JOptionPane.showInputDialog("Ingrese Receptor: ");
                            if (!Lista.contains(Receptor)) {
                                Receptor = JOptionPane.showInputDialog("Ingrese un Receptor correcto: ");
                            }
                            String Contenido = JOptionPane.showInputDialog("Ingrese su mensaje ");
                            String Prioridad =  JOptionPane.showInputDialog("Ingrese el nivel de prioridad: ");
                            Men.add(new Mensajes(Emisor,Receptor,Contenido,Prioridad));
                            
                            
                    }
                        
                    if (op.equalsIgnoreCase("f")) {
                        String salida="";
                        for (Object temp : Men ) {
                            if (temp instanceof Mensajes) {


                            salida += Men.indexOf(temp.toString());
                            salida+=temp+"\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                    }
                }
               
        
        }else{
                        System.out.println("Datos incorrectos");
                    }
               
                    
                }
            }
    }///FIN DE LOGIN
                
}//fin de salir del principal 
    }//fin de while general
}
    
    
    

