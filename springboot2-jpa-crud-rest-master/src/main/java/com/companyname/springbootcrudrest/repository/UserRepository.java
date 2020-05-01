package com.companyname.springbootcrudrest.repository;
/**
 * Created in Eclipse IDE.
 * Project : springboot2-jpa-crud-rest-master
 * User: yash
 * Date: 18/01/2020
 */


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companyname.springbootcrudrest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
