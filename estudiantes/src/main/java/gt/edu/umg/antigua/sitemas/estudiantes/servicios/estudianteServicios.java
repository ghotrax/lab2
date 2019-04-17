package gt.edu.umg.antigua.sitemas.estudiantes.servicios;

import gt.edu.umg.antigua.sitemas.estudiantes.dao.estudianteRepositorio;
import gt.edu.umg.antigua.sitemas.estudiantes.model.estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class estudianteServicios {
    @Autowired
    private estudianteRepositorio _estudianteR;
    public List<estudiante> list(){

        return  (List<estudiante>) this._estudianteR.findAll();
    }

    public estudiante crear(estudiante _estudiante){
       return   this._estudianteR.save(_estudiante);


    }
}
