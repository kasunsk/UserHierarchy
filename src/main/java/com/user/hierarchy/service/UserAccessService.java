package com.user.hierarchy.service;

import com.user.hierarchy.model.UserAccess;

import java.util.List;

public interface UserAccessService {

    Boolean insertUserAccess(UserAccess userAccess);

    Boolean insertAllUsersAccess(List<UserAccess> allUserAccess);

}
