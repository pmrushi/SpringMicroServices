package com.example.user.service

import com.example.user.VO.DepartmentVO
import com.example.user.VO.UserVO
import com.example.user.entity.User
import com.example.user.repository.UserRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
@Slf4j
class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate

    User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    UserVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        User user = userRepository.findByUserId(userId)
        //DepartmentVO department =
        //        restTemplate.getForObject("http://localhost:9001/departments/" + user.getDepartmentId()
        //                ,DepartmentVO.class);
        DepartmentVO department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId()
                        ,DepartmentVO.class);
        UserVO userVO = new UserVO()
        userVO.setUser(user)
        userVO.setDepartment(department)
        return userVO;
    }
}
