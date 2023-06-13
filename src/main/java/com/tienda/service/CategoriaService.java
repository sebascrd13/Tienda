package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se obtiene la lista de categorías en un List
    public List<Categoria> getCategorias(boolean activo);
    
}
