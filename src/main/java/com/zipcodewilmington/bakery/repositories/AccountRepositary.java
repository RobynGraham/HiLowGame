package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepositary extends CrudRepository<Account,Long> {
}
