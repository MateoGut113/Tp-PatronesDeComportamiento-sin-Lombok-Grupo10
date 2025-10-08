package Mediator;

import java.util.HashSet;
import java.util.Set;

public class ChatRoom implements ChatMediator{
    public Set<Usuario> usuarios = new HashSet<>();

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u != usuario) { // no se envía a sí mismo
                u.recibir(mensaje);
            }
        }
    }

}
