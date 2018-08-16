package com.ycz.demo.repositroy;

import com.ycz.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * user repository.
 *
 * @author yuancz.
 * @version 2018/8/15 18:57
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
