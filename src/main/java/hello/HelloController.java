package hello;

import simpleweb.Controller;
import simpleweb.Param;

public class HelloController extends Controller {


    public String hello(@Param("id") Integer id,
                        @Param("name") String name) {


        //business logic goes here

        addToModel("id", id);
        addToModel("name", name);
        return "hello.jsp";
    }
}
