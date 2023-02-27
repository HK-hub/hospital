package com.zy.hospital.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.hospital.api.service.DoctorService;
import com.zy.hospital.entity.Doctor;
import com.zy.hospital.infrastructure.mapper.DoctorMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor>
    implements DoctorService {

}




