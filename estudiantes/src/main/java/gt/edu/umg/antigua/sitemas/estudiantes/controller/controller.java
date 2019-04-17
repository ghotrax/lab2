package gt.edu.umg.antigua.sitemas.estudiantes.controller;

import gt.edu.umg.antigua.sitemas.estudiantes.model.estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import gt.edu.umg.antigua.sitemas.estudiantes.servicios.estudianteServicios;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class controller {
    @Autowired
    private estudianteServicios _estudianteServicios;

    @GetMapping("/buscar")
    public List<estudiante> buscar() {
        return _estudianteServicios.list();
    }

    @PostMapping("/crear")
    public estudiante crear(estudiante _estudiante){
        return   this._estudianteServicios.crear(_estudiante);


    }

}
