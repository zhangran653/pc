package com.ran.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestServiceTest {
	
	public static void main(String[] args) {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(    
                new String[]{"application.xml"});    
        context.start();   
        System.out.println("�ṩ�߷�����ע��ɹ�");    
        try {  
            System.in.read();//�ô˳���һֱ�ܣ���ʾһֱ�ṩ����  
        } catch (IOException e) {         
            e.printStackTrace();  
        }    
    }  

}
