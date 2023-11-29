package com.PetPalace.Repu;

import com.PetPalace.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userdataresp extends JpaRepository<User, String> {
    //public User createAccount(User user);
}
//cnt usr dta b