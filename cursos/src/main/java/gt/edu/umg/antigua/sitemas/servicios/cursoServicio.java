package gt.edu.umg.antigua.sitemas.servicios;

import gt.edu.umg.antigua.sitemas.dao.cusroRepositorio;
import gt.edu.umg.antigua.sitemas.model.curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cursoServicio {
    @Autowired
    private cusroRepositorio _cursoRepositorio;

    public List<curso> list(){

        return  (List<curso>) this._cursoRepositorio.findAll();
    }

    public curso crear(curso _curso){
        return   this._cursoRepositorio.save(_curso);


    }
}
