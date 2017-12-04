package com.mycompany.hr.service;

import java.util.Date;

import org.springframework.stereotype.Service;
/**
 * 
* @ClassName: StubHumanResourceService 
* @Description: stubHumanResourceService
* @author GWJ
* @date 2017��4��21�� ����12:02:30 
*
 */
@Service
public class StubHumanResourceService implements HumanResourceService {

	 public void bookHoliday(Date startDate, Date endDate, String name) {
	        System.out.println("Booking holiday for [" + startDate + "-" + endDate + "] for [" + name + "] ");
	    }
}
