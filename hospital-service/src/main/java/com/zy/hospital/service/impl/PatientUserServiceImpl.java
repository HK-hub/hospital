package com.zy.hospital.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.hospital.api.service.PatientUserService;
import com.zy.hospital.entity.PatientUser;
import com.zy.hospital.infrastructure.mapper.PatientUserMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class PatientUserServiceImpl extends ServiceImpl<PatientUserMapper, PatientUser>
    implements PatientUserService {

}




