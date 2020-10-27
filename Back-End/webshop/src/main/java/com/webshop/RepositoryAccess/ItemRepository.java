package com.webshop.RepositoryAccess;
import org.springframework.data.repository.CrudRepository;
import com.webshop.Entities.Product_Item_Class;


public interface ItemRepository extends CrudRepository<Product_Item_Class, Integer>{

}
