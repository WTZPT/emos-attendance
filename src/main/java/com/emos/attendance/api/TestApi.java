package com.emos.attendance.api;

import com.emos.attendance.common.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;

@RestController
@Api("TestAPI")
public class TestApi {

    @ApiOperation("helllo world")
    @GetMapping("/")
    public String test() {
        return "hello world";
    }

    @ApiOperation("valid test")
    @PostMapping("/valid")
    public R validTest(@Valid @RequestBody FromBody body) {
        HashMap map = new HashMap();
        map.put("name",body.getName());
        map.put("schoolId", body.getSchoolId());
        return R.ok(map);
    }


}
