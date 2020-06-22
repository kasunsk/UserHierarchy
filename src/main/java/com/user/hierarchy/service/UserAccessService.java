package com.user.hierarchy.service;

import com.user.hierarchy.model.UserAccess;

import java.util.List;

public interface UserAccessService {

    void insertUserAccess(UserAccess userAccess);

    void insertAllUsersAccess(List<UserAccess> allUserAccess);

}
