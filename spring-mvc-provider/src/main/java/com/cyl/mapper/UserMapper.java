package com.cyl.mapper;

import com.cyl.vo.UserVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-25
 */
@Repository
public interface UserMapper {

    List<UserVO> allUsers();
}
