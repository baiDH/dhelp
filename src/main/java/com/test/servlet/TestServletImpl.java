package com.test.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.bean.Test;
import com.test.dao.TestDao;

@Component
public class TestServletImpl{

    @Autowired
	private TestDao testdao;
	public Test selectInfo(Test test) {
		// TODO Auto-generated method stub
		return testdao.selectInfo(test);
	}

}
