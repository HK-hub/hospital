package com.zy.hospital.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.hospital.api.service.MedicalRegistrationService;
import com.zy.hospital.entity.MedicalRegistration;
import com.zy.hospital.infrastructure.mapper.MedicalRegistrationMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class MedicalRegistrationServiceImpl extends ServiceImpl<MedicalRegistrationMapper, MedicalRegistration>
    implements MedicalRegistrationService {

}




