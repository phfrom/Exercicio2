package Aeds2;

public class ClassePrincipal {
    public static void main(String[] args) {

        DAO dao = new DAO();
        dao.conectar();

        //Colocar os elementos     
        Usuarios usuario = new Usuarios (11, "pedrochaves","pedrochaves",'M');
        if(dao.inserirUsuario(usuario)==true) {
            System.out.println("Inserção com sucesso ->" + usuario.toString());
        }

        //Mostrar usuários masculinos
        System.out.println("==== Mostrar usuários do sexo masculino === ");
        Usuarios[] usuarios = dao.getUsuariosMasculinos();
        for(int i=0;i<usuarios.length;i++) {
            System.out.println(usuarios[i].toString());
        }

        // Atualizar usuários
        usuario.setSenha("Nova senha");
        dao.atualizarUsuario(usuario);

        //Mostrar usuários masculinos
        System.out.println("==== Mostrar usuários do sexo masculino === ");
        usuarios = dao.getUsuarios();
        for(int i=0;i<usuarios.length;i++) {
            System.out.println(usuarios[i].toString());
        }

        //Excluir usuários
        dao.excluirUsuario(usuario.getCodigo());

        //Mostrar usuários
        usuarios = dao.getUsuarios();
        System.out.println("Mostrar usuários: ");
        for(int i = 0;i < usuarios.length;i++) {
            System.out.println(usuarios [ i ].toString());
        }

        dao.close();
    }
}
