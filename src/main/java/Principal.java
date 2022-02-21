public class Principal {
    public static void main(String[] args) {
        System.out.println("QUé tal?");
        System.out.println("Uno");
    }



    //Rama morada
    public void login(String usuario, String password){

    }
    public void signup(String usuario, String password){
        String consulta = "INSERT (usuarios, password) VALUES("+usuario+password+") FROM Usuarios";
        //llamar a la bbdd
    }


    //Fin Rama morada

    //Rama verde
    public void login(String usuario, String password){
        String consulta = "SELECT * FROM Usuarios WHERE nombre="+usuario+" AND password="+password;
        //llamar a la bbdd
    }
    public void signup(String usuario, String password){
    }
    //Fin Rama Verde
}

