package gt.edu.umg.antigua.sitemas.controller;

import gt.edu.umg.antigua.sitemas.model.catedratico;
import gt.edu.umg.antigua.sitemas.model.curso;
import gt.edu.umg.antigua.sitemas.servicios.catedraticoServicio;
import gt.edu.umg.antigua.sitemas.servicios.cursoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catedratico")
public class controllerCatedratico {
    @Autowired
    private catedraticoServicio _catedraticoServicio;

    @GetMapping("/buscar")
    public List<catedratico> buscar() {
        return _catedraticoServicio.list();
    }

    @PostMapping("/crear")
    public catedratico crear(catedratico _catedratico){
        return   this._catedraticoServicio.crear(_catedratico);


    }
}
