package com.endrius.os.ripositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endrius.os.domain.OS;

@Repository
public interface OSRepository extends JpaRepository<OS, Integer>{

}
