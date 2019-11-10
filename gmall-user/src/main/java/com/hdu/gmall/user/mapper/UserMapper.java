package com.hdu.gmall.user.mapper;

import com.hdu.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper  extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
