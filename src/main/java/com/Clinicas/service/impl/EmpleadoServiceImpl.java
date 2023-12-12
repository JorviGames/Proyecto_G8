package com.Clinicas.service.impl;

import com.Clinicas.dao.EmpleadoDao;
import com.Clinicas.domain.Empleado;
import com.Clinicas.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoDao empleadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> getEmpleados() {
        return empleadoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado getEmpleado(Empleado empleado) {
        return empleadoDao.findById(empleado.getIdEmpleado()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado getEmpleadoById(Long id) {
        return empleadoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Empleado empleado) {
        empleadoDao.save(empleado);
    }

    @Override
    @Transactional
    public void delete(Empleado empleado) {
        empleadoDao.delete(empleado);
    }

}
