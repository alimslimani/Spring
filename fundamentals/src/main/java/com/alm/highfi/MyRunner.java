//package com.alm.highfi;
//
//import com.alm.highfi.model.Application;
//import com.alm.highfi.repository.ApplicationRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import javax.transaction.Transactional;
//
//@SuppressWarnings("unchecked")
//@Component
//public class MyRunner implements CommandLineRunner {
//
//    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);
//
//    @Autowired
//    private ApplicationRepository applicationRepository;
//
//    @Override
//    @Transactional
//    public void run(String... args) throws Exception {
//
//        logger.info("initializing users");
//
//        var u1 = new Application("Paul", "Smith", "paul.smith@gmail.com");
//        applicationRepository.save(u1);
//
//        var u2 = new Application("Robert", "Black", "rb34@gmail.com");
//        applicationRepository.save(u2);
//
//        var u3 = new Application("John", "Doe", "jdoe@gmail.com");
//        applicationRepository.save(u3);
//
//    }
//}