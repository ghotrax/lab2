package gt.edu.umg.antigua.sitemas.servicios;

import gt.edu.umg.antigua.sitemas.dao.catedraticoRepositrio;
import gt.edu.umg.antigua.sitemas.dao.cusroRepositorio;
import gt.edu.umg.antigua.sitemas.model.catedratico;
import gt.edu.umg.antigua.sitemas.model.curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class catedraticoServicio {
    @Autowired
    private catedraticoRepositrio _catedraticoServicio;

    public List<catedratico> list(){

        return  (List<catedratico>) this._catedraticoServicio.findAll();
    }

    public catedratico crear(catedratico _catedratico){
        return   this._catedraticoServicio.save(_catedratico);


    }
}
