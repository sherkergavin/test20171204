package com.mycompany.hr.service;

import java.util.Date;

/**
 * 
* @ClassName: HumanResourceService 
* @Description: humanResourceService
* @author GWJ
* @date 2017年4月21日 上午11:54:27 
*
 */
public interface HumanResourceService {
	
	void bookHoliday(Date startDate, Date endDate, String name);

}
