package org.example.wrong;

import java.util.HashMap;

public class Wrong {

    HashMap<Integer, String> stateCode  = new HashMap<Integer, String>() {{
        put(1, "账号错误");
        put(2, "密码错误");
        put(3,"成功登录");
    }};
    public Wrong(){}
    public HashMap getCode()
    {
        return stateCode;
    }

}
