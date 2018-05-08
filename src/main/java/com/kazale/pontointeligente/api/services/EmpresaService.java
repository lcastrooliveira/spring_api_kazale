package com.kazale.pontointeligente.api.services;

import com.kazale.pontointeligente.api.entities.Empresa;

import java.util.Optional;

public interface EmpresaService {

    Optional<Empresa> buscarPorCnpj(String cnpj);

    Empresa persistir(Empresa empresa);

}
