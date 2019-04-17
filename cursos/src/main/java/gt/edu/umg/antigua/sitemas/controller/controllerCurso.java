package gt.edu.umg.antigua.sitemas.controller;

import gt.edu.umg.antigua.sitemas.model.curso;
import gt.edu.umg.antigua.sitemas.servicios.cursoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class controllerCurso {
    @Autowired
    private cursoServicio _cursoServicio;

    @GetMapping("/buscar")
    public List<curso> buscar() {
        return _cursoServicio.list();
    }

    @PostMapping("/crear")
    public curso crear(curso _curso){
        return   this._cursoServicio.crear(_curso);


    }
}
