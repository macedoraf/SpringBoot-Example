package br.com.applyer.v2.controller;

import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.Req;
import br.com.applyer.v2.service.RequisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v3/requisito")
public class RequisitoController extends BaseController<Req> {

    @Autowired
    RequisitorService service;

    @Override
    public BaseServiceContract<Req> getService() {
        return service;
    }
}
