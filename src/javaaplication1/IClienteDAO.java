/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaaplication1;

import java.util.Collection;
import javaaplication1.domain.Cliente;

/**
 *
 * @author Rafael
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public boolean excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}

