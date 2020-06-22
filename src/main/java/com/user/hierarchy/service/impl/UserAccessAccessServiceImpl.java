package com.user.hierarchy.service.impl;

import com.user.hierarchy.model.UserAccess;
import com.user.hierarchy.repository.UserAccessRepository;
import com.user.hierarchy.service.UserAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAccessAccessServiceImpl implements UserAccessService {

    @Autowired
    private UserAccessRepository userAccessRepository;

    @Override
    public Boolean insertUserAccess(UserAccess userAccess) {
        return null;
    }

    @Override
    public Boolean insertAllUsersAccess(List<UserAccess> allUserAccess) {
        return null;
    }
}
