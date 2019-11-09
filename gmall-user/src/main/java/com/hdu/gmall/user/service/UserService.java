package com.hdu.gmall.user.service;

import com.hdu.gmall.user.bean.UmsMember;
import com.hdu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
