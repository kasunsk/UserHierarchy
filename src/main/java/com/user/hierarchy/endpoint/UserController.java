package com.user.hierarchy.endpoint;

import com.user.hierarchy.model.UserAccess;
import com.user.hierarchy.param.HttpResponse;
import com.user.hierarchy.service.UserAccessService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserAccessService userAccessService;

    @RequestMapping(method = RequestMethod.POST, value = "/access")
    public HttpResponse createUserAccess(@RequestBody UserAccess userAccess) {
        HttpResponse httpResponse = new HttpResponse();
        try {
            userAccessService.insertUserAccess(userAccess);
            httpResponse.setMessage("User Access Inserted Successfully");
            return httpResponse;
        } catch (Exception e) {
            httpResponse.setMessage("User Access Inserted Fail");
        }
        return httpResponse;
    }
}
