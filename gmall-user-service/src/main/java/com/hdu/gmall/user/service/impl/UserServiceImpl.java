package com.hdu.gmall.user.service.impl;



import com.alibaba.dubbo.config.annotation.Service;
import com.hdu.gmall.bean.UmsMember;
import com.hdu.gmall.bean.UmsMemberReceiveAddress;
import com.hdu.gmall.service.UserService;
import com.hdu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.hdu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> list = umsMemberReceiveAddressMapper.selectByExample(e);
        return list;
    }
}
